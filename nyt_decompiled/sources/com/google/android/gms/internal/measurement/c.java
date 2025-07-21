package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends j2 implements eef {
    private static final c zza;
    private int zze;
    private int zzf;
    private tbf zzg = j2.l();
    private tbf zzh = j2.l();
    private boolean zzi;
    private boolean zzj;

    static {
        c cVar = new c();
        zza = cVar;
        j2.p(c.class, cVar);
    }

    private c() {
    }

    static /* synthetic */ void A(c cVar, int i, e eVar) {
        eVar.getClass();
        tbf tbfVar = cVar.zzh;
        if (!tbfVar.zzc()) {
            cVar.zzh = j2.m(tbfVar);
        }
        cVar.zzh.set(i, eVar);
    }

    static /* synthetic */ void z(c cVar, int i, l lVar) {
        lVar.getClass();
        tbf tbfVar = cVar.zzg;
        if (!tbfVar.zzc()) {
            cVar.zzg = j2.m(tbfVar);
        }
        cVar.zzg.set(i, lVar);
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
            return j2.o(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", l.class, "zzh", e.class, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new c();
        }
        a aVar = null;
        if (i2 == 4) {
            return new b(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzf;
    }

    public final int s() {
        return this.zzh.size();
    }

    public final int t() {
        return this.zzg.size();
    }

    public final e v(int i) {
        return (e) this.zzh.get(i);
    }

    public final l w(int i) {
        return (l) this.zzg.get(i);
    }

    public final List x() {
        return this.zzh;
    }

    public final List y() {
        return this.zzg;
    }
}
