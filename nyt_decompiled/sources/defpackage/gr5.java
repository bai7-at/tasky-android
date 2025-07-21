package defpackage;

/* loaded from: classes2.dex */
public interface gr5 {

    public static final class a implements gr5 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "Denied(shouldShowRationale=" + this.a + ')';
        }
    }

    public static final class b implements gr5 {
        public static final b a = new b();

        private b() {
        }
    }
}
