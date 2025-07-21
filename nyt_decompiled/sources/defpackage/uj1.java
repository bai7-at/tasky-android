package defpackage;

import android.content.res.Resources;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.subauth.ui.ui.theme.ColorKt;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes4.dex */
public final class uj1 {
    private final String A;
    private final f68 B;
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
    private final Pair o;
    private final Pair p;
    private final Pair q;
    private final String r;
    private final boolean s;
    private final String t;
    private final boolean u;
    private final String v;
    private final String w;
    private final boolean x;
    private final nk8 y;
    private final String z;

    public uj1(Resources resources, b68 b68Var, b68 b68Var2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, String str10, boolean z, String str11, boolean z2, String str12, String str13, boolean z3, nk8 nk8Var, String str14, String str15) {
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        Pair pair6;
        String str25;
        b68 b68Var3 = b68Var;
        zq3.h(resources, "resources");
        zq3.h(str12, "webSSOAppName");
        zq3.h(nk8Var, "theAthleticUser");
        this.a = resources;
        this.b = b68Var3;
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
        this.o = pair3;
        this.p = pair4;
        this.q = pair5;
        this.r = str10;
        this.s = z;
        this.t = str11;
        this.u = z2;
        this.v = str12;
        this.w = str13;
        this.x = z3;
        this.y = nk8Var;
        this.z = str14;
        this.A = str15;
        b68 z4 = b68Var3 == null ? ColorKt.z() : b68Var3;
        b68 A = b68Var2 == null ? ColorKt.A() : b68Var2;
        if (str == null) {
            String string = resources.getString(mm6.subauth_email_first_screen_title);
            zq3.g(string, "getString(...)");
            str16 = string;
        } else {
            str16 = str;
        }
        if (str2 == null) {
            String string2 = resources.getString(mm6.subauth_registration_screen_title);
            zq3.g(string2, "getString(...)");
            str17 = string2;
        } else {
            str17 = str2;
        }
        if (str3 == null) {
            String string3 = resources.getString(mm6.subauth_login_screen_title);
            zq3.g(string3, "getString(...)");
            str18 = string3;
        } else {
            str18 = str3;
        }
        if (str4 == null) {
            String string4 = resources.getString(mm6.subauth_verify_your_email_address);
            zq3.g(string4, "getString(...)");
            str19 = string4;
        } else {
            str19 = str4;
        }
        if (str5 == null) {
            String string5 = resources.getString(mm6.subauth_set_a_password);
            zq3.g(string5, "getString(...)");
            str20 = string5;
        } else {
            str20 = str5;
        }
        if (str6 == null) {
            String string6 = resources.getString(mm6.subauth_you_are_all_set);
            zq3.g(string6, "getString(...)");
            str21 = string6;
        } else {
            str21 = str6;
        }
        if (str7 == null) {
            String string7 = resources.getString(mm6.subauth_you_can_now_use_this_account);
            zq3.g(string7, "getString(...)");
            str22 = string7;
        } else {
            str22 = str7;
        }
        if (str8 == null) {
            String string8 = resources.getString(mm6.subauth_you_are_logged_in);
            zq3.g(string8, "getString(...)");
            str23 = string8;
        } else {
            str23 = str8;
        }
        if (str9 == null) {
            String string9 = resources.getString(mm6.subauth_account_created);
            zq3.g(string9, "getString(...)");
            str24 = string9;
        } else {
            str24 = str9;
        }
        Pair pair7 = pair2 == null ? new Pair(resources.getString(mm6.subauth_login_screen_heading), null) : pair2;
        if (pair5 == null) {
            String string10 = resources.getString(mm6.subauth_newsletter_text);
            String string11 = resources.getString(mm6.subauth_contact_us_text);
            zq3.g(string11, "getString(...)");
            String string12 = resources.getString(mm6.subauth_contact_us_link);
            zq3.g(string12, "getString(...)");
            pair6 = new Pair(string10, i.e(new g54(string11, string12, null, null, 12, null)));
        } else {
            pair6 = pair5;
        }
        if (str15 == null) {
            String string13 = resources.getString(mm6.subauth_email_first_continue_button_label);
            zq3.g(string13, "getString(...)");
            str25 = string13;
        } else {
            str25 = str15;
        }
        this.B = new f68(resources, z4, A, str16, str17, str18, str19, str20, str21, str22, str23, str24, pair7, pair6, z, str11, z2, str12, str13, z3, nk8Var, str14, str25);
    }

