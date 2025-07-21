package defpackage;

/* loaded from: classes3.dex */
public final class ww9 implements gx9 {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public ww9(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        wad.d(length == length2);
        boolean z = length2 > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.c = j;
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        if (!this.d) {
            hx9 hx9Var = hx9.c;
            return new ex9(hx9Var, hx9Var);
        }
        int r = khe.r(this.b, j, true, true);
        hx9 hx9Var2 = new hx9(this.b[r], this.a[r]);
        if (hx9Var2.a != j) {
            long[] jArr = this.b;
            if (r != jArr.length - 1) {
                int i = r + 1;
                return new ex9(hx9Var2, new hx9(jArr[i], this.a[i]));
            }
        }
        return new ex9(hx9Var2, hx9Var2);
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.c;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return this.d;
    }
}
