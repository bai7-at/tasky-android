package com.nytimes.android.interests;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.interests.InterestsPreferencesStore", f = "InterestsPreferencesStore.kt", l = {54}, m = "getLastAutoAddedAtTime")
/* loaded from: classes4.dex */
final class InterestsPreferencesStore$getLastAutoAddedAtTime$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterestsPreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsPreferencesStore$getLastAutoAddedAtTime$1(InterestsPreferencesStore interestsPreferencesStore, by0 by0Var) {
        super(by0Var);
        this.this$0 = interestsPreferencesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.f(this);
    }
}
