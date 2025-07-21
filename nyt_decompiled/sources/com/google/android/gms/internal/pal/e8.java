package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class e8 extends c0 implements by9 {
    private static final e8 zzb;
    private String zze = "";

    static {
        e8 e8Var = new e8();
        zzb = e8Var;
        c0.h(e8.class, e8Var);
    }

    private e8() {
    }

    public static e8 t() {
        return zzb;
    }

    public static e8 u(zzaby zzabyVar, ev9 ev9Var) {
        return (e8) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new e8();
        }
        c8 c8Var = null;
        if (i2 == 4) {
            return new d8(c8Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String v() {
        return this.zze;
    }
}
