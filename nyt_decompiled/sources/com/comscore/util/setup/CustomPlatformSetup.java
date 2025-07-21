package com.comscore.util.setup;

import com.comscore.android.util.jni.AndroidJniHelper;
import com.comscore.android.util.log.AndroidLogger;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.LogHelper;

/* loaded from: classes2.dex */
public class CustomPlatformSetup extends PlatformSetup {
    private static final String a = "6.9.0+2204261318";

    @Override // com.comscore.util.setup.PlatformSetup
    public JniComScoreHelper createApplicationInfoHelper() {
        return new AndroidJniHelper();
    }

    @Override // com.comscore.util.setup.PlatformSetup
    public LogHelper createLogger() {
        return new AndroidLogger();
    }

    @Override // com.comscore.util.setup.PlatformSetup
    public String getJavaCodeVersion() {
        return a;
    }
}
