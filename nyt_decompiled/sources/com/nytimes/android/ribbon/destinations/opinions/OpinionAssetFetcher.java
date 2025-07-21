package com.nytimes.android.ribbon.destinations.opinions;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.api.config.model.RibbonTabEndpoint;
import defpackage.gj5;
import defpackage.wj5;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class OpinionAssetFetcher {
    private final ApolloClient a;
    private final gj5 b;
    private final wj5 c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RibbonTabEndpoint.values().length];
            try {
                iArr[RibbonTabEndpoint.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RibbonTabEndpoint.PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public OpinionAssetFetcher(ApolloClient apolloClient, gj5 gj5Var, wj5 wj5Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(gj5Var, "opinionGenericPersonalizedAssetParser");
        zq3.h(wj5Var, "opinionPersonalizedAssetParser");
        this.a = apolloClient;
        this.b = gj5Var;
        this.c = wj5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.nytimes.android.api.config.model.RibbonTabEndpoint r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher$downloadOpinionRecommendedData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher$downloadOpinionRecommendedData$1 r0 = (com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher$downloadOpinionRecommendedData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher$downloadOpinionRecommendedData$1 r0 = new com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher$downloadOpinionRecommendedData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher r5 = (com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher) r5
            kotlin.f.b(r7)
            goto L99
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher r5 = (com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher) r5
            kotlin.f.b(r7)
            goto L73
        L40:
            kotlin.f.b(r7)
            r7 = -1
            if (r6 != 0) goto L48
            r6 = r7
            goto L50
        L48:
            int[] r2 = com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher.a.a
            int r6 = r6.ordinal()
            r6 = r2[r6]
        L50:
            if (r6 == r7) goto L83
            if (r6 == r4) goto L5d
            if (r6 != r3) goto L57
            goto L83
        L57:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L5d:
            com.apollographql.apollo.ApolloClient r6 = r5.a
            hj5 r7 = new hj5
            r7.<init>()
            com.apollographql.apollo.ApolloCall r6 = r6.L(r7)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = com.nytimes.android.apolloschema.ExtensionsKt.a(r6, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            yj r7 = (defpackage.yj) r7
            ii5$a r6 = r7.c
            defpackage.zq3.e(r6)
            hj5$b r6 = (hj5.b) r6
            gj5 r5 = r5.b
            java.util.List r5 = r5.a(r6)
            goto La8
        L83:
            com.apollographql.apollo.ApolloClient r6 = r5.a
            xj5 r7 = new xj5
            r7.<init>()
            com.apollographql.apollo.ApolloCall r6 = r6.L(r7)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = com.nytimes.android.apolloschema.ExtensionsKt.a(r6, r0)
            if (r7 != r1) goto L99
            return r1
        L99:
            yj r7 = (defpackage.yj) r7
            ii5$a r6 = r7.c
            defpackage.zq3.e(r6)
            xj5$b r6 = (xj5.b) r6
            wj5 r5 = r5.c
            java.util.List r5 = r5.a(r6)
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher.a(com.nytimes.android.api.config.model.RibbonTabEndpoint, by0):java.lang.Object");
    }
}
