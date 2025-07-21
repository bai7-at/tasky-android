package io.embrace.android.embracesdk.session.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import defpackage.zq3;

/* loaded from: classes5.dex */
public interface ActivityLifecycleListener {

    public static final class DefaultImpls {
        public static void applicationStartupComplete(ActivityLifecycleListener activityLifecycleListener) {
        }

        public static void onActivityCreated(ActivityLifecycleListener activityLifecycleListener, Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
        }

        public static void onView(ActivityLifecycleListener activityLifecycleListener, Activity activity) {
            zq3.h(activity, "activity");
        }

        public static void onViewClose(ActivityLifecycleListener activityLifecycleListener, Activity activity) {
            zq3.h(activity, "activity");
        }
    }

    void applicationStartupComplete();

    void onActivityCreated(Activity activity, Bundle bundle);

    void onView(Activity activity);

    void onViewClose(Activity activity);
}
