package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class fk8 {
    public static final a b = new a(null);
    private static final long c = e(0);
    private static final long d = e(4294967296L);
    private static final long e = e(8589934592L);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return fk8.e;
        }

        public final long b() {
            return fk8.d;
        }

        public final long c() {
            return fk8.c;
        }

        private a() {
        }
    }

    private /* synthetic */ fk8(long j) {
        this.a = j;
    }

    public static final /* synthetic */ fk8 d(long j) {
        return new fk8(j);
    }

    public static long e(long j) {
        return j;
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof fk8) && j == ((fk8) obj).j();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        return g(j, c) ? "Unspecified" : g(j, d) ? "Sp" : g(j, e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
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
