package com.upupa.common.interfaces.security;

public interface DataMaskingService {
    Object mask(String fieldName, Object value,AccessScope scope);
}
