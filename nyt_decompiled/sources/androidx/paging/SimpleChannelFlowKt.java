package androidx.paging;

import defpackage.gt2;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* loaded from: classes.dex */
public abstract class SimpleChannelFlowKt {
    public static final Flow a(gt2 gt2Var) {
        zq3.h(gt2Var, "block");
        return FlowKt__ContextKt.buffer$default(FlowKt.flow(new SimpleChannelFlowKt$simpleChannelFlow$1(gt2Var, null)), -2, null, 2, null);
    }
}
