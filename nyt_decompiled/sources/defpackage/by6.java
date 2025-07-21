package defpackage;

import com.nytimes.android.crashlytics.CrashlyticsConfig;
import com.nytimes.android.utils.AppPreferences;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public abstract class by6 implements ba2 {
    public static CrashlyticsConfig a(AppPreferences appPreferences, BehaviorSubject behaviorSubject) {
        return (CrashlyticsConfig) g16.e(ay6.a.a(appPreferences, behaviorSubject));
    }
}
