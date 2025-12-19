package com.upupa.common.interfaces.config;

import com.upupa.common.interfaces.security.UserContext;

public interface FeatureFlagProvider {
    boolean isEnabled(String featureKey, UserContext user);
}
