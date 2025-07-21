package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.mw9;

/* loaded from: classes3.dex */
public final class o2 extends c0 implements by9 {
    private static final o2 zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private mw9 zzq = c0.o();

    static {
        o2 o2Var = new o2();
        zzb = o2Var;
        c0.h(o2.class, o2Var);
    }

    private o2() {
    }

    static /* synthetic */ void C(o2 o2Var, String str) {
        str.getClass();
        o2Var.zze |= 1;
        o2Var.zzf = str;
    }

    public static k2 s() {
        return (k2) zzb.j();
    }

    static /* synthetic */ void u(o2 o2Var, long j) {
        o2Var.zze |= 2;
        o2Var.zzg = j;
    }

    static /* synthetic */ void v(o2 o2Var, String str) {
        str.getClass();
        o2Var.zze |= 4;
        o2Var.zzh = str;
    }

    static /* synthetic */ void w(o2 o2Var, String str) {
        str.getClass();
        o2Var.zze |= 8;
        o2Var.zzi = str;
    }

    static /* synthetic */ void x(o2 o2Var, String str) {
        o2Var.zze |= 16;
        o2Var.zzj = str;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", m2.class, "zzr", n2.a});
        }
        if (i2 == 3) {
            return new o2();
        }
        a aVar = null;
        if (i2 == 4) {
            return new k2(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
