package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class h4 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    final /* synthetic */ k4 e;

    public h4(k4 k4Var, String str, long j) {
        this.e = k4Var;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.k().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.k().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
