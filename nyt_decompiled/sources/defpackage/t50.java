package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class t50 implements qh4 {
    private final long b;
    private final long c;
    private long d;

    public t50(long j, long j2) {
        this.b = j;
        this.c = j2;
        f();
    }

    protected final void c() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.d;
    }

    public boolean e() {
        return this.d > this.c;
    }

    public void f() {
        this.d = this.b - 1;
    }

    @Override // defpackage.qh4
    public boolean next() {
        this.d++;
        return !e();
    }
}
