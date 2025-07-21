package com.nytimes.android.logging.remote.stream;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager", f = "LoggingRemoteStreamManager.kt", l = {136}, m = "updateRemoteStreamLogger")
/* loaded from: classes4.dex */
final class LoggingRemoteStreamManager$updateRemoteStreamLogger$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggingRemoteStreamManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingRemoteStreamManager$updateRemoteStreamLogger$1(LoggingRemoteStreamManager loggingRemoteStreamManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = loggingRemoteStreamManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.n(this);
    }
}
