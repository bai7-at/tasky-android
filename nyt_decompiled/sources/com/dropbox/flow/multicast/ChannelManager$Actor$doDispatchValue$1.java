package com.dropbox.flow.multicast;

import androidx.recyclerview.widget.RecyclerView;
import com.dropbox.flow.multicast.ChannelManager;
import com.dropbox.flow.multicast.ChannelManager.Actor;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.dropbox.flow.multicast.ChannelManager$Actor", f = "ChannelManager.kt", l = {181, 190}, m = "doDispatchValue")
/* loaded from: classes2.dex */
final class ChannelManager$Actor$doDispatchValue$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Actor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelManager$Actor$doDispatchValue$1(ChannelManager.Actor actor, by0 by0Var) {
        super(by0Var);
        this.this$0 = actor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        o = this.this$0.o(null, this);
        return o;
    }
}
