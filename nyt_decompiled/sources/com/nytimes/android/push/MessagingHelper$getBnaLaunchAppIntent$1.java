package com.nytimes.android.push;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.push.MessagingHelper", f = "MessagingHelper.kt", l = {68}, m = "getBnaLaunchAppIntent")
/* loaded from: classes4.dex */
final class MessagingHelper$getBnaLaunchAppIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessagingHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessagingHelper$getBnaLaunchAppIntent$1(MessagingHelper messagingHelper, by0 by0Var) {
        super(by0Var);
        this.this$0 = messagingHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bnaLaunchAppIntent;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        bnaLaunchAppIntent = this.this$0.getBnaLaunchAppIntent(null, null, this);
        return bnaLaunchAppIntent;
    }
}
