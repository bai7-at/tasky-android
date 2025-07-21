package com.nytimes.android.features.notifications.push;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.notifications.push.NotificationsViewModel", f = "NotificationsViewModel.kt", l = {132, 142}, m = "onSubscribeCheckChanged")
/* loaded from: classes4.dex */
final class NotificationsViewModel$onSubscribeCheckChanged$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsViewModel$onSubscribeCheckChanged$1(NotificationsViewModel notificationsViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = notificationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.s(null, null, false, this);
    }
}
