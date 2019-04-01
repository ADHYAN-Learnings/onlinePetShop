/** @Author AdityaPandey
 *  22 May 2018
 */
package org.framework.controller;

import org.apache.log4j.Logger;
import org.framework.beans.PaymentUserMappingBean;
import org.framework.beans.PetDescriptionBeans;
import org.framework.beans.ProductDetailsCountBean;
import org.framework.beans.UserDetailsBean;
import org.framework.service.AdminUserDetailsService;
import org.framework.service.PaymentTransactionDetailService;
import org.framework.service.ProductDetailsCountService;
import org.framework.service.UnsoldAnimalsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminSideImplementation {
	
	private static final Logger logger = Logger.getLogger(AdminSideImplementation.class);
	
	@Autowired
	protected ProductDetailsCountService productDetailsCountService;
	@Autowired
	protected AdminUserDetailsService adminUserDetailsService;
	@Autowired
	protected PaymentTransactionDetailService paymentTransactionDetailService;
	@Autowired
	protected UnsoldAnimalsDetailService unsoldAnimalsDetailService;
	
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String getAdminLoginPage() {
		String view ="adminLoginPage";
		return view;
	}
	@RequestMapping(value="/admin_index",method=RequestMethod.GET)
	public ModelAndView getAdminIndexPage(@ModelAttribute ProductDetailsCountBean bean) {
		if(logger.isDebugEnabled()) {
			logger.debug("::AdminSideImplementation::::getAdminIndexPage:::bean-"+bean.toString());
		}
		return new ModelAndView("dashboard","_product_count_details",productDetailsCountService.get(bean));
	}
	@RequestMapping(value="/admin_user_details",method=RequestMethod.GET)
	public ModelAndView getUserDetails(@ModelAttribute UserDetailsBean beans) {
		
		if(logger.isDebugEnabled()) {
			logger.debug("::AdminSideImplementation::::getUserDetails:::beans-"+beans.toString());
		}
		
		return new ModelAndView("admin_user_details","_user_details", adminUserDetailsService.getAll(beans));
		
	}
	@RequestMapping(value="/admin_single_user_information", method=RequestMethod.GET)
	public ModelAndView getAdminSingleUserInformation(@ModelAttribute UserDetailsBean beans) {
		if(logger.isDebugEnabled()) {
			logger.debug("::AdminSideImplementation::::::getAdminSingleUserInformation:::beans-"+beans.toString());
		}
		return new ModelAndView("admin_single_user_information","_user_information_details",adminUserDetailsService.get(beans));
	}
	
	@RequestMapping(value="/admin_transaction_details", method=RequestMethod.GET)
	public ModelAndView getTotalSoldAnimalInformation(@ModelAttribute PaymentUserMappingBean beans ) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::AdminSideImplementation:::getTotalSoldAnimalInformation::beans-"+beans.toString());
		}
		return new ModelAndView("total_transaction_details","_transaction_information", paymentTransactionDetailService.getAll(beans));
	}
	@RequestMapping(value="/admin_single_transaction_information", method=RequestMethod.GET)
	public ModelAndView getSingleSoldAnimalInformation(@ModelAttribute PaymentUserMappingBean beans) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::AdminSideImplementation::::getSingleSoldAnimalInformation::beans-"+beans.toString());
		}
		return new ModelAndView("single_transaction_details","_transaction_single_transaction_details", paymentTransactionDetailService.get(beans));
	}
	@RequestMapping(value="/admin_unsold_animals", method=RequestMethod.GET)
	public ModelAndView getUnsoldAnimalInformation(@ModelAttribute PetDescriptionBeans beans) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::AdminSideImplementation:::getUnsoldAnimalInformation:::beans-"+beans.toString());
		}
		return new ModelAndView("unsold_animal_information","_unsold_animal",unsoldAnimalsDetailService.getAll(beans));
	}
	@RequestMapping(value="/add_product_Information", method=RequestMethod.GET)
	public ModelAndView getAddProudctDetails(Model model) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::AdminSideImplementation:::getAddProductDetails::");
		}
		return new ModelAndView("add_product_details","_product_description_details",new PetDescriptionBeans());
	}
	
	@RequestMapping(value="/admin_add_unsold_animals",method=RequestMethod.POST)
	public ModelAndView SaveProductDetails(Model model,@ModelAttribute PetDescriptionBeans petDescriptionBeans) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::saveProductDetails:::::"+petDescriptionBeans.toString()+":::::"+petDescriptionBeans.getPetBeans().toString());	
		}

        /* Step 1:Add product and their description */
		 model.addAttribute("_product_description_details", unsoldAnimalsDetailService.add(petDescriptionBeans));
		 
		 /* Step 2: Target display page and their values */
		return new ModelAndView("unsold_animal_information","_unsold_animal",unsoldAnimalsDetailService.getAll(petDescriptionBeans));
	}
	@RequestMapping(value="/Unsold_pet_edit_details",method=RequestMethod.GET)
	public ModelAndView EditProductDetails(@ModelAttribute PetDescriptionBeans petDescriptionBeans) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::AdminSideImplementation:::EditProductDetails::petDescriptionBeans-"+petDescriptionBeans.toString());
		}
		return new ModelAndView("add_product_details","_product_description_details",unsoldAnimalsDetailService.get(petDescriptionBeans));
	}
	@RequestMapping(value="/admin_edit_unsold_animals",method=RequestMethod.POST)
	public ModelAndView UpdateProductDetails(Model model,@ModelAttribute PetDescriptionBeans petDescriptionBeans) {
		if(logger.isDebugEnabled()) {
			logger.debug(":::AdminSideImplementation::::UpdateProductDetails::::");
		}
		/* Step 1:Add product and their description */
		 model.addAttribute("_product_description_details", unsoldAnimalsDetailService.update(petDescriptionBeans));
		
		 /* Step 2: Target display page and their values */
		return new ModelAndView("unsold_animal_information","_unsold_animal",unsoldAnimalsDetailService.getAll(petDescriptionBeans));
		
	}

}
