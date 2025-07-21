package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class dr0 implements fr0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, nq0 nq0Var, uq0 uq0Var) {
        try {
            lj2.b(str);
            return nq0Var.f().a(uq0Var);
        } finally {
            lj2.a();
        }
    }

    @Override // defpackage.fr0
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final nq0 nq0Var : componentRegistrar.getComponents()) {
            final String g = nq0Var.g();
            if (g != null) {
                nq0Var = nq0Var.r(new ar0() { // from class: cr0
                    @Override // defpackage.ar0
                    public final Object a(uq0 uq0Var) {
                        Object c;
                        c = dr0.c(g, nq0Var, uq0Var);
                        return c;
                    }
                });
            }
            arrayList.add(nq0Var);
        }
        return arrayList;
    }
}
