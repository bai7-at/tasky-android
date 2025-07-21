package androidx.lifecycle;

import androidx.lifecycle.t;
import defpackage.c04;
import defpackage.ou3;
import defpackage.qs2;
import defpackage.t21;
import defpackage.vu3;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class s implements c04 {
    private final vu3 a;
    private final qs2 b;
    private final qs2 c;
    private final qs2 d;
    private q e;

    public s(vu3 vu3Var, qs2 qs2Var, qs2 qs2Var2, qs2 qs2Var3) {
        zq3.h(vu3Var, "viewModelClass");
        zq3.h(qs2Var, "storeProducer");
        zq3.h(qs2Var2, "factoryProducer");
        zq3.h(qs2Var3, "extrasProducer");
        this.a = vu3Var;
        this.b = qs2Var;
        this.c = qs2Var2;
        this.d = qs2Var3;
    }

    @Override // defpackage.c04
    public boolean a() {
        return this.e != null;
    }

    @Override // defpackage.c04
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q getValue() {
        q qVar = this.e;
        if (qVar != null) {
            return qVar;
        }
        q a = new t((u) this.b.mo865invoke(), (t.b) this.c.mo865invoke(), (t21) this.d.mo865invoke()).a(ou3.a(this.a));
        this.e = a;
        return a;
    }
}
