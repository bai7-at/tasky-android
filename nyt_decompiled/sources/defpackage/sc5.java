package defpackage;

/* loaded from: classes5.dex */
public abstract class sc5 implements lp6 {
    private Object a;

    public sc5(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.lp6
    public void a(Object obj, iv3 iv3Var, Object obj2) {
        zq3.h(iv3Var, "property");
        Object obj3 = this.a;
        if (c(iv3Var, obj3, obj2)) {
            this.a = obj2;
            b(iv3Var, obj3, obj2);
        }
    }

    protected abstract void b(iv3 iv3Var, Object obj, Object obj2);

    protected boolean c(iv3 iv3Var, Object obj, Object obj2) {
        zq3.h(iv3Var, "property");
        return true;
    }

    @Override // defpackage.lp6, defpackage.hp6
    public Object getValue(Object obj, iv3 iv3Var) {
        zq3.h(iv3Var, "property");
        return this.a;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
