package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class jd extends yh implements x1f {
    private static final jd zzb;
    private int zzd;
    private int zze;
    private pd zzf;
    private zzgyl zzg = zzgyl.a;

    static {
        jd jdVar = new jd();
        zzb = jdVar;
        yh.D(jd.class, jdVar);
    }

    private jd() {
    }

    public static id M() {
        return (id) zzb.k();
    }

    public static jd O() {
        return zzb;
    }

    static /* synthetic */ void R(jd jdVar, pd pdVar) {
        pdVar.getClass();
        jdVar.zzf = pdVar;
        jdVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new jd();
        }
        hd hdVar = null;
        if (i2 == 4) {
            return new id(hdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zze;
    }

    public final pd P() {
        pd pdVar = this.zzf;
        return pdVar == null ? pd.O() : pdVar;
    }

    public final zzgyl Q() {
        return this.zzg;
    }
}
