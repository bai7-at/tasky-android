package defpackage;

/* loaded from: classes.dex */
public final class tx5 {
    private final long a;

    private /* synthetic */ tx5(long j) {
        this.a = j;
    }

    public static final /* synthetic */ tx5 a(long j) {
        return new tx5(j);
    }

    public static long b(long j) {
        return j;
    }

    public static boolean c(long j, Object obj) {
        return (obj instanceof tx5) && j == ((tx5) obj).g();
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static int e(long j) {
        return Long.hashCode(j);
    }

    public static String f(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ long g() {
        return this.a;
    }

    public int hashCode() {
        return e(this.a);
    }

    public String toString() {
        return f(this.a);
    }
}
