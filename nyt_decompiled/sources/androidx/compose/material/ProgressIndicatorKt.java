package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bu1;
import defpackage.dj7;
import defpackage.du7;
import defpackage.fv0;
import defpackage.fv1;
import defpackage.hd5;
import defpackage.it2;
import defpackage.iv0;
import defpackage.jm0;
import defpackage.lj7;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.t46;
import defpackage.u48;
import defpackage.uo6;
import defpackage.v31;
import defpackage.v48;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zt7;

/* loaded from: classes.dex */
public abstract class ProgressIndicatorKt {
    private static final float a = t46.a.a();
    private static final float b = bu1.g(240);
    private static final float c = bu1.g(40);
    private static final v31 d = new v31(0.2f, 0.0f, 0.8f, 1.0f);
    private static final v31 e = new v31(0.4f, 0.0f, 1.0f, 1.0f);
    private static final v31 f = new v31(0.0f, 0.0f, 0.65f, 1.0f);
    private static final v31 g = new v31(0.1f, 0.0f, 0.45f, 1.0f);
    private static final v31 h = new v31(0.4f, 0.0f, 0.2f, 1.0f);

    private static final void C(fv1 fv1Var, float f2, float f3, long j, u48 u48Var) {
        float f4 = 2;
        float f5 = u48Var.f() / f4;
        float i = zt7.i(fv1Var.b()) - (f4 * f5);
        fv1.K0(fv1Var, j, f2, f3, false, hd5.a(f5, f5), du7.a(i, i), 0.0f, u48Var, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(fv1 fv1Var, long j, u48 u48Var) {
        C(fv1Var, 0.0f, 360.0f, j, u48Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(fv1 fv1Var, float f2, float f3, float f4, long j, u48 u48Var) {
        C(fv1Var, f2 + (v48.e(u48Var.b(), v48.a.a()) ? 0.0f : ((f3 / bu1.g(c / 2)) * 57.29578f) / 2.0f), Math.max(f4, 0.1f), j, u48Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(fv1 fv1Var, float f2, float f3, long j, float f4, int i) {
        float i2 = zt7.i(fv1Var.b());
        float g2 = zt7.g(fv1Var.b());
        float f5 = 2;
        float f6 = g2 / f5;
        boolean z = fv1Var.getLayoutDirection() == LayoutDirection.Ltr;
        float f7 = (z ? f2 : 1.0f - f3) * i2;
        float f8 = (z ? f3 : 1.0f - f2) * i2;
        if (v48.e(i, v48.a.a()) || g2 > i2) {
            fv1.s0(fv1Var, j, hd5.a(f7, f6), hd5.a(f8, f6), f4, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f9 = f4 / f5;
        jm0 b2 = uo6.b(f9, i2 - f9);
        float floatValue = ((Number) uo6.p(Float.valueOf(f7), b2)).floatValue();
        float floatValue2 = ((Number) uo6.p(Float.valueOf(f8), b2)).floatValue();
        if (Math.abs(f3 - f2) > 0.0f) {
            fv1.s0(fv1Var, j, hd5.a(floatValue, f6), hd5.a(floatValue2, f6), f4, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(fv1 fv1Var, long j, float f2, int i) {
        F(fv1Var, 0.0f, 1.0f, j, f2, i);
    }

    public static final Modifier H(Modifier modifier) {
        final float g2 = bu1.g(10);
        return PaddingKt.k(dj7.c(androidx.compose.ui.layout.d.a(modifier, new it2() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final sg4 b(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
                final int l0 = fVar.l0(g2);
                int i = l0 * 2;
                final androidx.compose.ui.layout.l W = qg4Var.W(iv0.i(j, 0, i));
                return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0() - i, null, new ss2() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(l.a aVar) {
                        l.a.f(aVar, androidx.compose.ui.layout.l.this, 0, -l0, 0.0f, 4, null);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((l.a) obj);
                        return ww8.a;
                    }
                }, 4, null);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((androidx.compose.ui.layout.f) obj, (qg4) obj2, ((fv0) obj3).t());
            }
        }), true, new ss2() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$2
            public final void b(lj7 lj7Var) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        }), 0.0f, g2, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r24, long r25, float r27, long r28, int r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.a(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void b(androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.b(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(x08 x08Var) {
        return ((Number) x08Var.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(androidx.compose.ui.Modifier r23, long r24, long r26, int r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.g(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }
}
