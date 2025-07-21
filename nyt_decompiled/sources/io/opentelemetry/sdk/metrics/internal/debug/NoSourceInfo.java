package io.opentelemetry.sdk.metrics.internal.debug;

import defpackage.ac1;

/* loaded from: classes5.dex */
enum NoSourceInfo implements a {
    INSTANCE;

    public String multiLineDebugString() {
        return "\tat unknown source\n\t\t" + ac1.a();
    }

    public String shortDebugString() {
        return "unknown source";
    }
}
