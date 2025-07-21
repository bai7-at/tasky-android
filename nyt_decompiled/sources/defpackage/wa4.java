package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class wa4 extends o26 {
    private long[] a;
    private int b;

    public wa4(long[] jArr) {
        zq3.h(jArr, "bufferWithData");
        this.a = jArr;
        this.b = jArr.length;
        b(10);
    }

    @Override // defpackage.o26
    public void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, uo6.d(i, jArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(long j) {
        o26.c(this, 0, 1, null);
        long[] jArr = this.a;
        int d = d();
        this.b = d + 1;
        jArr[d] = j;
    }

    @Override // defpackage.o26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
