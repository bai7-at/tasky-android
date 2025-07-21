package defpackage;

/* loaded from: classes.dex */
public abstract class dt0 {
    public static final Object a(ct0 ct0Var, bt0 bt0Var) {
        if (ct0Var.c0().L1()) {
            return rl1.k(ct0Var).H().a(bt0Var);
        }
        throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
    }
}
