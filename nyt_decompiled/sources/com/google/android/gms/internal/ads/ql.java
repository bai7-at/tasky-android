package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class ql extends yh implements x1f {
    private static final ql zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgyl zzg;
    private zzgyl zzh;

    static {
        ql qlVar = new ql();
        zzb = qlVar;
        yh.D(ql.class, qlVar);
    }

    private ql() {
        zzgyl zzgylVar = zzgyl.a;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    public static ol L() {
        return (ol) zzb.k();
    }

    static /* synthetic */ void N(ql qlVar, String str) {
        qlVar.zzd |= 2;
        qlVar.zzf = "image/png";
    }

    static /* synthetic */ void O(ql qlVar, zzgyl zzgylVar) {
        zzgylVar.getClass();
        qlVar.zzd |= 4;
        qlVar.zzg = zzgylVar;
    }

    static /* synthetic */ void P(ql qlVar, int i) {
        qlVar.zze = 1;
        qlVar.zzd = 1 | qlVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", pl.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new ql();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new ol(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
