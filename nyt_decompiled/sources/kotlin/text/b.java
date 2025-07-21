package kotlin.text;

import defpackage.an3;
import defpackage.zq3;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class b {
    public static int a(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new an3(2, 36));
    }

    public static final int b(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static String d(char c, Locale locale) {
        zq3.h(locale, "locale");
        String e = e(c, locale);
        if (e.length() <= 1) {
            String valueOf = String.valueOf(c);
            zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            return !zq3.c(e, upperCase) ? e : String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return e;
        }
        char charAt = e.charAt(0);
        zq3.f(e, "null cannot be cast to non-null type java.lang.String");
        String substring = e.substring(1);
        zq3.g(substring, "substring(...)");
        zq3.f(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }

    public static final String e(char c, Locale locale) {
        zq3.h(locale, "locale");
        String valueOf = String.valueOf(c);
        zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        zq3.g(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
