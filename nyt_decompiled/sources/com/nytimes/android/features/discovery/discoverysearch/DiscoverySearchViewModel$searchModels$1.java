package com.nytimes.android.features.discovery.discoverysearch;

import defpackage.by0;
import defpackage.cc0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.kt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel$searchModels$1", f = "DiscoverySearchViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DiscoverySearchViewModel$searchModels$1 extends SuspendLambda implements kt2 {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    DiscoverySearchViewModel$searchModels$1(by0 by0Var) {
        super(4, by0Var);
    }

    public final Object b(String str, long j, String str2, by0 by0Var) {
        DiscoverySearchViewModel$searchModels$1 discoverySearchViewModel$searchModels$1 = new DiscoverySearchViewModel$searchModels$1(by0Var);
        discoverySearchViewModel$searchModels$1.L$0 = str;
        discoverySearchViewModel$searchModels$1.J$0 = j;
        return discoverySearchViewModel$searchModels$1.invokeSuspend(ww8.a);
    }

    @Override // defpackage.kt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return b((String) obj, ((Number) obj2).longValue(), (String) obj3, (by0) obj4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return du8.a((String) this.L$0, cc0.d(this.J$0));
    }
}
