package com.dropbox.flow.multicast;

import com.comscore.streaming.ContentType;
import com.dropbox.flow.multicast.ChannelManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.flow.multicast.Multicaster$newDownstream$2$subFlow$3", f = "Multicaster.kt", l = {ContentType.LONG_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Multicaster$newDownstream$2$subFlow$3 extends SuspendLambda implements it2 {
    final /* synthetic */ Channel<ChannelManager.b.AbstractC0166b.c> $channel;
    int label;
    final /* synthetic */ Multicaster this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Multicaster$newDownstream$2$subFlow$3(Multicaster multicaster, Channel channel, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = multicaster;
        this.$channel = channel;
    }

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
                this.label = 1;
                if (h.i(channel, this) == h2) {
                    return h2;
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

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        return new Multicaster$newDownstream$2$subFlow$3(this.this$0, this.$channel, by0Var).invokeSuspend(ww8.a);
    }
}
