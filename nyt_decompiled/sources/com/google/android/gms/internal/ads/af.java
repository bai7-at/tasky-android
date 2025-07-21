package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class af extends yh implements x1f {
    private static final af zzb;
    private int zzd;
    private int zze;

    static {
        af afVar = new af();
        zzb = afVar;
        yh.D(af.class, afVar);
    }

    private af() {
    }

    public static ze N() {
        return (ze) zzb.k();
    }

    public static af P() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new af();
        }
        ye yeVar = null;
        if (i2 == 4) {
            return new ze(yeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zze;
    }

    public final zzguf M() {
        int i = this.zzd;
        zzguf zzgufVar = zzguf.UNKNOWN_HASH;
        zzguf zzgufVar2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzguf.SHA224 : zzguf.SHA512 : zzguf.SHA256 : zzguf.SHA384 : zzguf.SHA1 : zzguf.UNKNOWN_HASH;
        return zzgufVar2 == null ? zzguf.UNRECOGNIZED : zzgufVar2;
    }
}
