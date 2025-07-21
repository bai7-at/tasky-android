package defpackage;

import java.util.Locale;
import kotlin.text.a;
import kotlin.text.h;

/* loaded from: classes2.dex */
public abstract class az8 {
    private static final boolean a(int i) {
        if (97 <= i && i < 123) {
            return true;
        }
        if (65 > i || i >= 91) {
            return (48 <= i && i < 58) || i == 45 || i == 46 || i == 95 || i == 126;
        }
        return true;
    }

    private static final String b(int i) {
        String num = Integer.toString(i, a.a(16));
        zq3.g(num, "toString(...)");
        String upperCase = num.toUpperCase(Locale.ROOT);
        zq3.g(upperCase, "toUpperCase(...)");
        if (upperCase.length() == 1) {
            upperCase = '0' + upperCase;
        }
        return '%' + upperCase;
    }

    public static final String c(String str) {
        zq3.h(str, "<this>");
        StringBuilder sb = new StringBuilder();
        for (byte b : h.t(str)) {
            int i = b & 255;
            if (a(i)) {
                sb.append((char) i);
            } else {
                sb.append(b(i));
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
