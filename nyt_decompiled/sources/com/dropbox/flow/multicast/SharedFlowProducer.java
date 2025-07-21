package com.dropbox.flow.multicast;

import defpackage.by0;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class SharedFlowProducer {
    private final CoroutineScope a;
    private final Flow b;
    private final gt2 c;
    private final Job d;

    public SharedFlowProducer(CoroutineScope coroutineScope, Flow flow, gt2 gt2Var) {
        Job launch$default;
        zq3.h(coroutineScope, "scope");
        zq3.h(flow, "src");
        zq3.h(gt2Var, "sendUpsteamMessage");
        this.a = coroutineScope;
        this.b = flow;
        this.c = gt2Var;
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.LAZY, new SharedFlowProducer$collectionJob$1(this, null), 1, null);
        this.d = launch$default;
    }

    public final void d() {
        Job.DefaultImpls.cancel$default(this.d, (CancellationException) null, 1, (Object) null);
    }

    public final Object e(by0 by0Var) {
        Object cancelAndJoin = JobKt.cancelAndJoin(this.d, by0Var);
        return cancelAndJoin == kotlin.coroutines.intrinsics.a.h() ? cancelAndJoin : ww8.a;
    }

    public final void f() {
        BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new SharedFlowProducer$start$1(this, null), 3, null);
    }
}
