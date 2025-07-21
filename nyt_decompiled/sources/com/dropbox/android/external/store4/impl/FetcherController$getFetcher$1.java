package com.dropbox.android.external.store4.impl;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.FetcherController$getFetcher$1", f = "FetcherController.kt", l = {99, 101, 103, 103}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FetcherController$getFetcher$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $key;
    final /* synthetic */ boolean $piggybackOnly;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FetcherController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetcherController$getFetcher$1(FetcherController fetcherController, Object obj, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fetcherController;
        this.$key = obj;
        this.$piggybackOnly = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FetcherController$getFetcher$1 fetcherController$getFetcher$1 = new FetcherController$getFetcher$1(this.this$0, this.$key, this.$piggybackOnly, by0Var);
        fetcherController$getFetcher$1.L$0 = obj;
        return fetcherController$getFetcher$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3e
            if (r1 == r5) goto L36
            if (r1 == r4) goto L29
            if (r1 == r3) goto L25
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1c:
            java.lang.Object r8 = r8.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.f.b(r9)
            goto L95
        L25:
            kotlin.f.b(r9)
            goto L7d
        L29:
            java.lang.Object r1 = r8.L$0
            com.dropbox.flow.multicast.Multicaster r1 = (com.dropbox.flow.multicast.Multicaster) r1
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L69
        L31:
            r9 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
            goto L81
        L36:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r9)
            goto L55
        L3e:
            kotlin.f.b(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            com.dropbox.android.external.store4.impl.FetcherController r9 = r8.this$0
            java.lang.Object r6 = r8.$key
            r8.L$0 = r1
            r8.label = r5
            java.lang.Object r9 = com.dropbox.android.external.store4.impl.FetcherController.a(r9, r6, r8)
            if (r9 != r0) goto L55
            return r0
        L55:
            com.dropbox.flow.multicast.Multicaster r9 = (com.dropbox.flow.multicast.Multicaster) r9
            boolean r5 = r8.$piggybackOnly     // Catch: java.lang.Throwable -> L80
            kotlinx.coroutines.flow.Flow r5 = r9.i(r5)     // Catch: java.lang.Throwable -> L80
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L80
            r8.label = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.emitAll(r1, r5, r8)     // Catch: java.lang.Throwable -> L80
            if (r1 != r0) goto L68
            return r0
        L68:
            r1 = r9
        L69:
            com.dropbox.android.external.store4.impl.FetcherController r9 = r8.this$0
            com.dropbox.android.external.store4.impl.RefCountedResource r9 = com.dropbox.android.external.store4.impl.FetcherController.b(r9)
            java.lang.Object r2 = r8.$key
            r4 = 0
            r8.L$0 = r4
            r8.label = r3
            java.lang.Object r8 = r9.b(r2, r1, r8)
            if (r8 != r0) goto L7d
            return r0
        L7d:
            ww8 r8 = defpackage.ww8.a
            return r8
        L80:
            r1 = move-exception
        L81:
            com.dropbox.android.external.store4.impl.FetcherController r3 = r8.this$0
            com.dropbox.android.external.store4.impl.RefCountedResource r3 = com.dropbox.android.external.store4.impl.FetcherController.b(r3)
            java.lang.Object r4 = r8.$key
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r8 = r3.b(r4, r9, r8)
            if (r8 != r0) goto L94
            return r0
        L94:
            r8 = r1
        L95:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.FetcherController$getFetcher$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((FetcherController$getFetcher$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
