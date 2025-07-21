package defpackage;

import android.content.res.Resources;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class f68 {
    private final Pair A;
    private final Pair B;
    private final Resources a;
    private final b68 b;
    private final b68 c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final Pair m;
    private final Pair n;
    private final boolean o;
    private final String p;
    private final boolean q;
    private final String r;
    private final String s;
    private final boolean t;
    private final nk8 u;
    private final String v;
    private final String w;
    private final Pair x;
    private final Pair y;
    private final Pair z;

    public f68(Resources resources, b68 b68Var, b68 b68Var2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Pair pair, Pair pair2, boolean z, String str10, boolean z2, String str11, String str12, boolean z3, nk8 nk8Var, String str13, String str14) {
        Pair pair3;
        zq3.h(resources, "resources");
        zq3.h(b68Var, "darkModeColors");
        zq3.h(b68Var2, "lightModeColor");
        zq3.h(str, "emailFirstScreenTitle");
        zq3.h(str2, "registrationScreenTitle");
        zq3.h(str3, "loginScreenTitle");
        zq3.h(str4, "regiliteVerifyEmailScreenTitle");
        zq3.h(str5, "regiliteCreateNewPasswordScreenTitle");
        zq3.h(str6, "regiliteSuccessScreenTitle");
        zq3.h(str7, "regiliteSuccessScreenBody");
        zq3.h(str8, "regiliteSuccessSSOScreenTitle");
        zq3.h(str9, "regiliteSuccessSSOScreenTitleRegister");
        zq3.h(pair, "loginScreenHeading");
        zq3.h(pair2, "newsLetter");
        zq3.h(str11, "webSSOAppName");
        zq3.h(nk8Var, "theAthleticUser");
        zq3.h(str14, "emailFirstContinueCTA");
        this.a = resources;
        this.b = b68Var;
        this.c = b68Var2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = pair;
        this.n = pair2;
        this.o = z;
        this.p = str10;
        this.q = z2;
        this.r = str11;
        this.s = str12;
        this.t = z3;
        this.u = nk8Var;
        this.v = str13;
        this.w = str14;
        String string = resources.getString(mm6.subauth_email_first_screen_heading);
        zq3.g(string, "getString(...)");
        String string2 = resources.getString(mm6.subauth_terms_of_sale_text);
        zq3.g(string2, "getString(...)");
        String string3 = resources.getString(mm6.subauth_terms_of_sale_link);
        zq3.g(string3, "getString(...)");
        g54 g54Var = new g54(string2, string3, null, null, 12, null);
        String string4 = resources.getString(mm6.subauth_terms_of_service_text);
        zq3.g(string4, "getString(...)");
        String string5 = resources.getString(mm6.subauth_terms_of_service_link);
        zq3.g(string5, "getString(...)");
        String string6 = resources.getString(mm6.subauth_terms_of_service_tag);
        zq3.g(string6, "getString(...)");
        g54 g54Var2 = new g54(string4, string5, string6, null, 8, null);
        String string7 = resources.getString(mm6.subauth_privacy_policy_text);
        zq3.g(string7, "getString(...)");
        String string8 = resources.getString(mm6.subauth_privacy_policy_link);
        zq3.g(string8, "getString(...)");
        this.x = new Pair(string, i.o(g54Var, g54Var2, new g54(string7, string8, null, null, 12, null)));
        String string9 = resources.getString(mm6.subauth_registration_screen_disclaimer);
        zq3.g(string9, "getString(...)");
        String string10 = resources.getString(mm6.subauth_terms_of_sale_text);
        zq3.g(string10, "getString(...)");
        String string11 = resources.getString(mm6.subauth_terms_of_sale_link);
        zq3.g(string11, "getString(...)");
        g54 g54Var3 = new g54(string10, string11, null, null, 12, null);
        String string12 = resources.getString(mm6.subauth_terms_of_service_text);
        zq3.g(string12, "getString(...)");
        String string13 = resources.getString(mm6.subauth_terms_of_service_link);
        zq3.g(string13, "getString(...)");
        g54 g54Var4 = new g54(string12, string13, null, null, 12, null);
        String string14 = resources.getString(mm6.subauth_privacy_policy_text);
        zq3.g(string14, "getString(...)");
        String string15 = resources.getString(mm6.subauth_privacy_policy_link);
        zq3.g(string15, "getString(...)");
        this.y = new Pair(string9, i.o(g54Var3, g54Var4, new g54(string14, string15, null, null, 12, null)));
        String string16 = resources.getString(mm6.subauth_california_notices_text);
        zq3.g(string16, "getString(...)");
        String string17 = resources.getString(mm6.subauth_california_notices_text);
        zq3.g(string17, "getString(...)");
        String string18 = resources.getString(mm6.subauth_california_notices_link);
        zq3.g(string18, "getString(...)");
        this.z = new Pair(string16, i.e(new g54(string17, string18, null, null, 12, null)));
        String string19 = resources.getString(mm6.subauth_did_not_receive_code_question);
        zq3.g(string19, "getString(...)");
        String string20 = resources.getString(mm6.subauth_request_a_new_one);
        zq3.g(string20, "getString(...)");
        this.A = new Pair(string19, i.e(new g54(string20, "", null, null, 12, null)));
        if (str13 != null) {
            String string21 = resources.getString(mm6.subauth_need_help_question);
            String string22 = resources.getString(mm6.subauth_need_help_question);
            zq3.g(string22, "getString(...)");
            pair3 = new Pair(string21, i.e(new g54(string22, str13, null, null, 12, null)));
        } else {
            pair3 = null;
        }
        this.B = pair3;
    }

    public final boolean A() {
        return this.t;
    }

    public final String a() {
        return this.s;
    }

    public final Pair b() {
        return this.z;
    }

    public final b68 c() {
        return this.b;
    }

    public final String d() {
        return this.w;
    }

    public final Pair e() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f68)) {
            return false;
        }
        f68 f68Var = (f68) obj;
        return zq3.c(this.a, f68Var.a) && zq3.c(this.b, f68Var.b) && zq3.c(this.c, f68Var.c) && zq3.c(this.d, f68Var.d) && zq3.c(this.e, f68Var.e) && zq3.c(this.f, f68Var.f) && zq3.c(this.g, f68Var.g) && zq3.c(this.h, f68Var.h) && zq3.c(this.i, f68Var.i) && zq3.c(this.j, f68Var.j) && zq3.c(this.k, f68Var.k) && zq3.c(this.l, f68Var.l) && zq3.c(this.m, f68Var.m) && zq3.c(this.n, f68Var.n) && this.o == f68Var.o && zq3.c(this.p, f68Var.p) && this.q == f68Var.q && zq3.c(this.r, f68Var.r) && zq3.c(this.s, f68Var.s) && this.t == f68Var.t && zq3.c(this.u, f68Var.u) && zq3.c(this.v, f68Var.v) && zq3.c(this.w, f68Var.w);
    }

    public final String f() {
        return this.d;
    }

    public final b68 g() {
        return this.c;
    }

    public final Pair h() {
        return this.m;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + Boolean.hashCode(this.o)) * 31;
        String str = this.p;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.q)) * 31) + this.r.hashCode()) * 31;
        String str2 = this.s;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.t)) * 31) + this.u.hashCode()) * 31;
        String str3 = this.v;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.w.hashCode();
    }

    public final String i() {
        return this.f;
    }

    public final Pair j() {
        return this.B;
    }

    public final String k() {
        return this.v;
    }

    public final Pair l() {
        return this.n;
    }

    public final String m() {
        return this.p;
    }

    public final String n() {
        return this.h;
    }

    public final String o() {
        return this.k;
    }

    public final String p() {
        return this.l;
    }

    public final String q() {
        return this.j;
    }

    public final String r() {
        return this.i;
    }

    public final String s() {
        return this.g;
    }

    public final Pair t() {
        return this.y;
    }

    public String toString() {
        return "SubauthConfig(resources=" + this.a + ", darkModeColors=" + this.b + ", lightModeColor=" + this.c + ", emailFirstScreenTitle=" + this.d + ", registrationScreenTitle=" + this.e + ", loginScreenTitle=" + this.f + ", regiliteVerifyEmailScreenTitle=" + this.g + ", regiliteCreateNewPasswordScreenTitle=" + this.h + ", regiliteSuccessScreenTitle=" + this.i + ", regiliteSuccessScreenBody=" + this.j + ", regiliteSuccessSSOScreenTitle=" + this.k + ", regiliteSuccessSSOScreenTitleRegister=" + this.l + ", loginScreenHeading=" + this.m + ", newsLetter=" + this.n + ", saveCredentialsToSmartLock=" + this.o + ", redirectUri=" + this.p + ", webSSOEnabled=" + this.q + ", webSSOAppName=" + this.r + ", appNameForCTA=" + this.s + ", isTheAthletic=" + this.t + ", theAthleticUser=" + this.u + ", needHelpUrl=" + this.v + ", emailFirstContinueCTA=" + this.w + ")";
    }

    public final String u() {
        return this.e;
    }

    public final Pair v() {
        return this.A;
    }

    public final boolean w() {
        return this.o;
    }

    public final nk8 x() {
        return this.u;
    }

    public final String y() {
        return this.r;
    }

    public final boolean z() {
        return this.q;
    }
}
