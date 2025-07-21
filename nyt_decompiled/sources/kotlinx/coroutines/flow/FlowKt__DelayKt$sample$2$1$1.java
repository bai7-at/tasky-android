package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ ReceiveChannel<ww8> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, ReceiveChannel<ww8> receiveChannel, by0<? super FlowKt__DelayKt$sample$2$1$1> by0Var) {
        super(2, by0Var);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, by0Var);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m920invokeWpGqRn0(((ChannelResult) obj).m904unboximpl(), (by0) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m920invokeWpGqRn0(Object obj, by0<? super ww8> by0Var) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(ChannelResult.m892boximpl(obj), by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, kotlinx.coroutines.internal.Symbol] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ?? m904unboximpl = ((ChannelResult) this.L$0).m904unboximpl();
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
        boolean z = m904unboximpl instanceof ChannelResult.Failed;
        if (!z) {
            ref$ObjectRef.element = m904unboximpl;
        }
        ReceiveChannel<ww8> receiveChannel = this.$ticker;
        if (z) {
            Throwable m896exceptionOrNullimpl = ChannelResult.m896exceptionOrNullimpl(m904unboximpl);
            if (m896exceptionOrNullimpl != null) {
                throw m896exceptionOrNullimpl;
            }
            receiveChannel.cancel((CancellationException) new ChildCancelledException());
            ref$ObjectRef.element = NullSurrogateKt.DONE;
        }
        return ww8.a;
    }
}
