package defpackage;

import defpackage.fk8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class dk8 {
    public static final a b = new a(null);
    private static final fk8[] c;
    private static final long d;
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return dk8.d;
        }

        private a() {
        }
    }

    static {
        fk8.a aVar = fk8.b;
        c = new fk8[]{fk8.d(aVar.c()), fk8.d(aVar.b()), fk8.d(aVar.a())};
        d = ek8.j(0L, Float.NaN);
    }

    private /* synthetic */ dk8(long j) {
        this.a = j;
    }

    public static final /* synthetic */ dk8 b(long j) {
        return new dk8(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof dk8) && j == ((dk8) obj).k();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final long f(long j) {
        return j & 1095216660480L;
    }

    public static final long g(long j) {
        return c[(int) (f(j) >>> 32)].j();
    }

    public static final float h(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int i(long j) {
        return Long.hashCode(j);
    }

    public static String j(long j) {
        long g = g(j);
        fk8.a aVar = fk8.b;
        if (fk8.g(g, aVar.c())) {
            return "Unspecified";
        }
        if (fk8.g(g, aVar.b())) {
            return h(j) + ".sp";
        }
        if (!fk8.g(g, aVar.a())) {
            return "Invalid";
        }
        return h(j) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return i(this.a);
    }

    public final /* synthetic */ long k() {
        return this.a;
    }

    public String toString() {
        return j(this.a);
    }
}
