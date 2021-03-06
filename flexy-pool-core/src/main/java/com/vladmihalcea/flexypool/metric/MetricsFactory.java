package com.vladmihalcea.flexypool.metric;

import com.vladmihalcea.flexypool.util.ConfigurationProperties;

/**
 * MetricsFactory - Metrics Configuration based factory
 *
 * @author Vlad Mihalcea
 */
public interface MetricsFactory {

    /**
     * Creates a new metrics instance for the given configuration.
     * @param configurationProperties configuration
     * @return metrics instance
     */
    Metrics newInstance(ConfigurationProperties configurationProperties);
}
