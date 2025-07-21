package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class uk extends yh implements x1f {
    private static final uk zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private byte zzg = 2;

    static {
        uk ukVar = new uk();
        zzb = ukVar;
        yh.D(uk.class, ukVar);
    }

    private uk() {
        zzgyl zzgylVar = zzgyl.a;
        this.zze = zzgylVar;
        this.zzf = zzgylVar;
    }

    public static tk L() {
        return (tk) zzb.k();
    }

    static /* synthetic */ void N(uk ukVar, zzgyl zzgylVar) {
        ukVar.zzd |= 1;
        ukVar.zze = zzgylVar;
    }

    static /* synthetic */ void O(uk ukVar, zzgyl zzgylVar) {
        ukVar.zzd |= 2;
        ukVar.zzf = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new uk();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new tk(wjVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
