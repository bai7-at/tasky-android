package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class d2 extends yh implements x1f {
    private static final d2 zzb;
    private int zzd;
    private g2 zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        d2 d2Var = new d2();
        zzb = d2Var;
        yh.D(d2.class, d2Var);
    }

    private d2() {
        zzgyl zzgylVar = zzgyl.a;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
    }

    public static d2 M(zzgyl zzgylVar, ph phVar) {
        return (d2) yh.q(zzb, zzgylVar, phVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new d2();
        }
        b2 b2Var = null;
        if (i2 == 4) {
            return new c2(b2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final g2 N() {
        g2 g2Var = this.zze;
        return g2Var == null ? g2.Q() : g2Var;
    }

    public final zzgyl O() {
        return this.zzg;
    }

    public final zzgyl P() {
        return this.zzf;
    }
}
