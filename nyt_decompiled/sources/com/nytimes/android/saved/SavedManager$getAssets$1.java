package com.nytimes.android.saved;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.SavedManager", f = "SavedManager.kt", l = {ContentType.USER_GENERATED_LIVE, 124}, m = "getAssets")
/* loaded from: classes4.dex */
final class SavedManager$getAssets$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SavedManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedManager$getAssets$1(SavedManager savedManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = savedManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.getAssets(0, 0, this);
    }
}
