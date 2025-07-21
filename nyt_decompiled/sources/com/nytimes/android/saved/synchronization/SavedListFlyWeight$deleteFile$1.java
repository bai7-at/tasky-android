package com.nytimes.android.saved.synchronization;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.nytimes.android.saved.synchronization.SavedListFlyWeight", f = "SavedListFlyWeight.kt", l = {71, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "deleteFile")
/* loaded from: classes4.dex */
final class SavedListFlyWeight$deleteFile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SavedListFlyWeight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedListFlyWeight$deleteFile$1(SavedListFlyWeight savedListFlyWeight, by0 by0Var) {
        super(by0Var);
        this.this$0 = savedListFlyWeight;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(this);
    }
}
