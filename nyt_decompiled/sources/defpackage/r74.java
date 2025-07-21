package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class r74 {
    private static final List a = Arrays.asList("he", "yi", "id");

    public static String a(Locale locale) {
        if (locale == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        if (r48.b(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(Locale.US));
        }
        return sb.toString();
    }
}
