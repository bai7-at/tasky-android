package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.preference.g;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public interface x16 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final qq3 a(Application application) {
            zq3.h(application, "application");
            return new c95(application);
        }

        public final boolean b(Application application, AppPreferences appPreferences) {
            zq3.h(application, "context");
            zq3.h(appPreferences, "preferences");
            String string = application.getString(km6.background_update_key);
            zq3.g(string, "getString(...)");
            return zq3.c(appPreferences.l(string, application.getString(km6.background_update_default)), application.getString(km6.noneRequirePTR_value));
        }

        public final boolean c(Application application, AppPreferences appPreferences) {
            zq3.h(application, "context");
            zq3.h(appPreferences, "preferences");
            String string = application.getString(km6.background_update_key);
            zq3.g(string, "getString(...)");
            return zq3.c(appPreferences.l(string, application.getString(km6.background_update_default)), application.getString(km6.wifi_only_value));
        }

        public final SharedPreferences d(Application application) {
            zq3.h(application, "application");
            SharedPreferences b = g.b(application);
            zq3.g(b, "getDefaultSharedPreferences(...)");
            return b;
        }
    }
}
