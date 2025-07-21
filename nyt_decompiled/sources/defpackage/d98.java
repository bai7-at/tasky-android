package defpackage;

import com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource;
import com.nytimes.android.subauth.core.auth.network.response.c;
import java.util.Set;

/* loaded from: classes4.dex */
public interface d98 {

    public static final class a {
        public static /* synthetic */ void a(d98 d98Var, String str, String str2, String str3, d54 d54Var, PurchaseLinkSource purchaseLinkSource, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPurchaseLinkFailed");
            }
            d98Var.p((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, d54Var, purchaseLinkSource);
        }
    }

    void c(String str, String str2, PurchaseLinkSource purchaseLinkSource, c.a aVar);

    void d(Set set);

    void p(String str, String str2, String str3, d54 d54Var, PurchaseLinkSource purchaseLinkSource);

    void s(String str);
}
