package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class vm3 {
    public static final a b = new a(null);
    private static final long c = wm3.a(0, 0);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return vm3.c;
        }

        private a() {
        }
    }

    private /* synthetic */ vm3(long j) {
        this.a = j;
    }

    public static final /* synthetic */ vm3 b(long j) {
        return new vm3(j);
    }

    public static final int c(long j) {
        return j(j);
    }

    public static final int d(long j) {
        return k(j);
    }

    public static long e(long j) {
        return j;
    }

    public static final long f(long j, int i, int i2) {
        return wm3.a(i, i2);
    }

    public static /* synthetic */ long g(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = j(j);
        }
        if ((i3 & 2) != 0) {
            i2 = k(j);
        }
        return f(j, i, i2);
    }

    public static boolean h(long j, Object obj) {
        return (obj instanceof vm3) && j == ((vm3) obj).n();
    }

    public static final boolean i(long j, long j2) {
        return j == j2;
    }

    public static final int j(long j) {
        return (int) (j >> 32);
    }

    public static final int k(long j) {
        return (int) (j & 4294967295L);
    }

    public static int l(long j) {
        return Long.hashCode(j);
    }

    public static String m(long j) {
        return '(' + j(j) + ", " + k(j) + ')';
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return l(this.a);
    }

    public final /* synthetic */ long n() {
        return this.a;
    }

    public String toString() {
        return m(this.a);
    }
}
