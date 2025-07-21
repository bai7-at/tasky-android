package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class gb4 extends db4 {
    private final long a;
    private final long b;
    private boolean c;
    private long d;

    public gb4(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    @Override // defpackage.db4
    public long c() {
        long j = this.d;
        if (j != this.b) {
            this.d = this.a + j;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }
}
