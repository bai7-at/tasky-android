package com.nytimes.android.subauth.core.database;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.database.DatabaseManager", f = "DatabaseManager.kt", l = {92}, m = "getUserData")
/* loaded from: classes4.dex */
final class DatabaseManager$getUserData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DatabaseManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatabaseManager$getUserData$1(DatabaseManager databaseManager, by0<? super DatabaseManager$getUserData$1> by0Var) {
        super(by0Var);
        this.this$0 = databaseManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(this);
    }
}
