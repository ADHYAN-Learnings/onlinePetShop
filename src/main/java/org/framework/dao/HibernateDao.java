/**
 * 
 */
package org.framework.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author AdityaPandey
 *
 */
@Transactional(propagation = Propagation.REQUIRES_NEW , value = "transactionManager")
public  class HibernateDao<T>  {
	protected Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Autowired
	@Qualifier(value="sessionFactory")
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session currentSession() {
		return getSession();
	}
	
	

}
