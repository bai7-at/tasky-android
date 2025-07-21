package androidx.compose.ui.text;

import defpackage.pj8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i {
    public static final a b = new a(null);
    private static final long c = pj8.a(0);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return i.c;
        }

        private a() {
        }
    }

    private /* synthetic */ i(long j) {
        this.a = j;
    }

    public static final /* synthetic */ i b(long j) {
        return new i(j);
    }

    public static long c(long j) {
        return j;
    }

    public static final boolean d(long j, long j2) {
        return l(j) <= l(j2) && k(j2) <= k(j);
    }

    public static final boolean e(long j, int i) {
        return i < k(j) && l(j) <= i;
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof i) && j == ((i) obj).r();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static final boolean h(long j) {
        return n(j) == i(j);
    }

    public static final int i(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int j(long j) {
        return k(j) - l(j);
    }

    public static final int k(long j) {
        return n(j) > i(j) ? n(j) : i(j);
    }

    public static final int l(long j) {
        return n(j) > i(j) ? i(j) : n(j);
    }

    public static final boolean m(long j) {
        return n(j) > i(j);
    }

    public static final int n(long j) {
        return (int) (j >> 32);
    }

    public static int o(long j) {
        return Long.hashCode(j);
    }

    public static final boolean p(long j, long j2) {
        return l(j) < k(j2) && l(j2) < k(j);
    }

    public static String q(long j) {
        return "TextRange(" + n(j) + ", " + i(j) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return o(this.a);
    }

    public final /* synthetic */ long r() {
        return this.a;
    }

    public String toString() {
        return q(this.a);
    }
}
