package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.LogoutSource;
import com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource;
import com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.c;
import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.TCFInfo;
import defpackage.d54;
import defpackage.ul8;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

/* loaded from: classes4.dex */
public final class n78 implements k78 {
    @Override // defpackage.g68
    public void A(String str) {
        ul8.a.z("SUBAUTH").a("OneTap Login Success! (" + str + ")", new Object[0]);
    }

    @Override // defpackage.g78
    public void B(String str) {
        zq3.h(str, "sourceName");
        ul8.a.z("SUBAUTH").d("Network Not Connected. Failed: " + str + InstructionFileId.DOT, new Object[0]);
    }

    @Override // defpackage.c98
    public void C(String str, String str2, String str3, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "nytSRequestCookie");
        zq3.h(str2, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        ul8.a.z("SUBAUTH").a("Attempting to link purchase sku (" + str2 + ", " + str3 + ", " + purchaseLinkSource.name() + ") to account via backend.", new Object[0]);
    }

    @Override // defpackage.g68
    public void D() {
        ul8.a.z("SUBAUTH").a("OneTap dialog dismissed by user", new Object[0]);
    }

    @Override // defpackage.x88
    public void E() {
    }

    @Override // defpackage.c98
    public void F(String str, String str2, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        ul8.a.z("SUBAUTH").a("Purchase Link Disabled. (Ignored) (" + str + ", " + str2 + ", " + purchaseLinkSource.name() + ")", new Object[0]);
    }

    @Override // defpackage.g78
    public void G(String str, String str2, boolean z) {
        zq3.h(str, "failedUserDetailsMessage");
        if (z) {
            ul8.a.z("SUBAUTH").u("Network Issues: UserDetails Error: " + str, new Object[0]);
            return;
        }
        ul8.a.z("SUBAUTH").d("UserDetails Failed: " + str, new Object[0]);
    }

    @Override // defpackage.x88
    public void H(Boolean bool, String str) {
        zq3.h(str, "errorMessage");
        ul8.c z = ul8.a.z("SUBAUTH");
        Object obj = bool;
        if (bool == null) {
            obj = "hidden checkbox (default true)";
        }
        z.a("Email Opt In FAILED: " + obj + " Error: " + str, new Object[0]);
    }

    @Override // defpackage.g88
    public void I(Date date) {
        zq3.h(date, "expirationDate");
        ul8.a.z("SUBAUTH").a("onNYTUserSetupWithProvisionalEntitlements: expirationDate: " + date, new Object[0]);
    }

    @Override // defpackage.g68
    public void J() {
        ul8.a.z("SUBAUTH").a("OneTap dialog shown", new Object[0]);
    }

    @Override // defpackage.l98
    public void K(String str) {
        zq3.h(str, "errorMessage");
        ul8.a.z("SUBAUTH").d("Show LIRE ErrorMessage: " + str, new Object[0]);
    }

    @Override // defpackage.f78
    public void L(LoginMethod loginMethod) {
        zq3.h(loginMethod, "loginMethod");
        ul8.a.z("SUBAUTH").a("On Login Success (" + loginMethod + "), Force Query User Details", new Object[0]);
    }

    @Override // defpackage.g78
    public void M(c.a aVar, String str, boolean z) {
        zq3.h(aVar, "sessionRefreshError");
        String c = aVar.c();
        Integer a = aVar.a();
        String b = aVar.b();
        if (aVar instanceof c.a.d) {
            ul8.a.z("SUBAUTH").u("Session Refresh Network Issues (Ignored): " + c + "(" + a + ", " + b + "). isForcingLogout: " + z, new Object[0]);
            return;
        }
        if (z) {
            ul8.a.z("SUBAUTH").d("Session Refresh Error: " + c + "(" + a + ", " + b + "). isForcingLogout: true", new Object[0]);
            return;
        }
        ul8.a.z("SUBAUTH").u("Session Refresh Error (Ignored): " + c + "(" + a + ", " + b + "). isForcingLogout: false", new Object[0]);
    }

    @Override // defpackage.g68
    public void N() {
        ul8.a.z("SUBAUTH").a("SmartLock dialog dismissed by user", new Object[0]);
    }

    @Override // defpackage.g68
    public void O() {
        ul8.a.z("SUBAUTH").a("SmartLock Login Success!", new Object[0]);
    }

