package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.mw9;
import java.util.List;

/* loaded from: classes3.dex */
public final class n8 extends c0 implements by9 {
    private static final n8 zzb;
    private String zze = "";
    private mw9 zzf = c0.o();

    static {
        n8 n8Var = new n8();
        zzb = n8Var;
        c0.h(n8.class, n8Var);
    }

    private n8() {
    }

    public static n8 t() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", n7.class});
        }
        if (i2 == 3) {
            return new n8();
        }
        l8 l8Var = null;
        if (i2 == 4) {
            return new m8(l8Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final List u() {
        return this.zzf;
    }
}
