package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class go extends nf0 {
    private final byte[] a;
    private int b;

    public go(byte[] bArr) {
        zq3.h(bArr, "array");
        this.a = bArr;
    }

    @Override // defpackage.nf0
    public byte a() {
        try {
            byte[] bArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
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
