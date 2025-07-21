package com.nytimes.android;

import com.nytimes.android.abra.AbraManager;
import defpackage.z58;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class AbraLoginObserver {
    private final z58 a;
    private final AbraManager b;

    public AbraLoginObserver(z58 z58Var, AbraManager abraManager) {
        zq3.h(z58Var, "subauthClient");
        zq3.h(abraManager, "abraManager");
        this.a = z58Var;
        this.b = abraManager;
    }

    public final void b(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "scope");
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(this.a.h().h(), new AbraLoginObserver$initialize$1(this, null)), new AbraLoginObserver$initialize$2(null)), coroutineScope);
    }
}
