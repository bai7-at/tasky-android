package androidx.compose.foundation;

import defpackage.b37;
import defpackage.bu1;
import defpackage.du7;
import defpackage.eg0;
import defpackage.el5;
import defpackage.ev1;
import defpackage.f01;
import defpackage.fg0;
import defpackage.fv1;
import defpackage.hd5;
import defpackage.ip5;
import defpackage.no7;
import defpackage.ql0;
import defpackage.ss2;
import defpackage.u48;
import defpackage.ul1;
import defpackage.ww8;
import defpackage.yc0;
import defpackage.yv0;
import defpackage.zq3;
import defpackage.zt7;
import defpackage.zu1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class BorderModifierNode extends ul1 {
    private b s;
    private float t;
    private yc0 u;
    private no7 w;
    private final eg0 x;

    public /* synthetic */ BorderModifierNode(float f, yc0 yc0Var, no7 no7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, yc0Var, no7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
    
        if (defpackage.tf3.h(r14, r3 != null ? defpackage.tf3.f(r3.b()) : null) != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, sf3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ev1 l2(defpackage.fg0 r44, final defpackage.yc0 r45, final el5.a r46, boolean r47, float r48) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.l2(fg0, yc0, el5$a, boolean, float):ev1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ev1 m2(fg0 fg0Var, final yc0 yc0Var, el5.c cVar, final long j, final long j2, final boolean z, final float f) {
        final ip5 i;
        if (b37.f(cVar.a())) {
            final long h = cVar.a().h();
            final float f2 = f / 2;
            final u48 u48Var = new u48(f, 0.0f, 0, 0, null, 30, null);
            return fg0Var.e(new ss2() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(yv0 yv0Var) {
                    long l;
                    yv0Var.A1();
                    if (z) {
                        fv1.N0(yv0Var, yc0Var, 0L, 0L, h, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float d = f01.d(h);
                    float f3 = f2;
                    if (d >= f3) {
                        yc0 yc0Var2 = yc0Var;
                        long j3 = j;
                        long j4 = j2;
                        l = BorderKt.l(h, f3);
                        fv1.N0(yv0Var, yc0Var2, j3, j4, l, 0.0f, u48Var, null, 0, 208, null);
                        return;
                    }
                    float f4 = f;
                    float i2 = zt7.i(yv0Var.b()) - f;
                    float g = zt7.g(yv0Var.b()) - f;
                    int a = ql0.a.a();
                    yc0 yc0Var3 = yc0Var;
                    long j5 = h;
                    zu1 i1 = yv0Var.i1();
                    long b = i1.b();
                    i1.c().t();
                    i1.a().b(f4, f4, i2, g, a);
                    fv1.N0(yv0Var, yc0Var3, 0L, 0L, j5, 0.0f, null, null, 0, 246, null);
                    i1.c().k();
                    i1.d(b);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((yv0) obj);
                    return ww8.a;
                }
            });
        }
        if (this.s == null) {
            this.s = new b(null, null, null, null, 15, null);
        }
        b bVar = this.s;
        zq3.e(bVar);
        i = BorderKt.i(bVar.g(), cVar.a(), f, z);
        return fg0Var.e(new ss2() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(yv0 yv0Var) {
                yv0Var.A1();
                fv1.w0(yv0Var, ip5.this, yc0Var, 0.0f, null, null, 0, 60, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((yv0) obj);
                return ww8.a;
            }
        });
    }

    public final void e1(no7 no7Var) {
        if (zq3.c(this.w, no7Var)) {
            return;
        }
        this.w = no7Var;
        this.x.J0();
    }

    public final yc0 n2() {
        return this.u;
    }

    public final no7 o2() {
        return this.w;
    }

    public final float p2() {
        return this.t;
    }

    public final void q2(yc0 yc0Var) {
        if (zq3.c(this.u, yc0Var)) {
            return;
        }
        this.u = yc0Var;
        this.x.J0();
    }

    public final void r2(float f) {
        if (bu1.j(this.t, f)) {
            return;
        }
        this.t = f;
        this.x.J0();
    }

    private BorderModifierNode(float f, yc0 yc0Var, no7 no7Var) {
        this.t = f;
        this.u = yc0Var;
        this.w = no7Var;
        this.x = (eg0) e2(androidx.compose.ui.draw.a.a(new ss2() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ev1 invoke(fg0 fg0Var) {
                ev1 j;
                ev1 k;
                ev1 m2;
                ev1 l2;
                if (fg0Var.f1(BorderModifierNode.this.p2()) < 0.0f || zt7.h(fg0Var.b()) <= 0.0f) {
                    j = BorderKt.j(fg0Var);
                    return j;
                }
                float f2 = 2;
                float min = Math.min(bu1.j(BorderModifierNode.this.p2(), bu1.b.a()) ? 1.0f : (float) Math.ceil(fg0Var.f1(BorderModifierNode.this.p2())), (float) Math.ceil(zt7.h(fg0Var.b()) / f2));
                float f3 = min / f2;
                long a = hd5.a(f3, f3);
                long a2 = du7.a(zt7.i(fg0Var.b()) - min, zt7.g(fg0Var.b()) - min);
                boolean z = f2 * min > zt7.h(fg0Var.b());
                el5 a3 = BorderModifierNode.this.o2().a(fg0Var.b(), fg0Var.getLayoutDirection(), fg0Var);
                if (a3 instanceof el5.a) {
                    BorderModifierNode borderModifierNode = BorderModifierNode.this;
                    l2 = borderModifierNode.l2(fg0Var, borderModifierNode.n2(), (el5.a) a3, z, min);
                    return l2;
                }
                if (a3 instanceof el5.c) {
                    BorderModifierNode borderModifierNode2 = BorderModifierNode.this;
                    m2 = borderModifierNode2.m2(fg0Var, borderModifierNode2.n2(), (el5.c) a3, a, a2, z, min);
                    return m2;
                }
                if (!(a3 instanceof el5.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                k = BorderKt.k(fg0Var, BorderModifierNode.this.n2(), a, a2, z, min);
                return k;
            }
        }));
    }
}
