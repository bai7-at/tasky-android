package defpackage;

import android.content.Context;
import com.nytimes.subauth.ui.models.SubauthUiParams;

/* loaded from: classes4.dex */
public interface t98 {

    public static final class a {
        public static /* synthetic */ Object a(t98 t98Var, Context context, SubauthUiParams subauthUiParams, by0 by0Var, int i, Object obj) {
            if (obj == null) {
                return t98Var.b(context, (i & 2) != 0 ? new SubauthUiParams(false, false, false, false, null, false, false, null, null, null, 1023, null) : subauthUiParams, by0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOpenAccountDeleteFlowIntent");
        }

        public static /* synthetic */ Object b(t98 t98Var, Context context, boolean z, SubauthUiParams subauthUiParams, by0 by0Var, int i, Object obj) {
            boolean z2;
            SubauthUiParams subauthUiParams2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAccountReadyFlow");
            }
            if ((i & 4) != 0) {
                subauthUiParams2 = new SubauthUiParams(false, false, false, false, null, false, false, null, null, null, 1023, null);
                z2 = z;
            } else {
                z2 = z;
                subauthUiParams2 = subauthUiParams;
            }
            return t98Var.c(context, z2, subauthUiParams2, by0Var);
        }
    }

    Object b(Context context, SubauthUiParams subauthUiParams, by0 by0Var);

    Object c(Context context, boolean z, SubauthUiParams subauthUiParams, by0 by0Var);
}
