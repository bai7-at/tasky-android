package defpackage;

/* loaded from: classes5.dex */
public class ww4 extends xw4 {
    public ww4(int i) {
        super(Math.max(2, i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return x() == v();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        long j = this.a + 1;
        long[] jArr = this.f;
        long j2 = Long.MAX_VALUE;
        while (true) {
            long v = v();
            long p = p(v);
            long q = q(jArr, p) - v;
            if (q == 0) {
                long j3 = v + 1;
                if (u(v, j3)) {
                    n(a(v), obj);
                    t(jArr, p, j3);
                    return true;
                }
            } else if (q < 0) {
                long j4 = v - j;
                if (j4 <= j2) {
                    j2 = x();
                    if (j4 <= j2) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
    }

    @Override // java.util.Queue
    public Object peek() {
        long x;
        Object e;
        do {
            x = x();
            e = e(a(x));
            if (e != null) {
                break;
            }
        } while (x != v());
        return e;
    }

    @Override // java.util.Queue, defpackage.sr4
    public Object poll() {
        long[] jArr = this.f;
        long j = -1;
        while (true) {
            long x = x();
            long p = p(x);
            long j2 = x + 1;
            long q = q(jArr, p) - j2;
            if (q == 0) {
                if (w(x, j2)) {
                    long a = a(x);
                    Object e = e(a);
                    n(a, null);
                    t(jArr, p, x + this.a + 1);
                    return e;
                }
            } else if (q < 0 && x >= j) {
                j = v();
                if (x == j) {
                    return null;
                }
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long x = x();
        while (true) {
            long v = v();
            long x2 = x();
            if (x == x2) {
                return (int) (v - x2);
            }
            x = x2;
        }
    }
}
