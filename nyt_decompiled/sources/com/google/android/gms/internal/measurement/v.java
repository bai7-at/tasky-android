package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class v extends j2 implements eef {
    private static final v zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = "";
    private tbf zzi = j2.l();
    private tbf zzj = j2.l();
    private tbf zzk = j2.l();
    private String zzl = "";
    private tbf zzn = j2.l();
    private tbf zzo = j2.l();
    private String zzp = "";

    static {
        v vVar = new v();
        zza = vVar;
        j2.p(v.class, vVar);
    }

    private v() {
    }

    static /* synthetic */ void E(v vVar, int i, t tVar) {
        tVar.getClass();
        tbf tbfVar = vVar.zzj;
        if (!tbfVar.zzc()) {
            vVar.zzj = j2.m(tbfVar);
        }
        vVar.zzj.set(i, tVar);
    }

    public static u v() {
        return (u) zza.f();
    }

    public static v x() {
        return zza;
    }

    public final List A() {
        return this.zzk;
    }

    public final List B() {
        return this.zzo;
    }

    public final List C() {
        return this.zzn;
    }

    public final List D() {
        return this.zzi;
    }

    public final boolean G() {
        return this.zzm;
    }

    public final boolean H() {
        return (this.zze & 2) != 0;
    }

    public final boolean I() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", z.class, "zzj", t.class, "zzk", c.class, "zzl", "zzm", "zzn", j1.class, "zzo", r.class, "zzp"});
        }
        if (i2 == 3) {
            return new v();
        }
        p pVar = null;
        if (i2 == 4) {
            return new u(pVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzn.size();
    }

    public final int s() {
        return this.zzj.size();
    }

    public final long t() {
        return this.zzf;
    }

    public final t u(int i) {
        return (t) this.zzj.get(i);
    }

    public final String y() {
        return this.zzg;
    }

    public final String z() {
        return this.zzp;
    }
}
