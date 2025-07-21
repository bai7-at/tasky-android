package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.d;
import defpackage.dy4;
import defpackage.dy5;
import defpackage.ka3;
import defpackage.la3;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
final class HoverableNode extends Modifier.c implements dy5 {
    private dy4 n;
    private ka3 r;

    public HoverableNode(dy4 dy4Var) {
        this.n = dy4Var;
    }

    @Override // defpackage.dy5
    public void L(androidx.compose.ui.input.pointer.c cVar, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int f = cVar.f();
            d.a aVar = androidx.compose.ui.input.pointer.d.a;
            if (androidx.compose.ui.input.pointer.d.i(f, aVar.a())) {
                BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3, null);
            } else if (androidx.compose.ui.input.pointer.d.i(f, aVar.b())) {
                BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        g2();
    }

    @Override // defpackage.dy5
    public void U0() {
        g2();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e2(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitEnter$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = (androidx.compose.foundation.HoverableNode$emitEnter$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = new androidx.compose.foundation.HoverableNode$emitEnter$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            ka3 r4 = (defpackage.ka3) r4
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            kotlin.f.b(r5)
            r5 = r4
            r4 = r0
            goto L56
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.f.b(r5)
            ka3 r5 = r4.r
            if (r5 != 0) goto L58
            ka3 r5 = new ka3
            r5.<init>()
            dy4 r2 = r4.n
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r4.r = r5
        L58:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.e2(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f2(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitExit$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = (androidx.compose.foundation.HoverableNode$emitExit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = new androidx.compose.foundation.HoverableNode$emitExit$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.HoverableNode r4 = (androidx.compose.foundation.HoverableNode) r4
            kotlin.f.b(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            ka3 r5 = r4.r
            if (r5 == 0) goto L51
            la3 r2 = new la3
            r2.<init>(r5)
            dy4 r5 = r4.n
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = 0
            r4.r = r5
        L51:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.f2(by0):java.lang.Object");
    }

    public final void g2() {
        ka3 ka3Var = this.r;
        if (ka3Var != null) {
            this.n.c(new la3(ka3Var));
            this.r = null;
        }
    }

    public final void h2(dy4 dy4Var) {
        if (zq3.c(this.n, dy4Var)) {
            return;
        }
        g2();
        this.n = dy4Var;
    }
}
