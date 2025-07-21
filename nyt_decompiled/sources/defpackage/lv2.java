package defpackage;

import android.app.Application;
import com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider;
import com.nytimes.android.features.games.gameshub.playtab.usecase.a;
import com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider;
import com.nytimes.android.features.games.gameshub.progress.api.GamesProgressModule;

/* loaded from: classes4.dex */
public abstract class lv2 implements ba2 {
    public static a a(Application application, cb2 cb2Var, GamesConfigurationProvider gamesConfigurationProvider, GamesProgressProvider gamesProgressProvider) {
        return (a) g16.e(GamesProgressModule.a.b(application, cb2Var, gamesConfigurationProvider, gamesProgressProvider));
    }
}
