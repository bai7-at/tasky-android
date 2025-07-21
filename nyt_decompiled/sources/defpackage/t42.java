package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.xwords.hybrid.analytics.HybridGamesReferringSourceData;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class t42 {
    public static final t42 a = new t42();

    private t42() {
    }

    private final Map a(dn5 dn5Var) {
        return t.m(du8.a("section", dn5Var.e()), du8.a(TransferTable.COLUMN_TYPE, dn5Var.f()));
    }

    private final Map d(dn5 dn5Var) {
        HybridGamesReferringSourceData c = dn5Var.c();
        Pair a2 = du8.a("messageId", c != null ? c.b() : null);
        HybridGamesReferringSourceData c2 = dn5Var.c();
        Pair a3 = du8.a(TransferTable.COLUMN_TYPE, c2 != null ? c2.c() : null);
        HybridGamesReferringSourceData c3 = dn5Var.c();
        return t.m(a2, a3, du8.a("detail", c3 != null ? c3.a() : null));
    }

    private final Map e(dn5 dn5Var) {
        Pair a2 = du8.a("cookie.nyts", dn5Var.b());
        Pair a3 = du8.a("regi_id", dn5Var.d());
        Pair a4 = du8.a(TransferTable.COLUMN_TYPE, dn5Var.g());
        Pair a5 = du8.a("entitlements", dn5Var.a());
        Boolean h = dn5Var.h();
        return t.m(a2, a3, a4, a5, du8.a("is_upgradeable", h != null ? h.toString() : null));
    }

    public final Map b(ei3 ei3Var) {
        zq3.h(ei3Var, "impressionEvent");
        return t.f(du8.a("module", t.m(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, ei3Var.b()), du8.a("region", ei3Var.c()), du8.a("label", ei3Var.a()))));
    }

    public final Map c(dn5 dn5Var) {
        zq3.h(dn5Var, "pageEvent");
        return t.f(du8.a("native_app", t.m(du8.a("asset", a(dn5Var)), du8.a("user", e(dn5Var)), du8.a("referring_source", d(dn5Var)))));
    }
}
