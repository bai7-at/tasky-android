package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.state.AppStateObserver;

/* loaded from: classes4.dex */
public final class m32 {
    public static final m32 a = new m32();

    private m32() {
    }

    public final ab a(SharedPreferences sharedPreferences, EventTracker.a aVar) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(aVar, "configuration");
        return ab.Companion.a(sharedPreferences, aVar.k(), aVar.d(), aVar.c());
    }

    public final fu b(EventTracker.a aVar) {
        zq3.h(aVar, "configuration");
        return fu.Companion.a(aVar.e());
    }

    public final cm0 c(Application application) {
        zq3.h(application, "context");
        return new ft8(application);
    }

    public final ls4 d(EventTracker.a aVar) {
        zq3.h(aVar, "configuration");
        return ls4.Companion.a(aVar.h());
    }

    public final String e(Application application) {
        zq3.h(application, "context");
        String string = Settings.Secure.getString(application.getContentResolver(), "android_id");
        zq3.g(string, "getString(...)");
        return string;
    }

    public final jl7 f(SharedPreferences sharedPreferences, EventTracker.a aVar) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(aVar, "configuration");
        return jl7.Companion.a(sharedPreferences, aVar.l());
    }

    public final an g(AppStateObserver appStateObserver) {
        zq3.h(appStateObserver, "appStateObserver");
        return an.Companion.a(appStateObserver);
    }
}
