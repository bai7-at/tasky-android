package com.nytimes.android.dimodules;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.nytimes.android.features.settings.AccountSettingsPresenter;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.sectionfrontrefresher.SectionFrontResourcesProvider;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.bh7;
import defpackage.cb2;
import defpackage.ch7;
import defpackage.f15;
import defpackage.iq4;
import defpackage.jh5;
import defpackage.kk6;
import defpackage.l17;
import defpackage.ls2;
import defpackage.r57;
import defpackage.t98;
import defpackage.vb2;
import defpackage.xq5;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes4.dex */
public interface ActivityModule {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final AccountSettingsPresenter a(com.nytimes.android.entitlements.a aVar) {
            zq3.h(aVar, "eCommClient");
            return new AccountSettingsPresenter(aVar);
        }

        public final ls2 b(Activity activity) {
            zq3.h(activity, "activity");
            return new ls2(activity);
        }

        public final Map c(iq4 iq4Var) {
            zq3.h(iq4Var, "menuMapProvider");
            return iq4Var.c();
        }

        public final OneTapLifecycleObserver d(Activity activity, Subauth subauth, t98 t98Var, xq5 xq5Var, jh5 jh5Var, cb2 cb2Var) {
            zq3.h(activity, "activity");
            zq3.h(subauth, "subauth");
            zq3.h(t98Var, "subauthUserUI");
            zq3.h(xq5Var, "perVersionManager");
            zq3.h(jh5Var, "oneTapEventTracker");
            zq3.h(cb2Var, "featureFlagUtil");
            return new OneTapLifecycleObserver((androidx.fragment.app.f) activity, subauth.i(), subauth.p(), xq5Var, jh5Var, subauth.o(), new ActivityModule$Companion$provideOneTapLifecycleObserver$1(cb2Var, t98Var, null));
        }

        public final xq5 e(Activity activity, SharedPreferences sharedPreferences) {
            zq3.h(activity, "activity");
            zq3.h(sharedPreferences, "sharedPreferences");
            return new xq5(activity, sharedPreferences);
        }

        public final l17 f(Activity activity) {
            zq3.h(activity, "activity");
            l17 a2 = com.google.android.play.core.review.a.a(activity);
            zq3.g(a2, "create(...)");
            return a2;
        }

        public final bh7 g(NetworkStatus networkStatus, r57 r57Var, SnackbarUtil snackbarUtil, Resources resources, AppPreferences appPreferences, TimeStampUtil timeStampUtil, f15 f15Var, SectionFrontResourcesProvider sectionFrontResourcesProvider, vb2 vb2Var) {
            zq3.h(networkStatus, "networkStatus");
            zq3.h(r57Var, "sectionFrontStore");
            zq3.h(snackbarUtil, "snackbarUtil");
            zq3.h(resources, "resources");
            zq3.h(appPreferences, "appPreferences");
            zq3.h(timeStampUtil, "timeStampUtil");
            zq3.h(f15Var, "nytScheduler");
            zq3.h(sectionFrontResourcesProvider, "sectionFrontResourcesProvider");
            zq3.h(vb2Var, "feedPerformanceTracker");
            return new bh7(new ch7(networkStatus, r57Var, snackbarUtil, appPreferences, timeStampUtil, f15Var, sectionFrontResourcesProvider.f(), sectionFrontResourcesProvider.b(), zq3.c("debug", resources.getString(kk6.com_nytimes_android_build_type)), vb2Var));
        }

        public final SmartLockLifecycleObserver h(Activity activity, Subauth subauth, xq5 xq5Var) {
            zq3.h(activity, "activity");
            zq3.h(subauth, "subauth");
            zq3.h(xq5Var, "perVersionManager");
            return new SmartLockLifecycleObserver((androidx.fragment.app.f) activity, subauth.i(), subauth.p(), xq5Var, subauth.o());
        }
    }
}
