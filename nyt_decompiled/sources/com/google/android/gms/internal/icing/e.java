package com.google.android.gms.internal.icing;

import defpackage.m5d;
import defpackage.vcc;

/* loaded from: classes3.dex */
public final class e extends z implements m5d {
    private static final e zze;
    private vcc zzb = z.m();

    static {
        e eVar = new e();
        zze = eVar;
        z.i(e.class, eVar);
    }

    private e() {
    }

    public static b o() {
        return (b) zze.g();
    }

    static /* synthetic */ void q(e eVar, Iterable iterable) {
        vcc vccVar = eVar.zzb;
        if (!vccVar.zza()) {
            eVar.zzb = z.n(vccVar);
        }
        f.e(iterable, eVar.zzb);
    }

    @Override // com.google.android.gms.internal.icing.z
    protected final Object f(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", d.class});
        }
        if (i2 == 3) {
            return new e();
        }
        a aVar = null;
        if (i2 == 4) {
            return new b(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
