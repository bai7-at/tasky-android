package defpackage;

/* loaded from: classes2.dex */
public abstract class a17 {
    public static Object a(int i, Object obj, ct2 ct2Var, f17 f17Var) {
        Object apply;
        if (i < 1) {
            return ct2Var.apply(obj);
        }
        do {
            apply = ct2Var.apply(obj);
            obj = f17Var.a(obj, apply);
            if (obj == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
