package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class uh8 {
    public static final a b = new a(null);
    private static final int c = h(1);
    private static final int d = h(2);
    private static final int e = h(3);
    private static final int f = h(4);
    private static final int g = h(5);
    private static final int h = h(RecyclerView.UNDEFINED_DURATION);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return uh8.e;
        }

        public final int b() {
            return uh8.f;
        }

        public final int c() {
            return uh8.g;
        }

        public final int d() {
            return uh8.c;
        }

        public final int e() {
            return uh8.d;
        }

        public final int f() {
            return uh8.h;
        }

        private a() {
        }
    }

    private /* synthetic */ uh8(int i) {
        this.a = i;
    }

    public static final /* synthetic */ uh8 g(int i) {
        return new uh8(i);
    }

    public static int h(int i) {
        return i;
    }

    public static boolean i(int i, Object obj) {
        return (obj instanceof uh8) && i == ((uh8) obj).m();
    }

    public static final boolean j(int i, int i2) {
        return i == i2;
    }

    public static int k(int i) {
        return Integer.hashCode(i);
    }

    public static String l(int i) {
        return j(i, c) ? "Ltr" : j(i, d) ? "Rtl" : j(i, e) ? "Content" : j(i, f) ? "ContentOrLtr" : j(i, g) ? "ContentOrRtl" : j(i, h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ int m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }
}
