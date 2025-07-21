package kotlinx.coroutines.channels;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

@fc1(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", l = {288}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class BroadcastChannelImpl$registerSelectForSend$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $element;
    final /* synthetic */ SelectInstance<?> $select;
    int label;
    final /* synthetic */ BroadcastChannelImpl<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BroadcastChannelImpl$registerSelectForSend$2(BroadcastChannelImpl<E> broadcastChannelImpl, Object obj, SelectInstance<?> selectInstance, by0<? super BroadcastChannelImpl$registerSelectForSend$2> by0Var) {
        super(2, by0Var);
        this.this$0 = broadcastChannelImpl;
        this.$element = obj;
        this.$select = selectInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new BroadcastChannelImpl$registerSelectForSend$2(this.this$0, this.$element, this.$select, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        HashMap hashMap2;
        Object h = a.h();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                f.b(obj);
                BroadcastChannel broadcastChannel = this.this$0;
                Object obj2 = this.$element;
                this.label = 1;
                if (broadcastChannel.send(obj2, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
        } catch (Throwable th) {
            if (!this.this$0.isClosedForSend() || (!(th instanceof ClosedSendChannelException) && this.this$0.getSendException() != th)) {
                throw th;
            }
            z = false;
        }
        ReentrantLock reentrantLock = ((BroadcastChannelImpl) this.this$0).lock;
        BroadcastChannelImpl<E> broadcastChannelImpl = this.this$0;
        SelectInstance<?> selectInstance = this.$select;
        reentrantLock.lock();
        try {
            hashMap = ((BroadcastChannelImpl) broadcastChannelImpl).onSendInternalResult;
            hashMap.put(selectInstance, z ? ww8.a : BufferedChannelKt.getCHANNEL_CLOSED());
            zq3.f(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            Object obj3 = ww8.a;
            if (((SelectImplementation) selectInstance).trySelectDetailed(broadcastChannelImpl, obj3) != TrySelectDetailedResult.REREGISTER) {
                hashMap2 = ((BroadcastChannelImpl) broadcastChannelImpl).onSendInternalResult;
                hashMap2.remove(selectInstance);
            }
            reentrantLock.unlock();
            return obj3;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((BroadcastChannelImpl$registerSelectForSend$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
