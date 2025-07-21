package com.nytimes.android.saved.repository;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.repository.SavedQueryFactory", f = "SavedQueryFactory.kt", l = {20}, m = "readingListQuery")
/* loaded from: classes4.dex */
final class SavedQueryFactory$readingListQuery$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SavedQueryFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedQueryFactory$readingListQuery$1(SavedQueryFactory savedQueryFactory, by0 by0Var) {
        super(by0Var);
        this.this$0 = savedQueryFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(0, null, this);
    }
}
