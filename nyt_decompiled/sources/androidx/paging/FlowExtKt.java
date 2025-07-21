package androidx.paging;

import defpackage.it2;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public abstract class FlowExtKt {
    private static final Object a = new Object();

    public static final Flow b(Flow flow, it2 it2Var) {
        zq3.h(flow, "<this>");
        zq3.h(it2Var, "operation");
        return FlowKt.flow(new FlowExtKt$simpleRunningReduce$1(flow, it2Var, null));
    }

    public static final Flow c(Flow flow, Object obj, it2 it2Var) {
        zq3.h(flow, "<this>");
        zq3.h(it2Var, "operation");
        return FlowKt.flow(new FlowExtKt$simpleScan$1(obj, flow, it2Var, null));
    }

    public static final Flow d(Flow flow, it2 it2Var) {
        zq3.h(flow, "<this>");
        zq3.h(it2Var, "transform");
        return SimpleChannelFlowKt.a(new FlowExtKt$simpleTransformLatest$1(flow, it2Var, null));
    }
}
