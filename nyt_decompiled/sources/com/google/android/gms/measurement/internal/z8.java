package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.nytimes.android.abra.models.AbraPackageKt;
import defpackage.cnf;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class z8 {
    protected long a;
    protected long b;
    private final n c;
    final /* synthetic */ b9 d;

    public z8(b9 b9Var) {
        this.d = b9Var;
        this.c = new y8(this, b9Var.a);
        long elapsedRealtime = b9Var.a.p().elapsedRealtime();
        this.a = elapsedRealtime;
        this.b = elapsedRealtime;
    }

    final void a() {
        this.c.b();
        this.a = 0L;
        this.b = 0L;
    }

    final void b(long j) {
        this.c.b();
    }

    final void c(long j) {
        this.d.c();
        this.c.b();
        this.a = j;
        this.b = j;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.d.c();
        this.d.d();
        cnf.b();
        if (!this.d.a.y().A(null, m3.g0)) {
            this.d.a.E().o.b(this.d.a.p().currentTimeMillis());
        } else if (this.d.a.k()) {
            this.d.a.E().o.b(this.d.a.p().currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.a.o().u().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        this.d.a.o().u().b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        x9.x(this.d.a.J().s(!this.d.a.y().C()), bundle, true);
        if (!z2) {
            this.d.a.H().u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.a = j;
        this.c.b();
        this.c.d(AbraPackageKt.MS_IN_HOUR);
        return true;
    }
}
