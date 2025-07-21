package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class mt0 extends nt0 {
    protected static final int c;
    private static final long d;
    private static final int e;
    protected final long a;
    protected final Object[] b;

    static {
        int intValue = Integer.getInteger("sparse.shift", 0).intValue();
        c = intValue;
        int arrayIndexScale = mx8.a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            e = intValue + 2;
        } else {
            if (8 != arrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size");
            }
            e = intValue + 3;
        }
        d = r1.arrayBaseOffset(Object[].class) + (32 << (e - intValue));
    }

    public mt0(int i) {
        int a = x06.a(i);
        this.a = a - 1;
        this.b = new Object[(a << c) + 64];
    }

    protected final long a(long j) {
        return c(j, this.a);
    }

    protected final long c(long j, long j2) {
        return d + ((j & j2) << e);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    protected final Object e(long j) {
        return f(this.b, j);
    }

    protected final Object f(Object[] objArr, long j) {
        return mx8.a.getObject(objArr, j);
    }

    protected final Object g(long j) {
        return j(this.b, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    protected final Object j(Object[] objArr, long j) {
        return mx8.a.getObjectVolatile(objArr, j);
    }

    protected final void k(Object[] objArr, long j, Object obj) {
        mx8.a.putOrderedObject(objArr, j, obj);
    }

    protected final void n(long j, Object obj) {
        o(this.b, j, obj);
    }

    protected final void o(Object[] objArr, long j, Object obj) {
        mx8.a.putObject(objArr, j, obj);
    }
}
