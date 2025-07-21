package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
abstract class g0 {
    private static final g0 a;
    private static final g0 b;

    static {
        d0 d0Var = null;
        a = new e0(d0Var);
        b = new f0(d0Var);
    }

    /* synthetic */ g0(d0 d0Var) {
    }

    static g0 c() {
        return a;
    }

    static g0 d() {
        return b;
    }

    abstract void a(Object obj, long j);

    abstract void b(Object obj, Object obj2, long j);
}
