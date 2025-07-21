package com.google.android.gms.common;

import android.util.Log;

/* loaded from: classes2.dex */
class p {
    private static final p e = new p(true, 3, 1, null, null);
    final boolean a;
    final String b;
    final Throwable c;
    final int d;

    private p(boolean z, int i, int i2, String str, Throwable th) {
        this.a = z;
        this.d = i;
        this.b = str;
        this.c = th;
    }

    static p b() {
        return e;
    }

    static p c(String str) {
        return new p(false, 1, 5, str, null);
    }

    static p d(String str, Throwable th) {
        return new p(false, 1, 5, str, th);
    }

    static p f(int i) {
        return new p(true, i, 1, null, null);
    }

    static p g(int i, int i2, String str, Throwable th) {
        return new p(false, i, i2, str, th);
    }

    String a() {
        return this.b;
    }

    final void e() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
