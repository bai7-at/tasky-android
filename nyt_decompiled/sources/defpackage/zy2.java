package defpackage;

/* loaded from: classes.dex */
public final class zy2 {
    private final String a;
    private final boolean b;

    public static final class a {
        private String a = "";
        private boolean b = true;

        public final zy2 a() {
            if (this.a.length() > 0) {
                return new zy2(this.a, this.b);
            }
            throw new IllegalStateException("adsSdkName must be set");
        }

        public final a b(String str) {
            zq3.h(str, "adsSdkName");
            this.a = str;
            return this;
        }

        public final a c(boolean z) {
            this.b = z;
            return this;
        }
    }

    public zy2(String str, boolean z) {
        zq3.h(str, "adsSdkName");
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2)) {
            return false;
        }
        zy2 zy2Var = (zy2) obj;
        return zq3.c(this.a, zy2Var.a) && this.b == zy2Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.a + ", shouldRecordObservation=" + this.b;
    }
}
