package com.nytimes.android.libs.messagingarchitecture.db;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage", f = "MessageStorage.kt", l = {86, 88, 89}, m = "getAllMessagesWithIssues")
/* loaded from: classes4.dex */
final class LegacyMessageStorage$getAllMessagesWithIssues$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyMessageStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyMessageStorage$getAllMessagesWithIssues$1(LegacyMessageStorage legacyMessageStorage, by0 by0Var) {
        super(by0Var);
        this.this$0 = legacyMessageStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        g = this.this$0.g(this);
        return g;
    }
}
