package io.embrace.android.embracesdk.internal;

import android.os.Build;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class SystemInfoKt {
    public static final String getDeviceManufacturer() {
        try {
            String str = Build.MANUFACTURER;
            zq3.g(str, "Build.MANUFACTURER");
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final String getDeviceModel() {
        try {
            String str = Build.MODEL;
            zq3.g(str, "Build.MODEL");
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final String getOsApiLevel() {
        try {
            return String.valueOf(Build.VERSION.SDK_INT);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final String getOsBuild() {
        String str = Build.VERSION.BASE_OS;
        zq3.g(str, "Build.VERSION.BASE_OS");
        return str;
    }

    public static final String getOsVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            zq3.g(str, "Build.VERSION.RELEASE");
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }
}
