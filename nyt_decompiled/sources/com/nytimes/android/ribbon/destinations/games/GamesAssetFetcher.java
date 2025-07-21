package com.nytimes.android.ribbon.destinations.games;

import com.apollographql.apollo.ApolloClient;
import defpackage.hv2;
import defpackage.ml0;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GamesAssetFetcher {
    private final ApolloClient a;
    private final ml0 b;
    private final hv2 c;

    public GamesAssetFetcher(ApolloClient apolloClient, ml0 ml0Var, hv2 hv2Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(ml0Var, "adParams");
        zq3.h(hv2Var, "gamesParser");
        this.a = apolloClient;
        this.b = ml0Var;
        this.c = hv2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.by0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher$downloadGamesData$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher$downloadGamesData$1 r0 = (com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher$downloadGamesData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher$downloadGamesData$1 r0 = new com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher$downloadGamesData$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher r8 = (com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher) r8
            kotlin.f.b(r9)
            goto L66
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.f.b(r9)
            com.apollographql.apollo.ApolloClient r9 = r8.a
            bu2 r2 = new bu2
            ml0 r4 = r8.b
            java.lang.String r4 = r4.c()
            ml0 r5 = r8.b
            java.lang.String r5 = r5.a()
            ml0 r6 = r8.b
            java.lang.String r6 = r6.b()
            ml0 r7 = r8.b
            java.lang.String r7 = r7.d()
            r2.<init>(r4, r5, r6, r7)
            com.apollographql.apollo.ApolloCall r9 = r9.L(r2)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = com.nytimes.android.apolloschema.ExtensionsKt.a(r9, r0)
            if (r9 != r1) goto L66
            return r1
        L66:
            yj r9 = (defpackage.yj) r9
            ii5$a r9 = r9.c
            defpackage.zq3.e(r9)
            bu2$g r9 = (bu2.g) r9
            hv2 r8 = r8.c
            java.util.List r8 = r8.a(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.games.GamesAssetFetcher.a(by0):java.lang.Object");
    }
}
