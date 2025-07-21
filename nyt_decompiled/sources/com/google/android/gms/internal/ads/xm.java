package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import defpackage.acd;
import defpackage.e9f;
import defpackage.fhe;
import defpackage.gge;
import defpackage.ggf;
import defpackage.i9f;
import defpackage.iv9;
import defpackage.izf;
import defpackage.j9f;
import defpackage.k9f;
import defpackage.khe;
import defpackage.waf;
import defpackage.yzf;

/* loaded from: classes3.dex */
public final class xm {
    final Context a;
    acd b;
    fhe c;
    fhe d;
    fhe e;
    fhe f;
    fhe g;
    gge h;
    Looper i;
    waf j;
    int k;
    boolean l;
    ggf m;
    long n;
    long o;
    boolean p;
    boolean q;
    um r;

    public xm(final Context context, o6 o6Var) {
        e9f e9fVar = new e9f(o6Var);
        wm wmVar = new wm(context);
        fhe fheVar = new fhe() { // from class: g9f
            @Override // defpackage.fhe
            public final Object zza() {
                return new k6g(context);
            }
        };
        i9f i9fVar = new fhe() { // from class: i9f
            @Override // defpackage.fhe
            public final Object zza() {
                return new j8f();
            }
        };
        j9f j9fVar = new j9f(context);
        k9f k9fVar = new gge() { // from class: k9f
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return new qnf((acd) obj);
            }
        };
        context.getClass();
        this.a = context;
        this.c = e9fVar;
        this.d = wmVar;
        this.e = fheVar;
        this.f = i9fVar;
        this.g = j9fVar;
        this.h = k9fVar;
        this.i = khe.M();
        this.j = waf.b;
        this.k = 1;
        this.l = true;
        this.m = ggf.g;
        this.r = new um(0.97f, 1.03f, 1000L, 1.0E-7f, khe.F(20L), khe.F(500L), 0.999f, null);
        this.b = acd.a;
        this.n = 500L;
        this.o = 2000L;
        this.p = true;
    }

    static /* synthetic */ yzf a(Context context) {
        return new izf(context, new iv9());
    }
}
