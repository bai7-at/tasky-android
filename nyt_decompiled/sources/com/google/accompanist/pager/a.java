package com.google.accompanist.pager;

import defpackage.by0;
import defpackage.d35;
import defpackage.fd5;
import defpackage.g35;
import defpackage.u49;
import defpackage.zq3;

/* loaded from: classes2.dex */
final class a implements d35 {
    private final boolean a;
    private final boolean b;
    private final PagerState c;

    public a(boolean z, boolean z2, PagerState pagerState) {
        zq3.h(pagerState, "pagerState");
        this.a = z;
        this.b = z2;
        this.c = pagerState;
    }

    @Override // defpackage.d35
    public Object Q0(long j, long j2, by0 by0Var) {
        return u49.b(this.c.m() == 0.0f ? Pager.f(j2, this.a, this.b) : u49.b.a());
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        long e;
        if (!g35.e(i, g35.a.b())) {
            return fd5.b.c();
        }
        e = Pager.e(j2, this.a, this.b);
        return e;
    }
}
