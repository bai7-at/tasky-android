package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class lo extends qm3 {
    private final int[] a;
    private int b;

    public lo(int[] iArr) {
        zq3.h(iArr, "array");
        this.a = iArr;
    }

    @Override // defpackage.qm3
    public int c() {
        try {
            int[] iArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return iArr[i];
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
