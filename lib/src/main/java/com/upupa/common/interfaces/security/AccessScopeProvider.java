package com.upupa.common.interfaces.security;

public interface AccessScopeProvider {
    AccessScope getAccessScope(UserContext user, Class<?> entityClass);
}

 