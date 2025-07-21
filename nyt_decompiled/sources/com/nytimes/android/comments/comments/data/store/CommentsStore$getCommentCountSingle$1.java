package com.nytimes.android.comments.comments.data.store;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.comments.data.store.CommentsStore$getCommentCountSingle$1", f = "CommentsStore.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsStore$getCommentCountSingle$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $articleUrl;
    int label;
    final /* synthetic */ CommentsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsStore$getCommentCountSingle$1(CommentsStore commentsStore, String str, by0<? super CommentsStore$getCommentCountSingle$1> by0Var) {
        super(2, by0Var);
        this.this$0 = commentsStore;
        this.$articleUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new CommentsStore$getCommentCountSingle$1(this.this$0, this.$articleUrl, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CommentsStore commentsStore = this.this$0;
            String str = this.$articleUrl;
            this.label = 1;
            obj = commentsStore.getCommentCount(str, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super Integer> by0Var) {
        return ((CommentsStore$getCommentCountSingle$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
