package com.nytimes.android.libs.messagingarchitecture.db;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.db.MessageHistoryMigrator", f = "MessageHistoryMigrator.kt", l = {23, EventType.CDN, 27, 28, BuildConfig.VERSION_CODE}, m = "runMigrationIfNeeded")
/* loaded from: classes4.dex */
final class MessageHistoryMigrator$runMigrationIfNeeded$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageHistoryMigrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageHistoryMigrator$runMigrationIfNeeded$1(MessageHistoryMigrator messageHistoryMigrator, by0 by0Var) {
        super(by0Var);
        this.this$0 = messageHistoryMigrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
