package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class r1 extends yh implements x1f {
    private static final r1 zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private zzgyl zzg;
    private zzgyl zzh;

    static {
        r1 r1Var = new r1();
        zzb = r1Var;
        yh.D(r1.class, r1Var);
    }

    private r1() {
        zzgyl zzgylVar = zzgyl.a;
        this.zze = zzgylVar;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    public static q1 L() {
        return (q1) zzb.k();
    }

    public static r1 N(byte[] bArr, ph phVar) {
        return (r1) yh.s(zzb, bArr, phVar);
    }

    static /* synthetic */ void S(r1 r1Var, zzgyl zzgylVar) {
        r1Var.zzd |= 1;
        r1Var.zze = zzgylVar;
    }

    static /* synthetic */ void T(r1 r1Var, zzgyl zzgylVar) {
        r1Var.zzd |= 2;
        r1Var.zzf = zzgylVar;
    }

    static /* synthetic */ void U(r1 r1Var, zzgyl zzgylVar) {
        r1Var.zzd |= 4;
        r1Var.zzg = zzgylVar;
    }

    static /* synthetic */ void V(r1 r1Var, zzgyl zzgylVar) {
        r1Var.zzd |= 8;
        r1Var.zzh = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new r1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new q1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgyl O() {
        return this.zze;
    }

    public final zzgyl P() {
        return this.zzf;
    }

    public final zzgyl Q() {
        return this.zzh;
    }

    public final zzgyl R() {
        return this.zzg;
    }
}
