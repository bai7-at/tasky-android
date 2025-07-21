package defpackage;

/* loaded from: classes4.dex */
public interface xz8 {

    public static final class a {
        public static /* synthetic */ Object a(xz8 xz8Var, boolean z, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUserDetails");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return xz8Var.c(z, by0Var);
        }
    }

    Object a(by0 by0Var);

    Object b(by0 by0Var);

    Object c(boolean z, by0 by0Var);
}
