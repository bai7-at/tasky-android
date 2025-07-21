package com.google.android.gms.internal.pal;

import defpackage.b3g;
import defpackage.by9;

/* loaded from: classes3.dex */
public final class k7 extends c0 implements by9 {
    private static final k7 zzb;
    private String zze = "";
    private zzaby zzf = zzaby.a;
    private int zzg;

    static {
        k7 k7Var = new k7();
        zzb = k7Var;
        c0.h(k7.class, k7Var);
    }

    private k7() {
    }

    public static j7 s() {
        return (j7) zzb.j();
    }

    public static k7 u() {
        return zzb;
    }

    static /* synthetic */ void x(k7 k7Var, String str) {
        str.getClass();
        k7Var.zze = str;
    }

    public final int E() {
        int b = b3g.b(this.zzg);
        if (b == 0) {
            return 1;
        }
        return b;
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
            return new k7();
        }
        i7 i7Var = null;
        if (i2 == 4) {
            return new j7(i7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby v() {
        return this.zzf;
    }

    public final String w() {
        return this.zze;
    }
}
