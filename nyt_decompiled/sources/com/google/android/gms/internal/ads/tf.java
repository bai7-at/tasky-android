package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class tf extends yh implements x1f {
    private static final tf zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        tf tfVar = new tf();
        zzb = tfVar;
        yh.D(tf.class, tfVar);
    }

    private tf() {
    }

    public static sf L() {
        return (sf) zzb.k();
    }

    static /* synthetic */ void N(tf tfVar, String str) {
        str.getClass();
        tfVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new tf();
        }
        qf qfVar = null;
        if (i2 == 4) {
            return new sf(qfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
