package kotlinx.coroutines.channels;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl")
/* loaded from: classes5.dex */
final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, by0<? super BufferedChannel$receiveCatching$1> by0Var) {
        super(by0Var);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object m884receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m884receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return m884receiveCatchingJP2dKIU$suspendImpl == a.h() ? m884receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m892boximpl(m884receiveCatchingJP2dKIU$suspendImpl);
    }
}
