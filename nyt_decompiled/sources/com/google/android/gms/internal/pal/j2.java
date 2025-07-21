package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.mw9;

/* loaded from: classes3.dex */
public final class j2 extends c0 implements by9 {
    private static final j2 zzb;
    private int zze;
    private mw9 zzf = c0.o();
    private zzaby zzg = zzaby.a;
    private int zzh = 1;
    private int zzi = 1;

    static {
        j2 j2Var = new j2();
        zzb = j2Var;
        c0.h(j2.class, j2Var);
    }

    private j2() {
    }

    public static i2 s() {
        return (i2) zzb.j();
    }

    static /* synthetic */ void u(j2 j2Var, zzaby zzabyVar) {
        mw9 mw9Var = j2Var.zzf;
        if (!mw9Var.zzc()) {
            j2Var.zzf = c0.e(mw9Var);
        }
        j2Var.zzf.add(zzabyVar);
    }

    static /* synthetic */ void v(j2 j2Var, zzaby zzabyVar) {
        j2Var.zze |= 1;
        j2Var.zzg = zzabyVar;
    }

    static /* synthetic */ void w(j2 j2Var, int i) {
        j2Var.zzi = 2;
        j2Var.zze |= 4;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", d2.a, "zzi", b2.a});
        }
        if (i2 == 3) {
            return new j2();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new i2(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
