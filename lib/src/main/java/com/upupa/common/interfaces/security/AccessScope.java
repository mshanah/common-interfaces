package com.upupa.common.interfaces.security;

import java.util.Map;
import java.util.Set;

public class AccessScope {
    private Set<String> allowedOrgs;
    private Set<String> allowedGroups;
    private Map<String, Object> attributeFilters;
    // getters/setters  

    public Set<String> getAllowedOrgs() {
        return allowedOrgs;
    }

    public void setAllowedOrgs(Set<String> allowedOrgs) {
        this.allowedOrgs = allowedOrgs;
    }

    public Set<String> getAllowedGroups() {
        return allowedGroups;
    }

    public void setAllowedGroups(Set<String> allowedGroups) {
        this.allowedGroups = allowedGroups;
    }

    public Map<String, Object> getAttributeFilters() {
        return attributeFilters;
    }

    public void setAttributeFilters(Map<String, Object> attributeFilters) {
        this.attributeFilters = attributeFilters;
    }
}