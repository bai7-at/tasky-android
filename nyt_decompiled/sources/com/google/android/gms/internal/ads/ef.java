package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class ef extends yh implements x1f {
    private static final ef zzb;
    private String zzd = "";
    private zzgyl zze = zzgyl.a;
    private int zzf;

    static {
        ef efVar = new ef();
        zzb = efVar;
        yh.D(ef.class, efVar);
    }

    private ef() {
    }

    public static cf L() {
        return (cf) zzb.k();
    }

    public static ef O() {
        return zzb;
    }

    static /* synthetic */ void R(ef efVar, String str) {
        str.getClass();
        efVar.zzd = str;
    }

    static /* synthetic */ void S(ef efVar, zzgyl zzgylVar) {
        zzgylVar.getClass();
        efVar.zze = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new ef();
        }
        bf bfVar = null;
        if (i2 == 4) {
            return new cf(bfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgus M() {
        int i = this.zzf;
        zzgus zzgusVar = zzgus.UNKNOWN_KEYMATERIAL;
        zzgus zzgusVar2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzgus.REMOTE : zzgus.ASYMMETRIC_PUBLIC : zzgus.ASYMMETRIC_PRIVATE : zzgus.SYMMETRIC : zzgus.UNKNOWN_KEYMATERIAL;
        return zzgusVar2 == null ? zzgus.UNRECOGNIZED : zzgusVar2;
    }

    public final zzgyl P() {
        return this.zze;
    }

    public final String Q() {
        return this.zzd;
    }
}
