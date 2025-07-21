package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class kg extends yh implements x1f {
    private static final kg zzb;
    private String zzd = "";
    private n1f zze = yh.x();

    static {
        kg kgVar = new kg();
        zzb = kgVar;
        yh.D(kg.class, kgVar);
    }

    private kg() {
    }

    public static kg M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", kf.class});
        }
        if (i2 == 3) {
            return new kg();
        }
        ig igVar = null;
        if (i2 == 4) {
            return new jg(igVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
