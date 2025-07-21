package defpackage;

import android.os.Handler;
import com.facebook.GraphRequest;

/* loaded from: classes2.dex */
public final class ry6 {
    private final Handler a;
    private final GraphRequest b;
    private final long c;
    private long d;
    private long e;
    private long f;

    public ry6(Handler handler, GraphRequest graphRequest) {
        zq3.h(graphRequest, "request");
        this.a = handler;
        this.b = graphRequest;
        this.c = w92.z();
    }

    public final void a(long j) {
        long j2 = this.d + j;
        this.d = j2;
        if (j2 >= this.e + this.c || j2 >= this.f) {
            c();
        }
    }

    public final void b(long j) {
        this.f += j;
    }

    public final void c() {
        if (this.d > this.e) {
            this.b.o();
        }
    }
}
