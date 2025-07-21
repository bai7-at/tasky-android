package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class p9a {
    private final List a;
    private final tx9[] b;

    public p9a(List list) {
        this.a = list;
        this.b = new tx9[list.size()];
    }

    public final void a(long j, b9e b9eVar) {
        if (b9eVar.q() < 9) {
            return;
        }
        int v = b9eVar.v();
        int v2 = b9eVar.v();
        int B = b9eVar.B();
        if (v == 434 && v2 == 1195456820 && B == 3) {
            xu9.b(j, b9eVar, this.b);
        }
    }

    public final void b(sv9 sv9Var, m9a m9aVar) {
        for (int i = 0; i < this.b.length; i++) {
            m9aVar.c();
            tx9 zzw = sv9Var.zzw(m9aVar.a(), 3);
            l6a l6aVar = (l6a) this.a.get(i);
            String str = l6aVar.l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            wad.e(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            x3a x3aVar = new x3a();
            x3aVar.k(m9aVar.b());
            x3aVar.w(str);
            x3aVar.y(l6aVar.d);
            x3aVar.n(l6aVar.c);
            x3aVar.i0(l6aVar.D);
            x3aVar.l(l6aVar.n);
            zzw.f(x3aVar.D());
            this.b[i] = zzw;
        }
    }
}
