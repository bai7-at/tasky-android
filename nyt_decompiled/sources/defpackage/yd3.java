package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class yd3 {
    public static final a b = new a(null);
    private static final int c = e(1);
    private static final int d = e(2);
    private static final int e = e(RecyclerView.UNDEFINED_DURATION);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return yd3.d;
        }

        public final int b() {
            return yd3.c;
        }

        public final int c() {
            return yd3.e;
        }

        private a() {
        }
    }

    private /* synthetic */ yd3(int i) {
        this.a = i;
    }

    public static final /* synthetic */ yd3 d(int i) {
        return new yd3(i);
    }

    private static int e(int i) {
        return i;
    }

    public static boolean f(int i, Object obj) {
        return (obj instanceof yd3) && i == ((yd3) obj).j();
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static int h(int i) {
        return Integer.hashCode(i);
    }

    public static String i(int i) {
        return g(i, c) ? "Hyphens.None" : g(i, d) ? "Hyphens.Auto" : g(i, e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ int j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }
}
