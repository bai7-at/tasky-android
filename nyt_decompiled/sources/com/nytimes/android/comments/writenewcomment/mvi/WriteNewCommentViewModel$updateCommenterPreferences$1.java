package com.nytimes.android.comments.writenewcomment.mvi;

import com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences;
import com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$updateCommenterPreferences$1", f = "WriteNewCommentViewModel.kt", l = {260}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentViewModel$updateCommenterPreferences$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CommenterPreferences $commenterPreferences;
    int label;
    final /* synthetic */ WriteNewCommentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentViewModel$updateCommenterPreferences$1(WriteNewCommentViewModel writeNewCommentViewModel, CommenterPreferences commenterPreferences, by0<? super WriteNewCommentViewModel$updateCommenterPreferences$1> by0Var) {
        super(2, by0Var);
        this.this$0 = writeNewCommentViewModel;
        this.$commenterPreferences = commenterPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new WriteNewCommentViewModel$updateCommenterPreferences$1(this.this$0, this.$commenterPreferences, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WriteNewCommentRepository writeNewCommentRepository;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            writeNewCommentRepository = this.this$0.writeNewCommentRepository;
            CommenterPreferences commenterPreferences = this.$commenterPreferences;
            this.label = 1;
            if (writeNewCommentRepository.updateCommenterPreferences(commenterPreferences, this) == h) {
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
        return ((WriteNewCommentViewModel$updateCommenterPreferences$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
