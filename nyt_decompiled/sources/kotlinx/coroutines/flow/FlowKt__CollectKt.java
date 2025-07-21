package kotlinx.coroutines.flow;

import defpackage.bk3;
import defpackage.by0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowKt__CollectKt {
    public static final Object collect(Flow<?> flow, by0<? super ww8> by0Var) {
        Object collect = flow.collect(NopCollector.INSTANCE, by0Var);
        return collect == a.h() ? collect : ww8.a;
    }

    private static final /* synthetic */ <T> Object collect$$forInline(Flow<? extends T> flow, gt2 gt2Var, by0<? super ww8> by0Var) {
        FlowKt__CollectKt$collect$3 flowKt__CollectKt$collect$3 = new FlowKt__CollectKt$collect$3(gt2Var);
        bk3.c(0);
        flow.collect(flowKt__CollectKt$collect$3, by0Var);
        bk3.c(1);
        return ww8.a;
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, it2 it2Var, by0<? super ww8> by0Var) {
        Object collect = flow.collect(new FlowKt__CollectKt$collectIndexed$2(it2Var), by0Var);
        return collect == a.h() ? collect : ww8.a;
    }

    private static final <T> Object collectIndexed$$forInline(Flow<? extends T> flow, it2 it2Var, by0<? super ww8> by0Var) {
        FlowKt__CollectKt$collectIndexed$2 flowKt__CollectKt$collectIndexed$2 = new FlowKt__CollectKt$collectIndexed$2(it2Var);
        bk3.c(0);
        flow.collect(flowKt__CollectKt$collectIndexed$2, by0Var);
        bk3.c(1);
        return ww8.a;
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, gt2 gt2Var, by0<? super ww8> by0Var) {
        Object collect = FlowKt.collect(FlowKt__ContextKt.buffer$default(FlowKt.mapLatest(flow, gt2Var), 0, null, 2, null), by0Var);
        return collect == a.h() ? collect : ww8.a;
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, by0<? super ww8> by0Var) {
        FlowKt.ensureActive(flowCollector);
        Object collect = flow.collect(flowCollector, by0Var);
        return collect == a.h() ? collect : ww8.a;
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3, null);
        return launch$default;
    }

    public static final /* synthetic */ <T> Object collect(Flow<? extends T> flow, gt2 gt2Var, by0<? super ww8> by0Var) {
        Object collect = flow.collect(new FlowKt__CollectKt$collect$3(gt2Var), by0Var);
        return collect == a.h() ? collect : ww8.a;
    }
}
