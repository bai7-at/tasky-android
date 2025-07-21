package defpackage;

/* loaded from: classes2.dex */
public class po2 extends d1 {
    public po2() {
        b("manual.keep");
    }

    @Override // defpackage.d1
    public boolean c(z51 z51Var, String str, Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            z51Var.v(2);
            return false;
        }
        if (!(obj instanceof String) || !Boolean.parseBoolean((String) obj)) {
            return false;
        }
        z51Var.v(2);
        return false;
    }
}
