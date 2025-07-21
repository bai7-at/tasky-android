package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class uf extends yh implements x1f {
    private static final uf zzb;
    private int zzd;
    private n1f zze = yh.x();

    static {
        uf ufVar = new uf();
        zzb = ufVar;
        yh.D(uf.class, ufVar);
    }

    private uf() {
    }

    public static rf L() {
        return (rf) zzb.k();
    }

    static /* synthetic */ void O(uf ufVar, tf tfVar) {
        tfVar.getClass();
        n1f n1fVar = ufVar.zze;
        if (!n1fVar.zzc()) {
            ufVar.zze = yh.y(n1fVar);
        }
        ufVar.zze.add(tfVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", tf.class});
        }
        if (i2 == 3) {
            return new uf();
        }
        qf qfVar = null;
        if (i2 == 4) {
            return new rf(qfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
