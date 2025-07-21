package kotlinx.coroutines.flow;

import defpackage.ak7;
import defpackage.an3;
import defpackage.by0;
import defpackage.gt2;
import defpackage.hb4;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowKt__BuildersKt {
    public static final <T> Flow<T> asFlow(final qs2 qs2Var) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
                Object emit = flowCollector.emit(qs2.this.mo865invoke(), by0Var);
                return emit == a.h() ? emit : ww8.a;
            }
        };
    }

    public static final <T> Flow<T> callbackFlow(gt2 gt2Var) {
        return new CallbackFlowBuilder(gt2Var, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> channelFlow(gt2 gt2Var) {
        return new ChannelFlowBuilder(gt2Var, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> emptyFlow() {
        return EmptyFlow.INSTANCE;
    }

    public static final <T> Flow<T> flow(gt2 gt2Var) {
        return new SafeFlow(gt2Var);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }

    public static final <T> Flow<T> asFlow(ss2 ss2Var) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(ss2Var);
    }

    public static final <T> Flow<T> flowOf(final T t) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
                Object emit = flowCollector.emit((Object) t, by0Var);
                return emit == a.h() ? emit : ww8.a;
            }
        };
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it2) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it2);
    }

    public static final <T> Flow<T> asFlow(ak7 ak7Var) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(ak7Var);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    public static final Flow<Integer> asFlow(an3 an3Var) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(an3Var);
    }

    public static final Flow<Long> asFlow(hb4 hb4Var) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(hb4Var);
    }
}
