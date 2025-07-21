package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class gg extends yh implements x1f {
    private static final gg zzb;
    private int zzd;
    private String zze = "";
    private hf zzf;

    static {
        gg ggVar = new gg();
        zzb = ggVar;
        yh.D(gg.class, ggVar);
    }

    private gg() {
    }

    public static fg M() {
        return (fg) zzb.k();
    }

    public static gg O() {
        return zzb;
    }

    public static gg P(zzgyl zzgylVar, ph phVar) {
        return (gg) yh.q(zzb, zzgylVar, phVar);
    }

    static /* synthetic */ void R(gg ggVar, String str) {
        str.getClass();
        ggVar.zze = str;
    }

    static /* synthetic */ void S(gg ggVar, hf hfVar) {
        hfVar.getClass();
        ggVar.zzf = hfVar;
        ggVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new gg();
        }
        eg egVar = null;
        if (i2 == 4) {
            return new fg(egVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final hf L() {
        hf hfVar = this.zzf;
        return hfVar == null ? hf.N() : hfVar;
    }

    public final String Q() {
        return this.zze;
    }
}
