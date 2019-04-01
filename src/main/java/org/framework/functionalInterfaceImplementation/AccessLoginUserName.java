/** @Author AdityaPandey
 *  19 May 2018
 */
package org.framework.functionalInterfaceImplementation;

import org.framework.functionalInterface.GetLoginUserName;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AccessLoginUserName {
	
	public  String getLoginUsername() {
		GetLoginUserName getLoginUserName = authentication ->(authentication != null && !authentication.getName().equalsIgnoreCase("anonymousUser"))? 
				                            authentication.getName():null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return getLoginUserName.accessingLoginUsername(authentication);
	}
}
