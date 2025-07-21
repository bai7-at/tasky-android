package com.chartbeat.androidsdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;

/* loaded from: classes2.dex */
final class SystemUtils {
    private static final String GENERIC_ANDROID_MOBILE_USER_AGENT = "Mozilla/5.0 (Android 6.0.1; Mobile; rv:50.0) Gecko/50.0 Firefox/50.0";
    private static final String GENERIC_ANDROID_TABLET_USER_AGENT = "Mozilla/5.0 (Linux; Android 7.0; Pixel C Build/NRD90M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/52.0.2743.98 Safari/537.36";
    private static final String STATIC_MOBILE_USER_AGENT = "Mozilla/5.0 (Android 6.0.1; Mobile; rv:50.0) Gecko/50.0 Firefox/50.0/cbua/App";
    private static final String STATIC_TABLET_USER_AGENT = "Mozilla/5.0 (Linux; Android 7.0; Pixel C Build/NRD90M; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/52.0.2743.98 Safari/537.36/cbua/App";
    private static final String TAG = "SystemUtils";
    private static final String USER_AGENT_SUFFIX = "/cbua/App";

    @TargetApi(17)
    private static class NewApiWrapper {
        private NewApiWrapper() {
        }

        static String getDefaultUserAgent(Context context) {
            return WebSettings.getDefaultUserAgent(context);
        }
    }

    SystemUtils() {
    }

    private static boolean checkIsTablet(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 7.0d;
        } catch (Exception unused) {
            return false;
        }
    }

    static Point getScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        defaultDisplay.getRealSize(point);
        return new Point((int) (point.x / f), (int) (point.y / f));
    }

    static String getSystemUserAgent(Context context) {
        return checkIsTablet(context) ? STATIC_TABLET_USER_AGENT : STATIC_MOBILE_USER_AGENT;
    }

    static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }
}
