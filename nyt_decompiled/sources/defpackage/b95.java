package defpackage;

/* loaded from: classes5.dex */
final class b95 implements lp6 {
    private Object a;

    @Override // defpackage.lp6
    public void a(Object obj, iv3 iv3Var, Object obj2) {
        zq3.h(iv3Var, "property");
        zq3.h(obj2, "value");
        this.a = obj2;
    }

    @Override // defpackage.lp6, defpackage.hp6
    public Object getValue(Object obj, iv3 iv3Var) {
        zq3.h(iv3Var, "property");
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + iv3Var.getName() + " should be initialized before get.");
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.a != null) {
            str = "value=" + this.a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
