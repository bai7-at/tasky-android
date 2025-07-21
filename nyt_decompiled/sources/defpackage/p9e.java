package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import com.google.android.gms.internal.ads.zzfoj;

/* loaded from: classes3.dex */
public abstract class p9e {
    private static UiModeManager a;

    public static zzfoj a() {
        UiModeManager uiModeManager = a;
        if (uiModeManager == null) {
            return zzfoj.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? zzfoj.OTHER : zzfoj.CTV : zzfoj.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
