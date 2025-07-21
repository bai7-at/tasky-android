package defpackage;

import androidx.compose.ui.input.pointer.c;
import java.util.List;

/* loaded from: classes.dex */
final class ze implements oc7 {
    public static final ze a = new ze();

    private ze() {
    }

    @Override // defpackage.oc7
    public long a(fm1 fm1Var, c cVar, long j) {
        List c = cVar.c();
        fd5 d = fd5.d(fd5.b.c());
        int size = c.size();
        for (int i = 0; i < size; i++) {
            d = fd5.d(fd5.t(d.x(), ((vx5) c.get(i)).n()));
        }
        return fd5.u(d.x(), -fm1Var.f1(bu1.g(64)));
    }
}
