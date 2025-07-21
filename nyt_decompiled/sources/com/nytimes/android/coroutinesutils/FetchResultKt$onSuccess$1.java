package com.nytimes.android.coroutinesutils;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.coroutinesutils.FetchResultKt", f = "FetchResult.kt", l = {41}, m = "onSuccess")
/* loaded from: classes4.dex */
final class FetchResultKt$onSuccess$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FetchResultKt$onSuccess$1(by0 by0Var) {
        super(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return FetchResultKt.e(null, null, this);
    }
}
