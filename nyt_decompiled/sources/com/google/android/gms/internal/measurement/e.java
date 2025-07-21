package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class e extends j2 implements eef {
    private static final e zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private tbf zzh = j2.l();
    private boolean zzi;
    private j zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        e eVar = new e();
        zza = eVar;
        j2.p(e.class, eVar);
    }

    private e() {
    }

    static /* synthetic */ void A(e eVar, int i, g gVar) {
        gVar.getClass();
        tbf tbfVar = eVar.zzh;
        if (!tbfVar.zzc()) {
            eVar.zzh = j2.m(tbfVar);
        }
        eVar.zzh.set(i, gVar);
    }

    public static d t() {
        return (d) zza.f();
    }

    static /* synthetic */ void z(e eVar, String str) {
        eVar.zze |= 2;
        eVar.zzg = str;
    }

    public final boolean B() {
        return this.zzk;
    }

    public final boolean C() {
        return this.zzl;
    }

    public final boolean D() {
        return this.zzm;
    }

    public final boolean E() {
        return (this.zze & 8) != 0;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    public final boolean G() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", g.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new e();
        }
        a aVar = null;
        if (i2 == 4) {
            return new d(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzh.size();
    }

    public final int s() {
        return this.zzf;
    }

    public final g v(int i) {
        return (g) this.zzh.get(i);
    }

    public final j w() {
        j jVar = this.zzj;
        return jVar == null ? j.s() : jVar;
    }

    public final String x() {
        return this.zzg;
    }

    public final List y() {
        return this.zzh;
    }
}
