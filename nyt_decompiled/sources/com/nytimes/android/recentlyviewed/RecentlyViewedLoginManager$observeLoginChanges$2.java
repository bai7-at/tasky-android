package com.nytimes.android.recentlyviewed;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.recentlyviewed.RecentlyViewedLoginManager$observeLoginChanges$2", f = "RecentlyViewedLoginManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RecentlyViewedLoginManager$observeLoginChanges$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecentlyViewedLoginManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentlyViewedLoginManager$observeLoginChanges$2(RecentlyViewedLoginManager recentlyViewedLoginManager, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = recentlyViewedLoginManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.g((Throwable) this.L$0);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        RecentlyViewedLoginManager$observeLoginChanges$2 recentlyViewedLoginManager$observeLoginChanges$2 = new RecentlyViewedLoginManager$observeLoginChanges$2(this.this$0, by0Var);
        recentlyViewedLoginManager$observeLoginChanges$2.L$0 = th;
        return recentlyViewedLoginManager$observeLoginChanges$2.invokeSuspend(ww8.a);
    }
}
