package defpackage;

import defpackage.ei7;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class rk0 implements ei7 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public rk0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    public int a(long j) {
        return z19.i(this.e, j, true, true);
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        int a = a(j);
        gi7 gi7Var = new gi7(this.e[a], this.c[a]);
        if (gi7Var.a >= j || a == this.a - 1) {
            return new ei7.a(gi7Var);
        }
        int i = a + 1;
        return new ei7.a(gi7Var, new gi7(this.e[i], this.c[i]));
    }

    @Override // defpackage.ei7
    public boolean h() {
        return true;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
