package com.nytimes.android.features.discovery.discoverytab.data;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher", f = "SectionCarouselsDataFetcher.kt", l = {76}, m = "executeQuery")
/* loaded from: classes4.dex */
final class SectionCarouselsDataFetcher$executeQuery$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SectionCarouselsDataFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionCarouselsDataFetcher$executeQuery$1(SectionCarouselsDataFetcher sectionCarouselsDataFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = sectionCarouselsDataFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        d = this.this$0.d(null, this);
        return d;
    }
}
