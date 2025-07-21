package defpackage;

import defpackage.ei7;

/* loaded from: classes2.dex */
public final class zi3 implements ei7 {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public zi3(long[] jArr, long[] jArr2, long j) {
        ur.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        if (!this.d) {
            return new ei7.a(gi7.c);
        }
        int i = z19.i(this.b, j, true, true);
        gi7 gi7Var = new gi7(this.b[i], this.a[i]);
        if (gi7Var.a == j || i == this.b.length - 1) {
            return new ei7.a(gi7Var);
        }
        int i2 = i + 1;
        return new ei7.a(gi7Var, new gi7(this.b[i2], this.a[i2]));
    }

    @Override // defpackage.ei7
    public boolean h() {
        return this.d;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.c;
    }
}
