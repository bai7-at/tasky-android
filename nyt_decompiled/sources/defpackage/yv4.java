package defpackage;

/* loaded from: classes.dex */
public abstract class yv4 {
    public static long a(long j) {
        return j;
    }

    public static final float b(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
