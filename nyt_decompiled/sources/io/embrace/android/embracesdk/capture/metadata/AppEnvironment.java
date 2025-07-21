package io.embrace.android.embracesdk.capture.metadata;

import android.content.pm.ApplicationInfo;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class AppEnvironment {
    private final Environment environment;
    private final boolean isDebug;

    public enum Environment {
        DEV("dev"),
        PROD("prod"),
        UNKNOWN("UNKNOWN");

        private final String value;

        Environment(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public AppEnvironment(ApplicationInfo applicationInfo) {
        zq3.h(applicationInfo, "appInfo");
        boolean z = (applicationInfo.flags & 2) != 0;
        this.isDebug = z;
        this.environment = z ? Environment.DEV : Environment.PROD;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final boolean isDebug() {
        return this.isDebug;
    }
}
