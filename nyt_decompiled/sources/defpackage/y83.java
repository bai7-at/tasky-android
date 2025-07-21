package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.a;
import androidx.compose.ui.input.pointer.b;
import java.util.List;

/* loaded from: classes.dex */
public final class y83 {
    public static final int c = vy4.d;
    private final cz3 a;
    private final b b = new b();

    public y83(cz3 cz3Var) {
        this.a = cz3Var;
    }

    public final void a(long j, List list) {
        Object obj;
        b bVar = this.b;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            Modifier.c cVar = (Modifier.c) list.get(i);
            if (z) {
                vy4 g = bVar.g();
                int q = g.q();
                if (q > 0) {
                    Object[] p = g.p();
                    int i2 = 0;
                    do {
                        obj = p[i2];
                        if (zq3.c(((a) obj).j(), cVar)) {
                            break;
                        } else {
                            i2++;
                        }
                    } while (i2 < q);
                }
                obj = null;
                a aVar = (a) obj;
                if (aVar != null) {
                    aVar.m();
                    aVar.k().b(j);
                    bVar = aVar;
                } else {
                    z = false;
                }
            }
            a aVar2 = new a(cVar);
            aVar2.k().b(j);
            bVar.g().b(aVar2);
            bVar = aVar2;
        }
    }

    public final boolean b(pq3 pq3Var, boolean z) {
        if (this.b.a(pq3Var.a(), this.a, pq3Var, z)) {
            return this.b.e(pq3Var) || this.b.f(pq3Var.a(), this.a, pq3Var, z);
        }
        return false;
    }

    public final void c() {
        this.b.d();
        this.b.c();
    }

    public final void d() {
        this.b.h();
    }
}
