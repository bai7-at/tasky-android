package defpackage;

/* loaded from: classes2.dex */
public final class sa4 {
    private final String a;
    private final h42 b;

    public static final class a {
        private String a;
        private h42 b = new a75();

        public final sa4 a() {
            return new sa4(this.a, this.b);
        }
    }

    public sa4(String str, h42 h42Var) {
        zq3.h(h42Var, "eventMapper");
        this.a = str;
        this.b = h42Var;
    }

    public final String a() {
        return this.a;
    }

    public final h42 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa4)) {
            return false;
        }
        sa4 sa4Var = (sa4) obj;
        return zq3.c(this.a, sa4Var.a) && zq3.c(this.b, sa4Var.b);
    }

    public int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LogsConfiguration(customEndpointUrl=" + this.a + ", eventMapper=" + this.b + ")";
    }
}
