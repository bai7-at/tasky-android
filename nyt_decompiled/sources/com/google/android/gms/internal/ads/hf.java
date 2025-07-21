package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class hf extends yh implements x1f {
    private static final hf zzb;
    private String zzd = "";
    private zzgyl zze = zzgyl.a;
    private int zzf;

    static {
        hf hfVar = new hf();
        zzb = hfVar;
        yh.D(hf.class, hfVar);
    }

    private hf() {
    }

    public static gf L() {
        return (gf) zzb.k();
    }

    public static hf N() {
        return zzb;
    }

    public static hf O(byte[] bArr, ph phVar) {
        return (hf) yh.s(zzb, bArr, phVar);
    }

    static /* synthetic */ void S(hf hfVar, String str) {
        str.getClass();
        hfVar.zzd = str;
    }

    static /* synthetic */ void T(hf hfVar, zzgyl zzgylVar) {
        zzgylVar.getClass();
        hfVar.zze = zzgylVar;
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
            return new hf();
        }
        ff ffVar = null;
        if (i2 == 4) {
            return new gf(ffVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgvz P() {
        zzgvz zzb2 = zzgvz.zzb(this.zzf);
        return zzb2 == null ? zzgvz.UNRECOGNIZED : zzb2;
    }

    public final zzgyl Q() {
        return this.zze;
    }

    public final String R() {
        return this.zzd;
    }
}
