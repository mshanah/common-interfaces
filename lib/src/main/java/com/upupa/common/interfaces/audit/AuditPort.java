package com.upupa.common.interfaces.audit;

import java.time.Instant;
import java.util.Map;

public interface AuditPort {

    enum Action {
        CREATE, UPDATE, DELETE, ACCESS
    }/**/

    void audit(Action action, String entityName, String entityId, Map<String, Object> changedFields, String performedBy, Instant timestamp);
}
