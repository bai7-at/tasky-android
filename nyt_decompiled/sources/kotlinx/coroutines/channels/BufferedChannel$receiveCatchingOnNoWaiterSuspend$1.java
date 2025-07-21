package kotlinx.coroutines.channels;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3064}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes5.dex */
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, by0<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> by0Var) {
        super(by0Var);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m885receiveCatchingOnNoWaiterSuspendGKJJFZk;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        m885receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m885receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return m885receiveCatchingOnNoWaiterSuspendGKJJFZk == a.h() ? m885receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m892boximpl(m885receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
