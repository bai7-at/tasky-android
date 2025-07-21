package okhttp3.internal.cache;

import defpackage.ad0;
import defpackage.np2;
import defpackage.ss2;
import defpackage.yt7;
import defpackage.zq3;
import java.io.IOException;

/* loaded from: classes5.dex */
public class FaultHidingSink extends np2 {
    private boolean hasErrors;
    private final ss2 onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(yt7 yt7Var, ss2 ss2Var) {
        super(yt7Var);
        zq3.h(yt7Var, "delegate");
        zq3.h(ss2Var, "onException");
        this.onException = ss2Var;
    }

    @Override // defpackage.np2, defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // defpackage.np2, defpackage.yt7, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final ss2 getOnException() {
        return this.onException;
    }

    @Override // defpackage.np2, defpackage.yt7
    public void write(ad0 ad0Var, long j) {
        zq3.h(ad0Var, "source");
        if (this.hasErrors) {
            ad0Var.skip(j);
            return;
        }
        try {
            super.write(ad0Var, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
