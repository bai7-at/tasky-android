package com.nytimes.android.subauth.core.purchase.storefront;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getPurchases$2", f = "GoogleStoreFront.kt", l = {170, 172, 173, 180}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleStoreFront$getPurchases$2 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ GoogleStoreFront this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleStoreFront$getPurchases$2(GoogleStoreFront googleStoreFront, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = googleStoreFront;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GoogleStoreFront$getPurchases$2(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00d1 -> B:8:0x00d2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.purchase.storefront.GoogleStoreFront$getPurchases$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GoogleStoreFront$getPurchases$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
