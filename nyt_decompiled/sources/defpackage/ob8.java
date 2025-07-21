package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Locale;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class ob8 {
    public static final int a(nb8 nb8Var) {
        zq3.h(nb8Var, "<this>");
        if (nb8Var.a() < 2) {
            String substring = nb8Var.b().substring(1, nb8Var.b().length() - 1);
            zq3.g(substring, "substring(...)");
            return Integer.parseInt(substring);
        }
        int a = nb8Var.a();
        String substring2 = nb8Var.b().substring(1, nb8Var.b().length() - 1);
        zq3.g(substring2, "substring(...)");
        return a * Integer.parseInt(substring2);
    }

    public static final String b(nb8 nb8Var) {
        zq3.h(nb8Var, "<this>");
        String valueOf = String.valueOf(h.j1(nb8Var.b()));
        zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 100) {
            if (hashCode != 109) {
                if (hashCode != 119) {
                    if (hashCode == 121 && lowerCase.equals(QueryKeys.CONTENT_HEIGHT)) {
                        return "year";
                    }
                } else if (lowerCase.equals(QueryKeys.SCROLL_WINDOW_HEIGHT)) {
                    return "week";
                }
            } else if (lowerCase.equals(QueryKeys.MAX_SCROLL_DEPTH)) {
                return "month";
            }
        } else if (lowerCase.equals(QueryKeys.SUBDOMAIN)) {
            return "day";
        }
        return "";
    }
}
