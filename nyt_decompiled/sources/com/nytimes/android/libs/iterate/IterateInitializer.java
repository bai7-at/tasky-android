package com.nytimes.android.libs.iterate;

import defpackage.bs3;
import defpackage.cs3;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class IterateInitializer {
    private final cs3 a;
    private final bs3 b;
    private final CoroutineScope c;

    public IterateInitializer(cs3 cs3Var, bs3 bs3Var, CoroutineScope coroutineScope) {
        zq3.h(cs3Var, "userTraitsProvider");
        zq3.h(bs3Var, "iterateSurveyReporter");
        zq3.h(coroutineScope, "applicationScope");
        this.a = cs3Var;
        this.b = bs3Var;
        this.c = coroutineScope;
    }

    public final void c() {
        this.b.e();
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.flowCombine(FlowKt.onStart(this.a.c(), new IterateInitializer$init$1(this, null)), this.a.b(), new IterateInitializer$init$2(this, null)), new IterateInitializer$init$3(null)), this.c);
    }
}
