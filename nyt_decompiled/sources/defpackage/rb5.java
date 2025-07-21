package defpackage;

import com.nytimes.android.logging.NYTLogger;
import java.net.URI;
import java.util.Locale;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class rb5 {
    public static final rb5 a = new rb5();

    private rb5() {
    }

    public static final boolean f(String str) {
        zq3.h(str, "url");
        return h.P(str, "nyta://", false, 2, null);
    }

    public static final boolean g(String str) {
        zq3.h(str, "url");
        return h.P(str, "nytimes://reader/products/allAccess", false, 2, null);
    }

    public static final boolean h(String str) {
        zq3.h(str, "url");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return h.P(lowerCase, "cooking.nytimes.com", false, 2, null);
    }

    private final boolean i(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return h.P(lowerCase, "nytimes.com/crosswords", false, 2, null);
    }

    public static final boolean j(String str) {
        zq3.h(str, "url");
        return h.P(str, "nytimes://reader/gamesProducts/", false, 2, null);
    }

    public static final boolean k(String str) {
        zq3.h(str, "url");
        if (a.m(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            zq3.g(lowerCase, "toLowerCase(...)");
            if (!p(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean l(String str) {
        zq3.h(str, "url");
        URI t = a.t(str);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        String host = t.getHost();
        if (host == null) {
            host = "";
        }
        boolean z = zq3.c(host, "nytimes.com") || h.v(host, p96.NYT_DOMAIN, false, 2, null);
        boolean z2 = h.P(lowerCase, "nytimes.com/es/", false, 2, null) && !h.P(lowerCase, ".html", false, 2, null);
        return ((!z && !(zq3.c("nytimes", t.getScheme()) || zq3.c("nyt", t.getScheme())) && !r(str)) || h(lowerCase) || h.P(lowerCase, "cn.nytimes.com", false, 2, null) || z2 || p(lowerCase)) ? false : true;
    }

    private final boolean m(String str) {
        return i(str) || n(str);
    }

    private final boolean n(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return h.P(lowerCase, "nytimes.com/puzzles", false, 2, null);
    }

    public static final boolean o(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return lowerCase != null && h.P(lowerCase, "nytimes.com/athletic", false, 2, null);
    }

    public static final boolean p(String str) {
        zq3.h(str, "url");
        return h.P(str, "nytexternal://", false, 2, null);
    }

    public static final boolean q(String str) {
        zq3.h(str, "url");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return h.P(lowerCase, ".pdf", false, 2, null);
    }

    public static final boolean r(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return lowerCase != null && h.P(lowerCase, "theathletic.com", false, 2, null);
    }

    public static final boolean s(String str) {
        zq3.h(str, "url");
        return h.P(str, "https://www.nytimes.com/wirecutter/out/", false, 2, null);
    }

    private final URI t(String str) {
        try {
            return new URI(str);
        } catch (Exception e) {
            NYTLogger.s(new Throwable("GMAX: Unable to parse valid URI from " + str, e));
            return new URI("");
        }
    }

    private final String u(String str) {
        if (str.length() > 0 && !h.K(str, "https", false, 2, null) && !h.K(str, "http", false, 2, null)) {
            str = "https://" + str;
        }
        return h.F(h.F(h.F(str, "http://", "https://", false, 4, null), "http//", "https://", false, 4, null), "https//", "https://", false, 4, null);
    }

    public final String a(String str) {
        zq3.h(str, "url");
        return u(h.F(str, "nyta://", "", false, 4, null));
    }

    public final String b(String str) {
        zq3.h(str, "url");
        return str + "?source=nytsports";
    }

    public final String c(String str) {
        zq3.h(str, "url");
        return str + "?source=nyt_app_android";
    }

    public final String d(String str) {
        zq3.h(str, "url");
        return h.F(str, "nytexternal", "https", false, 4, null);
    }

    public final String e(String str) {
        zq3.h(str, "sectionName");
        return "nytimes://reader/sf/" + str;
    }
}
