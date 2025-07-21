package defpackage;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes2.dex */
public abstract class q5c {
    public static void a(Context context) {
        int i = egb.g;
        if (((Boolean) mra.a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || egb.l()) {
                    return;
                }
                j64 b = new dbb(context).b();
                fgb.f("Updating ad debug logging enablement.");
                sgb.a(b, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                fgb.h("Fail to determine debug setting.", e);
            }
        }
    }
}
