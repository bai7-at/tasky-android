package com.google.android.gms.internal.icing;

import defpackage.m5d;

/* loaded from: classes3.dex */
public final class d extends z implements m5d {
    private static final d zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        d dVar = new d();
        zzh = dVar;
        z.i(d.class, dVar);
    }

    private d() {
    }

    public static c o() {
        return (c) zzh.g();
    }

    @Override // com.google.android.gms.internal.icing.z
    protected final Object f(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new d();
        }
        a aVar = null;
        if (i2 == 4) {
            return new c(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }
}
