package defpackage;

import com.nytimes.android.crashlytics.CrashlyticsConfig;
import com.nytimes.android.utils.AppPreferences;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public final class ay6 {
    public static final ay6 a = new ay6();

    private ay6() {
    }

    public final CrashlyticsConfig a(AppPreferences appPreferences, BehaviorSubject behaviorSubject) {
        zq3.h(appPreferences, "appPreferences");
        zq3.h(behaviorSubject, "cachedSubauthUserAnalyticsHelperSubject");
        return new CrashlyticsConfig(i21.Companion.a(), appPreferences, behaviorSubject);
    }
}
