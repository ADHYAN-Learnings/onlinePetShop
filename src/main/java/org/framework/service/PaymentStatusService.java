/** @Author AdityaPandey
 *  19 Apr 2018
 */
package org.framework.service;

import org.framework.beans.PaymentStatusBeans;
import org.framework.dao.DaoActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentStatusService extends AbstractService<PaymentStatusBeans> {
 
	@Autowired
	@Qualifier("paymentStatus")
	private DaoActions<PaymentStatusBeans> paymentStatus;
	
	@Override
	public PaymentStatusBeans add(Object obj) {
		return null;
	}

	@Override
	public PaymentStatusBeans update(Object obj) {
		return paymentStatus.update((PaymentStatusBeans)obj);
	}

	@Override
	public PaymentStatusBeans remove(Object obj) {
		return null;
	}

	@Override
	public PaymentStatusBeans getAll(Object obj) {
		return null;
	}

	@Override
	public PaymentStatusBeans get(Object obj) {
		return paymentStatus.get((PaymentStatusBeans)obj);
	}

}
