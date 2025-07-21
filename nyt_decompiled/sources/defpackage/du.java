package defpackage;

import defpackage.cu;
import defpackage.lh5;
import defpackage.oa4;
import defpackage.qv7;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class du {
    public static final cu a(oa4 oa4Var) {
        zq3.h(oa4Var, "<this>");
        if (oa4Var instanceof oa4.c) {
            oa4.c cVar = (oa4.c) oa4Var;
            return cVar.e() != null ? new cu.g(cVar) : new cu.f(cVar);
        }
        if (!(oa4Var instanceof oa4.b)) {
            if (oa4Var instanceof oa4.a) {
                return new cu.c((oa4.a) oa4Var);
            }
            throw new NoWhenBranchMatchedException();
        }
        oa4.b bVar = (oa4.b) oa4Var;
        qv7.a d = bVar.d();
        lh5.a c = bVar.c();
        return d != null ? new cu.i(bVar, d) : c != null ? new cu.h(bVar, c) : bVar.e() != null ? new cu.e(bVar) : new cu.d(bVar);
    }
}
