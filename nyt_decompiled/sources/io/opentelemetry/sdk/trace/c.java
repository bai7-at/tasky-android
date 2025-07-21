package io.opentelemetry.sdk.trace;

/* loaded from: classes5.dex */
public interface c {
    static c a() {
        return RandomIdGenerator.INSTANCE;
    }

    String generateSpanId();

    String generateTraceId();
}
