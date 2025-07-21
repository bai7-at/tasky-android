package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ba3;
import defpackage.bu1;
import defpackage.fb;
import defpackage.fv0;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final sg4 c(androidx.compose.ui.layout.f fVar, final fb fbVar, final float f, float f2, qg4 qg4Var, long j) {
        final androidx.compose.ui.layout.l W = qg4Var.W(d(fbVar) ? fv0.e(j, 0, 0, 0, 0, 11, null) : fv0.e(j, 0, 0, 0, 0, 14, null));
        int c0 = W.c0(fbVar);
        if (c0 == Integer.MIN_VALUE) {
            c0 = 0;
        }
        int v0 = d(fbVar) ? W.v0() : W.F0();
        int m = d(fbVar) ? fv0.m(j) : fv0.n(j);
        bu1.a aVar = bu1.b;
        int i = m - v0;
        final int m2 = uo6.m((!bu1.j(f, aVar.c()) ? fVar.l0(f) : 0) - c0, 0, i);
        final int m3 = uo6.m(((!bu1.j(f2, aVar.c()) ? fVar.l0(f2) : 0) - v0) + c0, 0, i - m2);
        final int F0 = d(fbVar) ? W.F0() : Math.max(W.F0() + m2 + m3, fv0.p(j));
        final int max = d(fbVar) ? Math.max(W.v0() + m2 + m3, fv0.o(j)) : W.v0();
        return androidx.compose.ui.layout.f.J(fVar, F0, max, null, new ss2() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar2) {
                boolean d;
                int F02;
                boolean d2;
                d = AlignmentLineKt.d(fb.this);
                if (d) {
                    F02 = 0;
                } else {
                    F02 = !bu1.j(f, bu1.b.c()) ? m2 : (F0 - m3) - W.F0();
                }
                d2 = AlignmentLineKt.d(fb.this);
                l.a.j(aVar2, W, F02, d2 ? !bu1.j(f, bu1.b.c()) ? m2 : (max - m3) - W.v0() : 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(fb fbVar) {
        return fbVar instanceof ba3;
    }

    public static final Modifier e(Modifier modifier, final fb fbVar, final float f, final float f2) {
        return modifier.h(new AlignmentLineOffsetDpElement(fbVar, f, f2, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static /* synthetic */ Modifier f(Modifier modifier, fb fbVar, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = bu1.b.c();
        }
        if ((i & 4) != 0) {
            f2 = bu1.b.c();
        }
        return e(modifier, fbVar, f, f2);
    }

    public static final Modifier g(Modifier modifier, float f, float f2) {
        bu1.a aVar = bu1.b;
        return modifier.h(!bu1.j(f, aVar.c()) ? f(Modifier.a, androidx.compose.ui.layout.AlignmentLineKt.a(), f, 0.0f, 4, null) : Modifier.a).h(!bu1.j(f2, aVar.c()) ? f(Modifier.a, androidx.compose.ui.layout.AlignmentLineKt.b(), 0.0f, f2, 2, null) : Modifier.a);
    }
}
