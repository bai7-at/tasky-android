package defpackage;

import com.nytimes.android.subauth.core.purchase.models.productdetails.StoreFrontProductDetailsWithPrice;
import defpackage.pb8;
import java.util.Locale;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class s53 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final pb8 b(StoreFrontProductDetailsWithPrice storeFrontProductDetailsWithPrice) {
        String str;
        String d = storeFrontProductDetailsWithPrice.d();
        Integer c = storeFrontProductDetailsWithPrice.c();
        String a = storeFrontProductDetailsWithPrice.a();
        if (a == null) {
            a = "";
        }
        String b = storeFrontProductDetailsWithPrice.b();
        if (b == null) {
            b = "";
        }
        pb8.b bVar = new pb8.b(new nb8(b, 0), a);
        if (d != null) {
            str = d.toLowerCase(Locale.ROOT);
            zq3.g(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (zq3.c(str, "free")) {
            String e = storeFrontProductDetailsWithPrice.e();
            return new pb8.a(new nb8(e != null ? e : "", 1), bVar);
        }
        if (d == null || h.d0(d) || c == null) {
            return bVar;
        }
        if (d == null) {
            d = "";
        }
        String e2 = storeFrontProductDetailsWithPrice.e();
        return new pb8.c(new nb8(e2 != null ? e2 : "", c.intValue()), d, bVar);
    }
}
