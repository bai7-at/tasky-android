package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class hv8 implements Comparable {
    public static final a b = new a(null);
    private final byte a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ hv8(byte b2) {
        this.a = b2;
    }

    public static final /* synthetic */ hv8 a(byte b2) {
        return new hv8(b2);
    }

    public static byte b(byte b2) {
        return b2;
    }

    public static boolean c(byte b2, Object obj) {
        return (obj instanceof hv8) && b2 == ((hv8) obj).f();
    }

    public static int d(byte b2) {
        return Byte.hashCode(b2);
    }

    public static String e(byte b2) {
        return String.valueOf(b2 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return zq3.j(f() & 255, ((hv8) obj).f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ byte f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
