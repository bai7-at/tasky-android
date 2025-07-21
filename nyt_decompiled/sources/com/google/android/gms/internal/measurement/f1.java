package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class f1 extends j2 implements eef {
    private static final f1 zza;
    private tbf zze = j2.l();

    static {
        f1 f1Var = new f1();
        zza = f1Var;
        j2.p(f1.class, f1Var);
    }

    private f1() {
    }

    public static f1 t() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", h1.class});
        }
        if (i2 == 3) {
            return new f1();
        }
        d1 d1Var = null;
        if (i2 == 4) {
            return new e1(d1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zze.size();
    }

    public final List u() {
        return this.zze;
    }
}
