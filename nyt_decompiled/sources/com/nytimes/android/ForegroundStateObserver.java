package com.nytimes.android;

import defpackage.d44;
import defpackage.ei1;
import defpackage.zq3;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class ForegroundStateObserver implements ei1 {
    private final MutableStateFlow a;
    private final StateFlow b;

    public ForegroundStateObserver() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.a = MutableStateFlow;
        this.b = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow a() {
        return this.b;
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.a.setValue(Boolean.FALSE);
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.a.setValue(Boolean.TRUE);
    }
}
