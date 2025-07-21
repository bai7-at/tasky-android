package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class aw8 implements Comparable {
    public static final a b = new a(null);
    private final short a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ aw8(short s) {
        this.a = s;
    }

    public static final /* synthetic */ aw8 a(short s) {
        return new aw8(s);
    }

    public static short b(short s) {
        return s;
    }

    public static boolean c(short s, Object obj) {
        return (obj instanceof aw8) && s == ((aw8) obj).f();
    }

    public static int d(short s) {
        return Short.hashCode(s);
    }

    public static String e(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return zq3.j(f() & 65535, ((aw8) obj).f() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ short f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
