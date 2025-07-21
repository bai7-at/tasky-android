package com.nytimes.android.libs.messagingarchitecture.db;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage", f = "MessageStorage.kt", l = {79}, m = "getById")
/* loaded from: classes4.dex */
final class LegacyMessageStorage$getById$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyMessageStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyMessageStorage$getById$1(LegacyMessageStorage legacyMessageStorage, by0 by0Var) {
        super(by0Var);
        this.this$0 = legacyMessageStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, this);
    }
}
