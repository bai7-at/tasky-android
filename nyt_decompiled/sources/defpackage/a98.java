package defpackage;

import android.app.Activity;
import com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface a98 {

    public static final class a {
        public static /* synthetic */ Object a(a98 a98Var, String str, PurchaseLinkSource purchaseLinkSource, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkNYTAccountToPurchase");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return a98Var.n(str, purchaseLinkSource, by0Var);
        }
    }

    Object e(by0 by0Var);

    Object f(by0 by0Var);

    Object g(by0 by0Var);

    Flow i();

    Object j(Set set, int i, by0 by0Var);

    Object l(Activity activity, String str, int i, ss2 ss2Var, String str2, Set set, by0 by0Var);

    Object n(String str, PurchaseLinkSource purchaseLinkSource, by0 by0Var);

    Flow o();
}
