package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.bu1;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.no7;
import defpackage.o23;
import defpackage.qt6;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class ShadowKt {
    public static final Modifier a(Modifier modifier, final float f, final no7 no7Var, final boolean z, final long j, final long j2) {
        if (bu1.f(f, bu1.g(0)) > 0 || z) {
            return InspectableValueKt.b(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
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
            } : InspectableValueKt.a(), androidx.compose.ui.graphics.b.a(Modifier.a, new ss2() { // from class: androidx.compose.ui.draw.ShadowKt$shadow$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(androidx.compose.ui.graphics.c cVar) {
                    cVar.G0(cVar.f1(f));
                    cVar.e1(no7Var);
                    cVar.i0(z);
                    cVar.b0(j);
                    cVar.n0(j2);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((androidx.compose.ui.graphics.c) obj);
                    return ww8.a;
                }
            }));
        }
        return modifier;
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f, no7 no7Var, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        no7 a = (i & 2) != 0 ? qt6.a() : no7Var;
        if ((i & 4) != 0) {
            z2 = false;
            if (bu1.f(f, bu1.g(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return a(modifier, f, a, z2, (i & 8) != 0 ? o23.a() : j, (i & 16) != 0 ? o23.a() : j2);
    }
}
