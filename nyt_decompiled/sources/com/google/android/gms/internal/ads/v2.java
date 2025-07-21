package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class v2 extends yh implements x1f {
    private static final v2 zzb;
    private n1f zzd = yh.x();

    static {
        v2 v2Var = new v2();
        zzb = v2Var;
        yh.D(v2.class, v2Var);
    }

    private v2() {
    }

    public static p2 L() {
        return (p2) zzb.k();
    }

    static /* synthetic */ void N(v2 v2Var, o2 o2Var) {
        o2Var.getClass();
        n1f n1fVar = v2Var.zzd;
        if (!n1fVar.zzc()) {
            v2Var.zzd = yh.y(n1fVar);
        }
        v2Var.zzd.add(o2Var);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", o2.class});
        }
        if (i2 == 3) {
            return new v2();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new p2(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
