package co.datadome.sdk;

import android.os.Build;

/* loaded from: classes.dex */
abstract class k {
    static {
        String str = Build.VERSION.RELEASE;
        Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
        String str2 = Build.MODEL;
        String str3 = Build.PRODUCT;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.DEVICE;
        String str6 = Build.HARDWARE;
        String str7 = Build.FINGERPRINT;
        String str8 = Build.TAGS;
    }

    k() {
    }
}
