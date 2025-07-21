package com.nytimes.android.logging.remote.stream;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager", f = "LoggingRemoteStreamManager.kt", l = {160}, m = "setupRemoteStreamSocket")
/* loaded from: classes4.dex */
final class LoggingRemoteStreamManager$setupRemoteStreamSocket$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoggingRemoteStreamManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingRemoteStreamManager$setupRemoteStreamSocket$1(LoggingRemoteStreamManager loggingRemoteStreamManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = loggingRemoteStreamManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        m = this.this$0.m(null, null, this);
        return m;
    }
}