    @Override // defpackage.g88
    public void P(NYTUser nYTUser, NYTUserUpdateSource nYTUserUpdateSource) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(nYTUserUpdateSource, "updateSource");
        ul8.a.z("SUBAUTH").a("Updating NYT User: " + nYTUser.t() + ", source: " + nYTUserUpdateSource.name(), new Object[0]);
    }

    @Override // defpackage.f78
    public void Q() {
        ul8.a.z("SUBAUTH").a("On Link Purchase Success, Force Query User Details", new Object[0]);
    }

    @Override // defpackage.x88
    public void R(PrivacyConfiguration privacyConfiguration) {
        zq3.h(privacyConfiguration, "privacyConfiguration");
    }

    @Override // defpackage.g78
    public void S(String str, q22 q22Var, Exception exc) {
        zq3.h(str, "sourceName");
        if (q22Var != null) {
            ul8.a.z("SUBAUTH").d(str + " GraphQL Error: " + q22Var, new Object[0]);
        }
        if (exc != null) {
            if (!(exc instanceof IOException)) {
                ul8.a.z("SUBAUTH").f(exc, str + " GraphQL Error", new Object[0]);
                return;
            }
            ul8.a.z("SUBAUTH").v(exc, "Network Connection Issues. " + str + " GraphQL Error.", new Object[0]);
        }
    }

    @Override // defpackage.f78
    public void T(UserData userData) {
        ul8.a.z("SUBAUTH").a("UserDetails Query Saved UserDetails to DB: " + userData, new Object[0]);
    }

    @Override // defpackage.c98
    public void U(String str, String str2, PurchaseLinkSource purchaseLinkSource, String str3) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        zq3.h(str3, "nytSRequestCookie");
        ul8.a.z("SUBAUTH").a("Forced Session Refresh for Purchase Link (" + str + ", " + str2 + ", " + purchaseLinkSource.name() + ") Succeeded: " + str3, new Object[0]);
    }

    @Override // defpackage.l98
    public void V(String str) {
        zq3.h(str, "buttonName");
        ul8.a.z("SUBAUTH").a("Clicked LIRE Screen button: " + str, new Object[0]);
    }

    @Override // defpackage.g68
    public void a(String str) {
        ul8.a.z("SUBAUTH").d("SmartLock Login Failure: " + str, new Object[0]);
    }

    @Override // defpackage.g88
    public void b() {
        ul8.a.z("SUBAUTH").a("onNYTUserProvisionalEntitlementsCleared", new Object[0]);
    }

    @Override // defpackage.d98
    public void c(String str, String str2, PurchaseLinkSource purchaseLinkSource, c.a aVar) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        zq3.h(aVar, "sessionRefreshError");
        String c = aVar.c();
        String b = aVar.b();
        ul8.a.z("SUBAUTH").u("Forced Session Refresh for Purchase Link Failed: " + c + ", " + b, new Object[0]);
    }

    @Override // defpackage.d98
    public void d(Set set) {
        zq3.h(set, "provisionalEntitlements");
        ul8.a.z("SUBAUTH").d("Purchase Verification Failed. Using Provisional Entitlements: " + set, new Object[0]);
    }

    @Override // defpackage.x88
    public void e() {
    }

    @Override // defpackage.g78
    public void f(String str, String str2) {
        zq3.h(str, "sourceName");
        ul8.a.z("SUBAUTH").d(str + " Failed (Partial GraphQL Response): " + str2, new Object[0]);
    }

    @Override // defpackage.x88
    public void g(Boolean bool) {
        ul8.c z = ul8.a.z("SUBAUTH");
        Object obj = bool;
        if (bool == null) {
            obj = "hidden checkbox (default true)";
        }
        z.a("Email Opt In SUCCESS: " + obj, new Object[0]);
    }

    @Override // defpackage.c98
    public void h(String str, String str2, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        ul8.a.z("SUBAUTH").a("Forcing Session Refresh for Purchase Link (" + str + ", " + str2 + ", " + purchaseLinkSource.name() + ") due to stale cookie", new Object[0]);
    }

    @Override // defpackage.x88
    public void i(TCFInfo tCFInfo) {
        zq3.h(tCFInfo, "tcfInfo");
    }

    @Override // defpackage.x88
    public void j(Boolean bool) {
        ul8.c z = ul8.a.z("SUBAUTH");
        Object obj = bool;
        if (bool == null) {
            obj = "hidden checkbox (default true)";
        }
        z.a("Attempt Email Opt In: " + obj, new Object[0]);
    }

    @Override // defpackage.f78
    public void k(RegiData regiData) {
        zq3.h(regiData, "regiData");
        ul8.a.z("SUBAUTH").a("UserDetails Query SUCCESS: " + regiData, new Object[0]);
    }

    @Override // defpackage.g78
    public void l(String str, LoginMethod loginMethod, LoginResponse loginResponse) {
        zq3.h(str, "errorMessage");
        zq3.h(loginMethod, "loginMethod");
        if (!pa4.a(loginMethod)) {
            ul8.a.z("SUBAUTH").d("Login Failure: " + str + ": " + (loginResponse != null ? loginResponse.e() : null), new Object[0]);
            return;
        }
        ul8.a.z("SUBAUTH").a("SSO Login Failure!!! " + loginMethod + " (" + (loginResponse != null ? loginResponse.b() : null) + ") " + str + ": " + (loginResponse != null ? loginResponse.e() : null), new Object[0]);
    }

    @Override // defpackage.f78
    public void m(LogoutSource logoutSource) {
        zq3.h(logoutSource, "logoutSource");
        ul8.a.z("SUBAUTH").a("Logout (" + logoutSource + ")", new Object[0]);
    }

    @Override // defpackage.g78
    public void n(String str, String str2, String str3) {
        zq3.h(str, "subscriptionName");
        zq3.h(str2, "fieldName");
        ul8.a.z("SUBAUTH").d("UserDetails Date Parsing Failed: " + str + "(" + str2 + ":" + str3 + ")", new Object[0]);
    }

    @Override // defpackage.f78
    public void o(LoginResponse loginResponse, LoginMethod loginMethod) {
        zq3.h(loginResponse, "loginResponse");
        zq3.h(loginMethod, "loginMethod");
        if (!pa4.a(loginMethod)) {
            ul8.a.z("SUBAUTH").a("Login Success! " + loginMethod, new Object[0]);
            return;
        }
        ul8.a.z("SUBAUTH").a("SSO Login Success! " + loginMethod + " (" + loginResponse.b() + ")", new Object[0]);
    }

    @Override // defpackage.d98
    public void p(String str, String str2, String str3, d54 d54Var, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(d54Var, "linkStatus");
        zq3.h(purchaseLinkSource, "linkSource");
        if (d54Var instanceof d54.c) {
            ul8.a.z("SUBAUTH").d("Purchase Link Failed. Sku: " + str + ", orderId: " + str2 + ", " + purchaseLinkSource + " (" + str3 + ")", new Object[0]);
            return;
        }
        if (d54Var instanceof d54.e) {
            ul8.a.z("SUBAUTH").u("Network Issues. Purchase Link Failed. Sku: " + str + ", orderId: " + str2 + ", " + purchaseLinkSource + " (" + str3 + ")", new Object[0]);
            return;
        }
        if (zq3.c(d54Var, d54.f.b)) {
            ul8.a.z("SUBAUTH").u("Anon User. Cannot link. Purchase Link Failed. Sku: " + str + ", orderId: " + str2 + ", " + purchaseLinkSource + " (" + str3 + ")", new Object[0]);
            return;
        }
        if (zq3.c(d54Var, d54.g.b)) {
            ul8.a.z("SUBAUTH").u("No Saved Purchase. Purchase Link Failed. Sku: " + str + ", orderId: " + str2 + ", " + purchaseLinkSource + " (" + str3 + ")", new Object[0]);
        }
    }

    @Override // defpackage.x88
    public void q() {
    }

    @Override // defpackage.f78
    public void r(String str) {
        ul8.a.z("SUBAUTH").a("UserDetails Query Started. NYT-S: " + str, new Object[0]);
    }

    @Override // defpackage.d98
    public void s(String str) {
        ul8.a.z("SUBAUTH").d("Purchase Verification Failed. " + str, new Object[0]);
    }

    @Override // defpackage.l98
    public void t(String str) {
        zq3.h(str, "screenName");
        ul8.a.z("SUBAUTH").a("Opened LIRE Screen: " + str, new Object[0]);
    }

    @Override // defpackage.f78
    public void u() {
        ul8.a.z("SUBAUTH").a("On Session Refresh Poll Success, 6 hours have passed, Query User Details", new Object[0]);
    }

    @Override // defpackage.c98
    public void v(String str, String str2, String str3, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        ul8.a.z("SUBAUTH").a("Purchase Link Success! sku: " + str + ", orderId: " + str2 + ", linkSource: " + purchaseLinkSource, new Object[0]);
    }

    @Override // defpackage.g88
    public void w() {
        ul8.a.z("SUBAUTH").a("Skipping updating NYTUser. UserData unchanged.", new Object[0]);
    }

    @Override // defpackage.g78
    public void x(String str) {
        ul8.a.z("SUBAUTH").u("Invalid RegiID (" + str + ") from User Details", new Object[0]);
    }

    @Override // defpackage.g68
    public void y(String str) {
        ul8.a.z("SUBAUTH").d("OneTap Login Failure: " + str, new Object[0]);
    }

    @Override // defpackage.g88
    public void z(NYTUser.StateChangeType stateChangeType, NYTUser nYTUser) {
        zq3.h(stateChangeType, "stateChangeType");
        zq3.h(nYTUser, "nytUser");
        ul8.a.z("SUBAUTH").a("onNYTUserHasMeaningfullyChanged: " + stateChangeType + ", nytUser: " + nYTUser, new Object[0]);
    }
}
