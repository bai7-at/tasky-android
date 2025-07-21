package com.google.android.gms.internal.ads;

import defpackage.doa;
import defpackage.foa;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class x3 extends yh implements x1f {
    private static final x3 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        x3 x3Var = new x3();
        zzb = x3Var;
        yh.D(x3.class, x3Var);
    }

    private x3() {
    }

    public static u3 L() {
        return (u3) zzb.k();
    }

    public static x3 N() {
        return zzb;
    }

    static /* synthetic */ void S(x3 x3Var, int i) {
        x3Var.zze = i - 1;
        x3Var.zzd |= 1;
    }

    static /* synthetic */ void T(x3 x3Var, int i) {
        x3Var.zzf = i - 1;
        x3Var.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", w3.a, "zzf", v3.a});
        }
        if (i2 == 3) {
            return new x3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new u3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean O() {
        return (this.zzd & 2) != 0;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }

    public final int Q() {
        int a = doa.a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int R() {
        int a = foa.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
