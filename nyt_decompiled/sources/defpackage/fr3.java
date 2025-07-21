package defpackage;

import android.content.res.Resources;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class fr3 {
    public static final fr3 a = new fr3();

    private fr3() {
    }

    private final boolean b(LocaleList localeList) {
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            Locale locale = localeList.get(i);
            zq3.e(locale);
            if (c(locale)) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(Locale locale) {
        return zq3.c(Locale.US, locale);
    }

    public final boolean a(Resources resources) {
        zq3.h(resources, "resources");
        LocaleList locales = resources.getConfiguration().getLocales();
        zq3.g(locales, "getLocales(...)");
        return b(locales);
    }
}
