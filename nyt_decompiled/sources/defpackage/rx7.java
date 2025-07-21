package defpackage;

import defpackage.yg3;
import java.io.File;

/* loaded from: classes.dex */
public final class rx7 extends yg3 {
    private final File a;
    private final yg3.a b;
    private boolean c;
    private sd0 d;
    private jp5 e;

    public rx7(sd0 sd0Var, File file, yg3.a aVar) {
        super(null);
        this.a = file;
        this.b = aVar;
        this.d = sd0Var;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.");
        }
    }

    private final void d() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // defpackage.yg3
    public yg3.a a() {
        return this.b;
    }

    @Override // defpackage.yg3
    public synchronized sd0 b() {
        d();
        sd0 sd0Var = this.d;
        if (sd0Var != null) {
            return sd0Var;
        }
        we2 h = h();
        jp5 jp5Var = this.e;
        zq3.e(jp5Var);
        sd0 d = wd5.d(h.q(jp5Var));
        this.d = d;
        return d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.c = true;
            sd0 sd0Var = this.d;
            if (sd0Var != null) {
                s.d(sd0Var);
            }
            jp5 jp5Var = this.e;
            if (jp5Var != null) {
                h().h(jp5Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public we2 h() {
        return we2.b;
    }
}
