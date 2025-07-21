package com.nytimes.android.comments.writenewcomment.data.repository;

import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase;
import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentEntity;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository$saveDraftComment$2", f = "WriteNewCommentRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentRepository$saveDraftComment$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $articleUrl;
    final /* synthetic */ String $content;
    final /* synthetic */ long $parentCommentId;
    int label;
    final /* synthetic */ WriteNewCommentRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentRepository$saveDraftComment$2(String str, long j, String str2, WriteNewCommentRepository writeNewCommentRepository, by0<? super WriteNewCommentRepository$saveDraftComment$2> by0Var) {
        super(2, by0Var);
        this.$articleUrl = str;
        this.$parentCommentId = j;
        this.$content = str2;
        this.this$0 = writeNewCommentRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new WriteNewCommentRepository$saveDraftComment$2(this.$articleUrl, this.$parentCommentId, this.$content, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DraftCommentDatabase draftCommentDatabase;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        DraftCommentEntity draftCommentEntity = new DraftCommentEntity(this.$articleUrl, this.$parentCommentId, this.$content);
        draftCommentDatabase = this.this$0.draftCommentDatabase;
        return cc0.d(draftCommentDatabase.draftCommentDao().insert(draftCommentEntity));
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super Long> by0Var) {
        return ((WriteNewCommentRepository$saveDraftComment$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
