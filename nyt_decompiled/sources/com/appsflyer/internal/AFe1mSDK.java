package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFe1lSDK;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AFe1mSDK extends AFe1lSDK {
    AFe1mSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    final void AFKeystoreWrapper(Context context, AFb1jSDK<Map<String, Object>> aFb1jSDK) {
        AFa1aSDK.values();
        if (AFa1aSDK.AFInAppEventType(AFa1aSDK.AFInAppEventType(context), false) > 0 || !aFb1jSDK.values()) {
            return;
        }
        aFb1jSDK.AFInAppEventParameterName.valueOf().execute(aFb1jSDK.valueOf);
        this.afErrorLog = System.currentTimeMillis();
        this.afRDLog = AFe1lSDK.AFa1wSDK.STARTED;
        addObserver(new AFe1lSDK.AnonymousClass4());
    }
}
