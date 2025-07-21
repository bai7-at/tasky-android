package defpackage;

/* loaded from: classes5.dex */
public final class rz7 extends wz7 {
    public rz7(int i) {
        super(i);
    }

    private long p() {
        return mx8.a.getLongVolatile(this, tz7.i);
    }

    private long q() {
        return mx8.a.getLongVolatile(this, xz7.h);
    }

    private void t(long j) {
        mx8.a.putOrderedLong(this, tz7.i, j);
    }

    private void u(long j) {
        mx8.a.putOrderedLong(this, xz7.h, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return q() == p();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null elements not allowed");
        }
        Object[] objArr = this.b;
        long j = this.producerIndex;
        long a = a(j);
        if (j(objArr, a) != null) {
            return false;
        }
        u(j + 1);
        k(objArr, a, obj);
        return true;
    }

    @Override // java.util.Queue
    public Object peek() {
        return g(a(this.consumerIndex));
    }

    @Override // java.util.Queue, defpackage.sr4
    public Object poll() {
        long j = this.consumerIndex;
        long a = a(j);
        Object[] objArr = this.b;
        Object j2 = j(objArr, a);
        if (j2 == null) {
            return null;
        }
        t(j + 1);
        k(objArr, a, null);
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long p = p();
        while (true) {
            long q = q();
            long p2 = p();
            if (p == p2) {
                return (int) (q - p2);
            }
            p = p2;
        }
    }
}
