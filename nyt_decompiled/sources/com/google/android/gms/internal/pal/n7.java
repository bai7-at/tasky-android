package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class n7 extends c0 implements by9 {
    private static final n7 zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        n7 n7Var = new n7();
        zzb = n7Var;
        c0.h(n7.class, n7Var);
    }

    private n7() {
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new n7();
        }
        l7 l7Var = null;
        if (i2 == 4) {
            return new m7(l7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String t() {
        return this.zzi;
    }

    public final String u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }
}
