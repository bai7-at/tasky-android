package defpackage;

import android.content.res.Resources;
import com.nytimes.android.subauth.core.auth.models.c;
import com.nytimes.android.subauth.core.auth.network.response.a;
import com.nytimes.subauth.ui.login.helpers.ErrorDisplayType;
import com.nytimes.subauth.ui.models.LoginType;
import defpackage.na4;
import defpackage.oa4;
import defpackage.yl7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class dr2 {
    public static final a b = new a(null);
    public static final int c = 8;
    private final Resources a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public dr2(Resources resources) {
        zq3.h(resources, "resources");
        this.a = resources;
    }

    private final na4.b a(oa4.b bVar, int i, ErrorDisplayType errorDisplayType, boolean z, boolean z2) {
        String string = this.a.getString(mm6.subauth_custom_nyts_login_failed_error);
        String string2 = this.a.getString(i);
        zq3.e(string2);
        return new na4.b(string2, errorDisplayType, bVar, z, z2, string);
    }

    static /* synthetic */ na4.b b(dr2 dr2Var, oa4.b bVar, int i, ErrorDisplayType errorDisplayType, boolean z, boolean z2, int i2, Object obj) {
        return dr2Var.a(bVar, i, errorDisplayType, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }

    private final Pair i(c.a aVar) {
        String string = this.a.getString(mm6.subauth_verify_email_code_something_went_wrong);
        zq3.g(string, "getString(...)");
        int i = mm6.subauth_something_went_wrong;
        if (aVar instanceof c.a.C0411a) {
            i = mm6.subauth_invalid_code;
            Resources resources = this.a;
            int b2 = ((c.a.C0411a) aVar).b();
            string = resources.getString((b2 == 910 || b2 == 912) ? mm6.subauth_verify_email_code_expired : mm6.subauth_verify_email_code_incorrect);
            zq3.g(string, "getString(...)");
        }
        String string2 = this.a.getString(i);
        zq3.g(string2, "getString(...)");
        return new Pair(string2, string);
    }

    private final boolean k(a.d dVar) {
        return (dVar.a().b() || dVar.a().c()) && !dVar.a().d();
    }

    private final na4.b l(oa4.b bVar) {
        return b(this, bVar, mm6.subauth_error_message_facebook_sso_default, ErrorDisplayType.Dialog, false, false, 12, null);
    }

    private final na4.b m(oa4.b bVar) {
        return b(this, bVar, mm6.subauth_error_message_google_sso_default, ErrorDisplayType.Dialog, false, false, 12, null);
    }

    private final na4.b n(oa4.b bVar) {
        Integer b2 = bVar.a().b();
        return (b2 != null && b2.intValue() == 101) ? b(this, bVar, mm6.subauth_error_login_message_101, ErrorDisplayType.Dialog, false, true, 4, null) : b(this, bVar, mm6.subauth_error_default_system_message, ErrorDisplayType.Dialog, true, false, 8, null);
    }

    private final na4.b o(oa4.b bVar) {
        Integer b2 = bVar.a().b();
        return (b2 != null && b2.intValue() == 112) ? b(this, bVar, mm6.subauth_error_registration_112, ErrorDisplayType.PasswordInline, false, false, 12, null) : b(this, bVar, mm6.subauth_error_default_system_message, ErrorDisplayType.Dialog, true, false, 8, null);
    }

    public final na4.d c() {
        String string = this.a.getString(mm6.subauth_code_sent);
        zq3.g(string, "getString(...)");
        String string2 = this.a.getString(mm6.subauth_code_sent_message);
        zq3.g(string2, "getString(...)");
        return new na4.d(string, string2);
    }

    public final na4.b d(boolean z) {
        String string = this.a.getString(mm6.subauth_custom_nyts_login_failed_error);
        String string2 = z ? this.a.getString(mm6.subauth_custom_nyts_login_failed_error_msg_registration) : this.a.getString(mm6.subauth_custom_nyts_login_failed_error_msg_login);
        ErrorDisplayType errorDisplayType = ErrorDisplayType.Dialog;
        zq3.e(string2);
        return new na4.b(string2, errorDisplayType, null, false, false, string, 28, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final na4.b e(com.nytimes.android.subauth.core.auth.network.response.a r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "emailAccountStatus"
            defpackage.zq3.h(r12, r0)
            com.nytimes.subauth.ui.login.helpers.ErrorDisplayType r0 = com.nytimes.subauth.ui.login.helpers.ErrorDisplayType.Dialog
            r1 = 0
            r2 = 0
            if (r13 == 0) goto L16
            int r12 = defpackage.mm6.subauth_error_email_is_invalid
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.nytimes.subauth.ui.login.helpers.ErrorDisplayType r0 = com.nytimes.subauth.ui.login.helpers.ErrorDisplayType.EmailInline
        L13:
            r4 = r0
        L14:
            r6 = r2
            goto L3e
        L16:
            boolean r13 = r12 instanceof com.nytimes.android.subauth.core.auth.network.response.a.d
            if (r13 == 0) goto L2a
            r13 = r12
            com.nytimes.android.subauth.core.auth.network.response.a$d r13 = (com.nytimes.android.subauth.core.auth.network.response.a.d) r13
            boolean r13 = r11.k(r13)
            if (r13 == 0) goto L2a
            int r12 = defpackage.mm6.subauth_error_email_needs_sso_flow
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L13
        L2a:
            boolean r13 = r12 instanceof com.nytimes.android.subauth.core.auth.network.response.a.C0413a
            if (r13 != 0) goto L36
            boolean r12 = r12 instanceof com.nytimes.android.subauth.core.auth.network.response.a.e
            if (r12 == 0) goto L33
            goto L36
        L33:
            r4 = r0
            r12 = r1
            goto L14
        L36:
            int r12 = defpackage.mm6.subauth_error_default_system_message
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2 = 1
            goto L13
        L3e:
            if (r12 == 0) goto L5b
            int r12 = r12.intValue()
            na4$b r1 = new na4$b
            android.content.res.Resources r11 = r11.a
            java.lang.String r3 = r11.getString(r12)
            java.lang.String r11 = "getString(...)"
            defpackage.zq3.g(r3, r11)
            r9 = 52
            r10 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr2.e(com.nytimes.android.subauth.core.auth.network.response.a, boolean):na4$b");
    }

    public final na4.b f(LoginType loginType, oa4.b bVar) {
        zq3.h(loginType, "loginType");
        zq3.h(bVar, "error");
        if (loginType instanceof LoginType.EmailLogin) {
            return n(bVar);
        }
        if (loginType instanceof LoginType.Registration) {
            return o(bVar);
        }
        if (loginType instanceof LoginType.FacebookSSOLogin) {
            return l(bVar);
        }
        if (loginType instanceof LoginType.GoogleSSOLogin) {
            return m(bVar);
        }
        if (zq3.c(loginType, LoginType.RegiLiteLogin.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final na4.b g() {
        String string = this.a.getString(mm6.subauth_error_device_offline);
        zq3.g(string, "getString(...)");
        return new na4.b(string, ErrorDisplayType.Snackbar, null, false, false, null, 60, null);
    }

    public final na4.b h() {
        String string = this.a.getString(mm6.subauth_email_error);
        String string2 = this.a.getString(mm6.subauth_verification_code_sending_error);
        ErrorDisplayType errorDisplayType = ErrorDisplayType.Dialog;
        zq3.e(string2);
        return new na4.b(string2, errorDisplayType, null, false, false, string, 28, null);
    }

    public final na4.b j() {
        String string = this.a.getString(mm6.subauth_invalid_code);
        String string2 = this.a.getString(mm6.subauth_verify_email_code_incomplete);
        ErrorDisplayType errorDisplayType = ErrorDisplayType.Dialog;
        zq3.e(string2);
        return new na4.b(string2, errorDisplayType, null, false, false, string, 28, null);
    }

    public final na4.b p(yl7.a aVar, boolean z) {
        zq3.h(aVar, "error");
        boolean z2 = (aVar instanceof yl7.a.d) && z;
        String string = this.a.getString(z2 ? mm6.subauth_password_too_short : mm6.subauth_something_went_wrong);
        String string2 = this.a.getString(z2 ? mm6.subauth_at_least_6_chars : mm6.subauth_verify_email_code_something_went_wrong);
        ErrorDisplayType errorDisplayType = ErrorDisplayType.Dialog;
        zq3.e(string2);
        return new na4.b(string2, errorDisplayType, null, false, false, string, 28, null);
    }

    public final na4.b q(c.a aVar) {
        zq3.h(aVar, "error");
        Pair i = i(aVar);
        return new na4.b((String) i.b(), ErrorDisplayType.Dialog, null, false, false, (String) i.a(), 28, null);
    }
}
