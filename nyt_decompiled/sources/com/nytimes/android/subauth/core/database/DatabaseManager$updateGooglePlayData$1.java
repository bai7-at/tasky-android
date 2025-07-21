package com.nytimes.android.subauth.core.database;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.ws.WebSocketProtocol;

@fc1(c = "com.nytimes.android.subauth.core.database.DatabaseManager", f = "DatabaseManager.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 128, 130, 135}, m = "updateGooglePlayData")
/* loaded from: classes4.dex */
final class DatabaseManager$updateGooglePlayData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DatabaseManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatabaseManager$updateGooglePlayData$1(DatabaseManager databaseManager, by0<? super DatabaseManager$updateGooglePlayData$1> by0Var) {
        super(by0Var);
        this.this$0 = databaseManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.n(null, this);
    }
}
