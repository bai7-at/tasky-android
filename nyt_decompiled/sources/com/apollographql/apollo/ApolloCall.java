package com.apollographql.apollo;

import defpackage.by0;
import defpackage.ii5;
import defpackage.xj;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class ApolloCall {
    private final ApolloClient a;
    private final xj.a b;

    public ApolloCall(ApolloClient apolloClient, xj.a aVar) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(aVar, "requestBuilder");
        this.a = apolloClient;
        this.b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlinx.coroutines.flow.Flow r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.apollographql.apollo.ApolloCall$singleSuccessOrException$1
            if (r0 == 0) goto L13
            r0 = r6
            com.apollographql.apollo.ApolloCall$singleSuccessOrException$1 r0 = (com.apollographql.apollo.ApolloCall$singleSuccessOrException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.apollographql.apollo.ApolloCall$singleSuccessOrException$1 r0 = new com.apollographql.apollo.ApolloCall$singleSuccessOrException$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2a
            kotlin.f.b(r4)
            goto L3e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.f.b(r4)
            r0.label = r3
            java.lang.Object r4 = kotlinx.coroutines.flow.FlowKt.toList$default(r5, r2, r0, r3, r2)
            if (r4 != r6) goto L3e
            return r6
        L3e:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L50:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r4.next()
            r1 = r0
            yj r1 = (defpackage.yj) r1
            com.apollographql.apollo.exception.ApolloException r1 = r1.e
            if (r1 == 0) goto L65
            r5.add(r0)
            goto L50
        L65:
            r6.add(r0)
            goto L50
        L69:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r5, r6)
            java.lang.Object r5 = r4.a()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r4.b()
            java.util.List r4 = (java.util.List) r4
            int r6 = r4.size()
            r0 = 2
            if (r6 == 0) goto L92
            if (r6 != r3) goto L8a
            java.lang.Object r4 = kotlin.collections.i.k0(r4)
            yj r4 = (defpackage.yj) r4
            goto Ld9
        L8a:
            com.apollographql.apollo.exception.DefaultApolloException r4 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.String r5 = "The operation returned multiple items, use .toFlow() instead of .execute()"
            r4.<init>(r5, r2, r0, r2)
            throw r4
        L92:
            int r4 = r5.size()
            if (r4 == 0) goto Lda
            if (r4 == r3) goto Ld3
            java.lang.Object r4 = kotlin.collections.i.k0(r5)
            yj r4 = (defpackage.yj) r4
            yj$a r6 = r4.d()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.i.e0(r5, r3)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            com.apollographql.apollo.exception.ApolloException r4 = r4.e
            defpackage.zq3.e(r4)
            java.util.Iterator r5 = r5.iterator()
        Lb5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r5.next()
            yj r0 = (defpackage.yj) r0
            com.apollographql.apollo.exception.ApolloException r0 = r0.e
            defpackage.zq3.e(r0)
            defpackage.g62.a(r4, r0)
            goto Lb5
        Lca:
            yj$a r4 = r6.e(r4)
            yj r4 = r4.b()
            goto Ld9
        Ld3:
            java.lang.Object r4 = kotlin.collections.i.k0(r5)
            yj r4 = (defpackage.yj) r4
        Ld9:
            return r4
        Lda:
            com.apollographql.apollo.exception.DefaultApolloException r4 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.String r5 = "The operation did not emit any item, check your interceptor chain"
            r4.<init>(r5, r2, r0, r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ApolloCall.c(kotlinx.coroutines.flow.Flow, by0):java.lang.Object");
    }

    public final Object b(by0 by0Var) {
        return c(d(), by0Var);
    }

    public final Flow d() {
        return this.a.h(this.b.b(), false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApolloCall(ApolloClient apolloClient, ii5 ii5Var) {
        this(apolloClient, new xj.a(ii5Var));
        zq3.h(apolloClient, "apolloClient");
        zq3.h(ii5Var, "operation");
    }
}
