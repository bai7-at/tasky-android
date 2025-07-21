package defpackage;

/* loaded from: classes.dex */
public final class hy5 {
    private final int a;

    private /* synthetic */ hy5(int i) {
        this.a = i;
    }

    public static final /* synthetic */ hy5 a(int i) {
        return new hy5(i);
    }

    public static int b(int i) {
        return i;
    }

    public static boolean c(int i, Object obj) {
        return (obj instanceof hy5) && i == ((hy5) obj).f();
    }

    public static int d(int i) {
        return Integer.hashCode(i);
    }

    public static String e(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
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
