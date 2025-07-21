package defpackage;

import androidx.fragment.app.f;

/* loaded from: classes4.dex */
public interface i13 extends g77 {

    public static final class a {
        public static /* synthetic */ Object a(i13 i13Var, f fVar, boolean z, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: smartLock");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return i13Var.d(fVar, z, by0Var);
        }
    }

    Object a(f fVar, String str, String str2, by0 by0Var);

    Object c(f fVar, by0 by0Var);

    Object d(f fVar, boolean z, by0 by0Var);
}
