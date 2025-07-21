package androidx.compose.foundation.relocation;

import defpackage.by0;
import defpackage.cz3;
import defpackage.du7;
import defpackage.in3;
import defpackage.kt6;
import defpackage.pc0;
import defpackage.qc0;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode extends a {
    private qc0 s;

    public BringIntoViewRequesterNode(qc0 qc0Var) {
        this.s = qc0Var;
    }

    private final void i2() {
        qc0 qc0Var = this.s;
        if (qc0Var instanceof BringIntoViewRequesterImpl) {
            zq3.f(qc0Var, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) qc0Var).c().w(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        j2(this.s);
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        i2();
    }

    public final Object h2(final kt6 kt6Var, by0 by0Var) {
        Object Y;
        pc0 g2 = g2();
        cz3 e2 = e2();
        return (e2 != null && (Y = g2.Y(e2, new qs2() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterNode$bringIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final kt6 mo865invoke() {
                kt6 kt6Var2 = kt6.this;
                if (kt6Var2 != null) {
                    return kt6Var2;
                }
                cz3 e22 = this.e2();
                if (e22 != null) {
                    return du7.c(in3.c(e22.a()));
                }
                return null;
            }
        }, by0Var)) == kotlin.coroutines.intrinsics.a.h()) ? Y : ww8.a;
    }

    public final void j2(qc0 qc0Var) {
        i2();
        if (qc0Var instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) qc0Var).c().b(this);
        }
        this.s = qc0Var;
    }
}
