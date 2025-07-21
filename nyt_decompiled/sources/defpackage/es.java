package defpackage;

/* loaded from: classes3.dex */
public final class es implements rp2 {
    private final a a;

    public static final class a {
        private final String a;

        public a(String str) {
            zq3.h(str, "default");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Headline(default=" + this.a + ")";
        }
    }

    public es(a aVar) {
        this.a = aVar;
    }

    public final a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es) && zq3.c(this.a, ((es) obj).a);
    }

    public int hashCode() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public String toString() {
        return "AssetCreativeWork(headline=" + this.a + ")";
    }
}
