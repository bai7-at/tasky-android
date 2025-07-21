package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yu9 implements gx9 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public yu9(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        long[] jArr = this.e;
        int r = khe.r(jArr, j, true, true);
        hx9 hx9Var = new hx9(jArr[r], this.c[r]);
        if (hx9Var.a >= j || r == this.a - 1) {
            return new ex9(hx9Var, hx9Var);
        }
        int i = r + 1;
        return new ex9(hx9Var, new hx9(this.e[i], this.c[i]));
    }

    public final String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.f;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }
}
