package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.wdf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class p9 {
    com.google.android.gms.internal.measurement.t0 a;
    List b;
    List c;
    long d;
    final /* synthetic */ r9 e;

    /* synthetic */ p9(r9 r9Var, wdf wdfVar) {
        this.e = r9Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.j0 j0Var) {
        return ((j0Var.u() / 1000) / 60) / 60;
    }

    public final boolean a(long j, com.google.android.gms.internal.measurement.j0 j0Var) {
        Preconditions.checkNotNull(j0Var);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.c.isEmpty() && b((com.google.android.gms.internal.measurement.j0) this.c.get(0)) != b(j0Var)) {
            return false;
        }
        long O = this.d + j0Var.O();
        this.e.S();
        if (O >= Math.max(0, ((Integer) m3.j.a(null)).intValue())) {
            return false;
        }
        this.d = O;
        this.c.add(j0Var);
        this.b.add(Long.valueOf(j));
        int size = this.c.size();
        this.e.S();
        return size < Math.max(1, ((Integer) m3.k.a(null)).intValue());
    }
}
