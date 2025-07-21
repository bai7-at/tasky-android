package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.iye;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class m1 extends j2 implements eef {
    private static final m1 zza;
    private int zze;
    private int zzf;
    private tbf zzg = j2.l();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        m1 m1Var = new m1();
        zza = m1Var;
        j2.p(m1.class, m1Var);
    }

    private m1() {
    }

    public final int A() {
        int a = iye.a(this.zzf);
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
            return j2.o(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", l1.a, "zzg", m1.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new m1();
        }
        d1 d1Var = null;
        if (i2 == 4) {
            return new k1(d1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double r() {
        return this.zzk;
    }

    public final String t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzi;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return (this.zze & 8) != 0;
    }

    public final boolean y() {
        return (this.zze & 16) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
