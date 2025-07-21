package com.nytimes.android.internal.pushmessaging.database;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.database.PushMessagingDao", f = "PushMessagingDatabase.kt", l = {63, 64}, m = "replaceAllTags$suspendImpl")
/* loaded from: classes4.dex */
final class PushMessagingDao$replaceAllTags$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushMessagingDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushMessagingDao$replaceAllTags$1(PushMessagingDao pushMessagingDao, by0 by0Var) {
        super(by0Var);
        this.this$0 = pushMessagingDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return PushMessagingDao.h(this.this$0, null, this);
    }
}
