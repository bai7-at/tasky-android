package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class m60 {
    public static final a b = new a(null);
    private static final float c = c(0.5f);
    private static final float d = c(-0.5f);
    private static final float e = c(0.0f);
    private final float a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return m60.e;
        }

        private a() {
        }
    }

    private /* synthetic */ m60(float f) {
        this.a = f;
    }

    public static final /* synthetic */ m60 b(float f) {
        return new m60(f);
    }

    public static float c(float f) {
        return f;
    }

    public static boolean d(float f, Object obj) {
        return (obj instanceof m60) && Float.compare(f, ((m60) obj).h()) == 0;
    }

    public static final boolean e(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int f(float f) {
        return Float.hashCode(f);
    }

    public static String g(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final /* synthetic */ float h() {
        return this.a;
    }

    public int hashCode() {
        return f(this.a);
    }

    public String toString() {
        return g(this.a);
    }
}
