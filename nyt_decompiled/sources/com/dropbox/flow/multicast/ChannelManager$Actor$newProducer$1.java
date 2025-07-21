package com.dropbox.flow.multicast;

import com.dropbox.flow.multicast.ChannelManager;
import defpackage.by0;
import defpackage.gt2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
/* synthetic */ class ChannelManager$Actor$newProducer$1 extends FunctionReferenceImpl implements gt2 {
    ChannelManager$Actor$newProducer$1(Object obj) {
        super(2, obj, ChannelManager.Actor.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.gt2
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ChannelManager.b bVar, by0 by0Var) {
        return ((ChannelManager.Actor) this.receiver).g(bVar, by0Var);
    }
}
