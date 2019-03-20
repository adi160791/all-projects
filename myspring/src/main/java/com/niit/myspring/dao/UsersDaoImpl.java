package com.niit.myspring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.myspring.model.*;





@Repository("usersDao")
@Transactional
public class UsersDaoImpl implements UsersDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public void addUsers(Users users) 
	{
		Session session = getSession();

		session.save(users);

		session.flush();

		session.close();

	}
	

	public List<Users> viewUsers(){
		Session session = getSession();
		Query query=session.createQuery("from Users");
		List<Users> userlist=query.list();
		return userlist;
		
	}
	public void updateUsers(Users users){
		Session session = getSession();
session.update(users);
session.flush();
session.close();
	}
	public Users getUsersById(int userId){
		Session session = getSession();
		Query query=session.createQuery("FROM Users u where u.userId=:userid");
		query.setParameter("userid", userId);
		Users u=(Users)query.uniqueResult();
		return u;
	}
	public void deleteUsersById(int userId){
		Session session = getSession();
		Query query=session.createQuery("FROM Users u where u.userId=:userid");
		query.setParameter("userid", userId);
		Users u=(Users)query.uniqueResult();
		session.delete(u);
		session.flush();
		session.close();		
	}
	

}

