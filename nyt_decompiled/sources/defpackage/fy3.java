package defpackage;

/* loaded from: classes4.dex */
public interface fy3 {

    public static final class a implements fy3 {
        public static final a a = new a();

        private a() {
        }
    }

    public static final class b implements fy3 {
        public static final b a = new b();

        private b() {
        }
    }

    public static final class c implements fy3 {
        private final g46 a;

        public c(g46 g46Var) {
            zq3.h(g46Var, "productTabs");
            this.a = g46Var;
        }

        public final g46 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "GamesTabbed(productTabs=" + this.a + ")";
        }
    }
}
