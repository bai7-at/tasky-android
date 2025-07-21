package com.nytimes.android.ribbon.di;

import android.content.SharedPreferences;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.ribbon.di.GamesModule;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.b05;
import defpackage.bq5;
import defpackage.j91;
import defpackage.ve2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class GamesModule {
    public static final GamesModule a = new GamesModule();

    private GamesModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(ww8 ww8Var) {
        zq3.h(ww8Var, "it");
        return "games-assets";
    }

    public final MoshiFileSystemPersister b(ve2 ve2Var, i iVar) {
        zq3.h(ve2Var, "fileSystem");
        zq3.h(iVar, "moshi");
        JsonAdapter d = iVar.d(j.j(List.class, Asset.class));
        zq3.g(d, "adapter(...)");
        return new MoshiFileSystemPersister(ve2Var, d, new bq5() { // from class: ev2
            @Override // defpackage.bq5
            public final String a(Object obj) {
                String c;
                c = GamesModule.c((ww8) obj);
                return c;
            }
        });
    }

    public final j91 d(SharedPreferences sharedPreferences, b05 b05Var) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(b05Var, "clock");
        return new j91(sharedPreferences, new GamesModule$provideGamesExpirationChecker$1(b05Var), "LAST_GAMES_ASSETS_FETCH_TIMESTAMP", TimeUnit.HOURS.toMillis(24L));
    }
}
