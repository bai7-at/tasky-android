package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public abstract class pzc extends fgb {
    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : fgb.a.d(str)) {
                if (z) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return fgb.j(2) && ((Boolean) yra.a.e()).booleanValue();
    }
}
