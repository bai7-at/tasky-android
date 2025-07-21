package com.nytimes.android.comments.comments.data.remote.getreporterreplies;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.comments.comments.data.remote.getreporterreplies.GetReportersRepliesPagingSource", f = "GetReportersRepliesCommentsPagingSource.kt", l = {31}, m = "load")
/* loaded from: classes4.dex */
final class GetReportersRepliesPagingSource$load$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetReportersRepliesPagingSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetReportersRepliesPagingSource$load$1(GetReportersRepliesPagingSource getReportersRepliesPagingSource, by0<? super GetReportersRepliesPagingSource$load$1> by0Var) {
        super(by0Var);
        this.this$0 = getReportersRepliesPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.load(null, this);
    }
}
