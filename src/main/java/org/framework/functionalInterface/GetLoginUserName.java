package org.framework.functionalInterface;

import org.springframework.security.core.Authentication;

@FunctionalInterface
public interface GetLoginUserName {
    public String accessingLoginUsername(Authentication authentication);
}
