package com.nytimes.android.features.discovery.discoverysearch.query;

import android.content.SharedPreferences;
import com.apollographql.apollo.ApolloClient;
import defpackage.sw0;
import defpackage.uw0;
import defpackage.zq3;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.SearchSort;

/* loaded from: classes4.dex */
public final class ContentSearchExecutor {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final ApolloClient a;
    private final uw0 b;
    private final sw0 c;
    private final SharedPreferences d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ContentSearchExecutor(ApolloClient apolloClient, uw0 uw0Var, sw0 sw0Var, SharedPreferences sharedPreferences) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(uw0Var, "contentSearchQuery");
        zq3.h(sw0Var, "contentSearchFieldQuery");
        zq3.h(sharedPreferences, "prefs");
        this.a = apolloClient;
        this.b = uw0Var;
        this.c = sw0Var;
        this.d = sharedPreferences;
    }

    private final SearchSort a() {
        String string = this.d.getString("DiscoverySearchOrderPref", "best");
        zq3.e(string);
        String lowerCase = string.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return SearchSort.valueOf(lowerCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, java.lang.String r9, defpackage.by0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor$search$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor$search$1 r0 = (com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor$search$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor$search$1 r0 = new com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor$search$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor r7 = (com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor) r7
            kotlin.f.b(r10)     // Catch: java.lang.Exception -> L32
            goto L62
        L32:
            r7 = move-exception
            goto L76
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.f.b(r10)
            com.apollographql.apollo.ApolloClient r10 = r7.a     // Catch: java.lang.Exception -> L32
            tw0 r2 = new tw0     // Catch: java.lang.Exception -> L32
            type.SearchSort r4 = r7.a()     // Catch: java.lang.Exception -> L32
            nk5$c r5 = new nk5$c     // Catch: java.lang.Exception -> L32
            r5.<init>(r9)     // Catch: java.lang.Exception -> L32
            r6 = 10
            r2.<init>(r8, r4, r6, r5)     // Catch: java.lang.Exception -> L32
            com.apollographql.apollo.ApolloCall r8 = r10.L(r2)     // Catch: java.lang.Exception -> L32
            r0.L$0 = r7     // Catch: java.lang.Exception -> L32
            r0.L$1 = r9     // Catch: java.lang.Exception -> L32
            r0.label = r3     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = com.nytimes.android.apolloschema.ExtensionsKt.a(r8, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r1) goto L62
            return r1
        L62:
            yj r10 = (defpackage.yj) r10     // Catch: java.lang.Exception -> L32
            ii5$a r8 = r10.c     // Catch: java.lang.Exception -> L32
            defpackage.zq3.e(r8)     // Catch: java.lang.Exception -> L32
            tw0$c r8 = (tw0.c) r8     // Catch: java.lang.Exception -> L32
            uw0 r7 = r7.b     // Catch: java.lang.Exception -> L32
            if (r9 != 0) goto L70
            goto L71
        L70:
            r3 = 0
        L71:
            androidx.paging.PagingSource$b r7 = r7.c(r8, r3)     // Catch: java.lang.Exception -> L32
            goto L83
        L76:
            androidx.paging.PagingSource$b$a r8 = new androidx.paging.PagingSource$b$a
            java.lang.Throwable r9 = new java.lang.Throwable
            java.lang.String r10 = "Search Query Failed"
            r9.<init>(r10, r7)
            r8.<init>(r9)
            r7 = r8
        L83:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverysearch.query.ContentSearchExecutor.b(java.lang.String, java.lang.String, by0):java.lang.Object");
    }
}
