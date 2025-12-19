package com.upupa.common.interfaces.events;

public interface DomainEventPublisher {
    void publish(Object event);
}

