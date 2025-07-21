package com.nytimes.android.comments;

import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentApi;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class CommentsModule_ProvideWriteNewCommentApiFactory implements ba2 {
    private final p76 retrofitProvider;

    public CommentsModule_ProvideWriteNewCommentApiFactory(p76 p76Var) {
        this.retrofitProvider = p76Var;
    }

    public static CommentsModule_ProvideWriteNewCommentApiFactory create(p76 p76Var) {
        return new CommentsModule_ProvideWriteNewCommentApiFactory(p76Var);
    }

    public static WriteNewCommentApi provideWriteNewCommentApi(Retrofit retrofit) {
        return (WriteNewCommentApi) g16.e(CommentsModule.INSTANCE.provideWriteNewCommentApi(retrofit));
    }

    @Override // defpackage.p76
    public WriteNewCommentApi get() {
        return provideWriteNewCommentApi((Retrofit) this.retrofitProvider.get());
    }
}
