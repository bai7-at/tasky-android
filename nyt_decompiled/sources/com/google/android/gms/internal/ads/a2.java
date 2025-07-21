package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class a2 extends yh implements x1f {
    private static final a2 zzb;
    private int zzd;
    private n1f zze = yh.x();
    private zzgyl zzf = zzgyl.a;
    private int zzg = 1;
    private int zzh = 1;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        yh.D(a2.class, a2Var);
    }

    private a2() {
    }

    public static z1 L() {
        return (z1) zzb.k();
    }

    static /* synthetic */ void N(a2 a2Var, zzgyl zzgylVar) {
        n1f n1fVar = a2Var.zze;
        if (!n1fVar.zzc()) {
            a2Var.zze = yh.y(n1fVar);
        }
        a2Var.zze.add(zzgylVar);
    }

    static /* synthetic */ void O(a2 a2Var, zzgyl zzgylVar) {
        a2Var.zzd |= 1;
        a2Var.zzf = zzgylVar;
    }

    static /* synthetic */ void P(a2 a2Var, int i) {
        a2Var.zzh = 4;
        a2Var.zzd = 4 | a2Var.zzd;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", u1.a, "zzh", s1.a});
        }
        if (i2 == 3) {
            return new a2();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new z1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
