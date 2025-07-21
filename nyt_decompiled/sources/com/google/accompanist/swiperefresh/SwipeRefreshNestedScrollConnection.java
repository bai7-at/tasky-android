package com.google.accompanist.swiperefresh;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.by0;
import defpackage.d35;
import defpackage.dg4;
import defpackage.fd5;
import defpackage.g35;
import defpackage.hd5;
import defpackage.qs2;
import defpackage.u49;
import defpackage.uo6;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
final class SwipeRefreshNestedScrollConnection implements d35 {
    private final SwipeRefreshState a;
    private final CoroutineScope b;
    private final qs2 c;
    private boolean d;
    private float e;

    public SwipeRefreshNestedScrollConnection(SwipeRefreshState swipeRefreshState, CoroutineScope coroutineScope, qs2 qs2Var) {
        zq3.h(swipeRefreshState, TransferTable.COLUMN_STATE);
        zq3.h(coroutineScope, "coroutineScope");
        zq3.h(qs2Var, "onRefresh");
        this.a = swipeRefreshState;
        this.b = coroutineScope;
        this.c = qs2Var;
    }

    private final long b(long j) {
        if (fd5.p(j) > 0) {
            this.a.h(true);
        } else if (dg4.d(this.a.d()) == 0) {
            this.a.h(false);
        }
        float c = uo6.c((fd5.p(j) * 0.5f) + this.a.d(), 0.0f) - this.a.d();
        if (Math.abs(c) < 0.5f) {
            return fd5.b.c();
        }
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new SwipeRefreshNestedScrollConnection$onScroll$1(this, c, null), 3, null);
        return hd5.a(0.0f, c / 0.5f);
    }

    @Override // defpackage.d35
    public long b1(long j, int i) {
        if (this.d && !this.a.e()) {
            return (!g35.e(i, g35.a.a()) || fd5.p(j) >= ((float) 0)) ? fd5.b.c() : b(j);
        }
        return fd5.b.c();
    }

    public final void c(boolean z) {
        this.d = z;
    }

    public final void d(float f) {
        this.e = f;
    }

    @Override // defpackage.d35
    public Object o0(long j, by0 by0Var) {
        if (!this.a.e() && this.a.d() >= this.e) {
            this.c.mo865invoke();
        }
        this.a.h(false);
        return u49.b(u49.b.a());
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        if (this.d && !this.a.e()) {
            return (!g35.e(i, g35.a.a()) || fd5.p(j2) <= ((float) 0)) ? fd5.b.c() : b(j2);
        }
        return fd5.b.c();
    }
}
