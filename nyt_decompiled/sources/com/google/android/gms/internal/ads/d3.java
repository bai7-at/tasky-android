package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.o0f;
import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class d3 extends yh implements x1f {
    private static final d3 zzb;
    private int zzd;
    private String zze = "";
    private n1f zzf = yh.x();
    private int zzg = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzh = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzi = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;

    static {
        d3 d3Var = new d3();
        zzb = d3Var;
        yh.D(d3.class, d3Var);
    }

    private d3() {
    }

    public static d3 M() {
        return zzb;
    }

    static /* synthetic */ void N(d3 d3Var, String str) {
        str.getClass();
        d3Var.zzd |= 1;
        d3Var.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            o0f o0fVar = l3.a;
            return yh.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", z2.class, "zzg", o0fVar, "zzh", o0fVar, "zzi", o0fVar});
        }
        if (i2 == 3) {
            return new d3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new c3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
