package com.upupa.common.interfaces.security;

public interface SecurityService {
    UserContext getCurrentUser();
    boolean hasRole(UserContext user, String role);
    boolean hasPermission(UserContext user, String permission);
}
