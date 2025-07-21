package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class p54 {
    private final String a;

    public static final class a extends p54 {
        public static final a b = new a();

        private a() {
            super("login", null);
        }
    }

    public static final class b extends p54 {
        public static final b b = new b();

        private b() {
            super("register", null);
        }
    }

    public static final class c extends p54 {
        public static final c b = new c();

        private c() {
            super("regiliteAccountReady", null);
        }
    }

    public static final class d extends p54 {
        private final i77 b;

        public d(i77 i77Var) {
            super("ssoConfirmationLogin", null);
            this.b = i77Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.b, ((d) obj).b);
        }

        public int hashCode() {
            i77 i77Var = this.b;
            if (i77Var == null) {
                return 0;
            }
            return i77Var.hashCode();
        }

        public String toString() {
            return "SSOLogin(ssoType=" + this.b + ")";
        }
    }

    public static final class e extends p54 {
        private final i77 b;

        public e(i77 i77Var) {
            super("ssoConfirmationLinked", null);
            this.b = i77Var;
        }

        public final i77 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            i77 i77Var = this.b;
            if (i77Var == null) {
                return 0;
            }
            return i77Var.hashCode();
        }

        public String toString() {
            return "SSORegiLiteLinked(ssoType=" + this.b + ")";
        }
    }

    public static final class f extends p54 {
        private final i77 b;

        public f(i77 i77Var) {
            super("ssoConfirmationRegister", null);
            this.b = i77Var;
        }

        public final i77 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.b, ((f) obj).b);
        }

        public int hashCode() {
            i77 i77Var = this.b;
            if (i77Var == null) {
                return 0;
            }
            return i77Var.hashCode();
        }

        public String toString() {
            return "SSORegister(ssoType=" + this.b + ")";
        }
    }

    public static final class g extends p54 {
        public static final g b = new g();

        private g() {
            super("", null);
        }
    }

    public /* synthetic */ p54(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private p54(String str) {
        this.a = str;
    }
}
