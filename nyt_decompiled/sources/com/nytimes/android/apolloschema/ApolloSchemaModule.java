package com.nytimes.android.apolloschema;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import defpackage.ak6;
import defpackage.b04;
import defpackage.c05;
import defpackage.du8;
import defpackage.p77;
import defpackage.qs2;
import defpackage.tj;
import defpackage.w13;
import defpackage.x13;
import defpackage.y13;
import defpackage.zq3;
import io.reactivex.Single;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.t;
import okhttp3.OkHttpClient;
import type.DateTime;

/* loaded from: classes3.dex */
public final class ApolloSchemaModule {
    public static final ApolloSchemaModule a = new ApolloSchemaModule();

    private ApolloSchemaModule() {
    }

    public final ApolloClient a(w13 w13Var, final b04 b04Var, c05 c05Var, x13 x13Var, Set set, Map map, boolean z) {
        zq3.h(w13Var, "graphQLConfig");
        zq3.h(b04Var, "okHttpClient");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(x13Var, "headersHolder");
        zq3.h(set, "optInToConditionalGETOperations");
        zq3.h(map, "customTypeAdapters");
        p77 k = new p77(null, null, null, null, null, null, null, null, false, false, 1023, null).j(w13Var.b()).h(new qs2() { // from class: com.nytimes.android.apolloschema.ApolloSchemaModule$provideApollo$builder$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final OkHttpClient mo865invoke() {
                Object obj = b04.this.get();
                zq3.g(obj, "get(...)");
                return (OkHttpClient) obj;
            }
        }).i(set).e(map).a(c05Var.p()).f(x13Var).b(w13Var.a()).k();
        if (z) {
            k.g();
        }
        return k.d();
    }

    public final Map b() {
        return t.f(du8.a(DateTime.Companion.getType(), new tj()));
    }

    public final w13 c(SharedPreferences sharedPreferences, Resources resources, GraphQlEnvironment graphQlEnvironment, Single single) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(resources, "resources");
        zq3.h(graphQlEnvironment, "graphQlEnvironment");
        zq3.h(single, "analyticsTrackingId");
        String string = resources.getString(graphQlEnvironment.getUrl(sharedPreferences.getString(resources.getString(ak6.content_hybrid_preview_branch_keys), "")));
        zq3.g(string, "getString(...)");
        return new w13(string, new ApolloSchemaModule$provideGraphQLConfig$1(single, null));
    }

    public final GraphQlEnvironment d(SharedPreferences sharedPreferences, Resources resources) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(resources, "resources");
        String string = resources.getString(GraphQlEnvironment.PRODUCTION.getLabel());
        zq3.g(string, "getString(...)");
        String string2 = sharedPreferences.getString(resources.getString(ak6.BETA_GRAPHQL_ENV), string);
        zq3.e(string2);
        return GraphQlEnvironment.Companion.a(string2, resources);
    }

    public final x13 e(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "sharedPreferences");
        return new y13(sharedPreferences);
    }

    public final Set f() {
        return b0.j("BestSellers", "Discover", "ForYouChannelList", "ForYouDaily", "ForYouFollowStatus", "GetReadingList", "HybridGlobalResources", "OneWebViewHomeQuery", "PodcastList", "Podcast", "GetInterests");
    }
}
