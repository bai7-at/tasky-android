package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class ho extends oj0 {
    private final char[] a;
    private int b;

    public ho(char[] cArr) {
        zq3.h(cArr, "array");
        this.a = cArr;
    }

    @Override // defpackage.oj0
    public char c() {
        try {
            char[] cArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return cArr[i];
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
