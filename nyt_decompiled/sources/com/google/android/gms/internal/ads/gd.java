package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class gd extends yh implements x1f {
    private static final gd zzb;
    private int zzd;
    private md zze;
    private xe zzf;

    static {
        gd gdVar = new gd();
        zzb = gdVar;
        yh.D(gd.class, gdVar);
    }

    private gd() {
    }

    public static fd L() {
        return (fd) zzb.k();
    }

    public static gd N(zzgyl zzgylVar, ph phVar) {
        return (gd) yh.q(zzb, zzgylVar, phVar);
    }

    static /* synthetic */ void Q(gd gdVar, md mdVar) {
        mdVar.getClass();
        gdVar.zze = mdVar;
        gdVar.zzd |= 1;
    }

    static /* synthetic */ void R(gd gdVar, xe xeVar) {
        xeVar.getClass();
        gdVar.zzf = xeVar;
        gdVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new gd();
        }
        ed edVar = null;
        if (i2 == 4) {
            return new fd(edVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final md O() {
        md mdVar = this.zze;
        return mdVar == null ? md.O() : mdVar;
    }

    public final xe P() {
        xe xeVar = this.zzf;
        return xeVar == null ? xe.P() : xeVar;
    }
}
