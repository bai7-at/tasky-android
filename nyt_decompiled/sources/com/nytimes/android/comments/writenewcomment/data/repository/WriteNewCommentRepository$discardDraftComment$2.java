package com.nytimes.android.comments.writenewcomment.data.repository;

import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository$discardDraftComment$2", f = "WriteNewCommentRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentRepository$discardDraftComment$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $articleUrl;
    final /* synthetic */ long $parentCommentId;
    int label;
    final /* synthetic */ WriteNewCommentRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentRepository$discardDraftComment$2(WriteNewCommentRepository writeNewCommentRepository, String str, long j, by0<? super WriteNewCommentRepository$discardDraftComment$2> by0Var) {
        super(2, by0Var);
        this.this$0 = writeNewCommentRepository;
        this.$articleUrl = str;
        this.$parentCommentId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new WriteNewCommentRepository$discardDraftComment$2(this.this$0, this.$articleUrl, this.$parentCommentId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DraftCommentDatabase draftCommentDatabase;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        draftCommentDatabase = this.this$0.draftCommentDatabase;
        draftCommentDatabase.draftCommentDao().delete(this.$articleUrl, this.$parentCommentId);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((WriteNewCommentRepository$discardDraftComment$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
