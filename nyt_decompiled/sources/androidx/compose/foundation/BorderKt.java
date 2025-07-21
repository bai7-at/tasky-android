package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.a37;
import defpackage.cg;
import defpackage.eb0;
import defpackage.ev1;
import defpackage.f01;
import defpackage.fd5;
import defpackage.fg0;
import defpackage.fv1;
import defpackage.g01;
import defpackage.gv1;
import defpackage.ip5;
import defpackage.no7;
import defpackage.ox7;
import defpackage.qf2;
import defpackage.ss2;
import defpackage.u48;
import defpackage.wp5;
import defpackage.ww8;
import defpackage.yc0;
import defpackage.yv0;

/* loaded from: classes.dex */
public abstract class BorderKt {
    public static final Modifier e(Modifier modifier, eb0 eb0Var, no7 no7Var) {
        return g(modifier, eb0Var.b(), eb0Var.a(), no7Var);
    }

    public static final Modifier f(Modifier modifier, float f, long j, no7 no7Var) {
        return g(modifier, f, new ox7(j, null), no7Var);
    }

    public static final Modifier g(Modifier modifier, float f, yc0 yc0Var, no7 no7Var) {
        return modifier.h(new BorderModifierNodeElement(f, yc0Var, no7Var, null));
    }

    private static final a37 h(float f, a37 a37Var) {
        return new a37(f, f, a37Var.j() - f, a37Var.d() - f, l(a37Var.h(), f), l(a37Var.i(), f), l(a37Var.c(), f), l(a37Var.b(), f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ip5 i(ip5 ip5Var, a37 a37Var, float f, boolean z) {
        ip5Var.a();
        ip5Var.D(a37Var);
        if (!z) {
            ip5 a = cg.a();
            a.D(h(f, a37Var));
            ip5Var.G(ip5Var, a, wp5.a.a());
        }
        return ip5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ev1 j(fg0 fg0Var) {
        return fg0Var.e(new ss2() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            public final void b(yv0 yv0Var) {
                yv0Var.A1();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((yv0) obj);
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ev1 k(fg0 fg0Var, final yc0 yc0Var, long j, long j2, boolean z, float f) {
        final long c = z ? fd5.b.c() : j;
        final long b = z ? fg0Var.b() : j2;
        final gv1 u48Var = z ? qf2.a : new u48(f, 0.0f, 0, 0, null, 30, null);
        return fg0Var.e(new ss2() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(yv0 yv0Var) {
                yv0Var.A1();
                fv1.Y0(yv0Var, yc0.this, c, b, 0.0f, u48Var, null, 0, 104, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((yv0) obj);
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j, float f) {
        return g01.a(Math.max(0.0f, f01.d(j) - f), Math.max(0.0f, f01.e(j) - f));
    }
}
