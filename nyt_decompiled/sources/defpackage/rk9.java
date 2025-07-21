package defpackage;

/* loaded from: classes.dex */
public abstract class rk9 {
    public static final void a(lv0 lv0Var, qk9 qk9Var, String str) {
        zq3.h(lv0Var, "<this>");
        zq3.h(qk9Var, "info");
        zq3.h(str, "tag");
        try {
            lv0Var.accept(qk9Var);
        } catch (Throwable th) {
            h94.e().d(str, "Exception handler threw an exception", th);
        }
    }
}
