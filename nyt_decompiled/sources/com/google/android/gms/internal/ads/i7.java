package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class i7 extends yh implements x1f {
    private static final i7 zzb;
    private n1f zzd = yh.x();

    static {
        i7 i7Var = new i7();
        zzb = i7Var;
        yh.D(i7.class, i7Var);
    }

    private i7() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", f7.class});
        }
        if (i2 == 3) {
            return new i7();
        }
        g7 g7Var = null;
        if (i2 == 4) {
            return new h7(g7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
