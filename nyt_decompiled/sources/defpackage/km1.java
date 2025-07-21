package defpackage;

/* loaded from: classes3.dex */
public final class km1 {
    private final Class a;
    private final int b;
    private final int c;

    private km1(Class cls, int i, int i2) {
        this.a = (Class) c16.c(cls, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }

    public static km1 a(Class cls) {
        return new km1(cls, 0, 2);
    }

    private static String b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static km1 h(Class cls) {
        return new km1(cls, 0, 0);
    }

    public static km1 i(Class cls) {
        return new km1(cls, 0, 1);
    }

    public static km1 j(Class cls) {
        return new km1(cls, 1, 0);
    }

    public static km1 k(Class cls) {
        return new km1(cls, 1, 1);
    }

    public static km1 l(Class cls) {
        return new km1(cls, 2, 0);
    }

    public Class c() {
        return this.a;
    }

    public boolean d() {
        return this.c == 2;
    }

    public boolean e() {
        return this.c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof km1)) {
            return false;
        }
        km1 km1Var = (km1) obj;
        return this.a == km1Var.a && this.b == km1Var.b && this.c == km1Var.c;
    }

    public boolean f() {
        return this.b == 1;
    }

    public boolean g() {
        return this.b == 2;
    }

    public int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.c));
        sb.append("}");
        return sb.toString();
    }
}
