package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class xe extends yh implements x1f {
    private static final xe zzb;
    private int zzd;
    private af zze;
    private int zzf;
    private int zzg;

    static {
        xe xeVar = new xe();
        zzb = xeVar;
        yh.D(xe.class, xeVar);
    }

    private xe() {
    }

    public static we N() {
        return (we) zzb.k();
    }

    public static xe P() {
        return zzb;
    }

    public static xe Q(zzgyl zzgylVar, ph phVar) {
        return (xe) yh.q(zzb, zzgylVar, phVar);
    }

    static /* synthetic */ void S(xe xeVar, af afVar) {
        afVar.getClass();
        xeVar.zze = afVar;
        xeVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new xe();
        }
        ve veVar = null;
        if (i2 == 4) {
            return new we(veVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zzf;
    }

    public final int M() {
        return this.zzg;
    }

    public final af R() {
        af afVar = this.zze;
        return afVar == null ? af.P() : afVar;
    }
}
