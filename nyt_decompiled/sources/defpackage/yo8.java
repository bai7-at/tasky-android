package defpackage;

/* loaded from: classes2.dex */
public final class yo8 {
    private final String a;
    private final dy7 b;
    private final boolean c;

    public static final class a {
        private String a;
        private dy7 b = new o75();
        private boolean c = true;

        public final yo8 a() {
            return new yo8(this.a, this.b, this.c);
        }
    }

    public yo8(String str, dy7 dy7Var, boolean z) {
        zq3.h(dy7Var, "eventMapper");
        this.a = str;
        this.b = dy7Var;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final dy7 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo8)) {
            return false;
        }
        yo8 yo8Var = (yo8) obj;
        return zq3.c(this.a, yo8Var.a) && zq3.c(this.b, yo8Var.b) && this.c == yo8Var.c;
    }

    public int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "TraceConfiguration(customEndpointUrl=" + this.a + ", eventMapper=" + this.b + ", networkInfoEnabled=" + this.c + ")";
    }
}
