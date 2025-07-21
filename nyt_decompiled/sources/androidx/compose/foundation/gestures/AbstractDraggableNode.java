package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.c;
import defpackage.bd8;
import defpackage.by0;
import defpackage.cd8;
import defpackage.ct0;
import defpackage.dy4;
import defpackage.dy5;
import defpackage.e1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.mx5;
import defpackage.nu1;
import defpackage.ou1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.vx5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* loaded from: classes.dex */
public abstract class AbstractDraggableNode extends ul1 implements dy5, ct0 {
    private boolean B;
    private boolean N;
    private ou1 X;
    private ss2 s;
    private boolean t;
    private dy4 u;
    private qs2 w;
    private it2 x;
    private it2 y;
    private final ss2 H = new ss2() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_canDrag$1
        {
            super(1);
        }

        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(vx5 vx5Var) {
            return (Boolean) AbstractDraggableNode.this.v2().invoke(vx5Var);
        }
    };
    private final qs2 L = new qs2() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_startDragImmediately$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return (Boolean) AbstractDraggableNode.this.B2().mo865invoke();
        }
    };
    private final androidx.compose.ui.input.pointer.util.a M = new androidx.compose.ui.input.pointer.util.a();
    private final cd8 Q = (cd8) e2(bd8.a(new AbstractDraggableNode$pointerInputNode$1(this, null)));
    private final Channel S = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    public AbstractDraggableNode(ss2 ss2Var, boolean z, dy4 dy4Var, qs2 qs2Var, it2 it2Var, it2 it2Var2, boolean z2) {
        this.s = ss2Var;
        this.t = z;
        this.u = dy4Var;
        this.w = qs2Var;
        this.x = it2Var;
        this.y = it2Var2;
        this.B = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C2(kotlinx.coroutines.CoroutineScope r9, defpackage.by0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r10)
            goto L7a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r8 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r8
            kotlin.f.b(r10)
            goto L5f
        L42:
            kotlin.f.b(r10)
            ou1 r10 = r8.X
            if (r10 == 0) goto L61
            dy4 r2 = r8.u
            if (r2 == 0) goto L5f
            nu1 r6 = new nu1
            r6.<init>(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.a(r6, r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            r8.X = r5
        L61:
            it2 r8 = r8.y
            u49$a r10 = defpackage.u49.b
            long r6 = r10.a()
            u49 r10 = defpackage.u49.b(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r8.invoke(r9, r10, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.C2(kotlinx.coroutines.CoroutineScope, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D2(kotlinx.coroutines.CoroutineScope r9, androidx.compose.foundation.gestures.a.c r10, defpackage.by0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5e
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r11)
            goto Lbf
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.L$3
            ou1 r8 = (defpackage.ou1) r8
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.a$c r9 = (androidx.compose.foundation.gestures.a.c) r9
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            kotlin.f.b(r11)
            goto L9c
        L4c:
            java.lang.Object r8 = r0.L$2
            r10 = r8
            androidx.compose.foundation.gestures.a$c r10 = (androidx.compose.foundation.gestures.a.c) r10
            java.lang.Object r8 = r0.L$1
            r9 = r8
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r8 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r8
            kotlin.f.b(r11)
            goto L7d
        L5e:
            kotlin.f.b(r11)
            ou1 r11 = r8.X
            if (r11 == 0) goto L7d
            dy4 r2 = r8.u
            if (r2 == 0) goto L7d
            nu1 r6 = new nu1
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r11 = r2.a(r6, r0)
            if (r11 != r1) goto L7d
            return r1
        L7d:
            ou1 r11 = new ou1
            r11.<init>()
            dy4 r2 = r8.u
            if (r2 == 0) goto La1
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r2 = r2.a(r11, r0)
            if (r2 != r1) goto L97
            return r1
        L97:
            r2 = r8
            r8 = r11
            r7 = r10
            r10 = r9
            r9 = r7
        L9c:
            r11 = r8
            r8 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        La1:
            r8.X = r11
            it2 r8 = r8.x
            long r10 = r10.a()
            fd5 r10 = defpackage.fd5.d(r10)
            r11 = 0
            r0.L$0 = r11
            r0.L$1 = r11
            r0.L$2 = r11
            r0.L$3 = r11
            r0.label = r3
            java.lang.Object r8 = r8.invoke(r9, r10, r0)
            if (r8 != r1) goto Lbf
            return r1
        Lbf:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.D2(kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.gestures.a$c, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E2(kotlinx.coroutines.CoroutineScope r8, androidx.compose.foundation.gestures.a.d r9, defpackage.by0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r10)
            goto L81
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.L$2
            r9 = r7
            androidx.compose.foundation.gestures.a$d r9 = (androidx.compose.foundation.gestures.a.d) r9
            java.lang.Object r7 = r0.L$1
            r8 = r7
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r7 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r7
            kotlin.f.b(r10)
            goto L66
        L47:
            kotlin.f.b(r10)
            ou1 r10 = r7.X
            if (r10 == 0) goto L68
            dy4 r2 = r7.u
            if (r2 == 0) goto L66
            pu1 r6 = new pu1
            r6.<init>(r10)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r10 = r2.a(r6, r0)
            if (r10 != r1) goto L66
            return r1
        L66:
            r7.X = r5
        L68:
            it2 r7 = r7.y
            long r9 = r9.a()
            u49 r9 = defpackage.u49.b(r9)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r8, r9, r0)
            if (r7 != r1) goto L81
            return r1
        L81:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.E2(kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.gestures.a$d, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M2() {
        this.N = true;
        BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new AbstractDraggableNode$startListeningForEvents$1(this, null), 3, null);
    }

    public final boolean A2() {
        return this.B;
    }

    public final qs2 B2() {
        return this.w;
    }

    public final void F2(ss2 ss2Var) {
        this.s = ss2Var;
    }

    public final void G2(boolean z) {
        this.t = z;
    }

    public final void H2(dy4 dy4Var) {
        this.u = dy4Var;
    }

    public final void I2(it2 it2Var) {
        this.x = it2Var;
    }

    public final void J2(it2 it2Var) {
        this.y = it2Var;
    }

    public final void K2(boolean z) {
        this.B = z;
    }

    @Override // defpackage.dy5
    public void L(c cVar, PointerEventPass pointerEventPass, long j) {
        this.Q.L(cVar, pointerEventPass, j);
    }

    public final void L2(qs2 qs2Var) {
        this.w = qs2Var;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        this.N = false;
        s2();
    }

    @Override // defpackage.dy5
    public void U0() {
        this.Q.U0();
    }

    public final void s2() {
        ou1 ou1Var = this.X;
        if (ou1Var != null) {
            dy4 dy4Var = this.u;
            if (dy4Var != null) {
                dy4Var.c(new nu1(ou1Var));
            }
            this.X = null;
        }
    }

    public abstract Object t2(gt2 gt2Var, by0 by0Var);

    public abstract Object u2(e1 e1Var, a.b bVar, by0 by0Var);

    public final ss2 v2() {
        return this.s;
    }

    public final boolean w2() {
        return this.t;
    }

    public final dy4 x2() {
        return this.u;
    }

    public abstract mx5 y2();

    public final cd8 z2() {
        return this.Q;
    }
}
