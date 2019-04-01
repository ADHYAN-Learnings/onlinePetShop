package org.framework.controller;

import org.apache.log4j.Logger;
import org.framework.beans.PaymentStatusBeans;
import org.framework.beans.PetBeans;
import org.framework.beans.PetDescriptionBeans;
import org.framework.functionalInterfaceImplementation.LoginAuthenticationExist;
import org.framework.service.PaymentStatusService;
import org.framework.service.PetDescriptionService;
import org.framework.service.PetShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserSideImplementation {
    
	private static final Logger logger = Logger.getLogger(UserSideImplementation.class);
	

	@Autowired
	protected PetShopService petShopService;
	@Autowired
	protected PetDescriptionService petDescriptionService;
	@Autowired
	protected PaymentStatusService paymentStatusService;
	@Autowired
	LoginAuthenticationExist loginAuthenticationExist;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView mainPage(@ModelAttribute PetBeans beans) {
		if(logger.isDebugEnabled()) {
		logger.debug(":::mainPage:::PetBean:::"+beans.toString());
		}
		return new ModelAndView("frontPage","_pet_Beans", petShopService.get(beans));
	}
	
	@RequestMapping(value="/description",method=RequestMethod.GET)
	public String getDescription(Model model,@ModelAttribute PetDescriptionBeans petDescriptionBeans) {
		if(logger.isDebugEnabled()) {
		logger.debug(":::getDescription::PetDescriptionBeans:::"+petDescriptionBeans.toString());
		}
		String view = "petDescription";
		model.addAttribute("_pet_Description_Beans",  petDescriptionService.get(petDescriptionBeans));
		return view;
	}
	
	@RequestMapping(value="/payment",method=RequestMethod.GET)
	public String getPaymentStatus(Model model,@ModelAttribute PaymentStatusBeans paymentStatusBeans ,
			                                   @ModelAttribute PetBeans petBeans,
			                                   @ModelAttribute PetDescriptionBeans petDescriptionBeans) {
		if(logger.isDebugEnabled()) {
		  logger.debug(":::getPaymentStatus::PaymentStatusBeans::::"+paymentStatusBeans.toString()+"::PetBeans::"+petBeans.toString());
		}
		String view ="";
		if(loginAuthenticationExist.loginAuthenticationCheck()) {
			model.addAttribute("pet_status_beans",petBeans);	    
			model.addAttribute("payment_status_beans",paymentStatusBeans);
		    view ="paymentStatus";
		} else {
		    petDescriptionBeans.setDescription_Id(petBeans.getId());
		    petDescriptionBeans.setLoginExist(false);
			model.addAttribute("_pet_Description_Beans",  petDescriptionService.get(petDescriptionBeans));
		    view = "petDescription";
		}
        
		return view;
	}
	
	@RequestMapping(value="/savePaymentData",method=RequestMethod.POST)
	public String getPaymentSaveData(Model model,@ModelAttribute PaymentStatusBeans paymentStatusBeans ,@ModelAttribute PetBeans petBeans) {
		if(logger.isDebugEnabled()) {
		  logger.debug(":::getPaymentSaveData::PaymentStatusBeans::::"+paymentStatusBeans.toString());
		}
		String view ="frontPage";
		model.addAttribute("payment_save_data",paymentStatusService.update(paymentStatusBeans));
		petBeans.setProductMessage("Your order is successfully placed");
		model.addAttribute("_pet_Beans",petShopService.get(petBeans));
		return view;
	}
}
