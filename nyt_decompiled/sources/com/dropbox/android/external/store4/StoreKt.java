package com.dropbox.android.external.store4;

/* loaded from: classes2.dex */
public abstract class StoreKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.m28 r4, java.lang.Object r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof com.dropbox.android.external.store4.StoreKt$fresh$1
            if (r0 == 0) goto L13
            r0 = r6
            com.dropbox.android.external.store4.StoreKt$fresh$1 r0 = (com.dropbox.android.external.store4.StoreKt$fresh$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dropbox.android.external.store4.StoreKt$fresh$1 r0 = new com.dropbox.android.external.store4.StoreKt$fresh$1
            r0.<init>(r6)
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
            a38$a r6 = defpackage.a38.d
            a38 r5 = r6.b(r5)
            kotlinx.coroutines.flow.Flow r4 = r4.a(r5)
            com.dropbox.android.external.store4.StoreKt$fresh$$inlined$filterNot$1 r5 = new com.dropbox.android.external.store4.StoreKt$fresh$$inlined$filterNot$1
            r5.<init>()
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.first(r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            b38 r6 = (defpackage.b38) r6
            java.lang.Object r4 = r6.c()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.StoreKt.a(m28, java.lang.Object, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.m28 r4, java.lang.Object r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof com.dropbox.android.external.store4.StoreKt$get$1
            if (r0 == 0) goto L13
            r0 = r6
            com.dropbox.android.external.store4.StoreKt$get$1 r0 = (com.dropbox.android.external.store4.StoreKt$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dropbox.android.external.store4.StoreKt$get$1 r0 = new com.dropbox.android.external.store4.StoreKt$get$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L4d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            a38$a r6 = defpackage.a38.d
            r2 = 0
            a38 r5 = r6.a(r5, r2)
            kotlinx.coroutines.flow.Flow r4 = r4.a(r5)
            com.dropbox.android.external.store4.StoreKt$get$$inlined$filterNot$1 r5 = new com.dropbox.android.external.store4.StoreKt$get$$inlined$filterNot$1
            r5.<init>()
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.first(r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            b38 r6 = (defpackage.b38) r6
            java.lang.Object r4 = r6.c()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.StoreKt.b(m28, java.lang.Object, by0):java.lang.Object");
    }
}
