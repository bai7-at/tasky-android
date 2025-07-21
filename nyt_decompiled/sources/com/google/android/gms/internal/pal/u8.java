package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class u8 extends c0 implements by9 {
    private static final u8 zzb;
    private int zze;

    static {
        u8 u8Var = new u8();
        zzb = u8Var;
        c0.h(u8.class, u8Var);
    }

    private u8() {
    }

    public static u8 t() {
        return zzb;
    }

    public static u8 u(zzaby zzabyVar, ev9 ev9Var) {
        return (u8) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new u8();
        }
        s8 s8Var = null;
        if (i2 == 4) {
            return new t8(s8Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
