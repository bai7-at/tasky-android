package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;
import defpackage.mw9;
import java.util.List;

/* loaded from: classes3.dex */
public final class t7 extends c0 implements by9 {
    private static final t7 zzb;
    private int zze;
    private mw9 zzf = c0.o();

    static {
        t7 t7Var = new t7();
        zzb = t7Var;
        c0.h(t7.class, t7Var);
    }

    private t7() {
    }

    static /* synthetic */ void E(t7 t7Var, s7 s7Var) {
        s7Var.getClass();
        mw9 mw9Var = t7Var.zzf;
        if (!mw9Var.zzc()) {
            t7Var.zzf = c0.e(mw9Var);
        }
        t7Var.zzf.add(s7Var);
    }

    public static p7 u() {
        return (p7) zzb.j();
    }

    public static t7 w(byte[] bArr, ev9 ev9Var) {
        return (t7) c0.m(zzb, bArr, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", s7.class});
        }
        if (i2 == 3) {
            return new t7();
        }
        o7 o7Var = null;
        if (i2 == 4) {
            return new p7(o7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zzf.size();
    }

    public final int t() {
        return this.zze;
    }

    public final List x() {
        return this.zzf;
    }
}
