package com.dropbox.android.external.store4.impl;

import defpackage.a38;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.RealStore$stream$1", f = "RealStore.kt", l = {105, 120}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RealStore$stream$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ a38 $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RealStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealStore$stream$1(a38 a38Var, RealStore realStore, by0 by0Var) {
        super(2, by0Var);
        this.$request = a38Var;
        this.this$0 = realStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        RealStore$stream$1 realStore$stream$1 = new RealStore$stream$1(this.$request, this.this$0, by0Var);
        realStore$stream$1.L$0 = obj;
        return realStore$stream$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003a, code lost:
    
        r13 = r12.this$0.c;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.f.b(r13)
            goto Lad
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L1c:
            java.lang.Object r1 = r12.L$1
            java.lang.Object r5 = r12.L$0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.f.b(r13)
            goto L50
        L26:
            kotlin.f.b(r13)
            java.lang.Object r13 = r12.L$0
            r5 = r13
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            a38 r13 = r12.$request
            com.dropbox.android.external.store4.CacheType r1 = com.dropbox.android.external.store4.CacheType.MEMORY
            boolean r13 = r13.d(r1)
            if (r13 == 0) goto L3a
        L38:
            r1 = r4
            goto L4e
        L3a:
            com.dropbox.android.external.store4.impl.RealStore r13 = r12.this$0
            dg0 r13 = com.dropbox.android.external.store4.impl.RealStore.e(r13)
            if (r13 != 0) goto L43
            goto L38
        L43:
            a38 r1 = r12.$request
            java.lang.Object r1 = r1.b()
            java.lang.Object r13 = r13.e(r1)
            r1 = r13
        L4e:
            if (r1 != 0) goto L52
        L50:
            r9 = r1
            goto L66
        L52:
            b38$a r13 = new b38$a
            com.dropbox.android.external.store4.ResponseOrigin r6 = com.dropbox.android.external.store4.ResponseOrigin.Cache
            r13.<init>(r1, r6)
            r12.L$0 = r5
            r12.L$1 = r1
            r12.label = r3
            java.lang.Object r13 = r5.emit(r13, r12)
            if (r13 != r0) goto L50
            return r0
        L66:
            com.dropbox.android.external.store4.impl.RealStore r13 = r12.this$0
            com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier r13 = com.dropbox.android.external.store4.impl.RealStore.f(r13)
            if (r13 != 0) goto L84
            a38 r13 = r12.$request
            boolean r13 = r13.c()
            if (r13 != 0) goto L79
            if (r9 == 0) goto L79
            goto L7a
        L79:
            r3 = 0
        L7a:
            com.dropbox.android.external.store4.impl.RealStore r13 = r12.this$0
            a38 r1 = r12.$request
            kotlinx.coroutines.flow.Flow r13 = com.dropbox.android.external.store4.impl.RealStore.c(r13, r1, r4, r3)
        L82:
            r7 = r13
            goto L91
        L84:
            com.dropbox.android.external.store4.impl.RealStore r13 = r12.this$0
            a38 r1 = r12.$request
            com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier r3 = com.dropbox.android.external.store4.impl.RealStore.f(r13)
            kotlinx.coroutines.flow.Flow r13 = com.dropbox.android.external.store4.impl.RealStore.d(r13, r1, r3)
            goto L82
        L91:
            com.dropbox.android.external.store4.impl.RealStore r10 = r12.this$0
            a38 r11 = r12.$request
            com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1 r13 = new com.dropbox.android.external.store4.impl.RealStore$stream$1$invokeSuspend$$inlined$transform$1
            r8 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.Flow r13 = kotlinx.coroutines.flow.FlowKt.flow(r13)
            r12.L$0 = r4
            r12.L$1 = r4
            r12.label = r2
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.emitAll(r5, r13, r12)
            if (r12 != r0) goto Lad
            return r0
        Lad:
            ww8 r12 = defpackage.ww8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.RealStore$stream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((RealStore$stream$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
