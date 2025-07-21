package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.ui.layout.c;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.platform.q;
import defpackage.bu1;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
final class BottomBarOffsetModifier extends q implements c {
    private final float c;

    public /* synthetic */ BottomBarOffsetModifier(float f, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, ss2Var);
    }

    @Override // androidx.compose.ui.layout.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        zq3.h(fVar, "$this$measure");
        zq3.h(qg4Var, "measurable");
        final l W = qg4Var.W(j);
        return f.J(fVar, W.F0(), W.v0() - fVar.l0(this.c), null, new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.BottomBarOffsetModifier$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar) {
                zq3.h(aVar, "$this$layout");
                l.a.f(aVar, l.this, 0, 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BottomBarOffsetModifier bottomBarOffsetModifier = obj instanceof BottomBarOffsetModifier ? (BottomBarOffsetModifier) obj : null;
        if (bottomBarOffsetModifier == null) {
            return false;
        }
        return bu1.j(this.c, bottomBarOffsetModifier.c);
    }

    public int hashCode() {
        return bu1.k(this.c);
    }

    public String toString() {
        return "BottomBarOffsetModifier(y=" + bu1.l(this.c) + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private BottomBarOffsetModifier(float f, ss2 ss2Var) {
        super(ss2Var);
        zq3.h(ss2Var, "inspectorInfo");
        this.c = f;
    }
}
