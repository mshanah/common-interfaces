package com.upupa.common.interfaces.logging;

public interface LoggerPort {

    enum Level {
        TRACE, DEBUG, INFO, WARN, ERROR
    }

    void log(Level level, String message);

    void log(Level level, String message, Throwable throwable);
}
