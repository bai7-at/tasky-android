package com.nytimes.android.internal.pushmessaging.tagmanager;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker", f = "TagManagerWorker.kt", l = {BuildConfig.VERSION_CODE}, m = "doWork")
/* loaded from: classes4.dex */
final class TagManagerWorker$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagManagerWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagManagerWorker$doWork$1(TagManagerWorker tagManagerWorker, by0 by0Var) {
        super(by0Var);
        this.this$0 = tagManagerWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
