package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class zm3 extends qm3 {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public zm3(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.d = z ? i : i2;
    }

    @Override // defpackage.qm3
    public int c() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }
}
