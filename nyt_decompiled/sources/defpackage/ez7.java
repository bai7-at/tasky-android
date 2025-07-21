package defpackage;

/* loaded from: classes5.dex */
public final class ez7 extends iz7 {
    public ez7(int i) {
        super(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return u() == p();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        Object[] objArr = this.b;
        long j = this.a;
        long p = p();
        long a = a(p);
        if (j(objArr, a) != null) {
            if (p - u() > j) {
                return false;
            }
            while (j(objArr, a) != null) {
            }
        }
        o(objArr, a, obj);
        q(p + 1);
        return true;
    }

    @Override // java.util.Queue
    public Object peek() {
        Object g;
        long v = v();
        do {
            long u = u();
            if (u >= v) {
                long p = p();
                if (u >= p) {
                    return null;
                }
                w(p);
            }
            g = g(a(u));
        } while (g == null);
        return g;
    }

    @Override // java.util.Queue, defpackage.sr4
    public Object poll() {
        long u;
        long v = v();
        do {
            u = u();
            if (u >= v) {
                long p = p();
                if (u >= p) {
                    return null;
                }
                w(p);
            }
        } while (!t(u, 1 + u));
        long a = a(u);
        Object[] objArr = this.b;
        Object f = f(objArr, a);
        k(objArr, a, null);
        return f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long u = u();
        while (true) {
            long p = p();
            long u2 = u();
            if (u == u2) {
                return (int) (p - u2);
            }
            u = u2;
        }
    }
}
