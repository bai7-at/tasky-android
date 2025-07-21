package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class yt6 {
    public static final yt6 a = new yt6();

    private yt6() {
    }

    private final boolean a(String str, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        Locale locale2 = Locale.US;
        zq3.g(locale2, "US");
        String lowerCase2 = str.toLowerCase(locale2);
        zq3.g(lowerCase2, "toLowerCase(...)");
        return arrayList.contains(lowerCase2);
    }

    public static final boolean b(String str) {
        if (str == null || h.d0(str)) {
            return false;
        }
        return a.a(str, "Facebook", "Twitter", "mail", "com.google.android.gm", "readitlater", "whatsapp", "mms", "clip", "hangouts", "messaging", "Deep Link");
    }
}
