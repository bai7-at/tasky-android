package defpackage;

import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class i87 {
    public static final String a(String str) {
        zq3.h(str, "<this>");
        if (h.P(str, "?", false, 2, null)) {
            return str + "&nytapp=true";
        }
        return str + "?nytapp=true";
    }

    public static final List b(s87 s87Var) {
        zq3.h(s87Var, "<this>");
        return c(s87Var.getUrl()) ? i.o(d(s87Var.getUrl()), s87Var.getUrl()) : i.o(s87Var.getUrl(), a(s87Var.getUrl()));
    }

    public static final boolean c(String str) {
        zq3.h(str, "<this>");
        return h.N(str, "nytapp=true", true);
    }

    public static final String d(String str) {
        zq3.h(str, "<this>");
        String D = h.D(str, "nytapp=true", "", true);
        return h.v(D, "?", false, 2, null) ? h.w0(D, "?") : h.v(D, "&", false, 2, null) ? h.w0(D, "&") : h.P(D, "?&", false, 2, null) ? h.F(D, "?&", "?", false, 4, null) : D;
    }
}
