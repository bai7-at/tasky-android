package com.dropbox.flow.multicast;

import com.dropbox.flow.multicast.ChannelManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1", f = "SharedFlowProducer.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SharedFlowProducer$collectionJob$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SharedFlowProducer this$0;

    @fc1(c = "com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$1", f = "SharedFlowProducer.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.dropbox.flow.multicast.SharedFlowProducer$collectionJob$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SharedFlowProducer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SharedFlowProducer sharedFlowProducer, by0 by0Var) {
            super(3, by0Var);
            this.this$0 = sharedFlowProducer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            gt2 gt2Var;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Throwable th = (Throwable) this.L$0;
                gt2Var = this.this$0.c;
                ChannelManager.b.AbstractC0166b.a aVar = new ChannelManager.b.AbstractC0166b.a(th);
                this.label = 1;
                if (gt2Var.invoke(aVar, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, by0Var);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedFlowProducer$collectionJob$1(SharedFlowProducer sharedFlowProducer, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = sharedFlowProducer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SharedFlowProducer$collectionJob$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flow;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                flow = this.this$0.b;
                Flow m911catch = FlowKt.m911catch(flow, new AnonymousClass1(this.this$0, null));
                SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 = new SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1(this.this$0);
                this.label = 1;
                if (m911catch.collect(sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
        } catch (ClosedSendChannelException unused) {
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SharedFlowProducer$collectionJob$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
