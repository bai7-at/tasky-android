package com.nytimes.android.link.share;

import com.apollographql.apollo.ApolloClient;
import defpackage.p03;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GiftShareRemainingDataFetcher {
    private final ApolloClient a;
    private final p03 b;

    public GiftShareRemainingDataFetcher(ApolloClient apolloClient, p03 p03Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(p03Var, "giftShareRemainingParser");
        this.a = apolloClient;
        this.b = p03Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.link.share.GiftShareRemainingDataFetcher$fetchGiftRemaining$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.link.share.GiftShareRemainingDataFetcher$fetchGiftRemaining$1 r0 = (com.nytimes.android.link.share.GiftShareRemainingDataFetcher$fetchGiftRemaining$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.link.share.GiftShareRemainingDataFetcher$fetchGiftRemaining$1 r0 = new com.nytimes.android.link.share.GiftShareRemainingDataFetcher$fetchGiftRemaining$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.link.share.GiftShareRemainingDataFetcher r4 = (com.nytimes.android.link.share.GiftShareRemainingDataFetcher) r4
            kotlin.f.b(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            com.apollographql.apollo.ApolloClient r5 = r4.a
            q03 r2 = new q03
            r2.<init>()
            com.apollographql.apollo.ApolloCall r5 = r5.L(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            yj r5 = (defpackage.yj) r5
            p03 r4 = r4.b
            ii5$a r5 = r5.c
            defpackage.zq3.e(r5)
            q03$b r5 = (q03.b) r5
            int r4 = r4.a(r5)
            java.lang.Integer r4 = defpackage.cc0.c(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.link.share.GiftShareRemainingDataFetcher.a(by0):java.lang.Object");
    }
}
