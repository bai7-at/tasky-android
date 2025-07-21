package com.google.android.gms.internal.pal;

import defpackage.dx9;
import java.util.List;

/* loaded from: classes3.dex */
abstract class j0 {
    private static final j0 a = new h0(null);
    private static final j0 b = new i0(0 == true ? 1 : 0);

    /* synthetic */ j0(dx9 dx9Var) {
    }

    static j0 d() {
        return a;
    }

    static j0 e() {
        return b;
    }

    abstract List a(Object obj, long j);

    abstract void b(Object obj, long j);

    abstract void c(Object obj, Object obj2, long j);
}
