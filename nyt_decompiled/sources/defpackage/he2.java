package defpackage;

import defpackage.yg3;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class he2 extends yg3 {
    private final jp5 a;
    private final we2 b;
    private final String c;
    private final Closeable d;
    private final yg3.a e;
    private boolean f;
    private sd0 g;

    public he2(jp5 jp5Var, we2 we2Var, String str, Closeable closeable, yg3.a aVar) {
        super(null);
        this.a = jp5Var;
        this.b = we2Var;
        this.c = str;
        this.d = closeable;
        this.e = aVar;
    }

    private final void d() {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // defpackage.yg3
    public yg3.a a() {
        return this.e;
    }

    @Override // defpackage.yg3
    public synchronized sd0 b() {
        d();
        sd0 sd0Var = this.g;
        if (sd0Var != null) {
            return sd0Var;
        }
        sd0 d = wd5.d(i().q(this.a));
        this.g = d;
        return d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f = true;
            sd0 sd0Var = this.g;
            if (sd0Var != null) {
                s.d(sd0Var);
            }
            Closeable closeable = this.d;
            if (closeable != null) {
                s.d(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String h() {
        return this.c;
    }

    public we2 i() {
        return this.b;
    }
}
