package com.nytimes.android.ads.analytics;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.e6;
import defpackage.i7;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class AdEventTracker {
    private final ET2Scope a;
    private final i7 b;
    private final CoroutineDispatcher c;
    private final CoroutineScope d;

    public AdEventTracker(ET2Scope eT2Scope, i7 i7Var, e6 e6Var, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(i7Var, "performanceTracker");
        zq3.h(e6Var, "adEventAnalytics");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = eT2Scope;
        this.b = i7Var;
        this.c = coroutineDispatcher;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.d = CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(Job$default));
        c(FlowKt.merge(e6Var.b(), e6Var.a()));
    }

    private final void c(Flow flow) {
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new AdEventTracker$trackAdEvents$1(this, flow, null), 3, null);
    }
}
