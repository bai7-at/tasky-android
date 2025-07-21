package com.datadog.android.trace;

/* loaded from: classes2.dex */
public enum TracingHeaderType {
    DATADOG("DATADOG"),
    B3("B3"),
    B3MULTI("B3MULTI"),
    TRACECONTEXT("TRACECONTEXT");

    private final String headerType;

    TracingHeaderType(String str) {
        this.headerType = str;
    }

    public final String getHeaderType() {
        return this.headerType;
    }
}
