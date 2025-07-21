package com.nytimes.android.subauth.embrace;

import com.apollographql.apollo.exception.ApolloNetworkException;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.client.SubscriptionLevel;
import com.nytimes.android.subauth.core.api.listeners.LogoutSource;
import com.nytimes.android.subauth.core.api.listeners.NYTUserUpdateSource;
import com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.c;
import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscription;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrUserPrivacyPreference;
import com.nytimes.android.subauth.core.purr.directive.TCFInfo;
import defpackage.d54;
import defpackage.k78;
import defpackage.mz8;
import defpackage.pa4;
import defpackage.q22;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.Severity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SubauthEmbraceListener implements k78 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SubscriptionLevel.values().length];
            try {
                iArr[SubscriptionLevel.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionLevel.ANONYMOUSLY_SUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionLevel.REGISTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionLevel.REGISTERED_SUBSCRIBED_UNLINKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubscriptionLevel.REGISTERED_SUBSCRIBED_LINKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public SubauthEmbraceListener() {
        ul8.a.z("SUBAUTH").a("Setting up Subauth Embrace Listener", new Object[0]);
    }

    private final Map W(q22 q22Var) {
        String str;
        Set entrySet;
        String u0;
        List a2 = q22Var.a();
        String str2 = "";
        if (a2 == null || (str = i.u0(a2, ",", null, null, 0, null, null, 62, null)) == null) {
            str = "";
        }
        Map c = q22Var.c();
        if (c != null && (entrySet = c.entrySet()) != null && (u0 = i.u0(entrySet, ",", null, null, 0, null, new ss2() { // from class: com.nytimes.android.subauth.embrace.SubauthEmbraceListener$parseError$customAttrString$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Map.Entry entry) {
                zq3.h(entry, "<name for destructuring parameter 0>");
                return ((String) entry.getKey()) + ":" + entry.getValue();
            }
        }, 30, null)) != null) {
            str2 = u0;
        }
        String b2 = q22Var.b();
        if (b2 == null) {
            b2 = "N/A";
        }
        Map n = t.n(new Pair("message", b2));
        if (str.length() != 0) {
            n.put("locations", str);
        }
        if (str2.length() != 0) {
            n.put("customAttr", str2);
        }
        return n;
    }

    private final String X(PrivacyConfiguration privacyConfiguration) {
        return i.u0(privacyConfiguration.getDirectives(), ",", null, null, 0, null, null, 62, null);
    }

    private final String Y(PrivacyConfiguration privacyConfiguration) {
        String u0;
        List<PurrUserPrivacyPreference> preferences = privacyConfiguration.getPreferences();
        return (preferences == null || (u0 = i.u0(preferences, ",", null, null, 0, null, null, 62, null)) == null) ? "N/A" : u0;
    }

    private final String Z(SubscriptionLevel subscriptionLevel) {
        int i = b.a[subscriptionLevel.ordinal()];
        if (i == 1) {
            return "anon";
        }
        if (i == 2) {
            return "anon_sub";
        }
        if (i == 3) {
            return "regi";
        }
        if (i == 4) {
            return "regi_sub_unlinked";
        }
        if (i == 5) {
            return "regi_sub_linked";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String a0(TCFInfo tCFInfo) {
        return tCFInfo.toString();
    }

    @Override // defpackage.g68
    public void A(String str) {
        Embrace.getInstance().logMessage("OneTap Login Success (" + str + ")", Severity.INFO);
    }

    @Override // defpackage.g78
    public void B(String str) {
        zq3.h(str, "sourceName");
        Embrace.getInstance().logMessage("Network Not Connected. Failed " + str, Severity.WARNING);
    }

    @Override // defpackage.c98
    public void C(String str, String str2, String str3, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "nytSRequestCookie");
        zq3.h(str2, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        Pair pair = new Pair("sku", str2);
        if (str3 == null) {
            str3 = "";
        }
        Map<String, ?> m = t.m(pair, new Pair("orderId", str3), new Pair("source", purchaseLinkSource.name()), new Pair("NYT-S", str));
        Embrace.getInstance().logMessage("Attempting to link purchase sku " + str2 + " to account via backend", Severity.INFO, m);
    }

    @Override // defpackage.g68
    public void D() {
        Embrace.getInstance().logMessage("OneTap Login Dialog Dismissed by User", Severity.INFO);
    }

    @Override // defpackage.x88
    public void E() {
        Embrace.getInstance().logInfo("PURR: Using Fallback Default for PURR Config");
    }

    @Override // defpackage.c98
    public void F(String str, String str2, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        Pair pair = new Pair("sku", str);
        if (str2 == null) {
            str2 = "";
        }
        Embrace.getInstance().logMessage("Purchase Linking Disabled. No Link Attempt Made.", Severity.INFO, t.m(pair, new Pair("orderId", str2), new Pair("source", purchaseLinkSource.name())));
    }

    @Override // defpackage.g78
    public void G(String str, String str2, boolean z) {
        zq3.h(str, "failedUserDetailsMessage");
        if (str2 == null) {
            str2 = "";
        }
        Map<String, ?> m = t.m(new Pair("NYT-S", str2), new Pair("errorMessage", str));
        if (z) {
            Embrace.getInstance().logMessage("[UD Info] User Details Query Network Issues.: " + str, Severity.WARNING, m);
            return;
        }
        Embrace.getInstance().logMessage("[UD Error] User Details Query Failed: " + str, Severity.ERROR, m);
    }

    @Override // defpackage.x88
    public void H(Boolean bool, String str) {
        zq3.h(str, "errorMessage");
        Object obj = bool;
        if (bool == null) {
            obj = "hidden checkbox (default true)";
        }
        Map<String, ?> m = t.m(new Pair("optIn", obj), new Pair("errorMessage", str));
        Embrace.getInstance().logMessage("[PURR ERROR] Email Opt In Failed (" + obj + ")", Severity.ERROR, m);
    }

    @Override // defpackage.g88
    public void I(Date date) {
        zq3.h(date, "expirationDate");
        Embrace.getInstance().logInfo("NYTUser Setup with Provisional Entitlements. Expiration Date: " + date);
    }

    @Override // defpackage.g68
    public void J() {
        Embrace.getInstance().logMessage("OneTap Login Dialog Shown", Severity.INFO);
    }

    @Override // defpackage.l98
    public void K(String str) {
        zq3.h(str, "errorMessage");
        Embrace.getInstance().logMessage("Showing LIRE Error Message", Severity.INFO, t.n(new Pair("errorMessage", str)));
    }

    @Override // defpackage.f78
    public void L(LoginMethod loginMethod) {
        zq3.h(loginMethod, "loginMethod");
        Embrace.getInstance().logInfo("On Login Success (" + loginMethod + "), Querying User Details");
    }

    @Override // defpackage.g78
    public void M(c.a aVar, String str, boolean z) {
        zq3.h(aVar, "sessionRefreshError");
        if (str == null) {
            str = "";
        }
        Map<String, ?> n = t.n(new Pair("NYT-S", str), new Pair("isForcingLogout", Boolean.valueOf(z)));
        String b2 = aVar.b();
        if (b2 != null) {
            n.put("errorMessage", b2);
        }
        Integer a2 = aVar.a();
        if (a2 != null) {
            n.put("Session Refresh Error Code", Integer.valueOf(a2.intValue()));
        }
        if (aVar instanceof c.a.d) {
            Embrace.getInstance().logMessage("[SRV2 Info] Session Refresh Network Issues.", Severity.WARNING, n);
            return;
        }
        Embrace.getInstance().logMessage("[SRV2 Error] Session Refresh Failed: " + aVar.c(), Severity.ERROR, n);
    }

    @Override // defpackage.g68
    public void N() {
        Embrace.getInstance().logMessage("SmartLock Login Dialog Dismissed by User", Severity.INFO);
    }

    @Override // defpackage.g68
    public void O() {
        Embrace.getInstance().logMessage("SmartLock Login Success", Severity.INFO);
    }

    @Override // defpackage.g88
    public void P(NYTUser nYTUser, NYTUserUpdateSource nYTUserUpdateSource) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(nYTUserUpdateSource, "updateSource");
        String p = nYTUser.p();
        if (p == null) {
            p = "N/A";
        }
        String Z = Z(nYTUser.l());
        Set<UserSubscriptionEntitlement> activeEntitlements = nYTUser.t().getActiveEntitlements();
        ArrayList arrayList = new ArrayList(i.w(activeEntitlements, 10));
        Iterator<T> it2 = activeEntitlements.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
        }
        String u0 = i.u0(arrayList, ",", null, null, 0, null, null, 62, null);
        if (u0.length() == 0) {
            u0 = "[]";
        }
        Set<UserSubscriptionEntitlement> entitlements = nYTUser.t().getGooglePlayData().getEntitlements();
        ArrayList arrayList2 = new ArrayList(i.w(entitlements, 10));
        Iterator<T> it3 = entitlements.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((UserSubscriptionEntitlement) it3.next()).getRawValue());
        }
        String u02 = i.u0(arrayList2, ",", null, null, 0, null, null, 62, null);
        String str = u02.length() != 0 ? u02 : "[]";
        String name = nYTUserUpdateSource.name();
        Embrace.getInstance().logMessage("Update NYTUser (" + p + ":" + Z + ") by " + name, Severity.INFO, t.m(new Pair("Linked Entitlements", u0), new Pair("Anon Entitlements", str), new Pair("desc", nYTUser.g()), new Pair("updateSource", name)));
        Embrace embrace = Embrace.getInstance();
        embrace.addSessionProperty("regiID", p, true);
        embrace.addSessionProperty("Subscription Level", Z, true);
        embrace.addSessionProperty("Linked Entitlements", u0, true);
        embrace.addSessionProperty("Anon Entitlements", str, false);
    }

    @Override // defpackage.f78
    public void Q() {
        Embrace.getInstance().logInfo("On Purchase Link Success, Querying User Details");
    }

    @Override // defpackage.x88
    public void R(PrivacyConfiguration privacyConfiguration) {
        zq3.h(privacyConfiguration, "privacyConfiguration");
        Embrace.getInstance().addSessionProperty("Privacy Directives", X(privacyConfiguration), true);
        Embrace.getInstance().addSessionProperty("Privacy Prefs", Y(privacyConfiguration), true);
    }

    @Override // defpackage.g78
    public void S(String str, q22 q22Var, Exception exc) {
        zq3.h(str, "sourceName");
        String str2 = str + " Returned Error Response";
        if (q22Var != null) {
            Embrace.getInstance().logMessage(str2, Severity.ERROR, W(q22Var));
        }
        if (exc != null) {
            if (exc instanceof ApolloNetworkException) {
                Embrace.getInstance().logException(exc, Severity.WARNING, t.f(new Pair("message", str2)));
            } else {
                Embrace.getInstance().logException(exc, Severity.ERROR, t.f(new Pair("message", str2)));
            }
        }
    }

    @Override // defpackage.f78
    public void T(UserData userData) {
        String str;
        if (userData == null || (str = userData.regiId()) == null) {
            str = "";
        }
        Embrace.getInstance().logMessage("UserDetails Query Saved UserDetails to DB", Severity.INFO, t.f(new Pair("regiID", str)));
    }

    @Override // defpackage.c98
    public void U(String str, String str2, PurchaseLinkSource purchaseLinkSource, String str3) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        zq3.h(str3, "nytSRequestCookie");
        Pair pair = new Pair("sku", str);
        if (str2 == null) {
            str2 = "";
        }
        Embrace.getInstance().logMessage("Forced Session Refresh for Purchase Link Succeeded", Severity.INFO, t.m(pair, new Pair("orderId", str2), new Pair("source", purchaseLinkSource.name()), new Pair("NYT-S", str3)));
    }

    @Override // defpackage.l98
    public void V(String str) {
        zq3.h(str, "buttonName");
        Map<String, ?> n = t.n(new Pair("buttonName", str));
        Embrace.getInstance().logMessage("Clicked LIRE Button: " + str, Severity.INFO, n);
    }

    @Override // defpackage.g68
    public void a(String str) {
        if (str == null) {
            str = "";
        }
        Embrace.getInstance().logMessage("SmartLock Login Failure", Severity.ERROR, t.n(new Pair("errorMessage", str)));
    }

    @Override // defpackage.g88
    public void b() {
        Embrace.getInstance().logInfo("NYTUser Provisional Entitlements Cleared");
    }

    @Override // defpackage.d98
    public void c(String str, String str2, PurchaseLinkSource purchaseLinkSource, c.a aVar) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        zq3.h(aVar, "sessionRefreshError");
        Pair pair = new Pair("sku", str);
        if (str2 == null) {
            str2 = "";
        }
        Pair pair2 = new Pair("orderId", str2);
        Pair pair3 = new Pair("source", purchaseLinkSource.name());
        Pair pair4 = new Pair("errorType", aVar.c());
        String b2 = aVar.b();
        Map<String, ?> m = t.m(pair, pair2, pair3, pair4, new Pair("errorMessage", b2 != null ? b2 : ""));
        if (aVar instanceof c.a.d) {
            Embrace.getInstance().logMessage("Network Connectivity Issues. Forced Session Refresh for Purchase Link Failed.", Severity.WARNING, m);
        } else {
            Embrace.getInstance().logMessage("Forced Session Refresh for Purchase Link Failed.", Severity.WARNING, m);
        }
    }

    @Override // defpackage.d98
    public void d(Set set) {
        zq3.h(set, "provisionalEntitlements");
        Embrace.getInstance().logMessage("Purchase Verification Failed. Using Provisional Entitlements: " + set, Severity.WARNING);
    }

    @Override // defpackage.x88
    public void e() {
        Embrace.getInstance().logInfo("PURR: Using Stale Cache for PURR Config");
    }

    @Override // defpackage.g78
    public void f(String str, String str2) {
        Map<String, ?> i;
        zq3.h(str, "sourceName");
        if (str2 == null || (i = t.f(new Pair("message", str2))) == null) {
            i = t.i();
        }
        Embrace.getInstance().logMessage(str + " Returned Partial GraphQL Response", Severity.ERROR, i);
    }

    @Override // defpackage.x88
    public void g(Boolean bool) {
        Object obj = bool;
        if (bool == null) {
            obj = "hidden checkbox (default true)";
        }
        Map<String, ?> f = t.f(new Pair("optIn", obj));
        Embrace.getInstance().logMessage("Email Opt In SUCCESS (" + obj + ")", Severity.INFO, f);
    }

    @Override // defpackage.c98
    public void h(String str, String str2, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        Pair pair = new Pair("sku", str);
        if (str2 == null) {
            str2 = "";
        }
        Embrace.getInstance().logMessage("Forcing Session Refresh for Purchase Link (stale NYT-S)", Severity.INFO, t.m(pair, new Pair("orderId", str2), new Pair("source", purchaseLinkSource.name())));
    }

    @Override // defpackage.x88
    public void i(TCFInfo tCFInfo) {
        zq3.h(tCFInfo, "tcfInfo");
        Embrace.getInstance().addSessionProperty("TCF information", a0(tCFInfo), true);
    }

    @Override // defpackage.x88
    public void j(Boolean bool) {
        Object obj = bool;
        if (bool == null) {
            obj = "hidden checkbox (default true)";
        }
        Map<String, ?> f = t.f(new Pair("optIn", obj));
        Embrace.getInstance().logMessage("Attempt Email Opt In (" + obj + ")", Severity.INFO, f);
    }

    @Override // defpackage.f78
    public void k(RegiData regiData) {
        String str;
        zq3.h(regiData, "regiData");
        List<UserSubscription> subscriptions = regiData.getSubscriptions();
        List<UserSubscription> list = subscriptions;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UserSubscription) obj).getHasActiveEntitlements()) {
                arrayList.add(obj);
            }
        }
        String u0 = i.u0(arrayList, ",", null, null, 0, null, new ss2() { // from class: com.nytimes.android.subauth.embrace.SubauthEmbraceListener$onUserDetailsQuerySuccess$activeSubs$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(UserSubscription userSubscription) {
                zq3.h(userSubscription, "it");
                return userSubscription.getName();
            }
        }, 30, null);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((UserSubscription) obj2).getHasActiveEntitlements()) {
                arrayList2.add(obj2);
            }
        }
        String u02 = i.u0(arrayList2, ",", null, null, 0, null, new ss2() { // from class: com.nytimes.android.subauth.embrace.SubauthEmbraceListener$onUserDetailsQuerySuccess$inactiveSubs$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(UserSubscription userSubscription) {
                zq3.h(userSubscription, "it");
                return userSubscription.getName();
            }
        }, 30, null);
        mz8 userAccount = regiData.getUserAccount();
        if (userAccount == null || (str = userAccount.i()) == null) {
            str = "";
        }
        Map<String, ?> n = t.n(new Pair("regiID", str), new Pair("activeSubs", u0), new Pair("inactiveSubs", u02), new Pair("numSubs", Integer.valueOf(subscriptions.size())));
        for (UserSubscription userSubscription : i.P0(subscriptions, 5)) {
            n.put(userSubscription.getName(), userSubscription.fullDescription());
        }
        Embrace.getInstance().logMessage("UserDetails Query SUCCESS", Severity.INFO, n);
    }

    @Override // defpackage.g78
    public void l(String str, LoginMethod loginMethod, LoginResponse loginResponse) {
        String str2;
        zq3.h(str, "errorMessage");
        zq3.h(loginMethod, "loginMethod");
        if (loginResponse == null || (str2 = loginResponse.b()) == null) {
            str2 = "";
        }
        Map<String, ?> n = t.n(new Pair("action", str2), new Pair("method", loginMethod.name()), new Pair("errorMessage", str));
        if (pa4.a(loginMethod)) {
            Embrace.getInstance().logMessage("SSO Login FAIL", Severity.ERROR, n);
        } else if (loginMethod == LoginMethod.RegisterCredentials) {
            Embrace.getInstance().logMessage("Registration FAIL", Severity.ERROR, n);
        } else {
            Embrace.getInstance().logMessage("Login FAIL", Severity.ERROR, n);
        }
    }

    @Override // defpackage.f78
    public void m(LogoutSource logoutSource) {
        zq3.h(logoutSource, "logoutSource");
        Embrace.getInstance().logMessage("Logout (" + logoutSource.name() + ")", Severity.INFO);
    }

    @Override // defpackage.g78
    public void n(String str, String str2, String str3) {
        zq3.h(str, "subscriptionName");
        zq3.h(str2, "fieldName");
        Pair pair = new Pair("subscriptionName", str);
        Pair pair2 = new Pair("fieldName", str2);
        if (str3 == null) {
            str3 = "";
        }
        Embrace.getInstance().logMessage("[UD Warn] User Details Date Parsing Failed", Severity.WARNING, t.m(pair, pair2, new Pair("value", str3)));
    }

    @Override // defpackage.f78
    public void o(LoginResponse loginResponse, LoginMethod loginMethod) {
        zq3.h(loginResponse, "loginResponse");
        zq3.h(loginMethod, "loginMethod");
        Map<String, ?> n = t.n(new Pair("method", loginMethod.name()));
        if (!pa4.a(loginMethod)) {
            if (loginMethod == LoginMethod.RegisterCredentials) {
                Embrace.getInstance().logMessage("Registration SUCCESS", Severity.INFO, n);
                return;
            } else {
                Embrace.getInstance().logMessage("Login SUCCESS", Severity.INFO, n);
                return;
            }
        }
        String b2 = loginResponse.b();
        if (b2 == null) {
            b2 = "";
        }
        n.put("action", b2);
        Embrace.getInstance().logMessage("SSO Login SUCCESS", Severity.INFO, n);
    }

    @Override // defpackage.d98
    public void p(String str, String str2, String str3, d54 d54Var, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(d54Var, "linkStatus");
        zq3.h(purchaseLinkSource, "linkSource");
        String name = purchaseLinkSource.name();
        Pair pair = new Pair("sku", str == null ? "" : str);
        if (str2 == null) {
            str2 = "";
        }
        Pair pair2 = new Pair("orderId", str2);
        Pair pair3 = new Pair("source", name);
        if (str3 == null) {
            str3 = "";
        }
        Map<String, ?> m = t.m(pair, pair2, pair3, new Pair("errorMessage", str3));
        if (d54Var instanceof d54.c) {
            Embrace.getInstance().logMessage("[Link Error] Purchase Link Failed (" + str + ", " + name + ")", Severity.ERROR, m);
            return;
        }
        if (d54Var instanceof d54.e) {
            Embrace.getInstance().logMessage("[Link Info] Network Connectivity Issues. Purchase Link Failed (" + str + ", " + name + ")", Severity.WARNING, m);
            return;
        }
        if (zq3.c(d54Var, d54.f.b)) {
            Embrace.getInstance().logMessage("[Link Info] Anon User. Cannot Link. Purchase Link Failed (" + str + ", " + name + ")", Severity.WARNING, m);
            return;
        }
        if (zq3.c(d54Var, d54.g.b)) {
            Embrace.getInstance().logMessage("[Link Info] No Purchase Saved. Purchase Link Failed (" + str + ", " + name + ")", Severity.WARNING, m);
        }
    }

    @Override // defpackage.x88
    public void q() {
        Embrace.getInstance().logInfo("PURR: Using Fresh Backend for PURR Config");
    }

    @Override // defpackage.f78
    public void r(String str) {
        if (str == null) {
            str = "";
        }
        Embrace.getInstance().logMessage("UserDetails Query Started", Severity.INFO, t.f(new Pair("NYT-S", str)));
    }

    @Override // defpackage.d98
    public void s(String str) {
        Embrace.getInstance().logMessage("Purchase Verification Failed: " + str, Severity.ERROR);
    }

    @Override // defpackage.l98
    public void t(String str) {
        zq3.h(str, "screenName");
        Embrace.getInstance().logMessage("Opened LIRE Screen: " + str, Severity.INFO);
    }

    @Override // defpackage.f78
    public void u() {
        Embrace.getInstance().logInfo("On Session Refresh Poll Success, Query User Details after 6 hours");
    }

    @Override // defpackage.c98
    public void v(String str, String str2, String str3, PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        String name = purchaseLinkSource.name();
        Pair pair = new Pair("sku", str);
        if (str2 == null) {
            str2 = "";
        }
        Pair pair2 = new Pair("orderId", str2);
        Pair pair3 = new Pair("source", name);
        if (str3 == null) {
            str3 = "";
        }
        Map<String, ?> m = t.m(pair, pair2, pair3, new Pair("regiID", str3));
        Embrace.getInstance().logMessage("Purchase Link Success (" + name + ")", Severity.INFO, m);
    }

    @Override // defpackage.g88
    public void w() {
        Embrace.getInstance().logInfo("Skipping updating NYTUser. UserData unchanged.");
    }

    @Override // defpackage.g78
    public void x(String str) {
        if (str == null) {
            str = "";
        }
        Embrace.getInstance().logMessage("[UD Warn] Invalid RegiID returned from UserData", Severity.WARNING, t.f(new Pair("regiID", str)));
    }

    @Override // defpackage.g68
    public void y(String str) {
        if (str == null) {
            str = "";
        }
        Embrace.getInstance().logMessage("OneTap Login Failure", Severity.ERROR, t.n(new Pair("errorMessage", str)));
    }

    @Override // defpackage.g88
    public void z(NYTUser.StateChangeType stateChangeType, NYTUser nYTUser) {
        zq3.h(stateChangeType, "stateChangeType");
        zq3.h(nYTUser, "nytUser");
        Embrace.getInstance().logInfo("NYTUser Meaningfully Changed: " + stateChangeType.name() + ": " + nYTUser.t());
    }
}
