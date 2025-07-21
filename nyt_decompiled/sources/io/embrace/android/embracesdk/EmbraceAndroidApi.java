package io.embrace.android.embracesdk;

import android.content.Context;
import io.embrace.android.embracesdk.Embrace;

/* loaded from: classes5.dex */
interface EmbraceAndroidApi extends EmbraceApi {
    boolean endView(String str);

    boolean isStarted();

    void start(Context context);

    void start(Context context, boolean z);

    void start(Context context, boolean z, Embrace.AppFramework appFramework);

    boolean startView(String str);
}
