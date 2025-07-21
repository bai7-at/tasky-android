package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b02 {
    public static final a b = new a(null);
    private static final int c = d(0);
    private static final int d = d(1);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return b02.c;
        }

        public final int b() {
            return b02.d;
        }

        private a() {
        }
    }

    private /* synthetic */ b02(int i) {
        this.a = i;
    }

    public static final /* synthetic */ b02 c(int i) {
        return new b02(i);
    }

    private static int d(int i) {
        return i;
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof b02) && i == ((b02) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static int g(int i) {
        return Integer.hashCode(i);
    }

    public static String h(int i) {
        if (i == c) {
            return "EmojiSupportMatch.Default";
        }
        if (i == d) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ int i() {
        return this.a;
    }

    public String toString() {
        return h(this.a);
    }
}
