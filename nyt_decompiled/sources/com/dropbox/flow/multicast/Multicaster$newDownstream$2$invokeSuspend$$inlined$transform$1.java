package com.dropbox.flow.multicast;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1", f = "Multicaster.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 implements FlowCollector {
        final /* synthetic */ FlowCollector a;

        @fc1(c = "com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1$1", f = "Multicaster.kt", l = {136}, m = "emit")
        /* renamed from: com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01681 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C01681(by0 by0Var) {
                super(by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= RecyclerView.UNDEFINED_DURATION;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector) {
            this.a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1.AnonymousClass1.C01681
                if (r0 == 0) goto L13
                r0 = r6
                com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1$1$1 r0 = (com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1.AnonymousClass1.C01681) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1$1$1 r0 = new com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1$1$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.L$0
                com.dropbox.flow.multicast.ChannelManager$b$b$c r4 = (com.dropbox.flow.multicast.ChannelManager.b.AbstractC0166b.c) r4
                kotlin.f.b(r6)
                goto L4c
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.f.b(r6)
                kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                com.dropbox.flow.multicast.ChannelManager$b$b$c r5 = (com.dropbox.flow.multicast.ChannelManager.b.AbstractC0166b.c) r5
                java.lang.Object r6 = r5.b()
                r0.L$0 = r5
                r0.label = r3
                java.lang.Object r4 = r4.emit(r6, r0)
                if (r4 != r1) goto L4b
                return r1
            L4b:
                r4 = r5
            L4c:
                kotlinx.coroutines.CompletableDeferred r4 = r4.a()
                ww8 r5 = defpackage.ww8.a
                r4.complete(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dropbox.flow.multicast.Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, by0):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1(Flow flow, by0 by0Var) {
        super(2, by0Var);
        this.$this_transform = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1 multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1 = new Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1(this.$this_transform, by0Var);
        multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
