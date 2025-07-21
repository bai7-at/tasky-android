package com.nytimes.android.comments.comments.mvi;

import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$getAllComments$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsViewModel$getAllComments$1 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    CommentsViewModel$getAllComments$1(by0<? super CommentsViewModel$getAllComments$1> by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return du8.a((String) this.L$0, (SortingOption) this.L$1);
    }

    @Override // defpackage.it2
    public final Object invoke(String str, SortingOption sortingOption, by0<? super Pair<String, ? extends SortingOption>> by0Var) {
        CommentsViewModel$getAllComments$1 commentsViewModel$getAllComments$1 = new CommentsViewModel$getAllComments$1(by0Var);
        commentsViewModel$getAllComments$1.L$0 = str;
        commentsViewModel$getAllComments$1.L$1 = sortingOption;
        return commentsViewModel$getAllComments$1.invokeSuspend(ww8.a);
    }
}
