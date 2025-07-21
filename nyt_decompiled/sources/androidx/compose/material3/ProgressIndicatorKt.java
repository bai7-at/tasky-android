package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.a54;
import defpackage.bu1;
import defpackage.dj7;
import defpackage.du7;
import defpackage.fv0;
import defpackage.fv1;
import defpackage.hd5;
import defpackage.it2;
import defpackage.iv0;
import defpackage.lj7;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.u48;
import defpackage.v31;
import defpackage.v48;
import defpackage.ww8;
import defpackage.zk0;
import defpackage.zt7;

/* loaded from: classes.dex */
public abstract class ProgressIndicatorKt {
    private static final float a;
    private static final Modifier b;
    private static final float c;
    private static final float d;
    private static final float e;
    private static final v31 f;
    private static final v31 g;
    private static final v31 h;
    private static final v31 i;
    private static final v31 j;

    static {
        float g2 = bu1.g(10);
        a = g2;
        b = PaddingKt.k(dj7.c(androidx.compose.ui.layout.d.a(Modifier.a, new it2() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            public final sg4 b(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j2) {
                float f2;
                f2 = ProgressIndicatorKt.a;
                final int l0 = fVar.l0(f2);
                int i2 = l0 * 2;
                final l W = qg4Var.W(iv0.i(j2, 0, i2));
                return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0() - i2, null, new ss2() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(l.a aVar) {
                        l.a.f(aVar, l.this, 0, -l0, 0.0f, 4, null);
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
        }), true, new ss2() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            public final void b(lj7 lj7Var) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        }), 0.0f, g2, 1, null);
        c = bu1.g(240);
        d = a54.a.a();
        zk0 zk0Var = zk0.a;
        e = bu1.g(zk0Var.c() - bu1.g(zk0Var.b() * 2));
        f = new v31(0.2f, 0.0f, 0.8f, 1.0f);
        g = new v31(0.4f, 0.0f, 1.0f, 1.0f);
        h = new v31(0.0f, 0.0f, 0.65f, 1.0f);
        i = new v31(0.1f, 0.0f, 0.45f, 1.0f);
        j = new v31(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r36, long r37, float r39, long r40, int r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.a(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void f(fv1 fv1Var, float f2, float f3, long j2, u48 u48Var) {
        float f4 = 2;
        float f5 = u48Var.f() / f4;
        float i2 = zt7.i(fv1Var.b()) - (f4 * f5);
        fv1.K0(fv1Var, j2, f2, f3, false, hd5.a(f5, f5), du7.a(i2, i2), 0.0f, u48Var, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(fv1 fv1Var, long j2, u48 u48Var) {
        f(fv1Var, 0.0f, 360.0f, j2, u48Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(fv1 fv1Var, float f2, float f3, float f4, long j2, u48 u48Var) {
        f(fv1Var, f2 + (v48.e(u48Var.b(), v48.a.a()) ? 0.0f : ((f3 / bu1.g(e / 2)) * 57.29578f) / 2.0f), Math.max(f4, 0.1f), j2, u48Var);
    }
}
