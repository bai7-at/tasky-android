package com.nytimes.games.spellingbee.di;

import android.app.Application;
import android.content.Context;
import androidx.preference.g;
import com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem;
import com.nytimes.xwords.hybrid.devsettings.GamesHybridDevSettingFactory;
import defpackage.ss2;
import defpackage.yn1;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class GamesHybridDevSettingsModule {
    public static final GamesHybridDevSettingsModule a = new GamesHybridDevSettingsModule();
    private static final yn1.b b = new yn1.b("Hybrid Games");

    private GamesHybridDevSettingsModule() {
    }

    public final Set a(Application application) {
        zq3.h(application, "application");
        GamesHybridDevSettingFactory gamesHybridDevSettingFactory = GamesHybridDevSettingFactory.a;
        Context applicationContext = application.getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        yn1.b bVar = b;
        final String str = "HYBRID_URL_PREF_KEY";
        return b0.m(gamesHybridDevSettingFactory.a(applicationContext, bVar), b0.d(new DevSettingTextFieldConfirmationButtonItem("Load Hybrid URL", new ss2() { // from class: com.nytimes.games.spellingbee.di.GamesHybridDevSettingsModule$provideHybridGamesDevSettings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(Context context) {
                zq3.h(context, "it");
                String string = g.b(context).getString(str, null);
                return string == null ? "" : string;
            }
        }, new GamesHybridDevSettingsModule$provideHybridGamesDevSettings$2("HYBRID_URL_PREF_KEY", null), null, "Load", null, null, null, false, false, bVar, null, false, 7144, null)));
    }
}
