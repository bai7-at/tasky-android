package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.comscore.android.util.jni.AndroidJniHelper;
import com.nytimes.android.logging.NYTLogger;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class lk8 {
    public static final lk8 a = new lk8();

    private lk8() {
    }

    public final boolean a(PackageManager packageManager) {
        PackageManager.PackageInfoFlags of;
        zq3.h(packageManager, AndroidJniHelper.KEY_PACKAGE_MANAGER);
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.PackageInfoFlags.of(0L);
                packageManager.getPackageInfo("com.theathletic", of);
            } else {
                packageManager.getPackageInfo("com.theathletic", 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            NYTLogger.m(e);
            return false;
        }
    }

    public final void b(Context context, String str) {
        zq3.h(context, "context");
        if (str == null) {
            return;
        }
        String str2 = (String) h.F0(str, new String[]{"/"}, false, 0, 6, null).get(4);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("theathletic://article/" + str2));
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            NYTLogger.h(e);
        }
    }

    public final void c(Context context) {
        zq3.h(context, "context");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.theathletic")));
        } catch (ActivityNotFoundException e) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.theathletic")));
            NYTLogger.h(e);
        }
    }
}
