package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class m2 extends yh implements x1f {
    private static final m2 zzb;
    private int zzd;
    private int zze;
    private b3 zzg;
    private d3 zzh;
    private f3 zzj;
    private i4 zzk;
    private z3 zzl;
    private r3 zzm;
    private t3 zzn;
    private int zzf = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private n1f zzi = yh.x();
    private n1f zzo = yh.x();

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        yh.D(m2.class, m2Var);
    }

    private m2() {
    }

    public static m2 M() {
        return zzb;
    }

    static /* synthetic */ void O(m2 m2Var, zzbbz zzbbzVar) {
        m2Var.zze = zzbbzVar.zza();
        m2Var.zzd |= 1;
    }

    static /* synthetic */ void P(m2 m2Var, d3 d3Var) {
        d3Var.getClass();
        m2Var.zzh = d3Var;
        m2Var.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", k2.a, "zzf", l3.a, "zzg", "zzh", "zzi", z2.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", u4.class});
        }
        if (i2 == 3) {
            return new m2();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new l2(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final d3 N() {
        d3 d3Var = this.zzh;
        return d3Var == null ? d3.M() : d3Var;
    }
}
