/**
 * 
 */
package org.framework.service;

import org.framework.beans.PetBeans;
import org.framework.dao.DaoActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author AdityaPandey
 *
 */
@Service
public class PetShopService extends  AbstractService<PetBeans> {
	
	@Autowired
	@Qualifier("daoActions")
	private DaoActions<PetBeans> daoActions;
	
	@Override
	public PetBeans add(Object obj) {
		return null;
	}

	@Override
	public PetBeans update(Object obj) {
		return null;
	}

	@Override
	public PetBeans remove(Object obj) {
		return null;
	}

	@Override
	public PetBeans getAll(Object obj) {
		return null;
	}

	@Override
	public PetBeans get(Object obj) {
		logger.debug("::PetShopService::get::Method::");
		return daoActions.get((PetBeans)obj);
	}

}
