package com.google.android.gms.measurement.internal;

import android.util.Log;

/* loaded from: classes3.dex */
final class t3 implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ x3 f;

    t3(x3 x3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = x3Var;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        k4 E = this.f.a.E();
        if (!E.j()) {
            Log.println(6, this.f.B(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        x3 x3Var = this.f;
        c = x3Var.c;
        if (c == 0) {
            if (x3Var.a.y().G()) {
                x3 x3Var2 = this.f;
                x3Var2.a.q();
                x3Var2.c = 'C';
            } else {
                x3 x3Var3 = this.f;
                x3Var3.a.q();
                x3Var3.c = 'c';
            }
        }
        x3 x3Var4 = this.f;
        j = x3Var4.d;
        if (j < 0) {
            x3Var4.a.y().m();
            x3Var4.d = 64000L;
        }
        char charAt = "01VDIWEA?".charAt(this.a);
        x3 x3Var5 = this.f;
        c2 = x3Var5.c;
        j2 = x3Var5.d;
        String str = "2" + charAt + c2 + j2 + ":" + x3.z(true, this.b, this.c, this.d, this.e);
        if (str.length() > 1024) {
            str = this.b.substring(0, 1024);
        }
        i4 i4Var = E.d;
        if (i4Var != null) {
            i4Var.b(str, 1L);
        }
    }
}
