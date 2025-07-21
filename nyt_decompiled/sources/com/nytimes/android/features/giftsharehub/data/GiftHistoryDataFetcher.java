package com.nytimes.android.features.giftsharehub.data;

import com.apollographql.apollo.ApolloClient;
import defpackage.wz2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GiftHistoryDataFetcher {
    private final ApolloClient a;
    private final wz2 b;

    public GiftHistoryDataFetcher(ApolloClient apolloClient, wz2 wz2Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(wz2Var, "giftHistoryDataParser");
        this.a = apolloClient;
        this.b = wz2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher$fetchData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher$fetchData$1 r0 = (com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher$fetchData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher$fetchData$1 r0 = new com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher$fetchData$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher r4 = (com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher) r4
            kotlin.f.b(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r4.a
            xz2 r2 = new xz2
            r2.<init>(r5)
            com.apollographql.apollo.ApolloCall r5 = r6.L(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            yj r6 = (defpackage.yj) r6
            wz2 r4 = r4.b
            ii5$a r5 = r6.c
            defpackage.zq3.e(r5)
            xz2$c r5 = (xz2.c) r5
            h03 r4 = r4.a(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.giftsharehub.data.GiftHistoryDataFetcher.a(int, by0):java.lang.Object");
    }
}
