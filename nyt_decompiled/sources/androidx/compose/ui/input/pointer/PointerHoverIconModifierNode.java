package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.d;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.ct0;
import defpackage.dt0;
import defpackage.dy5;
import defpackage.ls8;
import defpackage.ms8;
import defpackage.px5;
import defpackage.rx5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode extends Modifier.c implements ls8, dy5, ct0 {
    private final String n = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    private px5 r;
    private boolean s;
    private boolean t;

    public PointerHoverIconModifierNode(px5 px5Var, boolean z) {
        this.r = px5Var;
        this.s = z;
    }

    private final void f2() {
        rx5 n2 = n2();
        if (n2 != null) {
            n2.a(null);
        }
    }

    private final void g2() {
        px5 px5Var;
        PointerHoverIconModifierNode l2 = l2();
        if (l2 == null || (px5Var = l2.r) == null) {
            px5Var = this.r;
        }
        rx5 n2 = n2();
        if (n2 != null) {
            n2.a(px5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h2() {
        ww8 ww8Var;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ms8.a(this, new ss2() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                boolean z;
                boolean z2;
                if (Ref$ObjectRef.this.element == null) {
                    z2 = pointerHoverIconModifierNode.t;
                    if (z2) {
                        Ref$ObjectRef.this.element = pointerHoverIconModifierNode;
                        return Boolean.TRUE;
                    }
                }
                if (Ref$ObjectRef.this.element != null && pointerHoverIconModifierNode.m2()) {
                    z = pointerHoverIconModifierNode.t;
                    if (z) {
                        Ref$ObjectRef.this.element = pointerHoverIconModifierNode;
                    }
                }
                return Boolean.TRUE;
            }
        });
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) ref$ObjectRef.element;
        if (pointerHoverIconModifierNode != null) {
            pointerHoverIconModifierNode.g2();
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            f2();
        }
    }

    private final void i2() {
        PointerHoverIconModifierNode k2;
        if (this.t) {
            if (!this.s && (k2 = k2()) != null) {
                this = k2;
            }
            this.g2();
        }
    }

    private final void j2() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        if (!this.s) {
            ms8.d(this, new ss2() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final TraversableNode$Companion$TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                    boolean z;
                    z = pointerHoverIconModifierNode.t;
                    if (!z) {
                        return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                    }
                    Ref$BooleanRef.this.element = false;
                    return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                }
            });
        }
        if (ref$BooleanRef.element) {
            g2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PointerHoverIconModifierNode k2() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ms8.d(this, new ss2() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                boolean z;
                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                z = pointerHoverIconModifierNode.t;
                if (!z) {
                    return traversableNode$Companion$TraverseDescendantsAction;
                }
                Ref$ObjectRef.this.element = pointerHoverIconModifierNode;
                return pointerHoverIconModifierNode.m2() ? TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal : traversableNode$Companion$TraverseDescendantsAction;
            }
        });
        return (PointerHoverIconModifierNode) ref$ObjectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PointerHoverIconModifierNode l2() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ms8.a(this, new ss2() { // from class: androidx.compose.ui.input.pointer.PointerHoverIconModifierNode$findOverridingAncestorNode$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
                boolean z;
                if (pointerHoverIconModifierNode.m2()) {
                    z = pointerHoverIconModifierNode.t;
                    if (z) {
                        Ref$ObjectRef.this.element = pointerHoverIconModifierNode;
                    }
                }
                return Boolean.TRUE;
            }
        });
        return (PointerHoverIconModifierNode) ref$ObjectRef.element;
    }

    private final rx5 n2() {
        return (rx5) dt0.a(this, CompositionLocalsKt.k());
    }

    @Override // defpackage.dy5
    public void L(c cVar, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int f = cVar.f();
            d.a aVar = d.a;
            if (d.i(f, aVar.a())) {
                this.t = true;
                j2();
            } else if (d.i(cVar.f(), aVar.b())) {
                this.t = false;
                h2();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        this.t = false;
        h2();
        super.P1();
    }

    @Override // defpackage.dy5
    public void U0() {
    }

    public final boolean m2() {
        return this.s;
    }

    @Override // defpackage.ls8
    /* renamed from: o2, reason: merged with bridge method [inline-methods] */
    public String y() {
        return this.n;
    }

    public final void p2(px5 px5Var) {
        if (zq3.c(this.r, px5Var)) {
            return;
        }
        this.r = px5Var;
        if (this.t) {
            j2();
        }
    }

    public final void q2(boolean z) {
        if (this.s != z) {
            this.s = z;
            if (z) {
                if (this.t) {
                    g2();
                }
            } else if (this.t) {
                i2();
            }
        }
    }
}
