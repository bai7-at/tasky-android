package com.google.android.gms.internal.ads;

import defpackage.k1f;
import defpackage.n1f;
import defpackage.n2f;
import defpackage.p0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class gk extends yh implements x1f {
    private static final k1f zzb = new xj();
    private static final k1f zzd = new yj();
    private static final gk zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;
    private boolean zzu;
    private long zzv;
    private boolean zzx;
    private String zzi = "";
    private n1f zzj = yh.x();
    private String zzo = "";
    private n1f zzt = yh.x();
    private p0f zzw = yh.t();
    private p0f zzy = yh.t();

    static {
        gk gkVar = new gk();
        zze = gkVar;
        yh.D(gk.class, gkVar);
    }

    private gk() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zze, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzf", "zzg", fk.a, "zzh", "zzi", "zzj", "zzk", dk.a, "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", ck.class, "zzu", "zzv", "zzw", n2f.a(), "zzx", "zzy", ek.a});
        }
        if (i2 == 3) {
            return new gk();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new zj(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
