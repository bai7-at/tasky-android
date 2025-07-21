package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class x extends j2 implements eef {
    private static final x zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        x xVar = new x();
        zza = xVar;
        j2.p(x.class, xVar);
    }

    private x() {
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new x();
        }
        p pVar = null;
        if (i2 == 4) {
            return new w(pVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
