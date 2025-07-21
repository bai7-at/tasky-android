package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class fo extends ya0 {
    private final boolean[] a;
    private int b;

    public fo(boolean[] zArr) {
        zq3.h(zArr, "array");
        this.a = zArr;
    }

    @Override // defpackage.ya0
    public boolean c() {
        try {
            boolean[] zArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return zArr[i];
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
