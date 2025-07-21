package defpackage;

import android.content.Context;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.auth.network.response.d;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface n98 {

    public static final class a {
        public static /* synthetic */ Object a(n98 n98Var, Context context, boolean z, RegiInterface regiInterface, String str, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openLoginFlow");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return n98Var.I(context, z, (i & 4) != 0 ? null : regiInterface, (i & 8) != 0 ? null : str, by0Var);
        }
    }

    public interface b {
        Observable r();

        Single u();
    }

    Object A(String str, by0 by0Var);

    Flow B();

    Object C(by0 by0Var);

    String D();

    String G();

    Object I(Context context, boolean z, RegiInterface regiInterface, String str, by0 by0Var);

    String L();

    d a();

    Object c(String str, by0 by0Var);

    Object d(by0 by0Var);

    Flow e();

    Object g(by0 by0Var);

    NYTUser h();

    Object j(Context context, RegiInterface regiInterface, qs2 qs2Var, by0 by0Var);

    Object k(String str, by0 by0Var);

    Object l(List list, by0 by0Var);

    Flow m();

    Object n(by0 by0Var);

    boolean q();

    Object v(by0 by0Var);
}
