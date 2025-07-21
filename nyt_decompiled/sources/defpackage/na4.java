package defpackage;

import com.nytimes.android.subauth.core.api.providers.LinkResult;
import com.nytimes.subauth.ui.login.helpers.ErrorDisplayType;
import com.nytimes.subauth.ui.models.LoginType;
import defpackage.oa4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class na4 {

    public static final class a extends na4 {
        private final oa4.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oa4.a aVar) {
            super(null);
            zq3.h(aVar, "loginStatus");
            this.a = aVar;
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
            return "Cancelled(loginStatus=" + this.a + ")";
        }
    }

    public static final class b extends na4 {
        private final String a;
        private final ErrorDisplayType b;
        private final oa4.b c;
        private final boolean d;
        private final boolean e;
        private final String f;

        public /* synthetic */ b(String str, ErrorDisplayType errorDisplayType, oa4.b bVar, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, errorDisplayType, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str2);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.f;
        }

        public final ErrorDisplayType c() {
            return this.b;
        }

        public final oa4.b d() {
            return this.c;
        }

        public final boolean e() {
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
            return zq3.c(this.a, bVar.a) && this.b == bVar.b && zq3.c(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && zq3.c(this.f, bVar.f);
        }

        public final boolean f() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            oa4.b bVar = this.c;
            int hashCode2 = (((((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31;
            String str = this.f;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Error(displayText=" + this.a + ", errorDisplayType=" + this.b + ", loginStatus=" + this.c + ", isEmailSupportError=" + this.d + ", isResetPasswordError=" + this.e + ", displayTitle=" + this.f + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ErrorDisplayType errorDisplayType, oa4.b bVar, boolean z, boolean z2, String str2) {
            super(null);
            zq3.h(str, "displayText");
            zq3.h(errorDisplayType, "errorDisplayType");
            this.a = str;
            this.b = errorDisplayType;
            this.c = bVar;
            this.d = z;
            this.e = z2;
            this.f = str2;
        }
    }

    public static final class c extends na4 {
        private final String a;
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(null);
            zq3.h(str, "title");
            zq3.h(str2, "message");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "ErrorForceLogout(title=" + this.a + ", message=" + this.b + ")";
        }
    }

    public static final class d extends na4 {
        private final String a;
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(null);
            zq3.h(str, "title");
            zq3.h(str2, "message");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "InformativeAlert(title=" + this.a + ", message=" + this.b + ")";
        }
    }

    public static final class e extends na4 {
        private final String a;
        private final String b;
        private final LoginType c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, LoginType loginType) {
            super(null);
            zq3.h(str, "url");
            zq3.h(str2, "webStateParam");
            zq3.h(loginType, "loginType");
            this.a = str;
            this.b = str2;
            this.c = loginType;
        }

        public final LoginType a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "OpenWebSSO(url=" + this.a + ", webStateParam=" + this.b + ", loginType=" + this.c + ")";
        }
    }

    public static final class f extends na4 {
        private final LoginType a;
        private final oa4.c b;
        private final LinkResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LoginType loginType, oa4.c cVar, LinkResult linkResult) {
            super(null);
            zq3.h(loginType, "loginType");
            zq3.h(cVar, "loginStatus");
            zq3.h(linkResult, "linkingResult");
            this.a = loginType;
            this.b = cVar;
            this.c = linkResult;
        }

        public final LinkResult a() {
            return this.c;
        }

        public final oa4.c b() {
            return this.b;
        }

        public final LoginType c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && this.c == fVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Success(loginType=" + this.a + ", loginStatus=" + this.b + ", linkingResult=" + this.c + ")";
        }
    }

    public static final class g extends na4 {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public static final class h extends na4 {
        private final LoginType a;
        private final oa4.c b;
        private final LinkResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LoginType loginType, oa4.c cVar, LinkResult linkResult) {
            super(null);
            zq3.h(loginType, "loginType");
            zq3.h(cVar, "loginStatus");
            zq3.h(linkResult, "linkingResult");
            this.a = loginType;
            this.b = cVar;
            this.c = linkResult;
        }

        public final oa4.c a() {
            return this.b;
        }

        public final LoginType b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && this.c == hVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "SuccessWithFailedLink(loginType=" + this.a + ", loginStatus=" + this.b + ", linkingResult=" + this.c + ")";
        }
    }

    public /* synthetic */ na4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private na4() {
    }
}
