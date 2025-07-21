package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class hn3 {
    public static final a b = new a(null);
    private static final long c = c(0);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return hn3.c;
        }

        private a() {
        }
    }

    private /* synthetic */ hn3(long j) {
        this.a = j;
    }

    public static final /* synthetic */ hn3 b(long j) {
        return new hn3(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof hn3) && j == ((hn3) obj).j();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final int f(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int g(long j) {
        return (int) (j >> 32);
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        return g(j) + " x " + f(j);
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ long j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }
}
