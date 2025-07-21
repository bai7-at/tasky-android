package com.nytimes.android.features.you.youtab;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.you.youtab.YouTabPreferencesStore", f = "YouTabPreferences.kt", l = {BuildConfig.VERSION_CODE}, m = "isNew")
/* loaded from: classes4.dex */
final class YouTabPreferencesStore$isNew$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ YouTabPreferencesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouTabPreferencesStore$isNew$1(YouTabPreferencesStore youTabPreferencesStore, by0 by0Var) {
        super(by0Var);
        this.this$0 = youTabPreferencesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(false, this);
    }
}
