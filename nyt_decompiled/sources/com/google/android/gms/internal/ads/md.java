package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class md extends yh implements x1f {
    private static final md zzb;
    private int zzd;
    private pd zze;
    private int zzf;

    static {
        md mdVar = new md();
        zzb = mdVar;
        yh.D(md.class, mdVar);
    }

    private md() {
    }

    public static ld M() {
        return (ld) zzb.k();
    }

    public static md O() {
        return zzb;
    }

    static /* synthetic */ void Q(md mdVar, pd pdVar) {
        pdVar.getClass();
        mdVar.zze = pdVar;
        mdVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new md();
        }
        kd kdVar = null;
        if (i2 == 4) {
            return new ld(kdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zzf;
    }

    public final pd P() {
        pd pdVar = this.zze;
        return pdVar == null ? pd.O() : pdVar;
    }
}
