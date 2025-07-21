package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class k0 extends yh implements x1f {
    private static final k0 zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private n1f zzp = yh.x();

    static {
        k0 k0Var = new k0();
        zzb = k0Var;
        yh.D(k0.class, k0Var);
    }

    private k0() {
    }

    public static g0 L() {
        return (g0) zzb.k();
    }

    static /* synthetic */ void N(k0 k0Var, long j) {
        k0Var.zzd |= 2;
        k0Var.zzf = j;
    }

    static /* synthetic */ void O(k0 k0Var, String str) {
        str.getClass();
        k0Var.zzd |= 4;
        k0Var.zzg = str;
    }

    static /* synthetic */ void P(k0 k0Var, String str) {
        str.getClass();
        k0Var.zzd |= 8;
        k0Var.zzh = str;
    }

    static /* synthetic */ void Q(k0 k0Var, String str) {
        k0Var.zzd |= 16;
        k0Var.zzi = str;
    }

    static /* synthetic */ void R(k0 k0Var, String str) {
        k0Var.zzd |= 1024;
        k0Var.zzo = str;
    }

    static /* synthetic */ void S(k0 k0Var, String str) {
        str.getClass();
        k0Var.zzd |= 1;
        k0Var.zze = str;
    }

    static /* synthetic */ void T(k0 k0Var, int i) {
        k0Var.zzq = i - 1;
        k0Var.zzd |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", i0.class, "zzq", j0.a});
        }
        if (i2 == 3) {
            return new k0();
        }
        f0 f0Var = null;
        if (i2 == 4) {
            return new g0(f0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
