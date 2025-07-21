package defpackage;

/* loaded from: classes3.dex */
final class k3a {
    public final h3a a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public k3a(h3a h3aVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        wad.d(length == length2);
        int length3 = jArr.length;
        wad.d(length3 == length2);
        int length4 = iArr2.length;
        wad.d(length4 == length2);
        this.a = h3aVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int r = khe.r(this.f, j, true, false); r >= 0; r--) {
            if ((this.g[r] & 1) != 0) {
                return r;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int p = khe.p(this.f, j, true, false); p < this.f.length; p++) {
            if ((this.g[p] & 1) != 0) {
                return p;
            }
        }
        return -1;
    }
}
