package com.nytimes.android.coroutinesutils;

import defpackage.l28;
import defpackage.zq3;

/* loaded from: classes4.dex */
final class StoreWrapperImpl implements d {
    private final l28 a;

    public StoreWrapperImpl(l28 l28Var) {
        zq3.h(l28Var, "store");
        this.a = l28Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.nytimes.android.coroutinesutils.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.Object r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.coroutinesutils.StoreWrapperImpl$get$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.coroutinesutils.StoreWrapperImpl$get$1 r0 = (com.nytimes.android.coroutinesutils.StoreWrapperImpl$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.coroutinesutils.StoreWrapperImpl$get$1 r0 = new com.nytimes.android.coroutinesutils.StoreWrapperImpl$get$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            l28 r4 = r4.a
            io.reactivex.Single r4 = r4.get(r5)
            java.lang.String r5 = "get(...)"
            defpackage.zq3.g(r4, r5)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.rx2.RxAwaitKt.await(r4, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r4 = "await(...)"
            defpackage.zq3.g(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.StoreWrapperImpl.a(java.lang.Object, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.nytimes.android.coroutinesutils.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.Object r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.coroutinesutils.StoreWrapperImpl$fetch$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.coroutinesutils.StoreWrapperImpl$fetch$1 r0 = (com.nytimes.android.coroutinesutils.StoreWrapperImpl$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.coroutinesutils.StoreWrapperImpl$fetch$1 r0 = new com.nytimes.android.coroutinesutils.StoreWrapperImpl$fetch$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            l28 r4 = r4.a
            io.reactivex.Single r4 = r4.fetch(r5)
            java.lang.String r5 = "fetch(...)"
            defpackage.zq3.g(r4, r5)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.rx2.RxAwaitKt.await(r4, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r4 = "await(...)"
            defpackage.zq3.g(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.StoreWrapperImpl.b(java.lang.Object, by0):java.lang.Object");
    }
}
