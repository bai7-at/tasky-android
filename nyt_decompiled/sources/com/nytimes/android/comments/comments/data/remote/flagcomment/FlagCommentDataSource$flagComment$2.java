package com.nytimes.android.comments.comments.data.remote.flagcomment;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.coroutinesutils.FetchResultKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.comments.data.remote.flagcomment.FlagCommentDataSource$flagComment$2", f = "FlagCommentDataSource.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlagCommentDataSource$flagComment$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $articleUrl;
    final /* synthetic */ long $commentID;
    final /* synthetic */ String $flagOption;
    int label;
    final /* synthetic */ FlagCommentDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlagCommentDataSource$flagComment$2(String str, long j, String str2, FlagCommentDataSource flagCommentDataSource, by0<? super FlagCommentDataSource$flagComment$2> by0Var) {
        super(2, by0Var);
        this.$articleUrl = str;
        this.$commentID = j;
        this.$flagOption = str2;
        this.this$0 = flagCommentDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new FlagCommentDataSource$flagComment$2(this.$articleUrl, this.$commentID, this.$flagOption, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommentsApi commentsApi;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlagCommentBody flagCommentBody = new FlagCommentBody(this.$articleUrl, this.$commentID, this.$flagOption);
            commentsApi = this.this$0.commentsApi;
            this.label = 1;
            obj = CommentsApi.DefaultImpls.flagComment$default(commentsApi, null, null, flagCommentBody, this, 3, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return FetchResultKt.c((FetchResult) obj, new ss2() { // from class: com.nytimes.android.comments.comments.data.remote.flagcomment.FlagCommentDataSource$flagComment$2.1
            @Override // defpackage.ss2
            public final Integer invoke(FlaggedCommentResponse flaggedCommentResponse) {
                zq3.h(flaggedCommentResponse, "flaggedComment");
                return Integer.valueOf(flaggedCommentResponse.getCommentID());
            }
        });
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super FetchResult<Integer>> by0Var) {
        return ((FlagCommentDataSource$flagComment$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
