package com.nytimes.android.features.discovery.discoverysearch;

import com.nytimes.android.features.discovery.discoverysearch.a;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$searchModels$4", f = "DiscoverySearchViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DiscoverySearchViewModel$searchModels$4 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DiscoverySearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverySearchViewModel$searchModels$4(DiscoverySearchViewModel discoverySearchViewModel, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = discoverySearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Throwable th = (Throwable) this.L$0;
        this.this$0.l().setValue(a.C0268a.b);
        NYTLogger.h(th);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        DiscoverySearchViewModel$searchModels$4 discoverySearchViewModel$searchModels$4 = new DiscoverySearchViewModel$searchModels$4(this.this$0, by0Var);
        discoverySearchViewModel$searchModels$4.L$0 = th;
        return discoverySearchViewModel$searchModels$4.invokeSuspend(ww8.a);
    }
}
