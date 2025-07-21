package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class f4 {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    final /* synthetic */ k4 e;

    public f4(k4 k4Var, String str, boolean z) {
        this.e = k4Var;
        Preconditions.checkNotEmpty(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.k().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.k().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
