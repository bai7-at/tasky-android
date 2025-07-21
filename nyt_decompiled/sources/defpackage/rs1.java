package defpackage;

/* loaded from: classes.dex */
abstract class rs1 {
    public static final int a(long j, long j2) {
        boolean d = d(j);
        return d != d(j2) ? d ? -1 : 1 : (int) Math.signum(c(j) - c(j2));
    }

    public static long b(long j) {
        return j;
    }

    public static final float c(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean d(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }
}
