package com.nytimes.android.comments;

import android.content.res.Resources;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserApi;
import com.nytimes.android.utils.AppPreferences;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class CommentsModule_ProvideGetCurrentUserAPIFactory implements ba2 {
    private final p76 appPreferencesProvider;
    private final p76 resProvider;
    private final p76 retrofitProvider;

    public CommentsModule_ProvideGetCurrentUserAPIFactory(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.retrofitProvider = p76Var;
        this.resProvider = p76Var2;
        this.appPreferencesProvider = p76Var3;
    }

    public static CommentsModule_ProvideGetCurrentUserAPIFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new CommentsModule_ProvideGetCurrentUserAPIFactory(p76Var, p76Var2, p76Var3);
    }

    public static GetCurrentUserApi provideGetCurrentUserAPI(Retrofit retrofit, Resources resources, AppPreferences appPreferences) {
        return (GetCurrentUserApi) g16.e(CommentsModule.INSTANCE.provideGetCurrentUserAPI(retrofit, resources, appPreferences));
    }

    @Override // defpackage.p76
    public GetCurrentUserApi get() {
        return provideGetCurrentUserAPI((Retrofit) this.retrofitProvider.get(), (Resources) this.resProvider.get(), (AppPreferences) this.appPreferencesProvider.get());
    }
}
