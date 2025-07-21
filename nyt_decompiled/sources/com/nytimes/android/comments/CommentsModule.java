package com.nytimes.android.comments;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.nytimes.android.comments.comments.data.remote.BaseResponseFactory;
import com.nytimes.android.comments.comments.data.remote.CommentsApi;
import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentDatabase;
import com.nytimes.android.comments.writenewcomment.data.remote.QueryObjectToJsonConverterFactory;
import com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserApi;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentApi;
import com.nytimes.android.utils.AppPreferences;
import com.squareup.moshi.i;
import defpackage.b04;
import defpackage.c05;
import defpackage.ck6;
import defpackage.ql6;
import defpackage.w45;
import defpackage.zq3;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes4.dex */
public final class CommentsModule {
    public static final int $stable = 0;
    public static final CommentsModule INSTANCE = new CommentsModule();

    private CommentsModule() {
    }

    private final String getBaseUrl(Resources resources, AppPreferences appPreferences) {
        String string = zq3.c(getEnv(resources, appPreferences), resources.getString(ck6.STAGING)) ? resources.getString(ql6.nytimes_base_url_stage) : resources.getString(ql6.nytimes_base_url);
        zq3.e(string);
        return string;
    }

    private final String getEnv(Resources resources, AppPreferences appPreferences) {
        String string = resources.getString(ck6.com_nytimes_android_phoenix_beta_COMMENTS_ENV);
        zq3.g(string, "getString(...)");
        return appPreferences.l(string, resources.getString(ck6.PRODUCTION));
    }

    private final String getUserBaseUrl(Resources resources, AppPreferences appPreferences) {
        String string = zq3.c(getEnv(resources, appPreferences), resources.getString(ck6.STAGING)) ? resources.getString(ql6.ugc_base_url_stage) : resources.getString(ql6.ugc_base_url);
        zq3.e(string);
        return string;
    }

    public final DraftCommentDatabase provideDraftCommentDatabase(Application application) {
        zq3.h(application, "application");
        DraftCommentDatabase.Companion companion = DraftCommentDatabase.Companion;
        Context applicationContext = application.getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        return companion.build(applicationContext);
    }

    public final CommentsApi provideGetCommentsApi(@CommentsRetrofit Retrofit retrofit) {
        zq3.h(retrofit, "retrofit");
        Object create = retrofit.create(CommentsApi.class);
        zq3.g(create, "create(...)");
        return (CommentsApi) create;
    }

    public final GetCurrentUserApi provideGetCurrentUserAPI(@CommentsRetrofit Retrofit retrofit, Resources resources, AppPreferences appPreferences) {
        zq3.h(retrofit, "retrofit");
        zq3.h(resources, "res");
        zq3.h(appPreferences, "appPreferences");
        Object create = retrofit.newBuilder().baseUrl(getUserBaseUrl(resources, appPreferences)).build().create(GetCurrentUserApi.class);
        zq3.g(create, "create(...)");
        return (GetCurrentUserApi) create;
    }

    @CommentsRetrofit
    public final Retrofit provideRetrofit(b04 b04Var, c05 c05Var, Resources resources, AppPreferences appPreferences) {
        zq3.h(b04Var, "client");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(resources, "res");
        zq3.h(appPreferences, "appPreferences");
        String baseUrl = getBaseUrl(resources, appPreferences);
        OkHttpClient build = ((OkHttpClient) b04Var.get()).newBuilder().addInterceptor(c05Var.p()).build();
        i d = new i.b().a(BaseResponseFactory.Companion.getINSTANCE()).d();
        Retrofit.Builder addConverterFactory = new Retrofit.Builder().baseUrl(baseUrl).client(build).addConverterFactory(MoshiConverterFactory.create(d));
        zq3.e(d);
        Retrofit build2 = addConverterFactory.addConverterFactory(new QueryObjectToJsonConverterFactory(d)).addCallAdapterFactory(w45.Companion.a()).build();
        zq3.g(build2, "build(...)");
        return build2;
    }

    public final WriteNewCommentApi provideWriteNewCommentApi(@CommentsRetrofit Retrofit retrofit) {
        zq3.h(retrofit, "retrofit");
        Object create = retrofit.create(WriteNewCommentApi.class);
        zq3.g(create, "create(...)");
        return (WriteNewCommentApi) create;
    }
}
