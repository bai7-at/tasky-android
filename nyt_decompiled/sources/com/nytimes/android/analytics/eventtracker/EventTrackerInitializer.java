package com.nytimes.android.analytics.eventtracker;

import android.app.Application;
import android.content.SharedPreferences;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.utils.AppPreferences;
import defpackage.m40;
import defpackage.r42;
import defpackage.vp1;
import defpackage.zq3;
import io.reactivex.Single;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class EventTrackerInitializer {
    private final Application a;
    private final SharedPreferences b;
    private final AppPreferences c;
    private final r42 d;
    private final Single e;
    private final vp1 f;
    private final boolean g;
    private final Set h;
    private final m40 i;

    public EventTrackerInitializer(Application application, SharedPreferences sharedPreferences, AppPreferences appPreferences, r42 r42Var, Single single, vp1 vp1Var, boolean z, Set set, m40 m40Var) {
        zq3.h(application, "application");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(r42Var, "eventCallback");
        zq3.h(single, "agentId");
        zq3.h(vp1Var, "deviceTokenProvider");
        zq3.h(set, "streamCallbacks");
        zq3.h(m40Var, "bannedEventInterceptor");
        this.a = application;
        this.b = sharedPreferences;
        this.c = appPreferences;
        this.d = r42Var;
        this.e = single;
        this.f = vp1Var;
        this.g = z;
        this.h = set;
        this.i = m40Var;
    }

    private final EventTracker.Guard a() {
        return (this.g && this.b.getBoolean("com.nytimes.android.phoenix.beta.ET2_GUARD", false)) ? EventTracker.Guard.ASSERT : EventTracker.Guard.WARN;
    }

    public final void b() {
        EventTracker eventTracker = EventTracker.a;
        eventTracker.j(a());
        eventTracker.e(new EventTracker.Builder(this.a).j(this.c.n("FreshInstallLaunch", true)).k("newsreader-android-prd").i(this.g ? EventTracker.Environment.STAGING : EventTracker.Environment.PRODUCTION).d(this.e).h(new EventTrackerInitializer$init$1(this.f)).f(this.d).b(this.i).e());
        Set set = this.h;
        r42 r42Var = this.d;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            r42Var.t((r42.c) it2.next());
        }
    }
}
