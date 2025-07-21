package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class g4 extends yh implements x1f {
    private static final g4 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private n1f zze = yh.x();
    private String zzi = "";
    private String zzj = "";

    static {
        g4 g4Var = new g4();
        zzb = g4Var;
        yh.D(g4.class, g4Var);
    }

    private g4() {
    }

    public static d4 L() {
        return (d4) zzb.k();
    }

    static /* synthetic */ void N(g4 g4Var, Iterable iterable) {
        n1f n1fVar = g4Var.zze;
        if (!n1fVar.zzc()) {
            g4Var.zze = yh.y(n1fVar);
        }
        rg.g(iterable, g4Var.zze);
    }

    static /* synthetic */ void O(g4 g4Var, int i) {
        g4Var.zzd |= 1;
        g4Var.zzf = i;
    }

    static /* synthetic */ void P(g4 g4Var, int i) {
        g4Var.zzd |= 2;
        g4Var.zzg = i;
    }

    static /* synthetic */ void Q(g4 g4Var, long j) {
        g4Var.zzd |= 4;
        g4Var.zzh = j;
    }

    static /* synthetic */ void R(g4 g4Var, String str) {
        str.getClass();
        g4Var.zzd |= 8;
        g4Var.zzi = str;
    }

    static /* synthetic */ void S(g4 g4Var, String str) {
        str.getClass();
        g4Var.zzd |= 16;
        g4Var.zzj = str;
    }

    static /* synthetic */ void T(g4 g4Var, long j) {
        g4Var.zzd |= 32;
        g4Var.zzk = j;
    }

    static /* synthetic */ void U(g4 g4Var, int i) {
        g4Var.zzd |= 64;
        g4Var.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", c4.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new g4();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new d4(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
