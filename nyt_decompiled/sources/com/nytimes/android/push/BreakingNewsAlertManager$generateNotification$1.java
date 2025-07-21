package com.nytimes.android.push;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.push.BreakingNewsAlertManager", f = "BreakingNewsAlertManager.kt", l = {106, 128}, m = "generateNotification")
/* loaded from: classes4.dex */
final class BreakingNewsAlertManager$generateNotification$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BreakingNewsAlertManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BreakingNewsAlertManager$generateNotification$1(BreakingNewsAlertManager breakingNewsAlertManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = breakingNewsAlertManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.generateNotification(null, null, this);
    }
}
