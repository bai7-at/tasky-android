package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import defpackage.by0;
import defpackage.dy4;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.hd5;
import defpackage.in3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.ww8;

/* loaded from: classes.dex */
final class ClickablePointerInputNode extends AbstractClickablePointerInputNode {
    public ClickablePointerInputNode(boolean z, dy4 dy4Var, qs2 qs2Var, AbstractClickableNode.a aVar) {
        super(z, dy4Var, qs2Var, aVar, null);
    }

    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    protected Object n2(fy5 fy5Var, by0 by0Var) {
        AbstractClickableNode.a k2 = k2();
        long b = in3.b(fy5Var.a());
        k2.d(hd5.a(vm3.j(b), vm3.k(b)));
        Object h = TapGestureDetectorKt.h(fy5Var, new ClickablePointerInputNode$pointerInput$2(this, null), new ss2() { // from class: androidx.compose.foundation.ClickablePointerInputNode$pointerInput$3
            {
                super(1);
            }

            public final void b(long j) {
                if (ClickablePointerInputNode.this.j2()) {
                    ClickablePointerInputNode.this.l2().mo865invoke();
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((fd5) obj).x());
                return ww8.a;
            }
        }, by0Var);
        return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
    }

    public final void r2(boolean z, dy4 dy4Var, qs2 qs2Var) {
        o2(z);
        q2(qs2Var);
        p2(dy4Var);
    }
}
