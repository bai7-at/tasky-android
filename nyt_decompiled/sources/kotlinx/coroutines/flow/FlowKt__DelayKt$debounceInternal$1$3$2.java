package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef<Object> ref$ObjectRef, FlowCollector<? super T> flowCollector, by0<? super FlowKt__DelayKt$debounceInternal$1$3$2> by0Var) {
        super(2, by0Var);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, by0Var);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m919invokeWpGqRn0(((ChannelResult) obj).m904unboximpl(), (by0) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m919invokeWpGqRn0(Object obj, by0<? super ww8> by0Var) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(ChannelResult.m892boximpl(obj), by0Var)).invokeSuspend(ww8.a);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [T, kotlinx.coroutines.internal.Symbol] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ?? m904unboximpl = ((ChannelResult) this.L$0).m904unboximpl();
            ref$ObjectRef = this.$lastValue;
            boolean z = m904unboximpl instanceof ChannelResult.Failed;
            if (!z) {
                ref$ObjectRef.element = m904unboximpl;
            }
            FlowCollector<T> flowCollector = this.$downstream;
            if (z) {
                Throwable m896exceptionOrNullimpl = ChannelResult.m896exceptionOrNullimpl(m904unboximpl);
                if (m896exceptionOrNullimpl != null) {
                    throw m896exceptionOrNullimpl;
                }
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    if (obj2 == NullSurrogateKt.NULL) {
                        obj2 = null;
                    }
                    this.L$0 = m904unboximpl;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    if (flowCollector.emit(obj2, this) == h) {
                        return h;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.element = NullSurrogateKt.DONE;
            }
            return ww8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
        f.b(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.element = NullSurrogateKt.DONE;
        return ww8.a;
    }
}
