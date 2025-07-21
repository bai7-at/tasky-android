package com.dropbox.flow.multicast;

import com.dropbox.flow.multicast.ChannelManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.flow.multicast.Multicaster$newDownstream$2$subFlow$1", f = "Multicaster.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Multicaster$newDownstream$2$subFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Channel<ChannelManager.b.AbstractC0166b.c> $channel;
    final /* synthetic */ boolean $piggybackOnly;
    int label;
    final /* synthetic */ Multicaster this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Multicaster$newDownstream$2$subFlow$1(Multicaster multicaster, Channel channel, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = multicaster;
        this.$channel = channel;
        this.$piggybackOnly = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new Multicaster$newDownstream$2$subFlow$1(this.this$0, this.$channel, this.$piggybackOnly, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChannelManager h;
        Object h2 = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                h = this.this$0.h();
                Channel<ChannelManager.b.AbstractC0166b.c> channel = this.$channel;
                boolean z = this.$piggybackOnly;
                this.label = 1;
                Object g = h.g(channel, z, this);
                this = g;
                if (g == h2) {
                    return h2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                this = this;
            }
        } catch (ClosedSendChannelException unused) {
            SendChannel.DefaultImpls.close$default(this.$channel, null, 1, null);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((Multicaster$newDownstream$2$subFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
