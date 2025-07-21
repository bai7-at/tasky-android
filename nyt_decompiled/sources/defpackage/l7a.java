package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class l7a implements m7a {
    private final List a;
    private final tx9[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = -9223372036854775807L;

    public l7a(List list) {
        this.a = list;
        this.b = new tx9[list.size()];
    }

    private final boolean e(b9e b9eVar, int i) {
        if (b9eVar.q() == 0) {
            return false;
        }
        if (b9eVar.B() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
        if (this.c) {
            wad.f(this.f != -9223372036854775807L);
            for (tx9 tx9Var : this.b) {
                tx9Var.c(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.m7a
    public final void b(b9e b9eVar) {
        if (this.c) {
            if (this.d != 2 || e(b9eVar, 32)) {
                if (this.d != 1 || e(b9eVar, 0)) {
                    int s = b9eVar.s();
                    int q = b9eVar.q();
                    for (tx9 tx9Var : this.b) {
                        b9eVar.k(s);
                        tx9Var.b(b9eVar, q);
                    }
                    this.e += q;
                }
            }
        }
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        for (int i = 0; i < this.b.length; i++) {
            j9a j9aVar = (j9a) this.a.get(i);
            m9aVar.c();
            tx9 zzw = sv9Var.zzw(m9aVar.a(), 3);
            x3a x3aVar = new x3a();
            x3aVar.k(m9aVar.b());
            x3aVar.w("application/dvbsubs");
            x3aVar.l(Collections.singletonList(j9aVar.b));
            x3aVar.n(j9aVar.a);
            zzw.f(x3aVar.D());
            this.b[i] = zzw;
        }
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // defpackage.m7a
    public final void zze() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
