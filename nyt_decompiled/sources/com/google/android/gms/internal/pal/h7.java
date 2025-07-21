package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class h7 extends c0 implements by9 {
    private static final h7 zzb;
    private String zze = "";
    private zzaby zzf = zzaby.a;
    private int zzg;

    static {
        h7 h7Var = new h7();
        zzb = h7Var;
        c0.h(h7.class, h7Var);
    }

    private h7() {
    }

    static /* synthetic */ void C(h7 h7Var, String str) {
        str.getClass();
        h7Var.zze = str;
    }

    public static f7 s() {
        return (f7) zzb.j();
    }

    public static h7 v() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new h7();
        }
        e7 e7Var = null;
        if (i2 == 4) {
            return new f7(e7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzvn t() {
        zzvn zzb2 = zzvn.zzb(this.zzg);
        return zzb2 == null ? zzvn.UNRECOGNIZED : zzb2;
    }

    public final zzaby w() {
        return this.zzf;
    }

    public final String x() {
        return this.zze;
    }
}
