package defpackage;

import android.net.UrlQuerySanitizer;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AccessToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class zd9 {
    public static final a c = new a(null);
    private final String a;
    private final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zd9 a(String str, String str2) {
            zq3.h(str, "deepLink");
            zq3.h(str2, "savedWebSSOState");
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(h.F(h.F(str, "#state", "&state", false, 4, null), "#access_token", "&access_token", false, 4, null));
            String a = ee9.a(urlQuerySanitizer, TransferTable.COLUMN_STATE);
            return urlQuerySanitizer.hasParameter("error") ? zq3.c(ee9.a(urlQuerySanitizer, "error_reason"), "user_denied") ? new de9(str, a) : new ae9(str, a, ee9.a(urlQuerySanitizer, "error"), ee9.a(urlQuerySanitizer, "errorCode"), ee9.a(urlQuerySanitizer, "errorDescription"), ee9.a(urlQuerySanitizer, "errorReason")) : !zq3.c(a, str2) ? new be9(str, a) : (!zq3.c(a, str2) || h.d0(ee9.a(urlQuerySanitizer, AccessToken.ACCESS_TOKEN_KEY))) ? new ce9(str, a) : new b(str, a, ee9.a(urlQuerySanitizer, AccessToken.ACCESS_TOKEN_KEY), ee9.a(urlQuerySanitizer, "token_type"), ee9.a(urlQuerySanitizer, AccessToken.EXPIRES_IN_KEY), ee9.a(urlQuerySanitizer, "scope"), ee9.a(urlQuerySanitizer, "provider"));
        }

        private a() {
        }
    }

    public static final class b extends zd9 {
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(str, str2);
            zq3.h(str, "redirectUrl");
            zq3.h(str2, TransferTable.COLUMN_STATE);
            zq3.h(str3, "accessToken");
            zq3.h(str4, "tokenType");
            zq3.h(str5, "expiresIn");
            zq3.h(str6, "scope");
            zq3.h(str7, "ssoProvider");
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = str7;
        }

        public final String a() {
            return this.f;
        }

        public final String b() {
            return this.j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e) && zq3.c(this.f, bVar.f) && zq3.c(this.g, bVar.g) && zq3.c(this.h, bVar.h) && zq3.c(this.i, bVar.i) && zq3.c(this.j, bVar.j);
        }

        public int hashCode() {
            return (((((((((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
        }

        public String toString() {
            return "Success(redirectUrl=" + this.d + ", state=" + this.e + ", accessToken=" + this.f + ", tokenType=" + this.g + ", expiresIn=" + this.h + ", scope=" + this.i + ", ssoProvider=" + this.j + ")";
        }
    }

    public zd9(String str, String str2) {
        zq3.h(str, "redirectUrl");
        zq3.h(str2, TransferTable.COLUMN_STATE);
        this.a = str;
        this.b = str2;
    }
}
