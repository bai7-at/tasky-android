package dev.chrisbanes.snapper;

import androidx.compose.runtime.b0;
import defpackage.bi;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.it2;
import defpackage.iw7;
import defpackage.jw7;
import defpackage.oc1;
import defpackage.qc1;
import defpackage.qc7;
import defpackage.qk2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SnapperFlingBehavior implements qk2 {
    private final b a;
    private final oc1 b;
    private final ci c;
    private final it2 d;
    private final ss2 e;
    private final sy4 f;

    private SnapperFlingBehavior(b bVar, oc1 oc1Var, ci ciVar, it2 it2Var, ss2 ss2Var) {
        this.a = bVar;
        this.b = oc1Var;
        this.c = ciVar;
        this.d = it2Var;
        this.e = ss2Var;
        this.f = b0.e(null, null, 2, null);
    }

    private final int g(float f, iw7 iw7Var, int i) {
        if (f > 0.0f && iw7Var.a() >= i) {
            return this.a.d(iw7Var.a());
        }
        if (f >= 0.0f || iw7Var.a() > i - 1) {
            return 0;
        }
        return this.a.d(iw7Var.a() + 1);
    }

    private final boolean h(oc1 oc1Var, float f, iw7 iw7Var) {
        if (Math.abs(f) < 0.5f) {
            return false;
        }
        float a = qc1.a(oc1Var, 0.0f, f);
        jw7 jw7Var = jw7.a;
        if (f < 0.0f) {
            if (a > this.a.d(iw7Var.a())) {
                return false;
            }
        } else if (a < this.a.d(iw7Var.a() + 1)) {
            return false;
        }
        return true;
    }

    private final float i(float f) {
        if (f < 0.0f && !this.a.b()) {
            return f;
        }
        if (f <= 0.0f || this.a.a()) {
            return 0.0f;
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.qc7 r17, int r18, float r19, defpackage.by0 r20) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.j(qc7, int, float, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(final defpackage.qc7 r20, defpackage.iw7 r21, final int r22, float r23, boolean r24, defpackage.by0 r25) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.l(qc7, iw7, int, float, boolean, by0):java.lang.Object");
    }

    static /* synthetic */ Object m(SnapperFlingBehavior snapperFlingBehavior, qc7 qc7Var, iw7 iw7Var, int i, float f, boolean z, by0 by0Var, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return snapperFlingBehavior.l(qc7Var, iw7Var, i, f, z, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(bi biVar, iw7 iw7Var, int i, ss2 ss2Var) {
        jw7 jw7Var = jw7.a;
        int g = g(((Number) biVar.f()).floatValue(), iw7Var, i);
        if (g == 0) {
            return false;
        }
        ss2Var.invoke(Float.valueOf(g));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(final defpackage.qc7 r26, defpackage.iw7 r27, final int r28, float r29, defpackage.by0 r30) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.chrisbanes.snapper.SnapperFlingBehavior.o(qc7, iw7, int, float, by0):java.lang.Object");
    }

    private final void p(Integer num) {
        this.f.setValue(num);
    }

    @Override // defpackage.qk2
    public Object a(qc7 qc7Var, float f, by0 by0Var) {
        if (!this.a.b() || !this.a.a()) {
            return cc0.b(f);
        }
        jw7 jw7Var = jw7.a;
        float floatValue = ((Number) this.e.invoke(this.a)).floatValue();
        if (floatValue <= 0.0f) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0");
        }
        iw7 e = this.a.e();
        if (e == null) {
            return cc0.b(f);
        }
        int intValue = ((Number) this.d.invoke(this.a, cc0.c(f < 0.0f ? e.a() + 1 : e.a()), cc0.c(this.a.c(f, this.b, floatValue)))).intValue();
        if (intValue < 0 || intValue >= this.a.h()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j(qc7Var, intValue, f, by0Var);
    }

    public final Integer k() {
        return (Integer) this.f.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior(b bVar, oc1 oc1Var, ci ciVar, it2 it2Var) {
        this(bVar, oc1Var, ciVar, it2Var, SnapperFlingBehaviorDefaults.a.a());
        zq3.h(bVar, "layoutInfo");
        zq3.h(oc1Var, "decayAnimationSpec");
        zq3.h(ciVar, "springAnimationSpec");
        zq3.h(it2Var, "snapIndex");
    }
}
