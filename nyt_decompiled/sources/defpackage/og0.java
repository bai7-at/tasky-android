package defpackage;

/* loaded from: classes2.dex */
public final class og0 extends so {
    private int g;

    @Override // defpackage.hs7, java.util.Map
    public void clear() {
        this.g = 0;
        super.clear();
    }

    @Override // defpackage.hs7, java.util.Map
    public int hashCode() {
        if (this.g == 0) {
            this.g = super.hashCode();
        }
        return this.g;
    }

    @Override // defpackage.hs7
    public void j(hs7 hs7Var) {
        this.g = 0;
        super.j(hs7Var);
    }

    @Override // defpackage.hs7
    public Object l(int i) {
        this.g = 0;
        return super.l(i);
    }

    @Override // defpackage.hs7
    public Object m(int i, Object obj) {
        this.g = 0;
        return super.m(i, obj);
    }

    @Override // defpackage.hs7, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.g = 0;
        return super.put(obj, obj2);
    }
}
