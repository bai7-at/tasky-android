package com.nytimes.android.comments.comments.mvi;

import androidx.lifecycle.r;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$special$$inlined$flatMapLatest$2", f = "CommentsViewModel.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class CommentsViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements it2 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CommentsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsViewModel$special$$inlined$flatMapLatest$2(by0 by0Var, CommentsViewModel commentsViewModel) {
        super(3, by0Var);
        this.this$0 = commentsViewModel;
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super PagingData>) obj, (String) obj2, (by0<? super ww8>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow updateWithLocalChanges;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            String str = (String) this.L$1;
            CommentsViewModel commentsViewModel = this.this$0;
            updateWithLocalChanges = commentsViewModel.updateWithLocalChanges(CachedPagingDataKt.a(commentsViewModel.commentsRepository.getReadersPicksComments(str), r.a(this.this$0)));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, updateWithLocalChanges, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    public final Object invoke(FlowCollector<? super PagingData> flowCollector, String str, by0<? super ww8> by0Var) {
        CommentsViewModel$special$$inlined$flatMapLatest$2 commentsViewModel$special$$inlined$flatMapLatest$2 = new CommentsViewModel$special$$inlined$flatMapLatest$2(by0Var, this.this$0);
        commentsViewModel$special$$inlined$flatMapLatest$2.L$0 = flowCollector;
        commentsViewModel$special$$inlined$flatMapLatest$2.L$1 = str;
        return commentsViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(ww8.a);
    }
}
