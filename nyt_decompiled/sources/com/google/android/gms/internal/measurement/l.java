package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class l extends j2 implements eef {
    private static final l zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private g zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        l lVar = new l();
        zza = lVar;
        j2.p(l.class, lVar);
    }

    private l() {
    }

    public static k t() {
        return (k) zza.f();
    }

    static /* synthetic */ void w(l lVar, String str) {
        lVar.zze |= 2;
        lVar.zzg = str;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final boolean B() {
        return (this.zze & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new l();
        }
        a aVar = null;
        if (i2 == 4) {
            return new k(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzf;
    }

    public final g s() {
        g gVar = this.zzh;
        return gVar == null ? g.s() : gVar;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return this.zzk;
    }
}
