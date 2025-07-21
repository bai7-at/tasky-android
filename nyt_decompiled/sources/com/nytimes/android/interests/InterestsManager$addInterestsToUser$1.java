package com.nytimes.android.interests;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.interests.InterestsManager", f = "InterestsManager.kt", l = {ContentType.LIVE, 114, 117}, m = "addInterestsToUser")
/* loaded from: classes4.dex */
final class InterestsManager$addInterestsToUser$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterestsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsManager$addInterestsToUser$1(InterestsManager interestsManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = interestsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(null, null, null, this);
    }
}
