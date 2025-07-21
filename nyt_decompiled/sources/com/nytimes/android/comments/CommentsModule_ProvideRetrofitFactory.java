package com.nytimes.android.comments;

import android.content.res.Resources;
import com.nytimes.android.utils.AppPreferences;
import defpackage.b04;
import defpackage.ba2;
import defpackage.c05;
import defpackage.g16;
import defpackage.nt1;
import defpackage.p76;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class CommentsModule_ProvideRetrofitFactory implements ba2 {
    private final p76 appPreferencesProvider;
    private final p76 clientProvider;
    private final p76 nytCookieProvider;
    private final p76 resProvider;

    public CommentsModule_ProvideRetrofitFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.clientProvider = p76Var;
        this.nytCookieProvider = p76Var2;
        this.resProvider = p76Var3;
        this.appPreferencesProvider = p76Var4;
    }

    public static CommentsModule_ProvideRetrofitFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new CommentsModule_ProvideRetrofitFactory(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static Retrofit provideRetrofit(b04 b04Var, c05 c05Var, Resources resources, AppPreferences appPreferences) {
        return (Retrofit) g16.e(CommentsModule.INSTANCE.provideRetrofit(b04Var, c05Var, resources, appPreferences));
    }

    @Override // defpackage.p76
    public Retrofit get() {
        return provideRetrofit(nt1.a(this.clientProvider), (c05) this.nytCookieProvider.get(), (Resources) this.resProvider.get(), (AppPreferences) this.appPreferencesProvider.get());
    }
}
