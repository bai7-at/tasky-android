package defpackage;

/* loaded from: classes4.dex */
public interface s25 {

    public static final class a implements s25 {
        public static final a a = new a();

        private a() {
        }
    }

    public static final class b implements s25 {
        public static final b a = new b();
        public static final int b = 0;

        private b() {
        }
    }

    public static final class c implements s25 {
        private final int a;

        public c(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return "UpdatedContent(numberOfUpdates=" + this.a + ")";
        }
    }
}
