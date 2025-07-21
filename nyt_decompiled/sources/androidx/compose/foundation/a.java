package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cv1;
import defpackage.el5;
import defpackage.fl5;
import defpackage.fv1;
import defpackage.nn0;
import defpackage.no7;
import defpackage.qf2;
import defpackage.qt6;
import defpackage.yc0;
import defpackage.yv0;
import defpackage.zq3;
import defpackage.zt7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
final class a extends Modifier.c implements cv1 {
    private long n;
    private yc0 r;
    private float s;
    private no7 t;
    private zt7 u;
    private LayoutDirection w;
    private el5 x;
    private no7 y;

    public /* synthetic */ a(long j, yc0 yc0Var, float f, no7 no7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, yc0Var, f, no7Var);
    }

    private final void e2(yv0 yv0Var) {
        el5 a;
        if (zt7.e(yv0Var.b(), this.u) && yv0Var.getLayoutDirection() == this.w && zq3.c(this.y, this.t)) {
            a = this.x;
            zq3.e(a);
        } else {
            a = this.t.a(yv0Var.b(), yv0Var.getLayoutDirection(), yv0Var);
        }
        if (!nn0.t(this.n, nn0.b.g())) {
            fl5.d(yv0Var, a, this.n, (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? qf2.a : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? fv1.p.a() : 0);
        }
        yc0 yc0Var = this.r;
        if (yc0Var != null) {
            fl5.c(yv0Var, a, yc0Var, this.s, null, null, 0, 56, null);
        }
        this.x = a;
        this.u = zt7.c(yv0Var.b());
        this.w = yv0Var.getLayoutDirection();
        this.y = this.t;
    }

    private final void f2(yv0 yv0Var) {
        if (!nn0.t(this.n, nn0.b.g())) {
            fv1.a0(yv0Var, this.n, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        }
        yc0 yc0Var = this.r;
        if (yc0Var != null) {
            fv1.Y0(yv0Var, yc0Var, 0L, 0L, this.s, null, null, 0, 118, null);
        }
    }

    public final void c(float f) {
        this.s = f;
    }

    public final void e1(no7 no7Var) {
        this.t = no7Var;
    }

    public final void g2(yc0 yc0Var) {
        this.r = yc0Var;
    }

    public final void h2(long j) {
        this.n = j;
    }

    @Override // defpackage.cv1
    public void w(yv0 yv0Var) {
        if (this.t == qt6.a()) {
            f2(yv0Var);
        } else {
            e2(yv0Var);
        }
        yv0Var.A1();
    }

    private a(long j, yc0 yc0Var, float f, no7 no7Var) {
        this.n = j;
        this.r = yc0Var;
        this.s = f;
        this.t = no7Var;
    }
}
