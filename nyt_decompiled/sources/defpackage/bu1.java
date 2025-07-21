package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class bu1 implements Comparable {
    public static final a b = new a(null);
    private static final float c = g(0.0f);
    private static final float d = g(Float.POSITIVE_INFINITY);
    private static final float e = g(Float.NaN);
    private final float a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return bu1.c;
        }

        public final float b() {
            return bu1.d;
        }

        public final float c() {
            return bu1.e;
        }

        private a() {
        }
    }

    private /* synthetic */ bu1(float f) {
        this.a = f;
    }

    public static final /* synthetic */ bu1 d(float f) {
        return new bu1(f);
    }

    public static int f(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static float g(float f) {
        return f;
    }

    public static boolean i(float f, Object obj) {
        return (obj instanceof bu1) && Float.compare(f, ((bu1) obj).n()) == 0;
    }

    public static final boolean j(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int k(float f) {
        return Float.hashCode(f);
    }

    public static String l(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return e(((bu1) obj).n());
    }

    public int e(float f) {
        return f(this.a, f);
    }

    public boolean equals(Object obj) {
        return i(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ float n() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }
}
