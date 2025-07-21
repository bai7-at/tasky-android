package com.google.android.gms.internal.ads;

import defpackage.k1f;
import defpackage.p0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class m7 extends yh implements x1f {
    private static final k1f zzb = new j7();
    private static final m7 zzd;
    private int zze;
    private p0f zzf = yh.t();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        m7 m7Var = new m7();
        zzd = m7Var;
        yh.D(m7.class, m7Var);
    }

    private m7() {
    }

    public static l7 L() {
        return (l7) zzd.k();
    }

    static /* synthetic */ void N(m7 m7Var, String str) {
        str.getClass();
        m7Var.zze |= 1;
        m7Var.zzg = str;
    }

    static /* synthetic */ void O(m7 m7Var, int i) {
        p0f p0fVar = m7Var.zzf;
        if (!p0fVar.zzc()) {
            m7Var.zzf = yh.u(p0fVar);
        }
        m7Var.zzf.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", k7.a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new m7();
        }
        j7 j7Var = null;
        if (i2 == 4) {
            return new l7(j7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
