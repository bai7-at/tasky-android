package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class sk5 implements ov3 {
    private final so b = new og0();

    private static void f(mk5 mk5Var, Object obj, MessageDigest messageDigest) {
        mk5Var.g(obj, messageDigest);
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            f((mk5) this.b.i(i), this.b.n(i), messageDigest);
        }
    }

    public Object c(mk5 mk5Var) {
        return this.b.containsKey(mk5Var) ? this.b.get(mk5Var) : mk5Var.c();
    }

    public void d(sk5 sk5Var) {
        this.b.j(sk5Var.b);
    }

    public sk5 e(mk5 mk5Var, Object obj) {
        this.b.put(mk5Var, obj);
        return this;
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        if (obj instanceof sk5) {
            return this.b.equals(((sk5) obj).b);
        }
        return false;
    }

    @Override // defpackage.ov3
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.b + '}';
    }
}
