package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* loaded from: classes3.dex */
final class x8 {
    private w8 a;
    final /* synthetic */ b9 b;

    x8(b9 b9Var) {
        this.b = b9Var;
    }

    final void a(long j) {
        Handler handler;
        this.a = new w8(this, this.b.a.p().currentTimeMillis(), j);
        handler = this.b.c;
        handler.postDelayed(this.a, 2000L);
    }

    final void b() {
        Handler handler;
        this.b.c();
        w8 w8Var = this.a;
        if (w8Var != null) {
            handler = this.b.c;
            handler.removeCallbacks(w8Var);
        }
        this.b.a.E().q.a(false);
    }
}
