package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {466}, m = "presentNewList")
/* loaded from: classes.dex */
final class PagingDataPresenter$presentNewList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagingDataPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataPresenter$presentNewList$1(PagingDataPresenter pagingDataPresenter, by0 by0Var) {
        super(by0Var);
        this.this$0 = pagingDataPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        p = this.this$0.p(null, 0, 0, false, null, null, null, this);
        return p;
    }
}
