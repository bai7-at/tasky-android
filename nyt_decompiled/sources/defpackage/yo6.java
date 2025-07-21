package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public class yo6 {
    private final yl0 a;
    private final double b;
    private final long c;
    private final AtomicLong d;

    public yo6(double d, double d2, yl0 yl0Var) {
        this.a = yl0Var;
        double d3 = d / 1.0E9d;
        this.b = d3;
        long j = (long) (d2 / d3);
        this.c = j;
        this.d = new AtomicLong(yl0Var.nanoTime() - j);
    }
}
