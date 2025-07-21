package defpackage;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class x35 implements uj {
    private final j55 a;
    private final j55 b;

    public x35(j55 j55Var, j55 j55Var2) {
        zq3.h(j55Var, "networkTransport");
        zq3.h(j55Var2, "subscriptionNetworkTransport");
        this.a = j55Var;
        this.b = j55Var2;
    }

    @Override // defpackage.uj
    public Flow a(xj xjVar, vj vjVar) {
        zq3.h(xjVar, "request");
        zq3.h(vjVar, "chain");
        ii5 g = xjVar.g();
        if (!(g instanceof hb6) && !(g instanceof jz4)) {
            throw new IllegalStateException("");
        }
        return this.a.a(xjVar);
    }
}
