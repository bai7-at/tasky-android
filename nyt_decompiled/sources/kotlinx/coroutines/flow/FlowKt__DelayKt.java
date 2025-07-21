package kotlinx.coroutines.flow;

import defpackage.ss2;
import defpackage.ww8;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowKt__DelayKt {
    /* JADX WARN: Multi-variable type inference failed */
    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, final long j) {
        if (j >= 0) {
            return j == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new ss2() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public final Long invoke(T t) {
                    return Long.valueOf(j);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((FlowKt__DelayKt$debounce$2) obj);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    @FlowPreview
    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m915debounceHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt.debounce(flow, DelayKt.m873toDelayMillisLRDsOJo(j));
    }

    @FlowPreview
    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, final ss2 ss2Var) {
        return debounceInternal$FlowKt__DelayKt(flow, new ss2() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((FlowKt__DelayKt$debounce$3) obj);
            }

            @Override // defpackage.ss2
            public final Long invoke(T t) {
                return Long.valueOf(DelayKt.m873toDelayMillisLRDsOJo(((b) ss2.this.invoke(t)).N()));
            }
        });
    }

    private static final <T> Flow<T> debounceInternal$FlowKt__DelayKt(Flow<? extends T> flow, ss2 ss2Var) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(ss2Var, flow, null));
    }

    public static final ReceiveChannel<ww8> fixedPeriodTicker(CoroutineScope coroutineScope, long j) {
        return ProduceKt.produce$default(coroutineScope, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(j, null), 1, null);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j) {
        if (j > 0) {
            return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$sample$2(j, flow, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    @FlowPreview
    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m916sampleHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt.sample(flow, DelayKt.m873toDelayMillisLRDsOJo(j));
    }

    @FlowPreview
    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m917timeoutHG0u8IE(Flow<? extends T> flow, long j) {
        return m918timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j);
    }

    /* renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> Flow<T> m918timeoutInternalHG0u8IE$FlowKt__DelayKt(Flow<? extends T> flow, long j) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j, flow, null));
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, ss2 ss2Var) {
        return debounceInternal$FlowKt__DelayKt(flow, ss2Var);
    }
}
