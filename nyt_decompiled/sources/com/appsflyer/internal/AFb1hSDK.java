package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.Nullable;

/* loaded from: classes2.dex */
public final class AFb1hSDK {
    @Nullable
    public static Uri AFInAppEventParameterName(Activity activity) {
        return activity.getReferrer();
    }
}
