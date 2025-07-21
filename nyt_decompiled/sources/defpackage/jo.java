package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class jo extends wt1 {
    private final double[] a;
    private int b;

    public jo(double[] dArr) {
        zq3.h(dArr, "array");
        this.a = dArr;
    }

    @Override // defpackage.wt1
    public double c() {
        try {
            double[] dArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.length;
    }
}
