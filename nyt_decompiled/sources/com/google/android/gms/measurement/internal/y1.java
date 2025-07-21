package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.so;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class y1 extends z2 {
    private final Map b;
    private final Map c;
    private long d;

    public y1(a5 a5Var) {
        super(a5Var);
        this.c = new so();
        this.b = new so();
    }

    static /* synthetic */ void d(y1 y1Var, String str, long j) {
        y1Var.c();
        Preconditions.checkNotEmpty(str);
        if (y1Var.c.isEmpty()) {
            y1Var.d = j;
        }
        Integer num = (Integer) y1Var.c.get(str);
        if (num != null) {
            y1Var.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (y1Var.c.size() >= 100) {
            y1Var.a.o().v().a("Too many ads visible");
        } else {
            y1Var.c.put(str, 1);
            y1Var.b.put(str, Long.valueOf(j));
        }
    }

    static /* synthetic */ void f(y1 y1Var, String str, long j) {
        y1Var.c();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) y1Var.c.get(str);
        if (num == null) {
            y1Var.a.o().n().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        e7 s = y1Var.a.J().s(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            y1Var.c.put(str, Integer.valueOf(intValue));
            return;
        }
        y1Var.c.remove(str);
        Long l = (Long) y1Var.b.get(str);
        if (l == null) {
            y1Var.a.o().n().a("First ad unit exposure time was never set");
        } else {
            long longValue = l.longValue();
            y1Var.b.remove(str);
            y1Var.l(str, j - longValue, s);
        }
        if (y1Var.c.isEmpty()) {
            long j2 = y1Var.d;
            if (j2 == 0) {
                y1Var.a.o().n().a("First ad exposure time was never set");
            } else {
                y1Var.k(j - j2, s);
                y1Var.d = 0L;
            }
        }
    }

    private final void k(long j, e7 e7Var) {
        if (e7Var == null) {
            this.a.o().u().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.a.o().u().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        x9.x(e7Var, bundle, true);
        this.a.H().u("am", "_xa", bundle);
    }

    private final void l(String str, long j, e7 e7Var) {
        if (e7Var == null) {
            this.a.o().u().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.a.o().u().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        x9.x(e7Var, bundle, true);
        this.a.H().u("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(long j) {
        Iterator it2 = this.b.keySet().iterator();
        while (it2.hasNext()) {
            this.b.put((String) it2.next(), Long.valueOf(j));
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.d = j;
    }

    public final void h(String str, long j) {
        if (str == null || str.length() == 0) {
            this.a.o().n().a("Ad unit id must be a non-empty string");
        } else {
            this.a.e().y(new a(this, str, j));
        }
    }

    public final void i(String str, long j) {
        if (str == null || str.length() == 0) {
            this.a.o().n().a("Ad unit id must be a non-empty string");
        } else {
            this.a.e().y(new w(this, str, j));
        }
    }

    public final void j(long j) {
        e7 s = this.a.J().s(false);
        for (String str : this.b.keySet()) {
            l(str, j - ((Long) this.b.get(str)).longValue(), s);
        }
        if (!this.b.isEmpty()) {
            k(j - this.d, s);
        }
        m(j);
    }
}
