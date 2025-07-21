package com.nytimes.android.comments;

import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class CommentsModule_ProvideGetCommentsApiFactory implements ba2 {
    private final p76 retrofitProvider;

    public CommentsModule_ProvideGetCommentsApiFactory(p76 p76Var) {
        this.retrofitProvider = p76Var;
    }

    public static CommentsModule_ProvideGetCommentsApiFactory create(p76 p76Var) {
        return new CommentsModule_ProvideGetCommentsApiFactory(p76Var);
    }

    public static CommentsApi provideGetCommentsApi(Retrofit retrofit) {
        return (CommentsApi) g16.e(CommentsModule.INSTANCE.provideGetCommentsApi(retrofit));
    }

    @Override // defpackage.p76
    public CommentsApi get() {
        return provideGetCommentsApi((Retrofit) this.retrofitProvider.get());
    }
}
