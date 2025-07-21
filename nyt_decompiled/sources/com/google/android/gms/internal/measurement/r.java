package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;

/* loaded from: classes3.dex */
public final class r extends j2 implements eef {
    private static final r zza;
    private int zze;
    private String zzf = "";
    private tbf zzg = j2.l();
    private boolean zzh;

    static {
        r rVar = new r();
        zza = rVar;
        j2.p(r.class, rVar);
    }

    private r() {
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", x.class, "zzh"});
        }
        if (i2 == 3) {
            return new r();
        }
        p pVar = null;
        if (i2 == 4) {
            return new q(pVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String s() {
        return this.zzf;
    }
}
