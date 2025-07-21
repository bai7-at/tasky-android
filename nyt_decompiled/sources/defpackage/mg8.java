package defpackage;

import com.nytimes.android.subauth.core.auth.network.response.d;

/* loaded from: classes4.dex */
public interface mg8 {

    public static final class a {
        public static /* synthetic */ Object a(mg8 mg8Var, boolean z, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshTargetingData");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return mg8Var.b(z, by0Var);
        }
    }

    d a();

    Object b(boolean z, by0 by0Var);
}
