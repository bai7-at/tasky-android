package androidx.compose.ui.node;

import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.v5;
import defpackage.vy4;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class NodeChainKt {
    private static final a a;

    public static final class a extends Modifier.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    static {
        a aVar = new a();
        aVar.U1(-1);
        a = aVar;
    }

    public static final int d(Modifier.b bVar, Modifier.b bVar2) {
        if (zq3.c(bVar, bVar2)) {
            return 2;
        }
        return (v5.a(bVar, bVar2) || ((bVar instanceof ForceUpdateElement) && v5.a(((ForceUpdateElement) bVar).t(), bVar2))) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy4 e(Modifier modifier, final vy4 vy4Var) {
        vy4 vy4Var2 = new vy4(new Modifier[uo6.d(vy4Var.q(), 16)], 0);
        vy4Var2.b(modifier);
        ss2 ss2Var = null;
        while (vy4Var2.t()) {
            Modifier modifier2 = (Modifier) vy4Var2.y(vy4Var2.q() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                vy4Var2.b(combinedModifier.l());
                vy4Var2.b(combinedModifier.r());
            } else if (modifier2 instanceof Modifier.b) {
                vy4Var.b(modifier2);
            } else {
                if (ss2Var == null) {
                    ss2Var = new ss2() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(Modifier.b bVar) {
                            vy4.this.b(bVar);
                            return Boolean.TRUE;
                        }
                    };
                }
                modifier2.a(ss2Var);
                ss2Var = ss2Var;
            }
        }
        return vy4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ov4 ov4Var, Modifier.c cVar) {
        zq3.f(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        ov4Var.r(cVar);
    }
}
