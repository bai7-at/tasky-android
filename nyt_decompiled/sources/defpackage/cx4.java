package defpackage;

/* loaded from: classes2.dex */
public class cx4 {
    private Class a;
    private Class b;
    private Class c;

    public cx4() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cx4 cx4Var = (cx4) obj;
        return this.a.equals(cx4Var.a) && this.b.equals(cx4Var.b) && x19.c(this.c, cx4Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public cx4(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
