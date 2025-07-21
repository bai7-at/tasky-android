package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class sj0 extends oj0 {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public sj0(char c, char c2, int i) {
        this.a = i;
        this.b = c2;
        boolean z = false;
        if (i <= 0 ? zq3.j(c, c2) >= 0 : zq3.j(c, c2) <= 0) {
            z = true;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    @Override // defpackage.oj0
    public char c() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }
}
