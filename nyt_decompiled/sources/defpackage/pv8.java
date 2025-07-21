package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class pv8 implements Comparable {
    public static final a b = new a(null);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ pv8(long j) {
        this.a = j;
    }

    public static final /* synthetic */ pv8 a(long j) {
        return new pv8(j);
    }

    public static long b(long j) {
        return j;
    }

    public static boolean c(long j, Object obj) {
        return (obj instanceof pv8) && j == ((pv8) obj).g();
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static int e(long j) {
        return Long.hashCode(j);
    }

    public static String f(long j) {
        return qx8.d(j, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return qx8.b(g(), ((pv8) obj).g());
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
