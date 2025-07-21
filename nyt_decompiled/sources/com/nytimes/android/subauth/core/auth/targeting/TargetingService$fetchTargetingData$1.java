package com.nytimes.android.subauth.core.auth.targeting;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.targeting.TargetingService", f = "TargetingService.kt", l = {148, 149, 155}, m = "fetchTargetingData")
/* loaded from: classes4.dex */
final class TargetingService$fetchTargetingData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TargetingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TargetingService$fetchTargetingData$1(TargetingService targetingService, by0 by0Var) {
        super(by0Var);
        this.this$0 = targetingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        g = this.this$0.g(this);
        return g;
    }
}
