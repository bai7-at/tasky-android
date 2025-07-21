package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class vj extends yh implements x1f {
    private static final vj zzb;
    private n1f zzd = yh.x();

    static {
        vj vjVar = new vj();
        zzb = vjVar;
        yh.D(vj.class, vjVar);
    }

    private vj() {
    }

    public static uj L() {
        return (uj) zzb.k();
    }

    static /* synthetic */ void N(vj vjVar, tj tjVar) {
        tjVar.getClass();
        n1f n1fVar = vjVar.zzd;
        if (!n1fVar.zzc()) {
            vjVar.zzd = yh.y(n1fVar);
        }
        vjVar.zzd.add(tjVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", tj.class});
        }
        if (i2 == 3) {
            return new vj();
        }
        rj rjVar = null;
        if (i2 == 4) {
            return new uj(rjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
