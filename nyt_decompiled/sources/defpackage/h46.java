package defpackage;

import com.nytimes.android.growthui.common.models.ProductType;
import java.util.Locale;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class h46 {
    public static final String a(f46 f46Var) {
        zq3.h(f46Var, "<this>");
        String lowerCase = f46Var.a().toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String b(f46 f46Var) {
        zq3.h(f46Var, "<this>");
        String lowerCase = f46Var.a().toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        return h.F(lowerCase, "all access", "aa", false, 4, null);
    }

    public static final int c(g46 g46Var) {
        zq3.h(g46Var, "<this>");
        return g46Var.a().k();
    }

    public static final ProductType d(g46 g46Var) {
        zq3.h(g46Var, "<this>");
        return ((f46) g46Var.b().get(c(g46Var))).b();
    }
}
