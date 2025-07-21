package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class c7 extends yh implements x1f {
    private static final c7 zzb;
    private n1f zzd = yh.x();

    static {
        c7 c7Var = new c7();
        zzb = c7Var;
        yh.D(c7.class, c7Var);
    }

    private c7() {
    }

    public static z6 M() {
        return (z6) zzb.k();
    }

    static /* synthetic */ void P(c7 c7Var, b7 b7Var) {
        b7Var.getClass();
        n1f n1fVar = c7Var.zzd;
        if (!n1fVar.zzc()) {
            c7Var.zzd = yh.y(n1fVar);
        }
        c7Var.zzd.add(b7Var);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", b7.class});
        }
        if (i2 == 3) {
            return new c7();
        }
        y6 y6Var = null;
        if (i2 == 4) {
            return new z6(y6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zzd.size();
    }
}
