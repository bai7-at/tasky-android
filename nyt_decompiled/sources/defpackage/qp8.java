package defpackage;

import com.google.android.exoplayer2.t0;

/* loaded from: classes2.dex */
public final class qp8 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final t0 f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final rp8[] k;

    public qp8(int i, int i2, long j, long j2, long j3, t0 t0Var, int i3, rp8[] rp8VarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = t0Var;
        this.g = i3;
        this.k = rp8VarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public rp8 a(int i) {
        rp8[] rp8VarArr = this.k;
        if (rp8VarArr == null) {
            return null;
        }
        return rp8VarArr[i];
    }
}
