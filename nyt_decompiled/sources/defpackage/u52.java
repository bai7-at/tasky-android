package defpackage;

import com.facebook.AccessToken;
import defpackage.e78;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class u52 {
    private final e32 a;
    private final String b;
    private final String c;
    private final Pair d;
    private final Boolean e;

    public static final class a extends u52 {
        private final p54 f;
        private final boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p54 p54Var, boolean z) {
            super(null, p54Var.a(), "click", du8.a("email consent checkbox", !z ? "departure status: checked" : "departure status: unchecked"), null, 17, null);
            zq3.h(p54Var, "lireFlowType");
            this.f = p54Var;
            this.g = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.f, aVar.f) && this.g == aVar.g;
        }

        public int hashCode() {
            return (this.f.hashCode() * 31) + Boolean.hashCode(this.g);
        }

        public String toString() {
            return "OnAuthConfirmationScreenCheckboxUpdatedEvent(lireFlowType=" + this.f + ", isChecked=" + this.g + ")";
        }
    }

    public static final class a0 extends u52 {
        private final p54 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(p54 p54Var) {
            super(e78.a.c, p54Var.a(), null, null, null, 28, null);
            zq3.h(p54Var, "lireFlowType");
            this.f = p54Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && zq3.c(this.f, ((a0) obj).f);
        }

        public final p54 f() {
            return this.f;
        }

        public int hashCode() {
            return this.f.hashCode();
        }

        public String toString() {
            return "OnOpenAuthConfirmationScreenEvent(lireFlowType=" + this.f + ")";
        }
    }

    public static final class b extends u52 {
        private final p54 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p54 p54Var) {
            super(null, p54Var.a(), "click", du8.a("submit", "continue"), null, 17, null);
            zq3.h(p54Var, "lireFlowType");
            this.f = p54Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.f, ((b) obj).f);
        }

        public int hashCode() {
            return this.f.hashCode();
        }

        public String toString() {
            return "OnAuthConfirmationScreenEvent(lireFlowType=" + this.f + ")";
        }
    }

    public static final class b0 extends u52 {
        public static final b0 f = new b0();

        private b0() {
            super(e78.b.c, "createPassword", null, null, null, 28, null);
        }
    }

    public static final class c extends u52 {
        public static final c f = new c();

        private c() {
            super(null, "createPassword", "click", du8.a("submit", "email"), null, 17, null);
        }
    }

    public static final class c0 extends u52 {
        public static final c0 f = new c0();

        private c0() {
            super(e78.c.c, "entryView", null, null, null, 28, null);
        }
    }

    public static final class d extends u52 {
        public static final d f = new d();

        private d() {
            super(null, "createPassword", "click", du8.a("create password error", ""), null, 17, null);
        }
    }

    public static final class d0 extends u52 {
        public static final d0 f = new d0();

        private d0() {
            super(e78.c.c, "athleticLogin", null, null, null, 28, null);
        }
    }

    public static final class e extends u52 {
        public static final e f = new e();

        private e() {
            super(null, "createPassword", "click", du8.a("create password success", "email"), null, 17, null);
        }
    }

    public static final class e0 extends u52 {
        public static final e0 f = new e0();

        private e0() {
            super(e78.c.c, "athleticRegister", null, null, null, 28, null);
        }
    }

    public static final class f extends u52 {
        private final p54 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p54 p54Var) {
            super(null, p54Var.a(), "response", du8.a("get ta token error", ""), null, 17, null);
            zq3.h(p54Var, "lireFlowType");
            this.f = p54Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.f, ((f) obj).f);
        }

        public int hashCode() {
            return this.f.hashCode();
        }

        public String toString() {
            return "OnCustomNYTSLoginEventFailure(lireFlowType=" + this.f + ")";
        }
    }

    public static final class f0 extends u52 {
        public static final f0 f = new f0();

        private f0() {
            super(e78.d.c, "login", null, null, null, 28, null);
        }
    }

    public static final class g extends u52 {
        public static final g f = new g();

        private g() {
            super(null, "getTATokenError", null, null, null, 29, null);
        }
    }

    public static final class g0 extends u52 {
        public static final g0 f = new g0();

        private g0() {
            super(e78.e.c, "register", null, null, null, 28, null);
        }
    }

    public static final class h extends u52 {
        private final p54 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p54 p54Var) {
            super(null, p54Var.a(), "response", du8.a("get ta token success", ""), null, 17, null);
            zq3.h(p54Var, "lireFlowType");
            this.f = p54Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && zq3.c(this.f, ((h) obj).f);
        }

        public int hashCode() {
            return this.f.hashCode();
        }

        public String toString() {
            return "OnCustomNYTSLoginEventSuccess(lireFlowType=" + this.f + ")";
        }
    }

    public static final class h0 extends u52 {
        public static final h0 f = new h0();

        private h0() {
            super(e78.f.c, "verifyEmail", null, null, null, 28, null);
        }
    }

    public static final class i extends u52 {
        public static final i f = new i();

        private i() {
            super(null, "entryView", "click", du8.a("submit", "email"), null, 17, null);
        }
    }

    public static final class i0 extends u52 {
        public static final i0 f = new i0();

        private i0() {
            super(null, "verifyEmail", "click", du8.a("request new code link", "request new code link"), null, 17, null);
        }
    }

    public static final class j extends u52 {
        public static final j f = new j();

        private j() {
            super(null, "entryView", "response", du8.a("entryView error", "email"), null, 17, null);
        }
    }

    public static final class j0 extends u52 {
        public static final j0 f = new j0();

        private j0() {
            super(null, "verifyEmail", "click", du8.a("submit", "email"), null, 17, null);
        }
    }

    public static final class k extends u52 {
        public static final k f = new k();

        private k() {
            super(null, "entryView", "click", du8.a("show create password", "email"), null, 17, null);
        }
    }

    public static final class k0 extends u52 {
        public static final k0 f = new k0();

        private k0() {
            super(null, "verifyEmail", "click", du8.a("verify email error", "parameter-invalid:code"), null, 17, null);
        }
    }

    public static final class l extends u52 {
        public static final l f = new l();

        private l() {
            super(null, "entryView", "click", du8.a("show login", "email"), null, 17, null);
        }
    }

    public static final class l0 extends u52 {
        public static final l0 f = new l0();

        private l0() {
            super(null, "verifyEmail", "click", du8.a("verify email success", "email"), null, 17, null);
        }
    }

    public static final class m extends u52 {
        public static final m f = new m();

        private m() {
            super(null, "entryView", "click", du8.a("show register", "email"), null, 17, null);
        }
    }

    public static final class n extends u52 {
        public static final n f = new n();

        private n() {
            super(null, "entryView", "click", du8.a("show verify email", "email"), null, 17, null);
        }
    }

    public static final class o extends u52 {
        public static final o f = new o();

        private o() {
            super(null, "login", "click", du8.a("submit", "email"), null, 17, null);
        }
    }

    public static final class p extends u52 {
        public static final p f = new p();

        private p() {
            super(null, "login", "response", du8.a("login error", ""), null, 17, null);
        }
    }

    public static final class q extends u52 {
        public static final q f = new q();

        private q() {
            super(null, "login", "response", du8.a("login success", "email"), Boolean.TRUE, 1, null);
        }
    }

    public static final class r extends u52 {
        public static final r f = new r();

        private r() {
            super(null, "register", "click", du8.a("submit", "email"), null, 17, null);
        }
    }

    public static final class s extends u52 {
        public static final s f = new s();

        private s() {
            super(null, "register", "response", du8.a("register error", ""), null, 17, null);
        }
    }

    public static final class t extends u52 {
        public static final t f = new t();

        private t() {
            super(null, "register", "response", du8.a("register success", "email"), Boolean.TRUE, 1, null);
        }
    }

    public static final class u extends u52 {
        public static final u f = new u();

        private u() {
            super(null, "entryView", "click", du8.a("submit", AccessToken.DEFAULT_GRAPH_DOMAIN), null, 17, null);
        }
    }

    public static final class v extends u52 {
        public static final v f = new v();

        private v() {
            super(null, "entryView", "response", du8.a("auth error", "facebook: "), null, 17, null);
        }
    }

    public static final class w extends u52 {
        public static final w f = new w();

        private w() {
            super(null, "entryView", "response", du8.a("login success", AccessToken.DEFAULT_GRAPH_DOMAIN), Boolean.TRUE, 1, null);
        }
    }

    public static final class x extends u52 {
        public static final x f = new x();

        private x() {
            super(null, "entryView", "click", du8.a("submit", "google"), null, 17, null);
        }
    }

    public static final class y extends u52 {
        public static final y f = new y();

        private y() {
            super(null, "entryView", "response", du8.a("auth error", "google: "), null, 17, null);
        }
    }

    public static final class z extends u52 {
        public static final z f = new z();

        private z() {
            super(null, "entryView", "response", du8.a("login success", "google"), Boolean.TRUE, 1, null);
        }
    }

    public /* synthetic */ u52(e32 e32Var, String str, String str2, Pair pair, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(e32Var, str, str2, pair, bool);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final Pair c() {
        return this.d;
    }

    public final e32 d() {
        return this.a;
    }

    public final Boolean e() {
        return this.e;
    }

    private u52(e32 e32Var, String str, String str2, Pair pair, Boolean bool) {
        this.a = e32Var;
        this.b = str;
        this.c = str2;
        this.d = pair;
        this.e = bool;
    }

    public /* synthetic */ u52(e32 e32Var, String str, String str2, Pair pair, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : e32Var, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : pair, (i2 & 16) != 0 ? null : bool, null);
    }
}
