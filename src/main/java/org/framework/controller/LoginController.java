/** @Author AdityaPandey
 *  5 May 2018
 */
package org.framework.controller;

import org.apache.log4j.Logger;
import org.framework.beans.UserDetailsBean;
import org.framework.service.NewUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/loginDetails")
public class LoginController {
	
	private static final Logger logger = Logger.getLogger(LoginController.class);
	@Autowired
	protected NewUserDetailsService newUserDetailsService;	
	
	@RequestMapping(value="/saveNewUserDetails",method=RequestMethod.POST)
	@ResponseBody
	public void getPaymentStatus(@ModelAttribute UserDetailsBean beans ) {
		if(logger.isDebugEnabled()) {
		  logger.debug("::getPaymentStatus::UserDetailsBean::::"+beans.toString());
		}
		  newUserDetailsService.add(beans); 
	}
}