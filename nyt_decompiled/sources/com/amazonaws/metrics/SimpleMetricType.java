package com.amazonaws.metrics;

/* loaded from: classes.dex */
public abstract class SimpleMetricType implements MetricType {
    public final boolean equals(Object obj) {
        if (obj instanceof MetricType) {
            return name().equals(((MetricType) obj).name());
        }
        return false;
    }

    public final int hashCode() {
        return name().hashCode();
    }

    @Override // com.amazonaws.metrics.MetricType
    public abstract String name();

    public final String toString() {
        return name();
    }
}
