package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class vr9 {
    private final tr9 a;
    private final ls9 b;
    private boolean c;
    private long f;
    private int d = 0;
    private long e = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private float i = 1.0f;
    private acd j = acd.a;

    public vr9(Context context, tr9 tr9Var, long j) {
        this.a = tr9Var;
        this.b = new ls9(context);
    }

    private final void q(int i) {
        this.d = Math.min(this.d, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r20.a.k(r1, r11) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r23 >= r27) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r20.c != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r21, long r23, long r25, long r27, boolean r29, defpackage.rr9 r30) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr9.a(long, long, long, long, boolean, rr9):int");
    }

    public final void b() {
        if (this.d == 0) {
            this.d = 1;
        }
    }

    public final void c() {
        this.h = -9223372036854775807L;
    }

    public final void d() {
        q(0);
    }

    public final void e(boolean z) {
        this.d = z ? 1 : 0;
    }

    public final void f() {
        q(2);
    }

    public final void g() {
        this.c = true;
        this.f = khe.F(SystemClock.elapsedRealtime());
        this.b.g();
    }

    public final void h() {
        this.c = false;
        this.h = -9223372036854775807L;
        this.b.h();
    }

    public final void i() {
        this.b.f();
        this.g = -9223372036854775807L;
        this.e = -9223372036854775807L;
        q(1);
        this.h = -9223372036854775807L;
    }

    public final void j(int i) {
        this.b.j(i);
    }

    public final void k(acd acdVar) {
        this.j = acdVar;
    }

    public final void l(float f) {
        this.b.c(f);
    }

    public final void m(Surface surface) {
        this.b.i(surface);
        q(1);
    }

    public final void n(float f) {
        this.i = f;
        this.b.e(f);
    }

    public final boolean o(boolean z) {
        if (!z || this.d != 3) {
            if (this.h == -9223372036854775807L) {
                return false;
            }
            r2 = SystemClock.elapsedRealtime() < this.h;
            return r2;
        }
        this.h = -9223372036854775807L;
        return r2;
    }

    public final boolean p() {
        int i = this.d;
        this.d = 3;
        this.f = khe.F(SystemClock.elapsedRealtime());
        return i != 3;
    }
}
