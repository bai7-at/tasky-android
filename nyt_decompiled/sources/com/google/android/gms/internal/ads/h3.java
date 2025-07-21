package com.google.android.gms.internal.ads;

import defpackage.o0f;
import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class h3 extends yh implements x1f {
    private static final h3 zzb;
    private int zzd;
    private q4 zzf;
    private int zzg;
    private s4 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzk = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzl = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;

    static {
        h3 h3Var = new h3();
        zzb = h3Var;
        yh.D(h3.class, h3Var);
    }

    private h3() {
    }

    public static h3 M() {
        return zzb;
    }

    static /* synthetic */ void N(h3 h3Var, String str) {
        h3Var.zzd |= 1;
        h3Var.zze = str;
    }

    static /* synthetic */ void O(h3 h3Var, s4 s4Var) {
        s4Var.getClass();
        h3Var.zzh = s4Var;
        h3Var.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            o0f o0fVar = l3.a;
            return yh.A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", o0fVar, "zzk", o0fVar, "zzl", o0fVar});
        }
        if (i2 == 3) {
            return new h3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new g3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
