package com.nytimes.android.hybrid.bridge;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.hybrid.bridge.NativeToWebCommand", f = "NativeToWebCommand.kt", l = {EventType.CDN, BuildConfig.VERSION_CODE}, m = "enqueueCommand")
/* loaded from: classes4.dex */
final class NativeToWebCommand$enqueueCommand$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NativeToWebCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeToWebCommand$enqueueCommand$1(NativeToWebCommand nativeToWebCommand, by0 by0Var) {
        super(by0Var);
        this.this$0 = nativeToWebCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, null, this);
    }
}
