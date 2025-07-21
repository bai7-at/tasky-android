package com.nytimes.android.dailyfive.util;

/* loaded from: classes4.dex */
public abstract class StoreWrapperKtxKt {
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|(2:13|14)|16)(2:17|18))(2:19|20))(3:23|24|(1:26))|21|16))|34|6|7|(0)(0)|21|16) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r5.a() == 304) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r5 = r6.d(r7);
        defpackage.zq3.g(r5, "read(...)");
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 2;
        r8 = kotlinx.coroutines.rx2.RxAwaitKt.awaitSingleOrNull(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.nytimes.android.coroutinesutils.d r5, defpackage.js5 r6, java.lang.Object r7, defpackage.by0 r8) {
        /*
            boolean r0 = r8 instanceof com.nytimes.android.dailyfive.util.StoreWrapperKtxKt$fetchFromGraphQL$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.dailyfive.util.StoreWrapperKtxKt$fetchFromGraphQL$1 r0 = (com.nytimes.android.dailyfive.util.StoreWrapperKtxKt$fetchFromGraphQL$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.dailyfive.util.StoreWrapperKtxKt$fetchFromGraphQL$1 r0 = new com.nytimes.android.dailyfive.util.StoreWrapperKtxKt$fetchFromGraphQL$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L70
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r7 = r0.L$1
            java.lang.Object r5 = r0.L$0
            r6 = r5
            js5 r6 = (defpackage.js5) r6
            kotlin.f.b(r8)     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L3f
            goto L72
        L3f:
            r5 = move-exception
            goto L51
        L41:
            kotlin.f.b(r8)
            r0.L$0 = r6     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L3f
            r0.L$1 = r7     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L3f
            r0.label = r4     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L3f
            java.lang.Object r8 = r5.b(r7, r0)     // Catch: com.apollographql.apollo.exception.ApolloHttpException -> L3f
            if (r8 != r1) goto L72
            return r1
        L51:
            int r8 = r5.a()
            r2 = 304(0x130, float:4.26E-43)
            if (r8 != r2) goto L7b
            io.reactivex.Maybe r5 = r6.d(r7)
            java.lang.String r6 = "read(...)"
            defpackage.zq3.g(r5, r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.rx2.RxAwaitKt.awaitSingleOrNull(r5, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            if (r8 == 0) goto L73
        L72:
            return r8
        L73:
            com.nytimes.android.dailyfive.util.CachedDataNotAvailableException r5 = new com.nytimes.android.dailyfive.util.CachedDataNotAvailableException
            java.lang.String r6 = "304 error with no data available in cache"
            r5.<init>(r6)
            throw r5
        L7b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.dailyfive.util.StoreWrapperKtxKt.a(com.nytimes.android.coroutinesutils.d, js5, java.lang.Object, by0):java.lang.Object");
    }
}
