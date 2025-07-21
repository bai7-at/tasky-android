package com.nytimes.android.libs.messagingarchitecture.db;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.db.MessageHistoryMigrator$runMigrationIfNeeded$2", f = "MessageHistoryMigrator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessageHistoryMigrator$runMigrationIfNeeded$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    MessageHistoryMigrator$runMigrationIfNeeded$2(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MessageHistoryMigrator$runMigrationIfNeeded$2 messageHistoryMigrator$runMigrationIfNeeded$2 = new MessageHistoryMigrator$runMigrationIfNeeded$2(by0Var);
        messageHistoryMigrator$runMigrationIfNeeded$2.L$0 = obj;
        return messageHistoryMigrator$runMigrationIfNeeded$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((MessageHistoryMigrator$runMigrationIfNeeded$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ((MutablePreferences) this.L$0).j(MessageHistoryMigrator.Companion.a(), cc0.a(true));
        return ww8.a;
    }
}
