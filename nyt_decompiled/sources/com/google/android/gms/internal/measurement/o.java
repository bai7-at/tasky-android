package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.lod;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class o extends j2 implements eef {
    private static final o zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private tbf zzi = j2.l();

    static {
        o oVar = new o();
        zza = oVar;
        j2.p(o.class, oVar);
    }

    private o() {
    }

    public static o t() {
        return zza;
    }

    public final int A() {
        int a = lod.a(this.zzf);
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
            return j2.o(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", n.a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new o();
        }
        a aVar = null;
        if (i2 == 4) {
            return new m(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzi.size();
    }

    public final String u() {
        return this.zzg;
    }

    public final List v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
