package com.google.android.gms.internal.ads;

import defpackage.o0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class gl extends yh implements x1f {
    private static final gl zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        gl glVar = new gl();
        zzb = glVar;
        yh.D(gl.class, glVar);
    }

    private gl() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            o0f o0fVar = el.a;
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", o0fVar, "zzf", "zzg", o0fVar});
        }
        if (i2 == 3) {
            return new gl();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new fl(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
