package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.k;
import com.google.android.exoplayer2.source.o;
import defpackage.cj1;
import defpackage.dx6;
import defpackage.fi7;
import defpackage.gc8;
import defpackage.hq8;
import defpackage.ht2;
import defpackage.jk1;
import defpackage.kh1;
import defpackage.ur;
import defpackage.vl0;
import defpackage.z19;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;

/* loaded from: classes2.dex */
public final class k {
    boolean A;
    Looper B;
    boolean C;
    final Context a;
    vl0 b;
    long c;
    gc8 d;
    gc8 e;
    gc8 f;
    gc8 g;
    gc8 h;
    ht2 i;
    Looper j;
    com.google.android.exoplayer2.audio.a k;
    boolean l;
    int m;
    boolean n;
    boolean o;
    boolean p;
    int q;
    int r;
    boolean s;
    fi7 t;
    long u;
    long v;
    v0 w;
    long x;
    long y;
    boolean z;

    public k(final Context context) {
        this(context, new gc8() { // from class: e72
            @Override // defpackage.gc8
            public final Object get() {
                dx6 g;
                g = k.g(context);
                return g;
            }
        }, new gc8() { // from class: f72
            @Override // defpackage.gc8
            public final Object get() {
                o.a h;
                h = k.h(context);
                return h;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dx6 g(Context context) {
        return new cj1(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o.a h(Context context) {
        return new com.google.android.exoplayer2.source.i(context, new kh1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hq8 i(Context context) {
        return new jk1(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hq8 k(hq8 hq8Var) {
        return hq8Var;
    }

    b2 f() {
        ur.g(!this.C);
        this.C = true;
        return new b2(this);
    }

    public k l(final hq8 hq8Var) {
        ur.g(!this.C);
        ur.e(hq8Var);
        this.f = new gc8() { // from class: g72
            @Override // defpackage.gc8
            public final Object get() {
                hq8 k;
                k = k.k(hq8.this);
                return k;
            }
        };
        return this;
    }

    private k(final Context context, gc8 gc8Var, gc8 gc8Var2) {
        this(context, gc8Var, gc8Var2, new gc8() { // from class: h72
            @Override // defpackage.gc8
            public final Object get() {
                hq8 i;
                i = k.i(context);
                return i;
            }
        }, new gc8() { // from class: i72
            @Override // defpackage.gc8
            public final Object get() {
                return new fi1();
            }
        }, new gc8() { // from class: j72
            @Override // defpackage.gc8
            public final Object get() {
                l40 n;
                n = pg1.n(context);
                return n;
            }
        }, new ht2() { // from class: k72
            @Override // defpackage.ht2
            public final Object apply(Object obj) {
                return new dg1((vl0) obj);
            }
        });
    }

    private k(Context context, gc8 gc8Var, gc8 gc8Var2, gc8 gc8Var3, gc8 gc8Var4, gc8 gc8Var5, ht2 ht2Var) {
        this.a = (Context) ur.e(context);
        this.d = gc8Var;
        this.e = gc8Var2;
        this.f = gc8Var3;
        this.g = gc8Var4;
        this.h = gc8Var5;
        this.i = ht2Var;
        this.j = z19.R();
        this.k = com.google.android.exoplayer2.audio.a.g;
        this.m = 0;
        this.q = 1;
        this.r = 0;
        this.s = true;
        this.t = fi7.g;
        this.u = BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT;
        this.v = 15000L;
        this.w = new h.b().a();
        this.b = vl0.a;
        this.x = 500L;
        this.y = 2000L;
        this.A = true;
    }
}
