package defpackage;

import android.content.Context;
import com.nytimes.subauth.ui.models.SubauthUiParams;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface s98 {

    public static final class a {
        public static /* synthetic */ Object a(s98 s98Var, Context context, SubauthUiParams subauthUiParams, by0 by0Var, int i, Object obj) {
            if (obj == null) {
                return s98Var.y(context, (i & 2) != 0 ? new SubauthUiParams(false, false, false, false, null, false, false, null, null, null, 1023, null) : subauthUiParams, by0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOpenLoginFlowIntent");
        }
    }

    Flow E();

    Flow P();

    Flow R();

    Flow w();

    Object y(Context context, SubauthUiParams subauthUiParams, by0 by0Var);
}
