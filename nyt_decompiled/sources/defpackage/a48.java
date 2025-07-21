package defpackage;

import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class a48 {
    public static final String a(String str) {
        zq3.h(str, "<this>");
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            charAt = Character.toUpperCase(charAt);
        }
        String substring = str.substring(1);
        zq3.g(substring, "substring(...)");
        return charAt + substring;
    }

    public static final String b(String str, String str2) {
        zq3.h(str, "<this>");
        zq3.h(str2, "prefix");
        return h.K(str, str2, false, 2, null) ? h.v0(str, str2) : "";
    }
}
