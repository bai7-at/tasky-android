package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes3.dex */
final class lp {
    public final String a;
    public final boolean b;
    public final boolean c;

    public lp(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == lp.class) {
            lp lpVar = (lp) obj;
            if (TextUtils.equals(this.a, lpVar.a) && this.b == lpVar.b && this.c == lpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true != this.c ? 1237 : 1231);
    }
}
