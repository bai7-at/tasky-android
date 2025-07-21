package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class mt1 extends o26 {
    private double[] a;
    private int b;

    public mt1(double[] dArr) {
        zq3.h(dArr, "bufferWithData");
        this.a = dArr;
        this.b = dArr.length;
        b(10);
    }

    @Override // defpackage.o26
    public void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            double[] copyOf = Arrays.copyOf(dArr, uo6.d(i, dArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    @Override // defpackage.o26
    public int d() {
        return this.b;
    }

    public final void e(double d) {
        o26.c(this, 0, 1, null);
        double[] dArr = this.a;
        int d2 = d();
        this.b = d2 + 1;
        dArr[d2] = d;
    }

    @Override // defpackage.o26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.a, d());
        zq3.g(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
