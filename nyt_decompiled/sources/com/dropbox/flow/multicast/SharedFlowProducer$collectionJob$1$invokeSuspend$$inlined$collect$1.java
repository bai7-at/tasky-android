package com.dropbox.flow.multicast;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 implements FlowCollector {
    final /* synthetic */ SharedFlowProducer a;

    @fc1(c = "com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1", f = "SharedFlowProducer.kt", l = {136, 143}, m = "emit")
    /* renamed from: com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(by0 by0Var) {
            super(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1(SharedFlowProducer sharedFlowProducer) {
        this.a = sharedFlowProducer;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r7, defpackage.by0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1$1 r0 = (com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1$1 r0 = new com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r8)
            goto L66
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.CompletableDeferred r6 = (kotlinx.coroutines.CompletableDeferred) r6
            kotlin.f.b(r8)
            goto L5b
        L3d:
            kotlin.f.b(r8)
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r4, r5, r4)
            com.dropbox.flow.multicast.SharedFlowProducer r6 = r6.a
            gt2 r6 = com.dropbox.flow.multicast.SharedFlowProducer.b(r6)
            com.dropbox.flow.multicast.ChannelManager$b$b$c r2 = new com.dropbox.flow.multicast.ChannelManager$b$b$c
            r2.<init>(r7, r8)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            r6 = r8
        L5b:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L66
            return r1
        L66:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, by0):java.lang.Object");
    }
}
