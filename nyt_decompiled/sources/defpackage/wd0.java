package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.Locale;

/* loaded from: classes.dex */
public final class wd0 {
    public static final wd0 a = new wd0();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public final int a(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        b = i >= 30 ? a.a.a(30) : 0;
        c = i >= 30 ? a.a.a(31) : 0;
        d = i >= 30 ? a.a.a(33) : 0;
        e = i >= 30 ? a.a.a(1000000) : 0;
    }

    private wd0() {
    }

    public static final boolean a(String str, String str2) {
        zq3.h(str, "codename");
        zq3.h(str2, "buildCodename");
        if (zq3.c("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        zq3.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        zq3.g(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                zq3.g(str, "CODENAME");
                if (a(QueryKeys.SCREEN_WIDTH, str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                zq3.g(str, "CODENAME");
                if (a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 33) {
                String str = Build.VERSION.CODENAME;
                zq3.g(str, "CODENAME");
                if (a("UpsideDownCake", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
