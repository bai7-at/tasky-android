package com.airbnb.lottie.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import defpackage.fv0;
import defpackage.hn3;
import defpackage.in3;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class LottieAnimationSizeNode extends Modifier.c implements androidx.compose.ui.node.c {
    private int n;
    private int r;

    public LottieAnimationSizeNode(int i, int i2) {
        this.n = i;
        this.r = i2;
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(f fVar, qg4 qg4Var, long j) {
        zq3.h(fVar, "$this$measure");
        zq3.h(qg4Var, "measurable");
        long d = iv0.d(j, in3.a(this.n, this.r));
        final l W = qg4Var.W((fv0.m(j) != Integer.MAX_VALUE || fv0.n(j) == Integer.MAX_VALUE) ? (fv0.n(j) != Integer.MAX_VALUE || fv0.m(j) == Integer.MAX_VALUE) ? iv0.a(hn3.g(d), hn3.g(d), hn3.f(d), hn3.f(d)) : iv0.a((hn3.f(d) * this.n) / this.r, (hn3.f(d) * this.n) / this.r, hn3.f(d), hn3.f(d)) : iv0.a(hn3.g(d), hn3.g(d), (hn3.g(d) * this.r) / this.n, (hn3.g(d) * this.r) / this.n));
        return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar) {
                zq3.h(aVar, "$this$layout");
                l.a.j(aVar, l.this, 0, 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final void e2(int i) {
        this.r = i;
    }

    public final void f2(int i) {
        this.n = i;
    }
}
