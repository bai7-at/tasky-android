package defpackage;

import android.content.Context;
import androidx.fragment.app.f;
import com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface z88 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(z88 z88Var, f fVar, String str, CampaignCodeSource campaignCodeSource, String str2, String str3, by0 by0Var, int i, Object obj) {
            if (obj == null) {
                return z88Var.M(fVar, str, (i & 4) != 0 ? null : campaignCodeSource, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, by0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: purchaseSku");
        }
    }

    Object H(Iterable iterable, int i, by0 by0Var);

    Object J(Context context, String str, RegiInterface regiInterface, String str2, PurchaseLinkSource purchaseLinkSource, by0 by0Var);

    Object K(f fVar, by0 by0Var);

    Object M(f fVar, String str, CampaignCodeSource campaignCodeSource, String str2, String str3, by0 by0Var);

    String S();

    Object b(by0 by0Var);

    Object f(by0 by0Var);

    Flow i();

    String t();
}
