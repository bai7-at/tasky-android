package com.google.android.gms.measurement.internal;

import defpackage.vqf;

/* loaded from: classes3.dex */
final class s5 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ t5 e;

    s5(t5 t5Var, String str, String str2, String str3, long j) {
        this.e = t5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9 r9Var3;
        r9 r9Var4;
        r9 r9Var5;
        vqf.b();
        r9Var = this.e.a;
        if (r9Var.S().A(null, m3.v0)) {
            String str = this.a;
            if (str == null) {
                r9Var5 = this.e.a;
                r9Var5.u(this.b, null);
                return;
            } else {
                e7 e7Var = new e7(this.c, str, this.d);
                r9Var4 = this.e.a;
                r9Var4.u(this.b, e7Var);
                return;
            }
        }
        String str2 = this.a;
        if (str2 == null) {
            r9Var3 = this.e.a;
            r9Var3.a0().J().F(this.b, null);
        } else {
            e7 e7Var2 = new e7(this.c, str2, this.d);
            r9Var2 = this.e.a;
            r9Var2.a0().J().F(this.b, e7Var2);
        }
    }
}
