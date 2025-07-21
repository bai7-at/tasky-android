package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class j4 {
    private final String a;
    private boolean b;
    private String c;
    final /* synthetic */ k4 d;

    public j4(k4 k4Var, String str, String str2) {
        this.d = k4Var;
        Preconditions.checkNotEmpty(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.k().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.k().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
