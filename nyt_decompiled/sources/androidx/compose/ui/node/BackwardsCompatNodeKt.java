package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import defpackage.bg8;
import defpackage.gv4;
import defpackage.nv4;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class BackwardsCompatNodeKt {
    private static final a a = new a();
    private static final ss2 b = new ss2() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        public final void b(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.h2();
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((BackwardsCompatNode) obj);
            return ww8.a;
        }
    };
    private static final ss2 c = new ss2() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        public final void b(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.k2();
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((BackwardsCompatNode) obj);
            return ww8.a;
        }
    };

    public static final class a implements nv4 {
        a() {
        }

        @Override // defpackage.nv4
        public Object l(gv4 gv4Var) {
            return gv4Var.a().mo865invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(BackwardsCompatNode backwardsCompatNode) {
        Modifier.c o = rl1.k(backwardsCompatNode).h0().o();
        zq3.f(o, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((bg8) o).e2();
    }
}
