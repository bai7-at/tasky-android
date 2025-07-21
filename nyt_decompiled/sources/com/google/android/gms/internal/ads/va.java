package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class va {
    static final va c;
    static final va d;
    final boolean a;
    final Throwable b;

    static {
        if (eb.d) {
            d = null;
            c = null;
        } else {
            d = new va(false, null);
            c = new va(true, null);
        }
    }

    va(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
