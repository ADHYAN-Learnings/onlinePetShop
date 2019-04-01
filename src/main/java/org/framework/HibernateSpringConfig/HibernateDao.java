package org.framework.HibernateSpringConfig;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateDao {
	
	@Autowired
	public SessionFactory sessionFactory;
}
