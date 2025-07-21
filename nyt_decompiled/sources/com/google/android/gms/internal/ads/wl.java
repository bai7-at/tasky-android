package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class wl extends yh implements x1f {
    private static final wl zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        wl wlVar = new wl();
        zzb = wlVar;
        yh.D(wl.class, wlVar);
    }

    private wl() {
    }

    public static vl L() {
        return (vl) zzb.k();
    }

    static /* synthetic */ void N(wl wlVar, String str) {
        wlVar.zzd |= 1;
        wlVar.zze = str;
    }

    static /* synthetic */ void O(wl wlVar, long j) {
        wlVar.zzd |= 2;
        wlVar.zzf = j;
    }

    static /* synthetic */ void P(wl wlVar, boolean z) {
        wlVar.zzd |= 4;
        wlVar.zzg = z;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", xl.a, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new wl();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new vl(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
