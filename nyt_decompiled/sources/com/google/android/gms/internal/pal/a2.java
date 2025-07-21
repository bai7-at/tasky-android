package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class a2 extends c0 implements by9 {
    private static final a2 zzb;
    private int zze;
    private zzaby zzf;
    private zzaby zzg;
    private zzaby zzh;
    private zzaby zzi;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        c0.h(a2.class, a2Var);
    }

    private a2() {
        zzaby zzabyVar = zzaby.a;
        this.zzf = zzabyVar;
        this.zzg = zzabyVar;
        this.zzh = zzabyVar;
        this.zzi = zzabyVar;
    }

    static /* synthetic */ void E(a2 a2Var, zzaby zzabyVar) {
        a2Var.zze |= 1;
        a2Var.zzf = zzabyVar;
    }

    static /* synthetic */ void F(a2 a2Var, zzaby zzabyVar) {
        a2Var.zze |= 2;
        a2Var.zzg = zzabyVar;
    }

    static /* synthetic */ void G(a2 a2Var, zzaby zzabyVar) {
        a2Var.zze |= 4;
        a2Var.zzh = zzabyVar;
    }

    static /* synthetic */ void H(a2 a2Var, zzaby zzabyVar) {
        a2Var.zze |= 8;
        a2Var.zzi = zzabyVar;
    }

    public static z1 s() {
        return (z1) zzb.j();
    }

    public static a2 u(byte[] bArr, ev9 ev9Var) {
        return (a2) c0.m(zzb, bArr, ev9Var);
    }

    public final zzaby C() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new a2();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new z1(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby v() {
        return this.zzf;
    }

    public final zzaby w() {
        return this.zzg;
    }

    public final zzaby x() {
        return this.zzi;
    }
}
