package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class hh implements sh {
    private final List a;

    public hh(List list) {
        this.a = list;
    }

    @Override // defpackage.sh
    public p50 a() {
        return ((rw3) this.a.get(0)).i() ? new kx5(this.a) : new qp5(this.a);
    }

    @Override // defpackage.sh
    public List b() {
        return this.a;
    }

    @Override // defpackage.sh
    public boolean c() {
        return this.a.size() == 1 && ((rw3) this.a.get(0)).i();
    }
}
