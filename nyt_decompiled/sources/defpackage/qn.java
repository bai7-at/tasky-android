package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.appsflyer.AppsFlyerLib;
import com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public interface qn {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final mn a(AppsFlyerClient appsFlyerClient, CoroutineDispatcher coroutineDispatcher) {
            zq3.h(appsFlyerClient, "appsFlyerClient");
            zq3.h(coroutineDispatcher, "defaultDispatcher");
            return new mn(appsFlyerClient, coroutineDispatcher);
        }

        public final String b(Resources resources) {
            zq3.h(resources, "resources");
            String string = resources.getString(hl6.af_devkey);
            zq3.g(string, "getString(...)");
            return string;
        }

        public final String c(AppsFlyerLib appsFlyerLib, Application application) {
            zq3.h(appsFlyerLib, "appsFlyerLib");
            zq3.h(application, "application");
            return appsFlyerLib.getAppsFlyerUID(application);
        }
    }
}
