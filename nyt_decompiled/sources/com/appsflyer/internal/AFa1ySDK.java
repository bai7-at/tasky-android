package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;

/* loaded from: classes2.dex */
final class AFa1ySDK {
    private IntentFilter AFInAppEventType = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static final class AFa1vSDK {
        static final AFa1ySDK valueOf = new AFa1ySDK();
    }

    /* renamed from: com.appsflyer.internal.AFa1ySDK$AFa1ySDK, reason: collision with other inner class name */
    static final class C0144AFa1ySDK {
        final float AFInAppEventType;
        final String valueOf;

        C0144AFa1ySDK(float f, String str) {
            this.AFInAppEventType = f;
            this.valueOf = str;
        }
    }

    AFa1ySDK() {
    }

    @NonNull
    final C0144AFa1ySDK AFInAppEventParameterName(Context context) {
        String str;
        String str2 = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.AFInAppEventType);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                str2 = str;
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new C0144AFa1ySDK(f, str2);
    }
}
