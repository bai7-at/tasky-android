package defpackage;

/* loaded from: classes.dex */
public final class rk2 {
    private final float a;
    private final fm1 b;
    private final float c;

    public static final class a {
        private final float a;
        private final float b;
        private final long c;

        public a(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final float a(long j) {
            long j2 = this.c;
            return this.b * Math.signum(this.a) * cf.a.b(j2 > 0 ? j / j2 : 1.0f).a();
        }

        public final float b(long j) {
            long j2 = this.c;
            return (((cf.a.b(j2 > 0 ? j / j2 : 1.0f).b() * Math.signum(this.a)) * this.b) / this.c) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
        }
    }

    public rk2(float f, fm1 fm1Var) {
        this.a = f;
        this.b = fm1Var;
        this.c = a(fm1Var);
    }

    private final float a(fm1 fm1Var) {
        float c;
        c = sk2.c(0.84f, fm1Var.getDensity());
        return c;
    }

    private final double e(float f) {
        return cf.a.a(f, this.a * this.c);
    }

    public final float b(float f) {
        float f2;
        float f3;
        double e = e(f);
        f2 = sk2.a;
        double d = f2 - 1.0d;
        double d2 = this.a * this.c;
        f3 = sk2.a;
        return (float) (d2 * Math.exp((f3 / d) * e));
    }

    public final long c(float f) {
        float f2;
        double e = e(f);
        f2 = sk2.a;
        return (long) (Math.exp(e / (f2 - 1.0d)) * 1000.0d);
    }

    public final a d(float f) {
        float f2;
        float f3;
        double e = e(f);
        f2 = sk2.a;
        double d = f2 - 1.0d;
        double d2 = this.a * this.c;
        f3 = sk2.a;
        return new a(f, (float) (d2 * Math.exp((f3 / d) * e)), (long) (Math.exp(e / d) * 1000.0d));
    }
}
