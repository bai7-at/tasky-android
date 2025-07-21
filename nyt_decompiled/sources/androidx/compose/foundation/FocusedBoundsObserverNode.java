package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.cz3;
import defpackage.du8;
import defpackage.jv4;
import defpackage.kv4;
import defpackage.lv4;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends Modifier.c implements kv4 {
    private ss2 n;
    private final ss2 r;
    private final jv4 s;

    public FocusedBoundsObserverNode(ss2 ss2Var) {
        this.n = ss2Var;
        ss2 ss2Var2 = new ss2() { // from class: androidx.compose.foundation.FocusedBoundsObserverNode$focusBoundsObserver$1
            {
                super(1);
            }

            public final void b(cz3 cz3Var) {
                ss2 g2;
                if (FocusedBoundsObserverNode.this.L1()) {
                    FocusedBoundsObserverNode.this.f2().invoke(cz3Var);
                    g2 = FocusedBoundsObserverNode.this.g2();
                    if (g2 != null) {
                        g2.invoke(cz3Var);
                    }
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((cz3) obj);
                return ww8.a;
            }
        };
        this.r = ss2Var2;
        this.s = lv4.b(du8.a(FocusedBoundsKt.a(), ss2Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ss2 g2() {
        if (L1()) {
            return (ss2) l(FocusedBoundsKt.a());
        }
        return null;
    }

    @Override // defpackage.kv4
    public jv4 V() {
        return this.s;
    }

    public final ss2 f2() {
        return this.n;
    }
}
