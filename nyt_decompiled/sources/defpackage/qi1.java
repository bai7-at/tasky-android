package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerState;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class qi1 implements d35 {
    private final PagerState a;
    private final Orientation b;

    public qi1(PagerState pagerState, Orientation orientation) {
        this.a = pagerState;
        this.b = orientation;
    }

    @Override // defpackage.d35
    public Object Q0(long j, long j2, by0 by0Var) {
        return u49.b(a(j2, this.b));
    }

    public final long a(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? u49.e(j, 0.0f, 0.0f, 2, null) : u49.e(j, 0.0f, 0.0f, 1, null);
    }

    @Override // defpackage.d35
    public long b1(long j, int i) {
        if (!g35.e(i, g35.a.a()) || Math.abs(this.a.x()) <= 0.0d) {
            return fd5.b.c();
        }
        float x = this.a.x() * this.a.F();
        float g = ((this.a.C().g() + this.a.C().j()) * (-Math.signum(this.a.x()))) + x;
        if (this.a.x() > 0.0f) {
            g = x;
            x = g;
        }
        Orientation orientation = this.b;
        Orientation orientation2 = Orientation.Horizontal;
        float f = -this.a.f(-uo6.l(orientation == orientation2 ? fd5.o(j) : fd5.p(j), x, g));
        float o = this.b == orientation2 ? f : fd5.o(j);
        if (this.b != Orientation.Vertical) {
            f = fd5.p(j);
        }
        return fd5.h(j, o, f);
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        if (!g35.e(i, g35.a.b()) || fd5.l(j2, fd5.b.c())) {
            return fd5.b.c();
        }
        throw new CancellationException();
    }
}
