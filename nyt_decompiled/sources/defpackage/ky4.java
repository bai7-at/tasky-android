package defpackage;

/* loaded from: classes.dex */
public class ky4 {
    Object a;
    Object b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fo5)) {
            return false;
        }
        fo5 fo5Var = (fo5) obj;
        return a(fo5Var.a, this.a) && a(fo5Var.b, this.b);
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
