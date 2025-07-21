package com.nytimes.android;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.NYTApplication", f = "NYTApplication.kt", l = {352}, m = "updateHybridGameConfig")
/* loaded from: classes2.dex */
final class NYTApplication$updateHybridGameConfig$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NYTApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTApplication$updateHybridGameConfig$1(NYTApplication nYTApplication, by0 by0Var) {
        super(by0Var);
        this.this$0 = nYTApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d0;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        d0 = this.this$0.d0(this);
        return d0;
    }
}
