package com.nytimes.android.ribbon.destinations.wirecutter;

import com.apollographql.apollo.ApolloClient;
import defpackage.c65;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NewsletterFetcher {
    private final ApolloClient a;
    private final c65 b;

    public NewsletterFetcher(ApolloClient apolloClient, c65 c65Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(c65Var, "newsletterParser");
        this.a = apolloClient;
        this.b = c65Var;
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
            boolean r0 = r5 instanceof com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadNewsletterData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadNewsletterData$1 r0 = (com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadNewsletterData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadNewsletterData$1 r0 = new com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadNewsletterData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher r4 = (com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher) r4
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
            ki9 r2 = new ki9
            r2.<init>()
            com.apollographql.apollo.ApolloCall r5 = r5.L(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            yj r5 = (defpackage.yj) r5
            ii5$a r5 = r5.c
            defpackage.zq3.e(r5)
            ki9$b r5 = (ki9.b) r5
            c65 r4 = r4.b
            fi9 r4 = r4.a(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher.a(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadUserNewsletterSubscriptions$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadUserNewsletterSubscriptions$1 r0 = (com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadUserNewsletterSubscriptions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadUserNewsletterSubscriptions$1 r0 = new com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher$downloadUserNewsletterSubscriptions$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher r4 = (com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher) r4
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
            d65 r2 = new d65
            r2.<init>()
            com.apollographql.apollo.ApolloCall r5 = r5.L(r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = com.nytimes.android.apolloschema.ExtensionsKt.a(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            yj r5 = (defpackage.yj) r5
            ii5$a r5 = r5.c
            defpackage.zq3.e(r5)
            d65$b r5 = (d65.b) r5
            c65 r4 = r4.b
            java.util.Set r4 = r4.b(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher.b(by0):java.lang.Object");
    }
}
