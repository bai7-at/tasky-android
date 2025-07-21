package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.mgd;

/* loaded from: classes3.dex */
public final class j extends j2 implements eef {
    private static final j zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        j jVar = new j();
        zza = jVar;
        j2.p(j.class, jVar);
    }

    private j() {
    }

    public static j s() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 16) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final int C() {
        int a = mgd.a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", i.a, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new j();
        }
        a aVar = null;
        if (i2 == 4) {
            return new h(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzj;
    }

    public final String v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
