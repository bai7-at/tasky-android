package defpackage;

/* loaded from: classes3.dex */
public abstract class i0a {
    public static long a(long j, int i) {
        long j2 = i;
        long j3 = j * j2;
        if (j3 / j2 == j) {
            return j3;
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Multiplication overflows a long: ");
        sb.append(j);
        sb.append(" * ");
        sb.append(i);
        throw new ArithmeticException(sb.toString());
    }
}
