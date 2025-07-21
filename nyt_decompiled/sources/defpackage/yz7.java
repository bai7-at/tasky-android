package defpackage;

import com.amazonaws.event.ProgressEvent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class yz7 extends bv {
    private static final Integer g = Integer.getInteger("jctools.spsc.max.lookahead.step", ProgressEvent.PART_FAILED_EVENT_CODE);
    final AtomicLong c;
    protected long d;
    final AtomicLong e;
    final int f;

    public yz7(int i) {
        super(i);
        this.c = new AtomicLong();
        this.e = new AtomicLong();
        this.f = Math.min(i / 4, g.intValue());
    }

    private long j() {
        return this.e.get();
    }

    private long k() {
        return this.c.get();
    }

    private void n(long j) {
        this.e.lazySet(j);
    }

    private void o(long j) {
        this.c.lazySet(j);
    }

    @Override // defpackage.bv, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return k() == j();
    }

    @Override // defpackage.bv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.a;
        int i = this.b;
        long j = this.c.get();
        int c = c(j, i);
        if (j >= this.d) {
            long j2 = this.f + j;
            if (f(atomicReferenceArray, c(j2, i)) == null) {
                this.d = j2;
            } else if (f(atomicReferenceArray, c) != null) {
                return false;
            }
        }
        o(j + 1);
        g(atomicReferenceArray, c, obj);
        return true;
    }

    @Override // java.util.Queue
    public Object peek() {
        return e(a(this.e.get()));
    }

    @Override // java.util.Queue
    public Object poll() {
        long j = this.e.get();
        int a = a(j);
        AtomicReferenceArray atomicReferenceArray = this.a;
        Object f = f(atomicReferenceArray, a);
        if (f == null) {
            return null;
        }
        n(j + 1);
        g(atomicReferenceArray, a, null);
        return f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long j = j();
        while (true) {
            long k = k();
            long j2 = j();
            if (j == j2) {
                return (int) (k - j2);
            }
            j = j2;
        }
    }
}
