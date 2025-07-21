package defpackage;

import defpackage.bu1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class fu1 {
    public static final a b = new a(null);
    private static final long c;
    private static final long d;
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return fu1.d;
        }

        public final long b() {
            return fu1.c;
        }

        private a() {
        }
    }

    static {
        float f = 0;
        c = du1.b(bu1.g(f), bu1.g(f));
        bu1.a aVar = bu1.b;
        d = du1.b(aVar.c(), aVar.c());
    }

    private /* synthetic */ fu1(long j) {
        this.a = j;
    }

    public static final /* synthetic */ fu1 c(long j) {
        return new fu1(j);
    }

    public static long d(long j) {
        return j;
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof fu1) && j == ((fu1) obj).k();
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final float g(long j) {
        if (j == d) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        wk2 wk2Var = wk2.a;
        return bu1.g(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final float h(long j) {
        if (j == d) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        wk2 wk2Var = wk2.a;
        return bu1.g(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static int i(long j) {
        return Long.hashCode(j);
    }

    public static String j(long j) {
        if (j == b.a()) {
            return "DpSize.Unspecified";
        }
        return ((Object) bu1.l(h(j))) + " x " + ((Object) bu1.l(g(j)));
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
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
