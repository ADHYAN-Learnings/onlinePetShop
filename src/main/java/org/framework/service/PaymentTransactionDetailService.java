/** @Author AdityaPandey
 *  9 Jun 2018
 */
package org.framework.service;

import org.framework.beans.PaymentUserMappingBean;
import org.framework.dao.DaoActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentTransactionDetailService extends AbstractService<PaymentUserMappingBean>{
  
	@Autowired
	@Qualifier("paymentTransactionDetail")
	private DaoActions<PaymentUserMappingBean> paymentTransactionDetail;
	@Override
	public PaymentUserMappingBean add(Object obj) {
		return null;
	}

	@Override
	public PaymentUserMappingBean update(Object obj) {
		return null;
	}

	@Override
	public PaymentUserMappingBean remove(Object obj) {
		return null;
	}

	@Override
	public PaymentUserMappingBean getAll(Object obj) {
		return paymentTransactionDetail.getAll((PaymentUserMappingBean)obj);
	}

	@Override
	public PaymentUserMappingBean get(Object obj) {
		return paymentTransactionDetail.get((PaymentUserMappingBean)obj);
	}

}
