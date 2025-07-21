package defpackage;

/* loaded from: classes5.dex */
public abstract class o26 {
    public static /* synthetic */ void c(o26 o26Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = o26Var.d() + 1;
        }
        o26Var.b(i);
    }

    public abstract Object a();

    public abstract void b(int i);

    public abstract int d();
}
