package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class o0 extends c0 implements by9 {
    private static final o0 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        o0 o0Var = new o0();
        zzb = o0Var;
        c0.h(o0.class, o0Var);
    }

    private o0() {
    }

    static /* synthetic */ void C(o0 o0Var, long j) {
        o0Var.zze |= 32;
        o0Var.zzk = j;
    }

    public static d0 s() {
        return (d0) zzb.j();
    }

    static /* synthetic */ void u(o0 o0Var, long j) {
        o0Var.zze |= 1;
        o0Var.zzf = j;
    }

    static /* synthetic */ void v(o0 o0Var, long j) {
        o0Var.zze |= 4;
        o0Var.zzh = j;
    }

    static /* synthetic */ void w(o0 o0Var, long j) {
        o0Var.zze |= 8;
        o0Var.zzi = j;
    }

    static /* synthetic */ void x(o0 o0Var, long j) {
        o0Var.zze |= 16;
        o0Var.zzj = j;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new o0();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new d0(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
