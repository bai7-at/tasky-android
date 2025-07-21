package com.nytimes.android.libs.messagingarchitecture.network;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater", f = "MessageHistoryUpdater.kt", l = {24, BuildConfig.VERSION_CODE}, m = "updateMessageHistory")
/* loaded from: classes4.dex */
final class MessageHistoryUpdater$updateMessageHistory$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageHistoryUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageHistoryUpdater$updateMessageHistory$1(MessageHistoryUpdater messageHistoryUpdater, by0 by0Var) {
        super(by0Var);
        this.this$0 = messageHistoryUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.d(null, this);
    }
}
