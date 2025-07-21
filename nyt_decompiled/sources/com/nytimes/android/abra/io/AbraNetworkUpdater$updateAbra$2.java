package com.nytimes.android.abra.io;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.abra.io.AbraNetworkUpdater$updateAbra$2", f = "AbraNetworkUpdater.kt", l = {46, 47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbraNetworkUpdater$updateAbra$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AbraNetworkUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbraNetworkUpdater$updateAbra$2(AbraNetworkUpdater abraNetworkUpdater, by0<? super AbraNetworkUpdater$updateAbra$2> by0Var) {
        super(2, by0Var);
        this.this$0 = abraNetworkUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new AbraNetworkUpdater$updateAbra$2(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079 A[Catch: Exception -> 0x0012, LOOP:0: B:8:0x0073->B:10:0x0079, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0012, blocks: (B:6:0x000e, B:7:0x0065, B:8:0x0073, B:10:0x0079, B:18:0x001c, B:19:0x0032, B:23:0x0023), top: B:2:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L12
            goto L65
        L12:
            r5 = move-exception
            goto L83
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1c:
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L12
            goto L32
        L20:
            kotlin.f.b(r6)
            com.nytimes.android.abra.io.AbraNetworkUpdater r6 = r5.this$0     // Catch: java.lang.Exception -> L12
            com.nytimes.android.abra.utilities.ParamProvider r6 = com.nytimes.android.abra.io.AbraNetworkUpdater.access$getParamProvider$p(r6)     // Catch: java.lang.Exception -> L12
            r5.label = r3     // Catch: java.lang.Exception -> L12
            java.lang.Object r6 = r6.onNetworkUpdate(r5)     // Catch: java.lang.Exception -> L12
            if (r6 != r0) goto L32
            return r0
        L32:
            com.nytimes.android.abra.io.AbraNetworkUpdater r6 = r5.this$0     // Catch: java.lang.Exception -> L12
            b04 r6 = com.nytimes.android.abra.io.AbraNetworkUpdater.access$getStore$p(r6)     // Catch: java.lang.Exception -> L12
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "get(...)"
            defpackage.zq3.g(r6, r1)     // Catch: java.lang.Exception -> L12
            m28 r6 = (defpackage.m28) r6     // Catch: java.lang.Exception -> L12
            com.nytimes.android.abra.models.AbraStoreKey r1 = new com.nytimes.android.abra.models.AbraStoreKey     // Catch: java.lang.Exception -> L12
            com.nytimes.android.abra.io.AbraNetworkUpdater r3 = r5.this$0     // Catch: java.lang.Exception -> L12
            com.nytimes.android.abra.utilities.ParamProvider r3 = com.nytimes.android.abra.io.AbraNetworkUpdater.access$getParamProvider$p(r3)     // Catch: java.lang.Exception -> L12
            java.lang.String r3 = r3.getIntegration()     // Catch: java.lang.Exception -> L12
            com.nytimes.android.abra.io.AbraNetworkUpdater r4 = r5.this$0     // Catch: java.lang.Exception -> L12
            com.nytimes.android.abra.utilities.ParamProvider r4 = com.nytimes.android.abra.io.AbraNetworkUpdater.access$getParamProvider$p(r4)     // Catch: java.lang.Exception -> L12
            java.lang.String r4 = r4.getAbraBundleUrl()     // Catch: java.lang.Exception -> L12
            r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L12
            r5.label = r2     // Catch: java.lang.Exception -> L12
            java.lang.Object r6 = com.dropbox.android.external.store4.StoreKt.a(r6, r1, r5)     // Catch: java.lang.Exception -> L12
            if (r6 != r0) goto L65
            return r0
        L65:
            com.nytimes.android.abra.models.AbraPackage r6 = (com.nytimes.android.abra.models.AbraPackage) r6     // Catch: java.lang.Exception -> L12
            com.nytimes.android.abra.io.AbraNetworkUpdater r5 = r5.this$0     // Catch: java.lang.Exception -> L12
            java.util.List r5 = r5.getListeners()     // Catch: java.lang.Exception -> L12
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L12
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L12
        L73:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Exception -> L12
            com.nytimes.android.abra.io.NetworkUpdateListener r0 = (com.nytimes.android.abra.io.NetworkUpdateListener) r0     // Catch: java.lang.Exception -> L12
            r0.onNetworkUpdate(r6)     // Catch: java.lang.Exception -> L12
            goto L73
        L83:
            com.nytimes.android.abra.utilities.AbraLogger r6 = com.nytimes.android.abra.utilities.AbraLogger.INSTANCE
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to update abra package: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "AbraNetworkUpdater.checkForUpdates"
            r6.e(r5, r0)
        L9f:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.abra.io.AbraNetworkUpdater$updateAbra$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((AbraNetworkUpdater$updateAbra$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
