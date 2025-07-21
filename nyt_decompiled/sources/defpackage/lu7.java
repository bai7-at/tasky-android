package defpackage;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.subauth.core.purchase.models.productdetails.StoreFrontProductDetailsWithPrice;
import java.util.List;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class lu7 {
    public static final lu7 a = new lu7();

    private lu7() {
    }

    private final String a(String str) {
        String c = c(str);
        List F0 = h.F0(c, new String[]{" "}, false, 0, 6, null);
        return zq3.c(F0.get(0), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? (String) F0.get(1) : c;
    }

    private final String c(String str) {
        String str2;
        char j1 = h.j1(str);
        if (j1 == 'W') {
            str2 = "week";
        } else if (j1 == 'M') {
            str2 = "month";
        } else {
            if (j1 != 'Y') {
                return str;
            }
            str2 = "year";
        }
        String substring = str.substring(1, str.length() - 1);
        zq3.g(substring, "substring(...)");
        return d(substring + " " + str2);
    }

    private final String d(String str) {
        if (zq3.c(h.F0(str, new String[]{" "}, false, 0, 6, null).get(0), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || h.v(str, "s", false, 2, null)) {
            return str;
        }
        return str + "s";
    }

    public final CharSequence b(v28 v28Var) {
        String a2;
        String a3;
        zq3.h(v28Var, "skuDetail");
        StoreFrontProductDetailsWithPrice storeFrontProductDetailsWithPrice = new StoreFrontProductDetailsWithPrice(v28Var);
        String d = storeFrontProductDetailsWithPrice.d();
        if (d == null || d.length() == 0) {
            a2 = storeFrontProductDetailsWithPrice.a();
            zq3.e(a2);
            String b = storeFrontProductDetailsWithPrice.b();
            zq3.e(b);
            a3 = a(b);
        } else {
            a2 = storeFrontProductDetailsWithPrice.d();
            zq3.e(a2);
            String e = storeFrontProductDetailsWithPrice.e();
            zq3.e(e);
            a3 = a(e);
        }
        return a2 + "/" + a3;
    }
}
