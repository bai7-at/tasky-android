package com.nytimes.android.eventtracker.pagetracker;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient", f = "ET2SinglePageClient.kt", l = {88}, m = "trackPage")
/* loaded from: classes4.dex */
final class ET2SinglePageClient$trackPage$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ET2SinglePageClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ET2SinglePageClient$trackPage$1(ET2SinglePageClient eT2SinglePageClient, by0 by0Var) {
        super(by0Var);
        this.this$0 = eT2SinglePageClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(null, null, null, null, null, null, null, null, null, this);
    }
}
