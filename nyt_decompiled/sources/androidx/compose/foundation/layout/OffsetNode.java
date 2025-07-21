package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class OffsetNode extends Modifier.c implements androidx.compose.ui.node.c {
    private float n;
    private float r;
    private boolean s;

    public /* synthetic */ OffsetNode(float f, float f2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(final androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        final androidx.compose.ui.layout.l W = qg4Var.W(j);
        return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.layout.OffsetNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                if (OffsetNode.this.e2()) {
                    l.a.j(aVar, W, fVar.l0(OffsetNode.this.f2()), fVar.l0(OffsetNode.this.g2()), 0.0f, 4, null);
                } else {
                    l.a.f(aVar, W, fVar.l0(OffsetNode.this.f2()), fVar.l0(OffsetNode.this.g2()), 0.0f, 4, null);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final boolean e2() {
        return this.s;
    }

    public final float f2() {
        return this.n;
    }

    public final float g2() {
        return this.r;
    }

    public final void h2(boolean z) {
        this.s = z;
    }

    public final void i2(float f) {
        this.n = f;
    }

    public final void j2(float f) {
        this.r = f;
    }

    private OffsetNode(float f, float f2, boolean z) {
        this.n = f;
        this.r = f2;
        this.s = z;
    }
}
