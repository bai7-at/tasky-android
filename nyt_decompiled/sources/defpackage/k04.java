package defpackage;

/* loaded from: classes.dex */
public final class k04 {
    public static final int b = vy4.d;
    private final vy4 a = new vy4(new a[16], 0);

    public static final class a {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
            if (i < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Interval(start=" + this.a + ", end=" + this.b + ')';
        }
    }

    public final a a(int i, int i2) {
        a aVar = new a(i, i2);
        this.a.b(aVar);
        return aVar;
    }

    public final int b() {
        int a2 = ((a) this.a.o()).a();
        vy4 vy4Var = this.a;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            do {
                a aVar = (a) p[i];
                if (aVar.a() > a2) {
                    a2 = aVar.a();
                }
                i++;
            } while (i < q);
        }
        return a2;
    }

    public final int c() {
        int b2 = ((a) this.a.o()).b();
        vy4 vy4Var = this.a;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            do {
                a aVar = (a) p[i];
                if (aVar.b() < b2) {
                    b2 = aVar.b();
                }
                i++;
            } while (i < q);
        }
        if (b2 >= 0) {
            return b2;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.a.t();
    }

    public final void e(a aVar) {
        this.a.w(aVar);
    }
}
