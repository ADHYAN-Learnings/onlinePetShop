/** @Author AdityaPandey
 *  9 Jun 2018
 */
package org.framework.service;

import org.framework.beans.PetDescriptionBeans;
import org.framework.dao.DaoActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UnsoldAnimalsDetailService extends AbstractService<PetDescriptionBeans> {
	
	@Autowired
	@Qualifier("unsoldAnimalsDetail")
	private DaoActions<PetDescriptionBeans> unsoldAnimalsDetail;

	@Override
	public PetDescriptionBeans add(Object obj) {
		return unsoldAnimalsDetail.add((PetDescriptionBeans)obj);
	}

	@Override
	public PetDescriptionBeans update(Object obj) {
		return unsoldAnimalsDetail.update((PetDescriptionBeans)obj);
	}

	@Override
	public PetDescriptionBeans remove(Object obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans getAll(Object obj) {
		return unsoldAnimalsDetail.getAll((PetDescriptionBeans)obj);
	}

	@Override
	public PetDescriptionBeans get(Object obj) {
		return unsoldAnimalsDetail.get((PetDescriptionBeans)obj);
	}

}
