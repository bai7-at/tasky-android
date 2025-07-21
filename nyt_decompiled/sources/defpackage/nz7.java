package defpackage;

/* loaded from: classes.dex */
public abstract class nz7 {
    public static final long a(double d, double d2, double d3, double d4, double d5) {
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double sqrt = 2.0d * d2 * Math.sqrt(d);
        double d14 = (sqrt * sqrt) - (4.0d * d);
        double d15 = -sqrt;
        jq0 a = kq0.a(d14);
        d6 = a.a;
        a.a = d6 + d15;
        d7 = a.a;
        a.a = d7 * 0.5d;
        d8 = a.b;
        a.b = d8 * 0.5d;
        jq0 a2 = kq0.a(d14);
        d9 = a2.a;
        double d16 = -1;
        a2.a = d9 * d16;
        d10 = a2.b;
        a2.b = d10 * d16;
        d11 = a2.a;
        a2.a = d11 + d15;
        d12 = a2.a;
        a2.a = d12 * 0.5d;
        d13 = a2.b;
        a2.b = d13 * 0.5d;
        return d(a, a2, d2, d3, d4, d5);
    }

    public static final long b(float f, float f2, float f3, float f4, float f5) {
        return a(f, f2, f3, f4, f5);
    }

    private static final double c(jq0 jq0Var, double d, double d2, double d3) {
        double d4;
        int i;
        double d5 = d3;
        double f = jq0Var.f();
        double d6 = f * d;
        double d7 = d2 - d6;
        double log = Math.log(Math.abs(d5 / d)) / f;
        double log2 = Math.log(Math.abs(d5 / d7));
        double d8 = log2;
        for (int i2 = 0; i2 < 6; i2++) {
            d8 = log2 - Math.log(Math.abs(d8 / f));
        }
        double d9 = d8 / f;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            log = d9;
        } else if ((Double.isInfinite(d9) || Double.isNaN(d9)) ? false : true) {
            log = Math.max(log, d9);
        }
        double d10 = (-(d6 + d7)) / (f * d7);
        double d11 = f * d10;
        double exp = (Math.exp(d11) * d) + (d7 * d10 * Math.exp(d11));
        if (!Double.isNaN(d10) && d10 > 0.0d) {
            if (d10 <= 0.0d || (-exp) >= d5) {
                log = (-(2.0d / f)) - (d / d7);
                d4 = Double.MAX_VALUE;
                i = 0;
                while (d4 > 0.001d && i < 100) {
                    i++;
                    double d12 = f * log;
                    double d13 = d5;
                    double exp2 = log - ((((d + (d7 * log)) * Math.exp(d12)) + d5) / ((((1 + d12) * d7) + d6) * Math.exp(d12)));
                    d4 = Math.abs(log - exp2);
                    log = exp2;
                    d5 = d13;
                }
                return log;
            }
            if (d7 < 0.0d && d > 0.0d) {
                log = 0.0d;
            }
        }
        d5 = -d5;
        d4 = Double.MAX_VALUE;
        i = 0;
        while (d4 > 0.001d) {
            i++;
            double d122 = f * log;
            double d132 = d5;
            double exp22 = log - ((((d + (d7 * log)) * Math.exp(d122)) + d5) / ((((1 + d122) * d7) + d6) * Math.exp(d122)));
            d4 = Math.abs(log - exp22);
            log = exp22;
            d5 = d132;
        }
        return log;
    }

    private static final long d(jq0 jq0Var, jq0 jq0Var2, double d, double d2, double d3, double d4) {
        double d5 = d2;
        if (d3 == 0.0d && d5 == 0.0d) {
            return 0L;
        }
        if (d3 < 0.0d) {
            d5 = -d5;
        }
        double abs = Math.abs(d3);
        return (long) ((d > 1.0d ? e(jq0Var, jq0Var2, abs, d5, d4) : d < 1.0d ? g(jq0Var, abs, d5, d4) : c(jq0Var, abs, d5, d4)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final double e(defpackage.jq0 r29, defpackage.jq0 r30, double r31, double r33, double r35) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz7.e(jq0, jq0, double, double, double):double");
    }

    private static final double f(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final double g(jq0 jq0Var, double d, double d2, double d3) {
        double f = jq0Var.f();
        double e = (d2 - (f * d)) / jq0Var.e();
        return Math.log(d3 / Math.sqrt((d * d) + (e * e))) / f;
    }
}
