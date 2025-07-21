package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class lv8 implements Comparable {
    public static final a b = new a(null);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ lv8(int i) {
        this.a = i;
    }

    public static final /* synthetic */ lv8 a(int i) {
        return new lv8(i);
    }

    public static int b(int i) {
        return i;
    }

    public static boolean c(int i, Object obj) {
        return (obj instanceof lv8) && i == ((lv8) obj).f();
    }

    public static int d(int i) {
        return Integer.hashCode(i);
    }

    public static String e(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return qx8.a(f(), ((lv8) obj).f());
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ int f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
