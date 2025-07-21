package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;

/* loaded from: classes2.dex */
public interface AFc1qSDK {
    @WorkerThread
    void AFInAppEventType(@NonNull AFc1nSDK<?> aFc1nSDK);

    @WorkerThread
    void AFInAppEventType(@NonNull AFc1nSDK<?> aFc1nSDK, @NonNull AFc1rSDK aFc1rSDK);

    @WorkerThread
    void values(@NonNull AFc1nSDK<?> aFc1nSDK);
}
