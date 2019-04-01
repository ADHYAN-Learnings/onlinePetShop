package org.framework.functionalInterfaceImplementation;

import org.framework.functionalInterface.IsLoginAuthenticationExist;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class LoginAuthenticationExist {
	public boolean loginAuthenticationCheck() {
	  IsLoginAuthenticationExist  isLoginAuthenticationExist = authentication -> (authentication != null) && !authentication.getName().equalsIgnoreCase("anonymousUser");
	  
	  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	return isLoginAuthenticationExist.AuthenticationChecking(authentication );
	}
}
