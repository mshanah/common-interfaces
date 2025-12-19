package com.upupa.common.interfaces.security;

 
import java.util.Set;
import java.util.Map;

/**
 * Represents the currently authenticated user and attributes relevant for security and access control.
 */
public class UserContext {

    private String userId;                 // Unique identifier
    private String username;               // Display name
    private Set<String> roles;             // Roles assigned to the user
    private Set<String> groups;            // Groups assigned (e.g., org, department, supplier group)
    private Map<String, Object> attributes; // Any additional attributes for dynamic rules (e.g., region, clearance)

    // Constructors
    public UserContext(String userId, String username, Set<String> roles, Set<String> groups, Map<String, Object> attributes) {
        this.userId = userId;
        this.username = username;
        this.roles = roles;
        this.groups = groups;
        this.attributes = attributes;
    }

    // Getters & Setters
    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public Set<String> getRoles() { return roles; }
    public Set<String> getGroups() { return groups; }
    public Map<String, Object> getAttributes() { return attributes; }

    public void setUserId(String userId) { this.userId = userId; }
    public void setUsername(String username) { this.username = username; }
    public void setRoles(Set<String> roles) { this.roles = roles; }
    public void setGroups(Set<String> groups) { this.groups = groups; }
    public void setAttributes(Map<String, Object> attributes) { this.attributes = attributes; }
}
