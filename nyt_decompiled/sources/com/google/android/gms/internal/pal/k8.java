package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class k8 extends c0 implements by9 {
    private static final k8 zzb;
    private String zze = "";
    private k7 zzf;

    static {
        k8 k8Var = new k8();
        zzb = k8Var;
        c0.h(k8.class, k8Var);
    }

    private k8() {
    }

    public static k8 t() {
        return zzb;
    }

    public static k8 u(zzaby zzabyVar, ev9 ev9Var) {
        return (k8) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new k8();
        }
        i8 i8Var = null;
        if (i2 == 4) {
            return new j8(i8Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String v() {
        return this.zze;
    }

    public final boolean w() {
        return this.zzf != null;
    }
}
