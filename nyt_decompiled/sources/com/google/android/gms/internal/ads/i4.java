package com.google.android.gms.internal.ads;

import defpackage.o0f;
import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class i4 extends yh implements x1f {
    private static final i4 zzb;
    private int zzd;
    private int zze = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzf = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private k4 zzo;

    static {
        i4 i4Var = new i4();
        zzb = i4Var;
        yh.D(i4.class, i4Var);
    }

    private i4() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            o0f o0fVar = l3.a;
            return yh.A(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", o0fVar, "zzf", o0fVar, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new i4();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new h4(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
