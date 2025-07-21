package com.nytimes.android.coroutinesutils;

import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public abstract class MutableStateFlowKtxKt {
    public static final MutableStateFlow a(Flow flow, CoroutineScope coroutineScope, Object obj) {
        zq3.h(flow, "<this>");
        zq3.h(coroutineScope, "scope");
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(obj);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MutableStateFlowKtxKt$mutableStateIn$1(flow, MutableStateFlow, null), 3, null);
        return MutableStateFlow;
    }
}
