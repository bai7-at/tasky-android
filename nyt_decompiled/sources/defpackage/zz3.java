package defpackage;

import defpackage.fv0;

/* loaded from: classes.dex */
public abstract class zz3 {
    public static final long a(long j, boolean z, int i, float f) {
        return iv0.b(0, c(j, z, i, f), 0, fv0.m(j), 5, null);
    }

    public static final int b(boolean z, int i, int i2) {
        if (z || !kj8.e(i, kj8.a.b())) {
            return uo6.d(i2, 1);
        }
        return 1;
    }

    public static final int c(long j, boolean z, int i, float f) {
        int n = ((z || kj8.e(i, kj8.a.b())) && fv0.j(j)) ? fv0.n(j) : Integer.MAX_VALUE;
        return fv0.p(j) == n ? n : uo6.m(th8.a(f), fv0.p(j), n);
    }

    public static final long d(fv0.a aVar, int i, int i2) {
        int min = Math.min(i, 262142);
        return aVar.c(min, min < 8191 ? Math.min(i2, 262142) : min < 32767 ? Math.min(i2, 65534) : min < 65535 ? Math.min(i2, 32766) : Math.min(i2, 8190));
    }
}
