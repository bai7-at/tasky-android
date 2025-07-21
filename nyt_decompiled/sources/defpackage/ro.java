package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class ro extends db4 {
    private final long[] a;
    private int b;

    public ro(long[] jArr) {
        zq3.h(jArr, "array");
        this.a = jArr;
    }

    @Override // defpackage.db4
    public long c() {
        try {
            long[] jArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return jArr[i];
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
