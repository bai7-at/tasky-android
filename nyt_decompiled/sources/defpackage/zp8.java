package defpackage;

/* loaded from: classes2.dex */
final class zp8 {
    public final qp8 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public zp8(qp8 qp8Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        ur.a(iArr.length == jArr2.length);
        ur.a(jArr.length == jArr2.length);
        ur.a(iArr2.length == jArr2.length);
        this.a = qp8Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int i = z19.i(this.f, j, true, false); i >= 0; i--) {
            if ((this.g[i] & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int e = z19.e(this.f, j, true, false); e < this.f.length; e++) {
            if ((this.g[e] & 1) != 0) {
                return e;
            }
        }
        return -1;
    }
}
