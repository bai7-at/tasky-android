package com.nytimes.android.libs.messagingarchitecture.db;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageHistoryStorage", f = "HistoryStorage.kt", l = {57}, m = "getAll")
/* loaded from: classes4.dex */
final class LegacyMessageHistoryStorage$getAll$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyMessageHistoryStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyMessageHistoryStorage$getAll$1(LegacyMessageHistoryStorage legacyMessageHistoryStorage, by0 by0Var) {
        super(by0Var);
        this.this$0 = legacyMessageHistoryStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
