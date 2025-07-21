package kotlin.random;

import defpackage.mu5;
import defpackage.ro6;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class Random {
    public static final Default a = new Default(null);
    private static final Random b = mu5.a.b();

    public static final class Default extends Random implements Serializable {

        private static final class Serialized implements Serializable {
            public static final Serialized a = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.a;
            }
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.a;
        }

        @Override // kotlin.random.Random
        public int b(int i) {
            return Random.b.b(i);
        }

        @Override // kotlin.random.Random
        public double c() {
            return Random.b.c();
        }

        @Override // kotlin.random.Random
        public double d(double d, double d2) {
            return Random.b.d(d, d2);
        }

        @Override // kotlin.random.Random
        public int e() {
            return Random.b.e();
        }

        @Override // kotlin.random.Random
        public int f(int i) {
            return Random.b.f(i);
        }

        @Override // kotlin.random.Random
        public long g() {
            return Random.b.g();
        }

        @Override // kotlin.random.Random
        public long h(long j, long j2) {
            return Random.b.h(j, j2);
        }

        private Default() {
        }
    }

    public abstract int b(int i);

    public abstract double c();

    public double d(double d, double d2) {
        double c;
        ro6.b(d, d2);
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Double.isInfinite(d) || Double.isNaN(d) || Double.isInfinite(d2) || Double.isNaN(d2)) {
            c = d + (c() * d3);
        } else {
            double d4 = 2;
            double c2 = c() * ((d2 / d4) - (d / d4));
            c = d + c2 + c2;
        }
        return c >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : c;
    }

    public abstract int e();

    public abstract int f(int i);

    public abstract long g();

    public long h(long j, long j2) {
        long g;
        long j3;
        long j4;
        int e;
        ro6.c(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    e = b(ro6.d(i));
                } else if (i2 == 1) {
                    e = e();
                } else {
                    j4 = (b(ro6.d(i2)) << 32) + (e() & 4294967295L);
                }
                j4 = e & 4294967295L;
            } else {
                do {
                    g = g() >>> 1;
                    j3 = g % j5;
                } while ((g - j3) + (j5 - 1) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long g2 = g();
            if (j <= g2 && g2 < j2) {
                return g2;
            }
        }
    }
}
