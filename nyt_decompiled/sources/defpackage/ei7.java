package defpackage;

/* loaded from: classes2.dex */
public interface ei7 {

    public static final class a {
        public final gi7 a;
        public final gi7 b;

        public a(gi7 gi7Var) {
            this(gi7Var, gi7Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                str = ", " + this.b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public a(gi7 gi7Var, gi7 gi7Var2) {
            this.a = (gi7) ur.e(gi7Var);
            this.b = (gi7) ur.e(gi7Var2);
        }
    }

    public static class b implements ei7 {
        private final long a;
        private final a b;

        public b(long j) {
            this(j, 0L);
        }

        @Override // defpackage.ei7
        public a f(long j) {
            return this.b;
        }

        @Override // defpackage.ei7
        public boolean h() {
            return false;
        }

        @Override // defpackage.ei7
        public long i() {
            return this.a;
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? gi7.c : new gi7(0L, j2));
        }
    }

    a f(long j);

    boolean h();

    long i();
}
