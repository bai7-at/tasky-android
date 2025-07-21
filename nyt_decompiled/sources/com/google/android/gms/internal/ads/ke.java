package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class ke extends yh implements x1f {
    private static final ke zzb;
    private int zzd;
    private int zze;

    static {
        ke keVar = new ke();
        zzb = keVar;
        yh.D(ke.class, keVar);
    }

    private ke() {
    }

    public static je N() {
        return (je) zzb.k();
    }

    public static ke P(zzgyl zzgylVar, ph phVar) {
        return (ke) yh.q(zzb, zzgylVar, phVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i2 == 3) {
            return new ke();
        }
        ie ieVar = null;
        if (i2 == 4) {
            return new je(ieVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zzd;
    }

    public final int M() {
        return this.zze;
    }
}
