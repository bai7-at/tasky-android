package com.nytimes.android.internal.graphql.apollo;

import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.http.HttpMethod;
import com.nytimes.android.internal.graphql.exceptions.SamizdatApolloSetupException;
import defpackage.c04;
import defpackage.ds7;
import defpackage.fm8;
import defpackage.h8;
import defpackage.hm8;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ud5;
import defpackage.w13;
import defpackage.ww8;
import defpackage.x13;
import defpackage.x41;
import defpackage.z13;
import defpackage.zo3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.c;
import kotlin.collections.i;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class ApolloClientFactory {
    private final w13 a;
    private final qs2 b;
    private final x13 c;
    private final boolean d;
    private String e;

    public ApolloClientFactory(w13 w13Var, qs2 qs2Var, x13 x13Var, boolean z) {
        zq3.h(w13Var, "graphQLConfig");
        zq3.h(qs2Var, "okHttpClientProvider");
        this.a = w13Var;
        this.b = qs2Var;
        this.c = x13Var;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient i(c04 c04Var) {
        return (OkHttpClient) c04Var.getValue();
    }

    public final String g() {
        Object runBlocking$default;
        String str = this.e;
        if (str != null) {
            return str;
        }
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new ApolloClientFactory$getAgentId$1(this, null), 1, null);
        return (String) runBlocking$default;
    }

    public final ApolloClient h(final Set set, Map map, boolean z, final Interceptor... interceptorArr) {
        zq3.h(set, "optInToConditionalGetOperations");
        zq3.h(map, "customTypeAdapters");
        zq3.h(interceptorArr, "interceptors");
        final c04 a = c.a(new qs2() { // from class: com.nytimes.android.internal.graphql.apollo.ApolloClientFactory$provideApolloClient$newClient$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final OkHttpClient mo865invoke() {
                qs2 qs2Var;
                x13 x13Var;
                boolean z2;
                fm8 a2;
                qs2Var = ApolloClientFactory.this.b;
                OkHttpClient.Builder b = zo3.b(((OkHttpClient) qs2Var.mo865invoke()).newBuilder(), interceptorArr);
                final ApolloClientFactory apolloClientFactory = ApolloClientFactory.this;
                OkHttpClient.Builder c = zo3.c(b, new ss2() { // from class: com.nytimes.android.internal.graphql.apollo.ApolloClientFactory$provideApolloClient$newClient$2$builder$1
                    {
                        super(1);
                    }

                    public final void b(Request.Builder builder) {
                        zq3.h(builder, "$this$addRequestInterceptor");
                        builder.addHeader("NYT-Agent-Id", ApolloClientFactory.this.g());
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Request.Builder) obj);
                        return ww8.a;
                    }
                });
                x13Var = ApolloClientFactory.this.c;
                Set<String> set2 = set;
                z2 = ApolloClientFactory.this.d;
                OkHttpClient.Builder addInterceptor = c.addInterceptor(new z13(x13Var, set2, z2));
                List<Interceptor> interceptors = addInterceptor.interceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : interceptors) {
                    if (obj instanceof ds7) {
                        arrayList.add(obj);
                    }
                }
                ds7 ds7Var = (ds7) i.m0(arrayList);
                if (ds7Var == null || (a2 = ds7Var.a()) == null) {
                    throw new SamizdatApolloSetupException("Missing Required SigningInterceptor for Samizdat");
                }
                return addInterceptor.addInterceptor(new hm8(a2, null, 2, 0 == true ? 1 : 0)).build();
            }
        });
        ApolloClient.a l = ud5.d(new ApolloClient.a().b0(this.a.b()), new qs2() { // from class: com.nytimes.android.internal.graphql.apollo.ApolloClientFactory$provideApolloClient$builder$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Call.Factory mo865invoke() {
                OkHttpClient i;
                i = ApolloClientFactory.i(c04.this);
                return i;
            }
        }).l(Boolean.TRUE);
        if (z) {
            ApolloClient.a.e(l, HttpMethod.Get, null, false, 6, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            l.b((x41) entry.getKey(), (h8) entry.getValue());
        }
        return l.g();
    }
}
