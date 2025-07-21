package com.nytimes.android.eventtracker.validator.fetcher;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher", f = "EventTrackerScriptFetcher.kt", l = {24, 27}, m = "fetchValidationScript")
/* loaded from: classes4.dex */
final class EventTrackerScriptFetcher$fetchValidationScript$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventTrackerScriptFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventTrackerScriptFetcher$fetchValidationScript$1(EventTrackerScriptFetcher eventTrackerScriptFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = eventTrackerScriptFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
