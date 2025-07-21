package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class om extends yh implements x1f {
    private static final om zzb;
    private int zzd;
    private boolean zzk;
    private double zzl;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private String zze = "";
    private String zzf = "";
    private int zzg = 4;
    private n1f zzh = yh.x();
    private String zzi = "";
    private String zzj = "";
    private n1f zzm = yh.x();

    static {
        om omVar = new om();
        zzb = omVar;
        yh.D(om.class, omVar);
    }

    private om() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", nm.a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", mm.class, "zzf", "zzn", km.a, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new om();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new jm(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
