package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class w8 implements Runnable {
    final long a;
    final long b;
    final /* synthetic */ x8 c;

    w8(x8 x8Var, long j, long j2) {
        this.c = x8Var;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.a.e().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.v8
            @Override // java.lang.Runnable
            public final void run() {
                w8 w8Var = w8.this;
                x8 x8Var = w8Var.c;
                long j = w8Var.a;
                long j2 = w8Var.b;
                x8Var.b.c();
                x8Var.b.a.o().m().a("Application going to the background");
                x8Var.b.a.E().q.a(true);
                Bundle bundle = new Bundle();
                if (!x8Var.b.a.y().C()) {
                    x8Var.b.e.b(j2);
                    x8Var.b.e.d(false, false, j2);
                }
                x8Var.b.a.H().v(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, bundle);
            }
        });
    }
}
