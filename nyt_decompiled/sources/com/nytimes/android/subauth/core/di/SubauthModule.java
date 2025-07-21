package com.nytimes.android.subauth.core.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.preference.g;
import co.datadome.sdk.c;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.SubauthUserManager;
import com.nytimes.android.subauth.core.auth.network.NYTSubauthPollAPI;
import com.nytimes.android.subauth.core.auth.network.NYTTargetingAPI;
import com.nytimes.android.subauth.core.auth.network.UserAPI;
import com.nytimes.android.subauth.core.auth.sessionRefresh.SessionRefreshV2Manager;
import com.nytimes.android.subauth.core.auth.targeting.TargetingService;
import com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl;
import com.nytimes.android.subauth.core.auth.userdetails.UserDetailsManager;
import com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService;
import com.nytimes.android.subauth.core.di.SubauthModule;
import com.nytimes.android.subauth.core.purchase.SubauthLoginLinkingAPIImpl;
import com.nytimes.android.subauth.core.purchase.SubauthPurchaseManager;
import com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront;
import com.nytimes.android.subauth.core.purr.PurrManagerImpl;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.purr.network.PurrClientImpl;
import com.squareup.moshi.i;
import defpackage.ba1;
import defpackage.c05;
import defpackage.e98;
import defpackage.h98;
import defpackage.hm6;
import defpackage.j86;
import defpackage.kl7;
import defpackage.mg8;
import defpackage.n96;
import defpackage.ng8;
import defpackage.o96;
import defpackage.ox0;
import defpackage.p78;
import defpackage.qz8;
import defpackage.s86;
import defpackage.ss2;
import defpackage.t68;
import defpackage.u86;
import defpackage.vz8;
import defpackage.w88;
import defpackage.xe8;
import defpackage.xz8;
import defpackage.z38;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class SubauthModule {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements u86 {
        final /* synthetic */ c05 a;

        b(c05 c05Var) {
            this.a = c05Var;
        }

        @Override // defpackage.u86
        public String a() {
            return this.a.m(true);
        }
    }

    private final String b(Context context) {
        String packageName = context.getPackageName();
        zq3.e(packageName);
        if (!h.v(packageName, ".debug", false, 2, null)) {
            return packageName;
        }
        String substring = packageName.substring(0, packageName.length() - 6);
        zq3.g(substring, "substring(...)");
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response e(u86 u86Var, Interceptor.Chain chain) {
        zq3.h(u86Var, "$purrCookieProvider");
        zq3.h(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        String a2 = u86Var.a();
        if (a2 != null && a2.length() > 0) {
            z38 z38Var = z38.a;
            String format = String.format(Locale.getDefault(), "%s=%s; Domain=%s; Path=/", Arrays.copyOf(new Object[]{"NYT-S", u86Var.a(), "nytimes.com"}, 3));
            zq3.g(format, "format(...)");
            newBuilder.addHeader(c.HTTP_HEADER_COOKIE, format);
        }
        return chain.proceed(newBuilder.build());
    }

    public final GoogleStoreFront c(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        return new GoogleStoreFront(t68Var.j(), null, null, 6, null);
    }

    public final MutableSharedFlow d() {
        return SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    public final Interceptor f(final u86 u86Var) {
        zq3.h(u86Var, "purrCookieProvider");
        return new Interceptor() { // from class: q78
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response e;
                e = SubauthModule.e(u86.this, chain);
                return e;
            }
        };
    }

    public final s86 g(t68 t68Var, ApolloClient apolloClient, n96 n96Var, xe8 xe8Var, SubauthListenerManager subauthListenerManager, w88 w88Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(apolloClient, "apolloClient");
        zq3.h(n96Var, "purrResponseParser");
        zq3.h(xe8Var, "tcfPurrResponseParser");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(w88Var, "networkStatus");
        SharedPreferences b2 = g.b(t68Var.j());
        ss2 n = t68Var.n();
        String o = t68Var.o();
        zq3.e(b2);
        return new PurrClientImpl(apolloClient, w88Var, n, n96Var, xe8Var, o, b2, subauthListenerManager);
    }

    public final u86 h(c05 c05Var) {
        zq3.h(c05Var, "nytCookieProvider");
        return new b(c05Var);
    }

    public final com.nytimes.android.subauth.core.purr.a i(t68 t68Var, s86 s86Var, o96 o96Var, MutableSharedFlow mutableSharedFlow, PurrDirectiveOverrider purrDirectiveOverrider, u86 u86Var, SubauthListenerManager subauthListenerManager) {
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(s86Var, "purrClient");
        zq3.h(o96Var, "store");
        zq3.h(mutableSharedFlow, "latestPrivacySharedFlow");
        zq3.h(purrDirectiveOverrider, "purrDirectiveOverrider");
        zq3.h(u86Var, "purrCookieProvider");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        SharedPreferences b2 = g.b(t68Var.j());
        zq3.g(b2, "getDefaultSharedPreferences(...)");
        return new PurrManagerImpl(s86Var, o96Var, mutableSharedFlow, purrDirectiveOverrider, u86Var, b2, t68Var.q(), subauthListenerManager, null, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, null);
    }

    public final kl7 j(t68 t68Var, xz8 xz8Var, NYTSubauthPollAPI nYTSubauthPollAPI, c05 c05Var, ba1 ba1Var, w88 w88Var, SubauthListenerManager subauthListenerManager) {
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(xz8Var, "userDetailsProvider");
        zq3.h(nYTSubauthPollAPI, "pollAPI");
        zq3.h(c05Var, "cookieProvider");
        zq3.h(ba1Var, "dataStore");
        zq3.h(w88Var, "networkStatus");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        return new SessionRefreshV2Manager(t68Var.getResources(), nYTSubauthPollAPI, xz8Var, c05Var, t68Var.p(), t68Var.b(), w88Var, ba1Var, subauthListenerManager, null, 512, null);
    }

    public final p78 k(SubauthPurchaseManager subauthPurchaseManager) {
        zq3.h(subauthPurchaseManager, "purchaseManager");
        return new SubauthLoginLinkingAPIImpl(subauthPurchaseManager);
    }

    public final SubauthPurchaseManager l(t68 t68Var, NYTUser nYTUser, xz8 xz8Var, c05 c05Var, qz8 qz8Var, j86 j86Var, kl7 kl7Var, e98 e98Var, GoogleStoreFront googleStoreFront, i iVar, ba1 ba1Var, SubauthListenerManager subauthListenerManager, w88 w88Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(nYTUser, "nytUser");
        zq3.h(xz8Var, "userDetailsProvider");
        zq3.h(c05Var, "cookieProvider");
        zq3.h(qz8Var, "userDataDatabaseProvider");
        zq3.h(j86Var, "purchaseDatabaseProvider");
        zq3.h(kl7Var, "sessionRefreshProvider");
        zq3.h(e98Var, "networkManager");
        zq3.h(googleStoreFront, "googleStoreFront");
        zq3.h(iVar, "moshi");
        zq3.h(ba1Var, "dataStore");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(w88Var, "networkStatus");
        return new SubauthPurchaseManager(nYTUser, xz8Var, qz8Var, c05Var, j86Var, kl7Var, e98Var, w88Var, googleStoreFront, b(t68Var.j()), t68Var.getResources(), iVar, ba1Var, subauthListenerManager, t68Var.g(), t68Var.k(), null, 65536, null);
    }

    public final SubauthUserManager m(t68 t68Var, NYTUser nYTUser, UserAPI userAPI, xz8 xz8Var, c05 c05Var, kl7 kl7Var, mg8 mg8Var, ba1 ba1Var, SubauthListenerManager subauthListenerManager, w88 w88Var) {
        Map i;
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(nYTUser, "user");
        zq3.h(userAPI, "userAPI");
        zq3.h(xz8Var, "userDetailsProvider");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(kl7Var, "sessionRefreshProvider");
        zq3.h(mg8Var, "targetingServiceProvider");
        zq3.h(ba1Var, "dataStore");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        zq3.h(w88Var, "networkStatus");
        Resources resources = t68Var.getResources();
        h98 m = t68Var.m();
        if (m == null || (i = m.c()) == null) {
            i = t.i();
        }
        return new SubauthUserManager(resources, nYTUser, userAPI, w88Var, xz8Var, c05Var, kl7Var, i, t68Var.c(), ox0.a(t68Var.getApplication()), t68Var.b(), mg8Var, ba1Var, subauthListenerManager, null, Http2.INITIAL_MAX_FRAME_SIZE, null);
    }

    public final mg8 n(Application application, ba1 ba1Var, NYTTargetingAPI nYTTargetingAPI, c05 c05Var, ng8 ng8Var, w88 w88Var) {
        Object runBlocking$default;
        zq3.h(application, "context");
        zq3.h(ba1Var, "dataStore");
        zq3.h(nYTTargetingAPI, "targetingAPI");
        zq3.h(c05Var, "cookieProvider");
        zq3.h(ng8Var, "targetingStore");
        zq3.h(w88Var, "networkStatus");
        String string = application.getString(hm6.subauth_override_targeting_data);
        zq3.g(string, "getString(...)");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1(ba1Var, string, null), 1, null);
        Boolean bool = (Boolean) runBlocking$default;
        return bool != null ? bool.booleanValue() : false ? new DevSettingsTargetingService(ba1Var, application, null, 4, null) : new TargetingService(nYTTargetingAPI, c05Var, ng8Var, w88Var, null, 16, null);
    }

    public final ng8 o(ba1 ba1Var) {
        zq3.h(ba1Var, "dataStore");
        return new TargetingStoreImpl(ba1Var);
    }

    public final UserDetailsManager p(ba1 ba1Var, vz8 vz8Var, qz8 qz8Var, c05 c05Var, SubauthListenerManager subauthListenerManager) {
        zq3.h(ba1Var, "dataStore");
        zq3.h(vz8Var, "userDetailsClientAPI");
        zq3.h(qz8Var, "userDataDatabaseProvider");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        return new UserDetailsManager(ba1Var, vz8Var, qz8Var, c05Var, subauthListenerManager, null, 32, null);
    }

    public final xz8 q(UserDetailsManager userDetailsManager) {
        zq3.h(userDetailsManager, "userDetailsManager");
        return userDetailsManager;
    }
}
