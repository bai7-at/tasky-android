package io.embrace.android.embracesdk.session.lifecycle;

import android.app.Activity;
import android.app.Application;
import java.io.Closeable;

/* loaded from: classes5.dex */
public interface ActivityTracker extends Application.ActivityLifecycleCallbacks, Closeable {
    void addListener(ActivityLifecycleListener activityLifecycleListener);

    Activity getForegroundActivity();
}
