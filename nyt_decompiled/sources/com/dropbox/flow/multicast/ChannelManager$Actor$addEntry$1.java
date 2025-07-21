package com.dropbox.flow.multicast;

import androidx.recyclerview.widget.RecyclerView;
import com.dropbox.flow.multicast.ChannelManager;
import com.dropbox.flow.multicast.ChannelManager.Actor;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.dropbox.flow.multicast.ChannelManager$Actor", f = "ChannelManager.kt", l = {260}, m = "addEntry")
/* loaded from: classes2.dex */
final class ChannelManager$Actor$addEntry$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Actor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelManager$Actor$addEntry$1(ChannelManager.Actor actor, by0 by0Var) {
        super(by0Var);
        this.this$0 = actor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        l = this.this$0.l(null, this);
        return l;
    }
}
