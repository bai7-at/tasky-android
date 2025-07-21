package com.nytimes.android.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Display;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.nytimes.android.utils.ScreenWidth;
import defpackage.c04;
import defpackage.kk6;
import defpackage.qs2;
import defpackage.sc6;
import defpackage.u31;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class DeviceUtils {
    private static final c04 a = kotlin.c.a(new qs2() { // from class: com.nytimes.android.utils.DeviceUtils$osVersion$2
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final String mo865invoke() {
            return Build.VERSION.RELEASE;
        }
    });
    private static final c04 b = kotlin.c.a(new qs2() { // from class: com.nytimes.android.utils.DeviceUtils$deviceName$2
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final String mo865invoke() {
            return Build.MANUFACTURER + " " + Build.MODEL;
        }
    });

    public static final boolean A(Context context) {
        zq3.h(context, "<this>");
        return F(context) || E(context);
    }

    public static final boolean B(Context context) {
        zq3.h(context, "<this>");
        return h(context) == 1;
    }

    public static final boolean C(Context context) {
        zq3.h(context, "<this>");
        return !G(context);
    }

    public static final String D(Context context) {
        zq3.h(context, "<this>");
        return C(context) ? "phone" : "tablet";
    }

    public static final boolean E(Context context) {
        zq3.h(context, "<this>");
        long freeMemory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long maxMemory = Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        return ((float) (maxMemory - freeMemory)) < ((float) maxMemory) * 0.1f;
    }

    private static final boolean F(Context context) {
        Object systemService = context.getSystemService("activity");
        zq3.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static final boolean G(Context context) {
        zq3.h(context, "<this>");
        return context.getResources().getBoolean(sc6.is_tablet);
    }

    public static final float H(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final String a(Context context) {
        zq3.h(context, "<this>");
        return C(context) ? "droidapp" : "drtabapp";
    }

    public static final int b(float f) {
        return (int) Math.ceil(f * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final String c(Context context) {
        zq3.h(context, "<this>");
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static final String d(Context context) {
        zq3.h(context, "<this>");
        String string = context.getString(kk6.com_nytimes_android_build_type);
        zq3.g(string, "getString(...)");
        return string;
    }

    public static final Display e(Context context) {
        zq3.h(context, "<this>");
        Object systemService = context.getSystemService("display");
        zq3.f(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService).getDisplay(0);
        zq3.g(display, "getDisplay(...)");
        return display;
    }

    public static final int f() {
        return (int) (Resources.getSystem().getDisplayMetrics().heightPixels / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final String g() {
        return (String) b.getValue();
    }

    public static final int h(Context context) {
        zq3.h(context, "<this>");
        return context.getResources().getConfiguration().orientation;
    }

    public static final int i() {
        return (int) (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final String j(Context context, SharedPreferences sharedPreferences) {
        zq3.h(context, "<this>");
        zq3.h(sharedPreferences, "sharedPreferences");
        if (zq3.c("", sharedPreferences.getString("DeviceID", ""))) {
            try {
                String c = c(context);
                if (c != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    zq3.g(edit, "editor");
                    edit.putString("DeviceID", u31.a(c));
                    edit.apply();
                }
            } catch (Exception unused) {
            }
        }
        String string = sharedPreferences.getString("DeviceID", "");
        return string == null ? "" : string;
    }

    public static final long k() {
        return Runtime.getRuntime().freeMemory();
    }

    public static final String l() {
        Object value = a.getValue();
        zq3.g(value, "getValue(...)");
        return (String) value;
    }

    public static final float m(Context context) {
        zq3.h(context, "<this>");
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int n(Context context) {
        zq3.h(context, "<this>");
        return o(context).y;
    }

    public static final Point o(Context context) {
        zq3.h(context, "<this>");
        Point point = new Point();
        e(context).getSize(point);
        return point;
    }

    public static final int p(Context context) {
        zq3.h(context, "<this>");
        return o(context).x;
    }

    public static final float q(Context context) {
        zq3.h(context, "<this>");
        return o(context).x / m(context);
    }

    public static final int r(Context context) {
        zq3.h(context, "<this>");
        Resources resources = context.getResources();
        Integer valueOf = Integer.valueOf(resources.getIdentifier("status_bar_height", "dimen", "android"));
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return resources.getDimensionPixelSize(valueOf.intValue());
        }
        return 0;
    }

    public static final long s() {
        return Runtime.getRuntime().totalMemory();
    }

    public static final String t(Context context, boolean z, boolean z2) {
        zq3.h(context, "<this>");
        StringBuilder sb = new StringBuilder();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            sb.append(packageInfo.versionName);
            if (z) {
                if (z2) {
                    String d = d(context);
                    if (d.length() > 0) {
                        sb.append('-');
                        sb.append(d);
                    }
                    sb.append(" (");
                    sb.append(packageInfo.versionCode);
                    sb.append(")");
                } else {
                    sb.append("-");
                    sb.append(packageInfo.versionCode);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            sb.append(DatasetUtils.UNKNOWN_IDENTITY_ID);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String u(Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return t(context, z, z2);
    }

    public static final String v(Context context) {
        zq3.h(context, "<this>");
        try {
            String num = Integer.toString(x(context));
            zq3.e(num);
            return num;
        } catch (PackageManager.NameNotFoundException unused) {
            return DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
    }

    public static final int w(Context context) {
        zq3.h(context, "<this>");
        try {
            return x(context);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static final int x(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static final boolean y(Context context, ScreenWidth.ScreenWidthType screenWidthType) {
        zq3.h(context, "<this>");
        zq3.h(screenWidthType, "targetWidth");
        return new ScreenWidth().a(context).getValue() >= screenWidthType.getValue();
    }

    public static final boolean z(Context context) {
        zq3.h(context, "<this>");
        return zq3.c(context.getString(kk6.com_nytimes_android_build_type), "debug");
    }
}
