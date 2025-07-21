package defpackage;

/* loaded from: classes.dex */
public abstract class kp8 {
    public static final Object a(ip8 ip8Var, String str, qs2 qs2Var) {
        zq3.h(ip8Var, "<this>");
        zq3.h(str, "label");
        zq3.h(qs2Var, "block");
        boolean isEnabled = ip8Var.isEnabled();
        if (isEnabled) {
            try {
                ip8Var.a(str);
            } catch (Throwable th) {
                bk3.b(1);
                if (isEnabled) {
                    ip8Var.d();
                }
                bk3.a(1);
                throw th;
            }
        }
        Object mo865invoke = qs2Var.mo865invoke();
        bk3.b(1);
        if (isEnabled) {
            ip8Var.d();
        }
        bk3.a(1);
        return mo865invoke;
    }
}
