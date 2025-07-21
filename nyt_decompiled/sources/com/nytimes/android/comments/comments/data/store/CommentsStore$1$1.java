package com.nytimes.android.comments.comments.data.store;

import com.nytimes.android.comments.comments.data.remote.getcommentssummary.CommentsSummary;
import com.nytimes.android.comments.comments.data.remote.getcommentssummary.GetCommentsSummaryDataSource;
import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.comments.data.store.CommentsStore$1$1", f = "CommentsStore.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsStore$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ GetCommentsSummaryDataSource $commentsSummaryDataSource;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsStore$1$1(GetCommentsSummaryDataSource getCommentsSummaryDataSource, String str, by0<? super CommentsStore$1$1> by0Var) {
        super(2, by0Var);
        this.$commentsSummaryDataSource = getCommentsSummaryDataSource;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new CommentsStore$1$1(this.$commentsSummaryDataSource, this.$url, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            GetCommentsSummaryDataSource getCommentsSummaryDataSource = this.$commentsSummaryDataSource;
            String str = this.$url;
            zq3.g(str, "$url");
            this.label = 1;
            obj = getCommentsSummaryDataSource.getCommentsSummary(str, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        FetchResult fetchResult = (FetchResult) obj;
        if (fetchResult instanceof FetchResult.b.C0251b) {
            return (CommentsSummary) ((FetchResult.b.C0251b) fetchResult).b();
        }
        if (fetchResult instanceof FetchResult.b.a) {
            throw ((FetchResult.b.a) fetchResult).b();
        }
        if (fetchResult instanceof FetchResult.c) {
            throw new Exception("timeout");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super CommentsSummary> by0Var) {
        return ((CommentsStore$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
