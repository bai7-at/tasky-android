package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class dh8 {
    public static final a b = new a(null);
    private static final int c = i(1);
    private static final int d = i(2);
    private static final int e = i(3);
    private static final int f = i(4);
    private static final int g = i(5);
    private static final int h = i(6);
    private static final int i = i(RecyclerView.UNDEFINED_DURATION);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return dh8.e;
        }

        public final int b() {
            return dh8.h;
        }

        public final int c() {
            return dh8.f;
        }

        public final int d() {
            return dh8.c;
        }

        public final int e() {
            return dh8.d;
        }

        public final int f() {
            return dh8.g;
        }

        public final int g() {
            return dh8.i;
        }

        private a() {
        }
    }

    private /* synthetic */ dh8(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ dh8 h(int i2) {
        return new dh8(i2);
    }

    public static int i(int i2) {
        return i2;
    }

    public static boolean j(int i2, Object obj) {
        return (obj instanceof dh8) && i2 == ((dh8) obj).n();
    }

    public static final boolean k(int i2, int i3) {
        return i2 == i3;
    }

    public static int l(int i2) {
        return Integer.hashCode(i2);
    }

    public static String m(int i2) {
        return k(i2, c) ? "Left" : k(i2, d) ? "Right" : k(i2, e) ? "Center" : k(i2, f) ? "Justify" : k(i2, g) ? "Start" : k(i2, h) ? "End" : k(i2, i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.a, obj);
    }

    public int hashCode() {
        return l(this.a);
    }

    public final /* synthetic */ int n() {
        return this.a;
    }

    public String toString() {
        return m(this.a);
    }
}
