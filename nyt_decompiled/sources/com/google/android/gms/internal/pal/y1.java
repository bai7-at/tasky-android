package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class y1 extends c0 implements by9 {
    private static final y1 zzb;
    private int zze;
    private zzaby zzf;
    private zzaby zzg;

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        c0.h(y1.class, y1Var);
    }

    private y1() {
        zzaby zzabyVar = zzaby.a;
        this.zzf = zzabyVar;
        this.zzg = zzabyVar;
    }

    public static x1 s() {
        return (x1) zzb.j();
    }

    static /* synthetic */ void u(y1 y1Var, zzaby zzabyVar) {
        y1Var.zze |= 1;
        y1Var.zzf = zzabyVar;
    }

    static /* synthetic */ void v(y1 y1Var, zzaby zzabyVar) {
        y1Var.zze |= 2;
        y1Var.zzg = zzabyVar;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new y1();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new x1(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
