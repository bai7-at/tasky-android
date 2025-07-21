package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.bd8;
import defpackage.by0;
import defpackage.cd8;
import defpackage.ct0;
import defpackage.dy4;
import defpackage.dy5;
import defpackage.fy5;
import defpackage.kv4;
import defpackage.ll0;
import defpackage.qs2;
import defpackage.ul1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
abstract class AbstractClickablePointerInputNode extends ul1 implements kv4, ct0, dy5 {
    private boolean s;
    private dy4 t;
    private qs2 u;
    private final AbstractClickableNode.a w;
    private final qs2 x;
    private final cd8 y;

    public /* synthetic */ AbstractClickablePointerInputNode(boolean z, dy4 dy4Var, qs2 qs2Var, AbstractClickableNode.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, dy4Var, qs2Var, aVar);
    }

    @Override // defpackage.dy5
    public void L(androidx.compose.ui.input.pointer.c cVar, PointerEventPass pointerEventPass, long j) {
        this.y.L(cVar, pointerEventPass, j);
    }

    @Override // defpackage.dy5
    public void U0() {
        this.y.U0();
    }

    protected final boolean j2() {
        return this.s;
    }

    protected final AbstractClickableNode.a k2() {
        return this.w;
    }

    protected final qs2 l2() {
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r7 = androidx.compose.foundation.ClickableKt.f(r8, r9, r3, r7.w, r7.x, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object m2(defpackage.c26 r8, long r9, defpackage.by0 r11) {
        /*
            r7 = this;
            dy4 r3 = r7.t
            if (r3 == 0) goto L16
            androidx.compose.foundation.AbstractClickableNode$a r4 = r7.w
            qs2 r5 = r7.x
            r0 = r8
            r1 = r9
            r6 = r11
            java.lang.Object r7 = androidx.compose.foundation.ClickableKt.a(r0, r1, r3, r4, r5, r6)
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.h()
            if (r7 != r8) goto L16
            return r7
        L16:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickablePointerInputNode.m2(c26, long, by0):java.lang.Object");
    }

    protected abstract Object n2(fy5 fy5Var, by0 by0Var);

    protected final void o2(boolean z) {
        this.s = z;
    }

    protected final void p2(dy4 dy4Var) {
        this.t = dy4Var;
    }

    protected final void q2(qs2 qs2Var) {
        this.u = qs2Var;
    }

    private AbstractClickablePointerInputNode(boolean z, dy4 dy4Var, qs2 qs2Var, AbstractClickableNode.a aVar) {
        this.s = z;
        this.t = dy4Var;
        this.u = qs2Var;
        this.w = aVar;
        this.x = new qs2() { // from class: androidx.compose.foundation.AbstractClickablePointerInputNode$delayPressInteraction$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf(((Boolean) AbstractClickablePointerInputNode.this.l(ScrollableKt.h())).booleanValue() || ll0.c(AbstractClickablePointerInputNode.this));
            }
        };
        this.y = (cd8) e2(bd8.a(new AbstractClickablePointerInputNode$pointerInputNode$1(this, null)));
    }
}
