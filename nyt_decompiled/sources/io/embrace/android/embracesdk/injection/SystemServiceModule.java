package io.embrace.android.embracesdk.injection;

import android.app.ActivityManager;
import android.app.usage.StorageStatsManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.view.WindowManager;

/* loaded from: classes5.dex */
public interface SystemServiceModule {
    ActivityManager getActivityManager();

    ConnectivityManager getConnectivityManager();

    PowerManager getPowerManager();

    StorageStatsManager getStorageManager();

    WindowManager getWindowManager();
}
