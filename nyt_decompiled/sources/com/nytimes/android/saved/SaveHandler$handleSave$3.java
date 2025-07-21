package com.nytimes.android.saved;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.SaveHandler", f = "SaveHandler.kt", l = {145, 148}, m = "handleSave")
/* loaded from: classes4.dex */
final class SaveHandler$handleSave$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SaveHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveHandler$handleSave$3(SaveHandler saveHandler, by0 by0Var) {
        super(by0Var);
        this.this$0 = saveHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        l = this.this$0.l(null, null, null, this);
        return l;
    }
}
