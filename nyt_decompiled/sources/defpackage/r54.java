package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class r54 {
    private final r54 a;
    private final boolean b;

    public static final class a extends r54 {
        public static final a c = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super(null, 0 == true ? 1 : 0);
        }
    }

    public static final class b extends r54 {
        private final String c;
        private final String d;
        private final Boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Boolean bool) {
            super(new e(str), null);
            zq3.h(str, "username");
            this.c = str;
            this.d = str2;
            this.e = bool;
        }

        public static /* synthetic */ b d(b bVar, String str, String str2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.c;
            }
            if ((i & 2) != 0) {
                str2 = bVar.d;
            }
            if ((i & 4) != 0) {
                bool = bVar.e;
            }
            return bVar.c(str, str2, bool);
        }

        public final b c(String str, String str2, Boolean bool) {
            zq3.h(str, "username");
            return new b(str, str2, bool);
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e);
        }

        public final String f() {
            return this.c;
        }

        public final Boolean g() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.e;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "CreateAccountScreen(username=" + this.c + ", password=" + this.d + ", isCheckBoxChecked=" + this.e + ")";
        }
    }

    public static final class c extends r54 {
        private final String c;
        private final String d;
        private final String e;
        private final boolean f;
        private final boolean g;

        public /* synthetic */ c(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? false : z);
        }

        public static /* synthetic */ c d(c cVar, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.c;
            }
            if ((i & 2) != 0) {
                str2 = cVar.d;
            }
            if ((i & 4) != 0) {
                str3 = cVar.e;
            }
            if ((i & 8) != 0) {
                z = cVar.f;
            }
            return cVar.c(str, str2, str3, z);
        }

        @Override // defpackage.r54
        public boolean b() {
            return this.g;
        }

        public final c c(String str, String str2, String str3, boolean z) {
            zq3.h(str, "username");
            zq3.h(str3, "token");
            return new c(str, str2, str3, z);
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.c, cVar.c) && zq3.c(this.d, cVar.d) && zq3.c(this.e, cVar.e) && this.f == cVar.f;
        }

        public final String f() {
            return this.e;
        }

        public final String g() {
            return this.c;
        }

        public final boolean h() {
            return this.f;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f);
        }

        public String toString() {
            return "CreateNewPasswordScreen(username=" + this.c + ", password=" + this.d + ", token=" + this.e + ", verificationWasSkipped=" + this.f + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, boolean z) {
            super(new e(str), null);
            zq3.h(str, "username");
            zq3.h(str3, "token");
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = z;
        }
    }

    public static final class d extends r54 {
        private final String c;
        private final String d;

        public /* synthetic */ d(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ d d(d dVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.c;
            }
            if ((i & 2) != 0) {
                str2 = dVar.d;
            }
            return dVar.c(str, str2);
        }

        public final d c(String str, String str2) {
            zq3.h(str, "username");
            return new d(str, str2);
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.c, dVar.c) && zq3.c(this.d, dVar.d);
        }

        public final String f() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LoginScreen(username=" + this.c + ", password=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(new e(str), null);
            zq3.h(str, "username");
            this.c = str;
            this.d = str2;
        }
    }

    public static final class e extends r54 {
        private final String c;

        public e(String str) {
            super(a.c, null);
            this.c = str;
        }

        public final e c(String str) {
            return new e(str);
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            String str = this.c;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MainScreen(username=" + this.c + ")";
        }

        public /* synthetic */ e(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public static final class f extends r54 {
        private final String c;
        private final na4 d;
        private final boolean e;
        private final boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, na4 na4Var, boolean z, boolean z2) {
            super(a.c, null);
            zq3.h(str, "username");
            this.c = str;
            this.d = na4Var;
            this.e = z;
            this.f = z2;
        }

        public final na4 c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.c, fVar.c) && zq3.c(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f;
        }

        public final boolean f() {
            return this.f;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            na4 na4Var = this.d;
            return ((((hashCode + (na4Var == null ? 0 : na4Var.hashCode())) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
        }

        public String toString() {
            return "SuccessEmailOptInScreen(username=" + this.c + ", loginState=" + this.d + ", isRegistration=" + this.e + ", isSSO=" + this.f + ")";
        }
    }

    public static final class g extends r54 {
        private final String c;
        private final String d;
        private final boolean e;

        public /* synthetic */ g(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ g d(g gVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.c;
            }
            if ((i & 2) != 0) {
                str2 = gVar.d;
            }
            return gVar.c(str, str2);
        }

        @Override // defpackage.r54
        public boolean b() {
            return this.e;
        }

        public final g c(String str, String str2) {
            zq3.h(str, "username");
            return new g(str, str2);
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.c, gVar.c) && zq3.c(this.d, gVar.d);
        }

        public final String f() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "VerifyEmailScreen(username=" + this.c + ", code=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(new e(str), null);
            zq3.h(str, "username");
            this.c = str;
            this.d = str2;
        }
    }

    public static final class h extends r54 {
        private final String c;
        private final String d;
        private final r54 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, r54 r54Var) {
            super(r54Var, null);
            zq3.h(str, "url");
            zq3.h(str2, "title");
            zq3.h(r54Var, "originScreen");
            this.c = str;
            this.d = str2;
            this.e = r54Var;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.c, hVar.c) && zq3.c(this.d, hVar.d) && zq3.c(this.e, hVar.e);
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "WebScreen(url=" + this.c + ", title=" + this.d + ", originScreen=" + this.e + ")";
        }
    }

    public /* synthetic */ r54(r54 r54Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(r54Var);
    }

    public final r54 a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    private r54(r54 r54Var) {
        this.a = r54Var;
        this.b = true;
    }
}
