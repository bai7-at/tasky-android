package com.dropbox.android.external.store4.impl.operators;

import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* loaded from: classes2.dex */
public abstract class FlowMergeKt {
    public static final Flow a(Flow flow, Flow flow2) {
        zq3.h(flow, "<this>");
        zq3.h(flow2, "other");
        return FlowKt__ContextKt.buffer$default(FlowKt.channelFlow(new FlowMergeKt$merge$1(flow, flow2, null)), 0, null, 2, null);
    }
}
