package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class wa {
    static final wa d = new wa();
    final Runnable a;
    final Executor b;
    wa c;

    wa() {
        this.a = null;
        this.b = null;
    }

    wa(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
