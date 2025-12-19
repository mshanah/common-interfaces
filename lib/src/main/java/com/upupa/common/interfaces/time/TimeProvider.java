package com.upupa.common.interfaces.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;

public interface TimeProvider {
    Instant now();
    LocalDate today();
    ZonedDateTime nowAtZone(String zoneId);
}
