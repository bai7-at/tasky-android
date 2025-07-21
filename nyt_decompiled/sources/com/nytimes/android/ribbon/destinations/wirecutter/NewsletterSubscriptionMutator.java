package com.nytimes.android.ribbon.destinations.wirecutter;

import com.apollographql.apollo.ApolloClient;
import defpackage.nk5;
import defpackage.pw6;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import type.NewsletterProductsInput;

/* loaded from: classes4.dex */
public final class NewsletterSubscriptionMutator {
    private final ApolloClient a;

    public NewsletterSubscriptionMutator(ApolloClient apolloClient) {
        zq3.h(apolloClient, "apolloClient");
        this.a = apolloClient;
    }

    private final List a(String str) {
        return i.e(new NewsletterProductsInput(str, new nk5.c(Boolean.FALSE), new nk5.c(0)));
    }

    private final pw6 b(String str) {
        return new pw6(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$subscribeToNewsletter$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$subscribeToNewsletter$1 r0 = (com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$subscribeToNewsletter$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$subscribeToNewsletter$1 r0 = new com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$subscribeToNewsletter$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            java.util.List r5 = r4.a(r5)
            com.apollographql.apollo.ApolloClient r4 = r4.a
            q8 r6 = new q8
            r6.<init>(r5)
            com.apollographql.apollo.ApolloCall r4 = r4.G(r6)
            r0.label = r3
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r4, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            yj r6 = (defpackage.yj) r6
            java.util.List r4 = r6.d
            if (r4 != 0) goto L66
            ii5$a r4 = r6.c
            defpackage.zq3.e(r4)
            q8$c r4 = (q8.c) r4
            q8$b r4 = r4.a()
            if (r4 == 0) goto L64
            java.lang.String r4 = r4.a()
            goto L65
        L64:
            r4 = 0
        L65:
            return r4
        L66:
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            q22 r4 = (defpackage.q22) r4
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r4 = r4.b()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator.c(java.lang.String, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$unsubscribeFromNewsletter$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$unsubscribeFromNewsletter$1 r0 = (com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$unsubscribeFromNewsletter$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$unsubscribeFromNewsletter$1 r0 = new com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator$unsubscribeFromNewsletter$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            com.apollographql.apollo.ApolloClient r6 = r4.a
            pw6 r4 = r4.b(r5)
            com.apollographql.apollo.ApolloCall r4 = r6.G(r4)
            r0.label = r3
            java.lang.Object r6 = com.nytimes.android.apolloschema.ExtensionsKt.a(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            yj r6 = (defpackage.yj) r6
            ii5$a r4 = r6.c
            pw6$b r4 = (pw6.b) r4
            if (r4 == 0) goto L55
            pw6$c r4 = r4.a()
            if (r4 != 0) goto L5a
        L55:
            r4 = 0
            java.lang.Boolean r4 = defpackage.cc0.a(r4)
        L5a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator.d(java.lang.String, by0):java.lang.Object");
    }
}
