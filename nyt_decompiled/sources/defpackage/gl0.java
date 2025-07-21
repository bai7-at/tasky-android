package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class gl0 implements jz4 {
    public static final b Companion = new b(null);

    public static final class a {
        private final String a;
        private final boolean b;

        public a(String str, boolean z) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "ClearNewsQuizUserStats(message=" + this.a + ", success=" + this.b + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation ClearNewsQuizUserStats { clearNewsQuizUserStats { message success } }";
        }

        private b() {
        }
    }

    public static final class c implements ii5.a {
        private final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "Data(clearNewsQuizUserStats=" + this.a + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(il0.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == gl0.class;
    }

    public int hashCode() {
        return zt6.b(gl0.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "4bbe47f7b467b09ab17df5007f3fecb68784cdb31a1fc90736effeda94978bce";
    }

    @Override // defpackage.ii5
    public String name() {
        return "ClearNewsQuizUserStats";
    }
}
