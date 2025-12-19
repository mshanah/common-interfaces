package com.upupa.common.interfaces.monitoring;

public interface MonitoringPort {

    void incrementCounter(String metricName, long value);

    void recordGauge(String metricName, double value);

    void recordHistogram(String metricName, double value);

    void startTimer(String metricName);

    void stopTimer(String metricName);
}
