package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class ko extends yk2 {
    private final float[] a;
    private int b;

    public ko(float[] fArr) {
        zq3.h(fArr, "array");
        this.a = fArr;
    }

    @Override // defpackage.yk2
    public float c() {
        try {
            float[] fArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return fArr[i];
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
