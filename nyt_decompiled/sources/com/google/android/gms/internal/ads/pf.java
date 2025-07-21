package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public final class pf extends yh implements x1f {
    private static final pf zzb;
    private int zzd;
    private n1f zze = yh.x();

    static {
        pf pfVar = new pf();
        zzb = pfVar;
        yh.D(pf.class, pfVar);
    }

    private pf() {
    }

    public static mf N() {
        return (mf) zzb.k();
    }

    public static pf Q(InputStream inputStream, ph phVar) {
        return (pf) yh.r(zzb, inputStream, phVar);
    }

    static /* synthetic */ void T(pf pfVar, of ofVar) {
        ofVar.getClass();
        n1f n1fVar = pfVar.zze;
        if (!n1fVar.zzc()) {
            pfVar.zze = yh.y(n1fVar);
        }
        pfVar.zze.add(ofVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", of.class});
        }
        if (i2 == 3) {
            return new pf();
        }
        lf lfVar = null;
        if (i2 == 4) {
            return new mf(lfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zze.size();
    }

    public final int M() {
        return this.zzd;
    }

    public final of O(int i) {
        return (of) this.zze.get(i);
    }

    public final List R() {
        return this.zze;
    }
}
