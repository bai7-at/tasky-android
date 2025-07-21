package com.nytimes.android.interests;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.f;
import com.nytimes.android.interests.db.InterestsDatabase;
import com.nytimes.android.utils.AppPreferences;
import defpackage.b05;
import defpackage.eq3;
import defpackage.gp3;
import defpackage.j91;
import defpackage.zq3;
import java.io.File;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class FeatureInterestsModule {
    public static final FeatureInterestsModule a = new FeatureInterestsModule();

    private FeatureInterestsModule() {
    }

    public final gp3 a(InterestsDatabase interestsDatabase) {
        zq3.h(interestsDatabase, "database");
        return interestsDatabase.d();
    }

    public final InterestsManager b(InterestsRepository interestsRepository, InterestsCacheManager interestsCacheManager, CoroutineDispatcher coroutineDispatcher, File file, b05 b05Var, SharedPreferences sharedPreferences) {
        zq3.h(interestsRepository, "interestsRepository");
        zq3.h(interestsCacheManager, "interestsCacheManager");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(file, "baseDir");
        zq3.h(b05Var, "clock");
        zq3.h(sharedPreferences, "prefs");
        return new InterestsManager(interestsRepository, interestsCacheManager, coroutineDispatcher, file, b05Var, sharedPreferences);
    }

    public final InterestsOnboardingManager c(InterestsRepository interestsRepository, AppPreferences appPreferences) {
        zq3.h(interestsRepository, "interestsRepository");
        zq3.h(appPreferences, "appPreferences");
        return new InterestsOnboardingManager(interestsRepository, appPreferences);
    }

    public final InterestsDatabase d(Application application) {
        zq3.h(application, "application");
        Context applicationContext = application.getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        return (InterestsDatabase) f.a(applicationContext, InterestsDatabase.class, "user-interests").b(eq3.a(), eq3.b(), eq3.c()).d();
    }

    public final j91 e(SharedPreferences sharedPreferences, b05 b05Var) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(b05Var, "clock");
        return new j91(sharedPreferences, new FeatureInterestsModule$provideUserInterestsExpirationChecker$1(b05Var), "LAST_USER_INTERESTS_FETCH_TIMESTAMP", 21600000L);
    }
}
