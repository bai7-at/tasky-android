package com.nytimes.android.subauth.core.di;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Log;
import androidx.preference.g;
import co.datadome.sdk.DataDomeInterceptor;
import co.datadome.sdk.DataDomeSDK;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.network.NYTSubauthPollAPI;
import com.nytimes.android.subauth.core.auth.network.NYTTargetingAPI;
import com.nytimes.android.subauth.core.auth.network.UserAPI;
import com.nytimes.android.subauth.core.auth.network.UserDetailsClientAPIImpl;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.squareup.moshi.i;
import defpackage.ba1;
import defpackage.e98;
import defpackage.hm6;
import defpackage.p77;
import defpackage.qs2;
import defpackage.su4;
import defpackage.t68;
import defpackage.vz8;
import defpackage.w13;
import defpackage.w88;
import defpackage.wz8;
import defpackage.x13;
import defpackage.y13;
import defpackage.ym8;
import defpackage.z86;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.t;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes4.dex */
public final class SubauthNetworkModule {
    private final GraphQlEnvironment b(t68 t68Var, SharedPreferences sharedPreferences) {
        String string = t68Var.j().getString(hm6.subauth_graphql_env_pref);
        zq3.g(string, "getString(...)");
        String string2 = sharedPreferences.getString(string, null);
        if (string2 == null) {
            string2 = String.valueOf(GraphQlEnvironment.PRODUCTION.getLabel());
        }
        zq3.e(string2);
        return GraphQlEnvironment.Companion.a(string2, t68Var.getResources());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call k(OkHttpClient okHttpClient, Request request) {
        zq3.h(okHttpClient, "$basicOkHttpClient");
        zq3.h(request, "request");
        return okHttpClient.newCall(request);
    }

    public final w13 c(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        SharedPreferences b = g.b(t68Var.j());
        zq3.e(b);
        GraphQlEnvironment b2 = b(t68Var, b);
        Log.d("SUBAUTH", "Set Subauth GraphQL Env: " + b2);
        String string = t68Var.j().getString(b2.getUrlResource());
        zq3.g(string, "getString(...)");
        return new w13(string, t68Var.c());
    }

    public final x13 d(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        SharedPreferences sharedPreferences = t68Var.getApplication().getSharedPreferences("com.nytimes.android.compliance.purr", 0);
        zq3.g(sharedPreferences, "getSharedPreferences(...)");
        return new y13(sharedPreferences);
    }

    public final i e() {
        i d = new i.b().b(new JsonObjectAdapter()).d();
        zq3.g(d, "build(...)");
        return d;
    }

    public final NYTSubauthPollAPI f(Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        zq3.h(builder, "retrofitBuilder");
        zq3.h(subauthEnvironment, "subAuthEnvironment");
        Object create = builder.baseUrl(subauthEnvironment.c()).build().create(NYTSubauthPollAPI.class);
        zq3.g(create, "create(...)");
        return (NYTSubauthPollAPI) create;
    }

    public final NYTTargetingAPI g(Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        zq3.h(builder, "retrofitBuilder");
        zq3.h(subauthEnvironment, "subAuthEnvironment");
        Object create = builder.baseUrl(subauthEnvironment.d()).build().create(NYTTargetingAPI.class);
        zq3.g(create, "create(...)");
        return (NYTTargetingAPI) create;
    }

    public final OkHttpClient h(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().addAll(t68Var.d());
        if (t68Var.l() != null) {
            builder.addInterceptor(new DataDomeInterceptor(t68Var.getApplication(), DataDomeSDK.with(t68Var.getApplication(), t68Var.l(), t68Var.getApplication().getPackageManager().getPackageInfo(t68Var.getApplication().getPackageName(), 0).versionName)));
        }
        return builder.build();
    }

    public final Set i() {
        return b0.d("PrivacyDirectivesV2");
    }

    public final Retrofit.Builder j(final OkHttpClient okHttpClient, i iVar) {
        zq3.h(okHttpClient, "basicOkHttpClient");
        zq3.h(iVar, "moshi");
        Retrofit.Builder callFactory = new Retrofit.Builder().client(okHttpClient).addConverterFactory(new ym8()).addConverterFactory(MoshiConverterFactory.create(iVar)).callFactory(new Call.Factory() { // from class: h88
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request request) {
                Call k;
                k = SubauthNetworkModule.k(OkHttpClient.this, request);
                return k;
            }
        });
        zq3.g(callFactory, "callFactory(...)");
        return callFactory;
    }

    public final ApolloClient l(final t68 t68Var, w13 w13Var, x13 x13Var, Set set, Interceptor interceptor, z86 z86Var, su4 su4Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(w13Var, "graphQLConfig");
        zq3.h(x13Var, "graphQLHeadersHolder");
        zq3.h(set, "optInToConditionalGETOperations");
        zq3.h(interceptor, "nytCookieInterceptor");
        zq3.h(z86Var, "purrHeaderInterceptor");
        zq3.h(su4Var, "mockSubauthGraphQLInterceptor");
        return new p77(null, null, null, null, null, null, null, null, false, false, 1023, null).c(t68Var.getApplication()).j(w13Var.b()).h(new qs2() { // from class: com.nytimes.android.subauth.core.di.SubauthNetworkModule$provideSubauthApolloClient$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final OkHttpClient mo865invoke() {
                return ((OkHttpClient.Builder) t68.this.e().mo865invoke()).build();
            }
        }).i(set).e(t.i()).a(interceptor).a(z86Var).a(su4Var).f(x13Var).b(w13Var.a()).k().d();
    }

    public final SubauthEnvironment m(Resources resources, ba1 ba1Var) {
        zq3.h(resources, "resources");
        zq3.h(ba1Var, "dataStore");
        return new SubauthEnvironment(resources, ba1Var, null, 4, null);
    }

    public final e98 n(Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        zq3.h(builder, "retrofitBuilder");
        zq3.h(subauthEnvironment, "subAuthEnvironment");
        return new e98(builder, subauthEnvironment);
    }

    public final UserAPI o(Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        zq3.h(builder, "retrofitBuilder");
        zq3.h(subauthEnvironment, "subAuthEnvironment");
        Object create = builder.addConverterFactory(MoshiConverterFactory.create()).baseUrl(subauthEnvironment.c()).build().create(UserAPI.class);
        zq3.g(create, "create(...)");
        return (UserAPI) create;
    }

    public final vz8 p(ApolloClient apolloClient, wz8 wz8Var, w88 w88Var, SubauthListenerManager subauthListenerManager) {
        zq3.h(apolloClient, "samizdatApolloClient");
        zq3.h(wz8Var, "userDetailsParser");
        zq3.h(w88Var, "networkStatus");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        return new UserDetailsClientAPIImpl(apolloClient, w88Var, wz8Var, subauthListenerManager);
    }

    public final wz8 q(SubauthListenerManager subauthListenerManager) {
        zq3.h(subauthListenerManager, "subauthListenerManager");
        return new wz8(subauthListenerManager);
    }
}
