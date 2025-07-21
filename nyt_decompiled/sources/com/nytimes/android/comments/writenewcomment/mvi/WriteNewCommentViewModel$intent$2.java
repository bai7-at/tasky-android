package com.nytimes.android.comments.writenewcomment.mvi;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$intent$2", f = "WriteNewCommentViewModel.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentViewModel$intent$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ WriteNewCommentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentViewModel$intent$2(WriteNewCommentViewModel writeNewCommentViewModel, by0<? super WriteNewCommentViewModel$intent$2> by0Var) {
        super(2, by0Var);
        this.this$0 = writeNewCommentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new WriteNewCommentViewModel$intent$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object trySaveDraftComment;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            WriteNewCommentViewModel writeNewCommentViewModel = this.this$0;
            this.label = 1;
            trySaveDraftComment = writeNewCommentViewModel.trySaveDraftComment(this);
            if (trySaveDraftComment == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((WriteNewCommentViewModel$intent$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
