package defpackage;

import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class bn9 {
    public static final String a(char c) {
        String valueOf = String.valueOf(c);
        zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        zq3.g(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        zq3.f(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        zq3.g(substring, "substring(...)");
        zq3.f(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        zq3.g(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }
}
