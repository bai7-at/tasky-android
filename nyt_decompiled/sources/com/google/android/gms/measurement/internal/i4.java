package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.p6e;

/* loaded from: classes3.dex */
public final class i4 {
    final String a;
    private final String b;
    private final String c;
    private final long d;
    final /* synthetic */ k4 e;

    /* synthetic */ i4(k4 k4Var, String str, long j, p6e p6eVar) {
        this.e = k4Var;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    private final long c() {
        return this.e.k().getLong(this.a, 0L);
    }

    private final void d() {
        this.e.c();
        long currentTimeMillis = this.e.a.p().currentTimeMillis();
        SharedPreferences.Editor edit = this.e.k().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }

    public final Pair a() {
        long abs;
        this.e.c();
        this.e.c();
        long c = c();
        if (c == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c - this.e.a.p().currentTimeMillis());
        }
        long j = this.d;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            d();
            return null;
        }
        String string = this.e.k().getString(this.c, null);
        long j2 = this.e.k().getLong(this.b, 0L);
        d();
        return (string == null || j2 <= 0) ? k4.x : new Pair(string, Long.valueOf(j2));
    }

    public final void b(String str, long j) {
        this.e.c();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.k().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.k().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.e.a.M().t().nextLong();
        long j3 = j2 + 1;
        long j4 = Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.e.k().edit();
        if ((Long.MAX_VALUE & nextLong) < j4) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }
}
