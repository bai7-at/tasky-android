package com.nytimes.android.features.home;

import android.content.SharedPreferences;
import com.nytimes.android.devsettings.base.item.DevSettingXmlItem;
import defpackage.b05;
import defpackage.go6;
import defpackage.j91;
import defpackage.yn1;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public interface HomeSingletonComponent {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final Set a() {
            return b0.d(new DevSettingXmlItem("Home - One WebView", "GraphQL id", go6.graphql_settings_screen, yn1.a.b, null, false, 48, null));
        }

        public final j91 b(SharedPreferences sharedPreferences, b05 b05Var) {
            zq3.h(sharedPreferences, "prefs");
            zq3.h(b05Var, "clock");
            return new j91(sharedPreferences, new HomeSingletonComponent$Companion$provideProgramExpirationChecker$1(b05Var), "LAST_HOME_FETCH_TIMESTAMP", 0L, 8, null);
        }
    }
}
