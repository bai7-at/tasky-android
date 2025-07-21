package io.opentelemetry.context;

import defpackage.hx0;

/* loaded from: classes5.dex */
public interface b {
    static b a() {
        return ThreadLocalContextStorage.INSTANCE;
    }

    static b get() {
        return d.b();
    }

    hx0 current();

    default hx0 root() {
        return a.root();
    }
}
