package com.apollographql.apollo.internal;

import defpackage.it2;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public abstract class FlowsKt {
    public static final Flow a(Flow flow, it2 it2Var) {
        zq3.h(flow, "<this>");
        zq3.h(it2Var, "transform");
        return FlowKt.flow(new FlowsKt$transformWhile$1(flow, it2Var, null));
    }
}
