package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class pa2 extends np2 {
    private final ss2 a;
    private boolean b;

    public pa2(yt7 yt7Var, ss2 ss2Var) {
        super(yt7Var);
        this.a = ss2Var;
    }

    @Override // defpackage.np2, defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }

    @Override // defpackage.np2, defpackage.yt7, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }

    @Override // defpackage.np2, defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        if (this.b) {
            ad0Var.skip(j);
            return;
        }
        try {
            super.write(ad0Var, j);
        } catch (IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }
}
