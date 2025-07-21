package androidx.compose.ui.input.pointer.util;

import defpackage.fd5;
import defpackage.u49;
import defpackage.v49;

/* loaded from: classes.dex */
public final class a {
    private final VelocityTracker1D a = new VelocityTracker1D(false, null, 3, null);
    private final VelocityTracker1D b = new VelocityTracker1D(false, null, 3, null);
    private long c = fd5.b.c();
    private long d;

    public final void a(long j, long j2) {
        this.a.a(j, fd5.o(j2));
        this.b.a(j, fd5.p(j2));
    }

    public final long b(long j) {
        if (u49.h(j) > 0.0f && u49.i(j) > 0.0f) {
            return v49.a(this.a.d(u49.h(j)), this.b.d(u49.i(j)));
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) u49.n(j))).toString());
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final void e() {
        this.a.e();
        this.b.e();
        this.d = 0L;
    }

    public final void f(long j) {
        this.c = j;
    }

    public final void g(long j) {
        this.d = j;
    }
}
