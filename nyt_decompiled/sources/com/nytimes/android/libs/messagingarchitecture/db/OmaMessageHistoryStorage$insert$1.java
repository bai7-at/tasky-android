package com.nytimes.android.libs.messagingarchitecture.db;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.db.OmaMessageHistoryStorage", f = "HistoryStorage.kt", l = {BuildConfig.VERSION_CODE, 37}, m = "insert")
/* loaded from: classes4.dex */
final class OmaMessageHistoryStorage$insert$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OmaMessageHistoryStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OmaMessageHistoryStorage$insert$1(OmaMessageHistoryStorage omaMessageHistoryStorage, by0 by0Var) {
        super(by0Var);
        this.this$0 = omaMessageHistoryStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, this);
    }
}
