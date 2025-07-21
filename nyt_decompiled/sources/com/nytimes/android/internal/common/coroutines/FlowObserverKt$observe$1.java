package com.nytimes.android.internal.common.coroutines;

import defpackage.d44;
import defpackage.e44;
import defpackage.ei1;
import defpackage.gt2;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class FlowObserverKt$observe$1 implements ei1 {
    private Job a;
    final /* synthetic */ Flow b;
    final /* synthetic */ gt2 c;

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        Job launch$default;
        zq3.h(d44Var, "owner");
        launch$default = BuildersKt__Builders_commonKt.launch$default(e44.a(d44Var), null, null, new FlowObserverKt$observe$1$onStart$1(this.b, this.c, null), 3, null);
        this.a = launch$default;
    }

    @Override // defpackage.ei1
    public void onStop(d44 d44Var) {
        zq3.h(d44Var, "owner");
        Job job = this.a;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.a = null;
    }
}
