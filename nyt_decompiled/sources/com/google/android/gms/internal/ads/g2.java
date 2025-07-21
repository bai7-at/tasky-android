package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class g2 extends yh implements x1f {
    private static final g2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        g2 g2Var = new g2();
        zzb = g2Var;
        yh.D(g2.class, g2Var);
    }

    private g2() {
    }

    public static f2 O() {
        return (f2) zzb.k();
    }

    public static g2 Q() {
        return zzb;
    }

    public static g2 R(zzgyl zzgylVar) {
        return (g2) yh.o(zzb, zzgylVar);
    }

    public static g2 S(zzgyl zzgylVar, ph phVar) {
        return (g2) yh.q(zzb, zzgylVar, phVar);
    }

    static /* synthetic */ void V(g2 g2Var, String str) {
        str.getClass();
        g2Var.zzd |= 1;
        g2Var.zze = str;
    }

    static /* synthetic */ void W(g2 g2Var, long j) {
        g2Var.zzd |= 16;
        g2Var.zzi = j;
    }

    static /* synthetic */ void X(g2 g2Var, String str) {
        str.getClass();
        g2Var.zzd |= 2;
        g2Var.zzf = str;
    }

    static /* synthetic */ void Y(g2 g2Var, long j) {
        g2Var.zzd |= 4;
        g2Var.zzg = j;
    }

    static /* synthetic */ void Z(g2 g2Var, long j) {
        g2Var.zzd |= 8;
        g2Var.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new g2();
        }
        e2 e2Var = null;
        if (i2 == 4) {
            return new f2(e2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long L() {
        return this.zzh;
    }

    public final long M() {
        return this.zzg;
    }

    public final long N() {
        return this.zzi;
    }

    public final String T() {
        return this.zzf;
    }

    public final String U() {
        return this.zze;
    }
}
