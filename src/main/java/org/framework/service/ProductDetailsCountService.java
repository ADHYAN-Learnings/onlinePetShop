/** @Author AdityaPandey
 *  5 Jun 2018
 */
package org.framework.service;

import org.framework.beans.ProductDetailsCountBean;
import org.framework.dao.DaoActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsCountService extends AbstractService<ProductDetailsCountBean> {
	
	@Autowired
	@Qualifier("productDetailsCount")
	private DaoActions<ProductDetailsCountBean> productDetailsCount;

	@Override
	public ProductDetailsCountBean add(Object obj) {
		return null;
	}

	@Override
	public ProductDetailsCountBean update(Object obj) {
		return null;
	}

	@Override
	public ProductDetailsCountBean remove(Object obj) {
		return null;
	}

	@Override
	public ProductDetailsCountBean getAll(Object obj) {
		return null;
	}

	@Override
	public ProductDetailsCountBean get(Object obj) {
		return productDetailsCount.get((ProductDetailsCountBean) obj);
	}

}
