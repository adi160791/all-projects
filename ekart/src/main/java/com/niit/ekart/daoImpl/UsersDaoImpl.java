package com.niit.ekart.daoImpl;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ekart.dao.UsersDao;
import com.niit.ekart.model.ShippingAddress;
import com.niit.ekart.model.Users;

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
	} // here we are configuring session factory 

	public void addUsers(Users users) 
	{
		Session session = getSession();

		session.save(users);

		session.flush();

		session.close();

	} // this function is used to add users along with their details 

	@SuppressWarnings("unchecked")
	public List<Users> getAllUsers() {
		Session session = getSession();
		Query query=session.createQuery("from Users");
		List<Users> list = query.list();
		return list;
		
	} // here we are calling out the list of users present in the data base along with their details 

	public Users getUsersById(String userId) {
		Session session = getSession();
		Query query=session.createQuery("FROM Users u where u.userId=:userid");
		query.setParameter("userid", userId);
		Users u=(Users)query.uniqueResult();
		return u;
	} // here we are recognising the user on the basis of id of user 
	public void updateUsers(Users users) {
		Session session = getSession();
		session.update(users);
		session.flush();
		session.close();
	} // here we are updating the details of the users  after editing the details ..

	public void deleteUsers(String userId) {
		Session session = getSession();
		Query query=session.createQuery("FROM Users u where u.userId=:userid");
		query.setParameter("userid", userId);
		Users u=(Users)query.uniqueResult();
		session.delete(u);
		session.flush();
		session.close();
	} // here we are deleting the users informaion from entire data base .... 

	public boolean checkUserId(String userId)
	{
		Session session= getSession();
		Query query=session.createQuery("from Users u where u.userId=:userId");
		query.setParameter("userId", userId);
		Users u=(Users)query.uniqueResult();
		if(u==null)
		return true;
		else 
		return false;

	} // here we are checking wether the given id is valid with users or not .. if true then it will show details else it wil show invalid id ...

	public void addShippingAddress(ShippingAddress shippingaddress) {
		Session session = getSession();

		session.save(shippingaddress);

		session.flush();

		session.close();
	
	} // here we are adding shipping address based on users .... and saving the address with respct of user id ... 

	public ShippingAddress getShippingAddressById(int id) {
	

        Session session = getSession();
        Query query=session.createQuery("FROM ShippingAddress s where s.ShippingAddressId=:shippingAddressId");
        Object shippingAddressId = null;
		query.setParameter("shippingAddressId", shippingAddressId);
        ShippingAddress s=(ShippingAddress)query.uniqueResult();
          return s;

	} // here we are calling the shipping address with respect of users id ..... 

	public List<ShippingAddress> getShippingAddressByUserId(String userId) 
	{
		 Session session = getSession();
			Query query = session.createQuery("from ShippingAddress where user.userId=:userId");
			query.setParameter("userId", userId);
			List<ShippingAddress> shipingAdresList = query.list();
		        return shipingAdresList;
			
		
		
	} // here we are calling the list of shiiping address on a particluar id basis .... 

}