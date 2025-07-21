package com.nytimes.android.dailyfive.di;

import android.content.SharedPreferences;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.coroutinesutils.d;
import com.nytimes.android.dailyfive.di.DailyFiveModule;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import defpackage.b05;
import defpackage.bq5;
import defpackage.de4;
import defpackage.i81;
import defpackage.j91;
import defpackage.k81;
import defpackage.l81;
import defpackage.u71;
import defpackage.ve2;
import defpackage.w71;
import defpackage.wd2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public final class DailyFiveModule {
    public static final DailyFiveModule a = new DailyFiveModule();

    private DailyFiveModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single f(ApolloClient apolloClient, k81 k81Var, l81 l81Var) {
        zq3.h(apolloClient, "$apolloClient");
        zq3.h(k81Var, "$parser");
        zq3.h(l81Var, "it");
        return RxSingleKt.rxSingle$default(null, new DailyFiveModule$provideDailyFiveFeedStore$1$1(apolloClient, l81Var, k81Var, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single h(ApolloClient apolloClient, u71 u71Var, ww8 ww8Var) {
        zq3.h(apolloClient, "$apolloClient");
        zq3.h(u71Var, "$parser");
        zq3.h(ww8Var, "it");
        return RxSingleKt.rxSingle$default(null, new DailyFiveModule$provideDailyFiveFollowStatusStore$1$1(apolloClient, u71Var, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(l81 l81Var) {
        zq3.h(l81Var, "it");
        return "your_daily_five";
    }

    public final j91 d(SharedPreferences sharedPreferences, b05 b05Var) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(b05Var, "clock");
        return new j91(sharedPreferences, new DailyFiveModule$provideDailyFiveExpirationChecker$1(b05Var), "LAST_DAILY_FIVE_FETCH_TIMESTAMP", 0L, 8, null);
    }

    public final d e(final ApolloClient apolloClient, MoshiFileSystemPersister moshiFileSystemPersister, final k81 k81Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(moshiFileSystemPersister, "persister");
        zq3.h(k81Var, "parser");
        return d.Companion.a(moshiFileSystemPersister, new wd2() { // from class: b81
            @Override // defpackage.wd2
            public final Single fetch(Object obj) {
                Single f;
                f = DailyFiveModule.f(ApolloClient.this, k81Var, (l81) obj);
                return f;
            }
        });
    }

    public final d g(final ApolloClient apolloClient, w71 w71Var, final u71 u71Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(w71Var, "persister");
        zq3.h(u71Var, "parser");
        return d.Companion.a(w71Var, new wd2() { // from class: c81
            @Override // defpackage.wd2
            public final Single fetch(Object obj) {
                Single h;
                h = DailyFiveModule.h(ApolloClient.this, u71Var, (ww8) obj);
                return h;
            }
        });
    }

    public final MoshiFileSystemPersister i(ve2 ve2Var) {
        zq3.h(ve2Var, "fileSystem");
        return new MoshiFileSystemPersister(ve2Var, i81.a.b(), new bq5() { // from class: a81
            @Override // defpackage.bq5
            public final String a(Object obj) {
                String j;
                j = DailyFiveModule.j((l81) obj);
                return j;
            }
        });
    }

    public final de4 k(DailyFiveMainTabFactory dailyFiveMainTabFactory) {
        zq3.h(dailyFiveMainTabFactory, "factory");
        return dailyFiveMainTabFactory;
    }
}
