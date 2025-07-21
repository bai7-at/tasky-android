package com.comscore.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.chartbeat.androidsdk.QueryKeys;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class CommonUtils {
    private static final String a = "persist.sys.dalvik.vm.lib";
    private static final String b = "libdvm.so";
    private static final String c = "libart.so";
    private static final String d = "libartd.so";

    private CommonUtils() {
    }

    private static boolean a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean b() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getApplicationName(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            try {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
                if (applicationLabel != null) {
                    return applicationLabel.toString();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return DatasetUtils.UNKNOWN_IDENTITY_ID;
    }

    public static String getApplicationResolution(Context context) {
        Point applicationSize = getApplicationSize(context);
        return applicationSize.x + QueryKeys.SCROLL_POSITION_TOP + applicationSize.y;
    }

    public static Point getApplicationSize(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    public static String getApplicationVersion(Context context) {
        if (context == null) {
            return DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
    }

    public static int getConnectivityType(Context context) {
        if (context == null || !a.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue()) {
            return ConnectivityType.UNKNOWN;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return ConnectivityType.DISCONNECTED;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null ? networkCapabilities.hasTransport(0) ? ConnectivityType.WWAN : networkCapabilities.hasTransport(1) ? ConnectivityType.WIFI : networkCapabilities.hasTransport(3) ? ConnectivityType.ETHERNET : networkCapabilities.hasTransport(2) ? ConnectivityType.BLUETOOTH : ConnectivityType.CONNECTED : ConnectivityType.UNKNOWN;
    }

    public static String getDeviceArchitecture() {
        return System.getProperty("os.arch");
    }

    public static String getDeviceModel() {
        return Build.DEVICE;
    }

    public static String getDisplayResolution(Context context) {
        Point displaySize = getDisplaySize(context);
        return displaySize.x + QueryKeys.SCROLL_POSITION_TOP + displaySize.y;
    }

    @SuppressLint({"NewApi"})
    public static Point getDisplaySize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Point(point.x, point.y);
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getOsName() {
        return "android";
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getPackageName(Context context) {
        return context == null ? DatasetUtils.UNKNOWN_IDENTITY_ID : context.getPackageName();
    }

    public static String getRuntime() {
        String property = System.getProperty("java.vm.name");
        Locale locale = Locale.US;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, a, "Dalvik");
            return b.equals(str) ? "Dalvik".toLowerCase(locale) : c.equals(str) ? "ART".toLowerCase(locale) : d.equals(str) ? "ART_Debug".toLowerCase(locale) : str.toLowerCase(locale);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return property.toLowerCase(locale);
        }
    }

    public static boolean isDeviceRooted() {
        return a() || b();
    }
}
