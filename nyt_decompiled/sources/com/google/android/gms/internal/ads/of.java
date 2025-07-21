package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class of extends yh implements x1f {
    private static final of zzb;
    private int zzd;
    private ef zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        of ofVar = new of();
        zzb = ofVar;
        yh.D(of.class, ofVar);
    }

    private of() {
    }

    public static nf N() {
        return (nf) zzb.k();
    }

    static /* synthetic */ void Q(of ofVar, ef efVar) {
        efVar.getClass();
        ofVar.zze = efVar;
        ofVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new of();
        }
        lf lfVar = null;
        if (i2 == 4) {
            return new nf(lfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zzg;
    }

    public final ef M() {
        ef efVar = this.zze;
        return efVar == null ? ef.O() : efVar;
    }

    public final zzgvz P() {
        zzgvz zzb2 = zzgvz.zzb(this.zzh);
        return zzb2 == null ? zzgvz.UNRECOGNIZED : zzb2;
    }

    public final boolean T() {
        return (this.zzd & 1) != 0;
    }

    public final int U() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
