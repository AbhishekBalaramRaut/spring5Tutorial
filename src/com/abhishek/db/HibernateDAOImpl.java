package com.abhishek.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.abhishek.db.entities.Circle;

public class HibernateDAOImpl  {

	
	SessionFactory sessionFactory;

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public Long getCircleCount() {
		String hql = "Select count(*) from Circle";
		Query query = getSessionFactory().openSession().createQuery(hql);
		return (Long) query.getSingleResult();
	}
	
	public void saveCircle(Circle c) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		session.close();
	}
	
}
