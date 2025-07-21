package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class yo extends yq7 {
    private final short[] a;
    private int b;

    public yo(short[] sArr) {
        zq3.h(sArr, "array");
        this.a = sArr;
    }

    @Override // defpackage.yq7
    public short c() {
        try {
            short[] sArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return sArr[i];
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
