package defpackage;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class ne4 {
    private static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
