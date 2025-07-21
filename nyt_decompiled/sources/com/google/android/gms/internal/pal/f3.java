package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class f3 extends c0 implements by9 {
    private static final f3 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        f3 f3Var = new f3();
        zzb = f3Var;
        c0.h(f3.class, f3Var);
    }

    private f3() {
    }

    public static f3 t() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new f3();
        }
        p2 p2Var = null;
        if (i2 == 4) {
            return new e3(p2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzk;
    }
}