    public final f68 a() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj1)) {
            return false;
        }
        uj1 uj1Var = (uj1) obj;
        return zq3.c(this.a, uj1Var.a) && zq3.c(this.b, uj1Var.b) && zq3.c(this.c, uj1Var.c) && zq3.c(this.d, uj1Var.d) && zq3.c(this.e, uj1Var.e) && zq3.c(this.f, uj1Var.f) && zq3.c(this.g, uj1Var.g) && zq3.c(this.h, uj1Var.h) && zq3.c(this.i, uj1Var.i) && zq3.c(this.j, uj1Var.j) && zq3.c(this.k, uj1Var.k) && zq3.c(this.l, uj1Var.l) && zq3.c(this.m, uj1Var.m) && zq3.c(this.n, uj1Var.n) && zq3.c(this.o, uj1Var.o) && zq3.c(this.p, uj1Var.p) && zq3.c(this.q, uj1Var.q) && zq3.c(this.r, uj1Var.r) && this.s == uj1Var.s && zq3.c(this.t, uj1Var.t) && this.u == uj1Var.u && zq3.c(this.v, uj1Var.v) && zq3.c(this.w, uj1Var.w) && this.x == uj1Var.x && zq3.c(this.y, uj1Var.y) && zq3.c(this.z, uj1Var.z) && zq3.c(this.A, uj1Var.A);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b68 b68Var = this.b;
        int hashCode2 = (hashCode + (b68Var == null ? 0 : b68Var.hashCode())) * 31;
        b68 b68Var2 = this.c;
        int hashCode3 = (hashCode2 + (b68Var2 == null ? 0 : b68Var2.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Pair pair = this.m;
        int hashCode13 = (hashCode12 + (pair == null ? 0 : pair.hashCode())) * 31;
        Pair pair2 = this.n;
        int hashCode14 = (hashCode13 + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        Pair pair3 = this.o;
        int hashCode15 = (hashCode14 + (pair3 == null ? 0 : pair3.hashCode())) * 31;
        Pair pair4 = this.p;
        int hashCode16 = (hashCode15 + (pair4 == null ? 0 : pair4.hashCode())) * 31;
        Pair pair5 = this.q;
        int hashCode17 = (hashCode16 + (pair5 == null ? 0 : pair5.hashCode())) * 31;
        String str10 = this.r;
        int hashCode18 = (((hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.s)) * 31;
        String str11 = this.t;
        int hashCode19 = (((((hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31) + Boolean.hashCode(this.u)) * 31) + this.v.hashCode()) * 31;
        String str12 = this.w;
        int hashCode20 = (((((hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31) + Boolean.hashCode(this.x)) * 31) + this.y.hashCode()) * 31;
        String str13 = this.z;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.A;
        return hashCode21 + (str14 != null ? str14.hashCode() : 0);
    }

    public String toString() {
        return "DefaultSubauthConfig(resources=" + this.a + ", darkModeColors=" + this.b + ", lightModeColor=" + this.c + ", emailFirstScreenTitle=" + this.d + ", registrationScreenTitle=" + this.e + ", loginScreenTitle=" + this.f + ", regiliteVerifyEmailScreenTitle=" + this.g + ", regiliteCreateNewPasswordScreenTitle=" + this.h + ", regiliteSuccessScreenTitle=" + this.i + ", regiliteSuccessScreenBody=" + this.j + ", regiliteSuccessSSOScreenTitle=" + this.k + ", regiliteSuccessSSOScreenTitleRegister=" + this.l + ", emailFirstHeading=" + this.m + ", loginScreenHeading=" + this.n + ", registrationScreenDisclaimer=" + this.o + ", californiaNotices=" + this.p + ", newsLetter=" + this.q + ", newsLetterCode=" + this.r + ", saveCredentialsToSmartLock=" + this.s + ", redirectUri=" + this.t + ", webSSOEnabled=" + this.u + ", webSSOAppName=" + this.v + ", appNameForCTA=" + this.w + ", isTheAthletic=" + this.x + ", theAthleticUser=" + this.y + ", needHelpUrl=" + this.z + ", emailFirstContinueCTA=" + this.A + ")";
    }

    public /* synthetic */ uj1(Resources resources, b68 b68Var, b68 b68Var2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, String str10, boolean z, String str11, boolean z2, String str12, String str13, boolean z3, nk8 nk8Var, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i & 2) != 0 ? null : b68Var, (i & 4) != 0 ? null : b68Var2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str9, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : pair, (i & 8192) != 0 ? null : pair2, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : pair3, (i & 32768) != 0 ? null : pair4, (i & 65536) != 0 ? null : pair5, (i & 131072) != 0 ? null : str10, (i & 262144) != 0 ? false : z, (i & 524288) != 0 ? null : str11, (i & Constants.MB) != 0 ? true : z2, (i & 2097152) != 0 ? "news" : str12, (i & 4194304) != 0 ? null : str13, (i & 8388608) == 0 ? z3 : false, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? v75.a : nk8Var, (i & 33554432) != 0 ? null : str14, (i & 67108864) == 0 ? str15 : null);
    }
}
