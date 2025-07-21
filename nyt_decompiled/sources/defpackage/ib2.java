package defpackage;

/* loaded from: classes2.dex */
public interface ib2 {

    public static final class a {
        public static /* synthetic */ void a(ib2 ib2Var, boolean z, gt2 gt2Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withWriteContext");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            ib2Var.c(z, gt2Var);
        }
    }

    void a(Object obj);

    ya2 b();

    void c(boolean z, gt2 gt2Var);
}
