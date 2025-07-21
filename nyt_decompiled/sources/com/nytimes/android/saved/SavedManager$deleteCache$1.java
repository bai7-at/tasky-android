package com.nytimes.android.saved;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.SavedManager", f = "SavedManager.kt", l = {63}, m = "deleteCache")
/* loaded from: classes4.dex */
final class SavedManager$deleteCache$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SavedManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedManager$deleteCache$1(SavedManager savedManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = savedManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.deleteCache(this);
    }
}
