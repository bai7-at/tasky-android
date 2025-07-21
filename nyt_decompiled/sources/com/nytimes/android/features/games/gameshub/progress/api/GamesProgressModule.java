package com.nytimes.android.features.games.gameshub.progress.api;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.features.games.gameshub.configuration.DebugGamesConfigurationRepository;
import com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider;
import com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase;
import com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase;
import com.nytimes.android.features.games.gameshub.playtab.usecase.a;
import com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider;
import defpackage.at3;
import defpackage.au2;
import defpackage.cb2;
import defpackage.dt3;
import defpackage.ju0;
import defpackage.qv6;
import defpackage.rk6;
import defpackage.ss2;
import defpackage.tt3;
import defpackage.ww8;
import defpackage.zq3;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class GamesProgressModule {
    public static final GamesProgressModule a = new GamesProgressModule();

    private GamesProgressModule() {
    }

    public final ju0 a(Application application, cb2 cb2Var, at3 at3Var, qv6 qv6Var) {
        zq3.h(application, "context");
        zq3.h(cb2Var, "featureFlag");
        zq3.h(at3Var, "decoder");
        zq3.h(qv6Var, "remoteConfig");
        return cb2Var.k() ? new DebugGamesConfigurationRepository(application) : new au2(qv6Var, at3Var);
    }

    public final a b(Application application, cb2 cb2Var, GamesConfigurationProvider gamesConfigurationProvider, GamesProgressProvider gamesProgressProvider) {
        zq3.h(application, "context");
        zq3.h(cb2Var, "featureFlag");
        zq3.h(gamesConfigurationProvider, "configProvider");
        zq3.h(gamesProgressProvider, "progressProvider");
        return cb2Var.j() ? new DebugDataUseCase(application, gamesConfigurationProvider) : new MainDataUseCase(application, gamesConfigurationProvider, gamesProgressProvider);
    }

    public final GamesProgressApi c(Retrofit.Builder builder, Resources resources) {
        zq3.h(builder, "retrofitBuilder");
        zq3.h(resources, "res");
        Object create = builder.baseUrl(resources.getString(rk6.games_progress_base_url)).build().create(GamesProgressApi.class);
        zq3.g(create, "create(...)");
        return (GamesProgressApi) create;
    }

    public final at3 d() {
        return tt3.b(null, new ss2() { // from class: com.nytimes.android.features.games.gameshub.progress.api.GamesProgressModule$provideJsonDecoder$1
            public final void b(dt3 dt3Var) {
                zq3.h(dt3Var, "$this$Json");
                dt3Var.d(true);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((dt3) obj);
                return ww8.a;
            }
        }, 1, null);
    }
}
