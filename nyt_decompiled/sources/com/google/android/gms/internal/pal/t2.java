package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class t2 extends c0 implements by9 {
    private static final t2 zzb;
    private int zze;
    private c3 zzf;
    private f3 zzg;

    static {
        t2 t2Var = new t2();
        zzb = t2Var;
        c0.h(t2.class, t2Var);
    }

    private t2() {
    }

    public static t2 t(byte[] bArr, ev9 ev9Var) {
        return (t2) c0.m(zzb, bArr, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new t2();
        }
        p2 p2Var = null;
        if (i2 == 4) {
            return new q2(p2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final c3 u() {
        c3 c3Var = this.zzf;
        return c3Var == null ? c3.t() : c3Var;
    }

    public final f3 v() {
        f3 f3Var = this.zzg;
        return f3Var == null ? f3.t() : f3Var;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }

    public final boolean x() {
        return (this.zze & 2) != 0;
    }
}
