package com.nytimes.android.subauth.core.api.listeners;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.auth.models.LoginMethod;
import com.nytimes.android.subauth.core.auth.network.response.LoginResponse;
import com.nytimes.android.subauth.core.auth.network.response.c;
import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.TCFInfo;
import defpackage.d54;
import defpackage.k78;
import defpackage.q22;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class SubauthListenerManager implements k78 {
    private final CoroutineScope a;
    private final Set b;

    public SubauthListenerManager(CoroutineDispatcher coroutineDispatcher) {
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.b = new LinkedHashSet();
    }

    private final void X(ss2 ss2Var) {
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new SubauthListenerManager$launchListenerLambda$1(this, ss2Var, null), 3, null);
    }

    @Override // defpackage.g68
    public void A(final String str) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onOneTapLoginSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.A(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g78
    public void B(final String str) {
        zq3.h(str, "sourceName");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onNetworkNotConnected$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.B(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.c98
    public void C(final String str, final String str2, final String str3, final PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "nytSRequestCookie");
        zq3.h(str2, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseLinkCall$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.C(str, str2, str3, purchaseLinkSource);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g68
    public void D() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onOneTapDismissed$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.D();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.x88
    public void E() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUsingFallbackPURRConfig$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.E();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.c98
    public void F(final String str, final String str2, final PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseLinkDisabledNoOP$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.F(str, str2, purchaseLinkSource);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g78
    public void G(final String str, final String str2, final boolean z) {
        zq3.h(str, "failedUserDetailsMessage");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUserDetailsFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.G(str, str2, z);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.x88
    public void H(final Boolean bool, final String str) {
        zq3.h(str, "errorMessage");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onEmailOptInFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.H(bool, str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g88
    public void I(final Date date) {
        zq3.h(date, "expirationDate");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onNYTUserSetupWithProvisionalEntitlements$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.I(date);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g68
    public void J() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onOneTapShown$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.J();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.l98
    public void K(final String str) {
        zq3.h(str, "errorMessage");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onShowLIREError$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.K(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.f78
    public void L(final LoginMethod loginMethod) {
        zq3.h(loginMethod, "loginMethod");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onLoginSuccessQueryUserDetails$1
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.L(LoginMethod.this);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g78
    public void M(final c.a aVar, final String str, final boolean z) {
        zq3.h(aVar, "sessionRefreshError");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onSessionRefreshFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.M(c.a.this, str, z);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g68
    public void N() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onSmartLockDismissed$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.N();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g68
    public void O() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onSmartLockLoginSuccess$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.O();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g88
    public void P(final NYTUser nYTUser, final NYTUserUpdateSource nYTUserUpdateSource) {
        zq3.h(nYTUser, "nytUser");
        zq3.h(nYTUserUpdateSource, "updateSource");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUpdateNYTUser$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.P(NYTUser.this, nYTUserUpdateSource);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.f78
    public void Q() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onLinkSuccessQueryUserDetails$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.Q();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.x88
    public void R(final PrivacyConfiguration privacyConfiguration) {
        zq3.h(privacyConfiguration, "privacyConfiguration");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPURRConfigUpdated$1
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.R(PrivacyConfiguration.this);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g78
    public void S(final String str, final q22 q22Var, final Exception exc) {
        zq3.h(str, "sourceName");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onGraphQLErrorResponse$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.S(str, q22Var, exc);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.f78
    public void T(final UserData userData) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUserDetailsSavedToDB$1
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.T(UserData.this);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.c98
    public void U(final String str, final String str2, final PurchaseLinkSource purchaseLinkSource, final String str3) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        zq3.h(str3, "nytSRequestCookie");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseLinkForcedSessionRefreshSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.U(str, str2, purchaseLinkSource, str3);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.l98
    public void V(final String str) {
        zq3.h(str, "buttonName");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onClickLIREButton$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.V(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    public void Y(k78 k78Var) {
        zq3.h(k78Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.add(k78Var);
    }

    @Override // defpackage.g68
    public void a(final String str) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onSmartLockLoginFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.a(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g88
    public void b() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onNYTUserProvisionalEntitlementsCleared$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.b();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.d98
    public void c(final String str, final String str2, final PurchaseLinkSource purchaseLinkSource, final c.a aVar) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        zq3.h(aVar, "sessionRefreshError");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseLinkForcedSessionRefreshFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.c(str, str2, purchaseLinkSource, aVar);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.d98
    public void d(final Set set) {
        zq3.h(set, "provisionalEntitlements");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseVerificationFailedUsingProvisionalEntitlements$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.d(set);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.x88
    public void e() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUsingStaleCachedPURRConfig$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.e();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g78
    public void f(final String str, final String str2) {
        zq3.h(str, "sourceName");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onGraphQLPartialResponse$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.f(str, str2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.x88
    public void g(final Boolean bool) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onEmailOptInSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.g(bool);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.c98
    public void h(final String str, final String str2, final PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseLinkForcedSessionRefreshBeforeAttempt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.h(str, str2, purchaseLinkSource);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.x88
    public void i(final TCFInfo tCFInfo) {
        zq3.h(tCFInfo, "tcfInfo");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onTCFUpdated$1
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.i(TCFInfo.this);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.x88
    public void j(final Boolean bool) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onEmailOptInAttempt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.j(bool);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.f78
    public void k(final RegiData regiData) {
        zq3.h(regiData, "regiData");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUserDetailsQuerySuccess$1
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.k(RegiData.this);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g78
    public void l(final String str, final LoginMethod loginMethod, final LoginResponse loginResponse) {
        zq3.h(str, "errorMessage");
        zq3.h(loginMethod, "loginMethod");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onLoginFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.l(str, loginMethod, loginResponse);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.f78
    public void m(final LogoutSource logoutSource) {
        zq3.h(logoutSource, "logoutSource");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onLogout$1
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.m(LogoutSource.this);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g78
    public void n(final String str, final String str2, final String str3) {
        zq3.h(str, "subscriptionName");
        zq3.h(str2, "fieldName");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUserDetailsDateParsingFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.n(str, str2, str3);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.f78
    public void o(final LoginResponse loginResponse, final LoginMethod loginMethod) {
        zq3.h(loginResponse, "loginResponse");
        zq3.h(loginMethod, "loginMethod");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onLoginSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.o(LoginResponse.this, loginMethod);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.d98
    public void p(final String str, final String str2, final String str3, final d54 d54Var, final PurchaseLinkSource purchaseLinkSource) {
        zq3.h(d54Var, "linkStatus");
        zq3.h(purchaseLinkSource, "linkSource");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseLinkFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.p(str, str2, str3, d54Var, purchaseLinkSource);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.x88
    public void q() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUsingFreshBackendPURRConfig$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.q();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.f78
    public void r(final String str) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onUserDetailsQuery$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.r(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.d98
    public void s(final String str) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseVerificationFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.s(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.l98
    public void t(final String str) {
        zq3.h(str, "screenName");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onOpenLIREScreen$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.t(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.f78
    public void u() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onSessionRefreshPollSuccessQueryUserDetails$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.u();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.c98
    public void v(final String str, final String str2, final String str3, final PurchaseLinkSource purchaseLinkSource) {
        zq3.h(str, "sku");
        zq3.h(purchaseLinkSource, "linkSource");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onPurchaseLinkSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.v(str, str2, str3, purchaseLinkSource);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g88
    public void w() {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onSkipUpdateNYTUser$1
            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.w();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g78
    public void x(final String str) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onInvalidRegiId$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.x(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g68
    public void y(final String str) {
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onOneTapLoginFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.y(str);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.g88
    public void z(final NYTUser.StateChangeType stateChangeType, final NYTUser nYTUser) {
        zq3.h(stateChangeType, "stateChangeType");
        zq3.h(nYTUser, "nytUser");
        X(new ss2() { // from class: com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager$onNYTUserHasMeaningfullyChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(k78 k78Var) {
                zq3.h(k78Var, "it");
                k78Var.z(NYTUser.StateChangeType.this, nYTUser);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((k78) obj);
                return ww8.a;
            }
        });
    }

    public /* synthetic */ SubauthListenerManager(CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }
}
