package defpackage;

import android.content.Context;
import kotlin.collections.d;

/* loaded from: classes2.dex */
public final class mk2 {
    public static final mk2 a = new mk2();

    private mk2() {
    }

    public static final boolean a(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        String[] stringArray = context.getApplicationContext().getResources().getStringArray(bc6.adConfig_sectionFront_bypassFlexFrameAd);
        zq3.g(stringArray, "getStringArray(...)");
        return d.W(stringArray, str);
    }
}
