package org.framework.service;

import org.framework.beans.PetDescriptionBeans;
import org.framework.dao.DaoActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PetDescriptionService extends AbstractService<PetDescriptionBeans> {
	
	@Autowired
	@Qualifier("petDescription")
	private DaoActions<PetDescriptionBeans> petDescription;

	@Override
	public PetDescriptionBeans add(Object obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans update(Object obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans remove(Object obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans getAll(Object obj) {
		return null;
	}

	@Override
	public PetDescriptionBeans get(Object obj) {
		return  petDescription.get((PetDescriptionBeans)obj);
	}

}
