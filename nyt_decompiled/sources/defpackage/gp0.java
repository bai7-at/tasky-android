package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class gp0 {
    public static final gp0 a = new gp0();
    private static final Regex b = new Regex("[^0-9]*");
    public static final int c = 8;

    private gp0() {
    }

    public static final String a(String str, long j) {
        zq3.h(str, "url");
        return str + "#permid=" + j;
    }

    private final Long b(String str) {
        try {
            List F0 = h.F0(str, new String[]{"permid="}, false, 0, 6, null);
            if (F0.size() <= 1) {
                return null;
            }
            return Long.valueOf(Long.parseLong(b.e((CharSequence) i.w0(F0), "")));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Long c(String str) {
        if (str != null) {
            return a.b(str);
        }
        return null;
    }

    public static final boolean d(String str) {
        zq3.h(str, "url");
        List<String> F0 = h.F0(str, new String[]{"#"}, false, 0, 6, null);
        if ((F0 instanceof Collection) && F0.isEmpty()) {
            return false;
        }
        for (String str2 : F0) {
            if (h.P(str2, "permid=", false, 2, null) || h.P(str2, "commentsContainer", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public static final String e(String str) {
        zq3.h(str, "url");
        return d(str) ? (String) i.k0(h.F0(str, new String[]{"#"}, false, 0, 6, null)) : str;
    }
}
