package com.niit.ekart.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ekart.dao.ProductDao;
import com.niit.ekart.model.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao
{
	private static final Object Productid = null;
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	
	}  // here we are configuring session factory 
	
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts()
	{
		
		Session session = getSession();
		Query query=session.createQuery("from Product");
		List<Product> list = query.list();
		session.close();
		return list;
	} // here we are calling out the list of products present in the data base along with their details 

	public Product getProductById(int id)
	{
		Session session = getSession();
		Query query=session.createQuery("FROM Product p where productId=:productId");
		query.setParameter("productId", id);
		Product p=(Product)query.uniqueResult();
		return p;
	
	} // here we are recognising the product on the basis of id of  product 

	public void saveOrUpdateProduct(Product product) 
	{
	
		Session session = getSession();
		session.update(product);
		session.flush();
		session.close();
	
     } // here we are updating the details of the product  after editing the details .
	

	@SuppressWarnings("unchecked")
	public List<Product> listByCategoryId(int categoryId)
	{
		
		Session session = getSession();
		Query query=session.createQuery("FROM Product e where e.productCategory.categoryId=:categoryid");
		query.setParameter("categoryid", categoryId);
		List<Product> e=query.list();
		session.close();
		return e;
	} // here we are calling out the product base on category id ..
	

	public void deleteProduct(int id) 
	{
		Session session = getSession();
		Query query=session.createQuery("FROM Product u where productId=:productId");
		query.setParameter("productId", id);
		Product u=(Product)query.uniqueResult();
		session.delete(u);
		session.flush();
		session.close();
	} // here we are deleting the product informaion from entire data base ....
	

	public void addProduct(Product product)
	{

		Session session = getSession();

		session.save(product);

		session.flush();

		session.close();

		
	} // this function is used to add product along with their details 

	public void updateProduct(Product product)
	{
		Session session = getSession();
		session.update(product);
		session.flush();
		session.close();
	}

	
}
