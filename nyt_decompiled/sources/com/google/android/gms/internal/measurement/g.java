package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class g extends j2 implements eef {
    private static final g zza;
    private int zze;
    private o zzf;
    private j zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        g gVar = new g();
        zza = gVar;
        j2.p(g.class, gVar);
    }

    private g() {
    }

    public static g s() {
        return zza;
    }

    static /* synthetic */ void w(g gVar, String str) {
        gVar.zze |= 8;
        gVar.zzi = str;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new g();
        }
        a aVar = null;
        if (i2 == 4) {
            return new f(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final j t() {
        j jVar = this.zzg;
        return jVar == null ? j.s() : jVar;
    }

    public final o u() {
        o oVar = this.zzf;
        return oVar == null ? o.t() : oVar;
    }

    public final String v() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
