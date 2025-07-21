package com.google.android.gms.internal.icing;

import defpackage.m5d;
import defpackage.vcc;

/* loaded from: classes3.dex */
public final class s1 extends z implements m5d {
    private static final s1 zzg;
    private int zzb;
    private String zze = "";
    private vcc zzf = z.m();

    static {
        s1 s1Var = new s1();
        zzg = s1Var;
        z.i(s1.class, s1Var);
    }

    private s1() {
    }

    public static r1 o() {
        return (r1) zzg.g();
    }

    static /* synthetic */ void q(s1 s1Var, String str) {
        s1Var.zzb |= 1;
        s1Var.zze = str;
    }

    static /* synthetic */ void r(s1 s1Var, q1 q1Var) {
        q1Var.getClass();
        vcc vccVar = s1Var.zzf;
        if (!vccVar.zza()) {
            s1Var.zzf = z.n(vccVar);
        }
        s1Var.zzf.add(q1Var);
    }

    @Override // com.google.android.gms.internal.icing.z
    protected final Object f(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", q1.class});
        }
        if (i2 == 3) {
            return new s1();
        }
        o1 o1Var = null;
        if (i2 == 4) {
            return new r1(o1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
