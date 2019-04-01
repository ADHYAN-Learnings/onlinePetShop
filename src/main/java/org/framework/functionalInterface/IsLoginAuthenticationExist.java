package org.framework.functionalInterface;

import org.springframework.security.core.Authentication;

@FunctionalInterface
public interface IsLoginAuthenticationExist {
  public boolean AuthenticationChecking(Authentication authentication);
}
