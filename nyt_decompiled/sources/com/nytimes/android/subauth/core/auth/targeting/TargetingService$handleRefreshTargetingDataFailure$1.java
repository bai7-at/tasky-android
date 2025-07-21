package com.nytimes.android.subauth.core.auth.targeting;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.targeting.TargetingService", f = "TargetingService.kt", l = {138, 139}, m = "handleRefreshTargetingDataFailure")
/* loaded from: classes4.dex */
final class TargetingService$handleRefreshTargetingDataFailure$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TargetingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TargetingService$handleRefreshTargetingDataFailure$1(TargetingService targetingService, by0 by0Var) {
        super(by0Var);
        this.this$0 = targetingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        h = this.this$0.h(null, false, false, this);
        return h;
    }
}
