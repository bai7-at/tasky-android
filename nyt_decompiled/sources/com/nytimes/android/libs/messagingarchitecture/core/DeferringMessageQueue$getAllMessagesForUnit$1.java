package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue", f = "DeferringMessageQueue.kt", l = {BuildConfig.VERSION_CODE, 30}, m = "getAllMessagesForUnit")
/* loaded from: classes4.dex */
final class DeferringMessageQueue$getAllMessagesForUnit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeferringMessageQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeferringMessageQueue$getAllMessagesForUnit$1(DeferringMessageQueue deferringMessageQueue, by0 by0Var) {
        super(by0Var);
        this.this$0 = deferringMessageQueue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.g(null, this);
    }
}
