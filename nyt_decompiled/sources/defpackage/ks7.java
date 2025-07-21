package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public abstract class ks7 implements vc1 {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();
    private final DecoderInputBuffer[] e;
    private final xc1[] f;
    private int g;
    private int h;
    private DecoderInputBuffer i;
    private DecoderException j;
    private boolean k;
    private boolean l;
    private int m;

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ks7.this.t();
        }
    }

    protected ks7(DecoderInputBuffer[] decoderInputBufferArr, xc1[] xc1VarArr) {
        this.e = decoderInputBufferArr;
        this.g = decoderInputBufferArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = g();
        }
        this.f = xc1VarArr;
        this.h = xc1VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.c.isEmpty() && this.h > 0;
    }

    private boolean k() {
        DecoderException i;
        synchronized (this.b) {
            while (!this.l && !f()) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.c.removeFirst();
            xc1[] xc1VarArr = this.f;
            int i2 = this.h - 1;
            this.h = i2;
            xc1 xc1Var = xc1VarArr[i2];
            boolean z = this.k;
            this.k = false;
            if (decoderInputBuffer.l()) {
                xc1Var.e(4);
            } else {
                if (decoderInputBuffer.k()) {
                    xc1Var.e(RecyclerView.UNDEFINED_DURATION);
                }
                if (decoderInputBuffer.n()) {
                    xc1Var.e(134217728);
                }
                try {
                    i = j(decoderInputBuffer, xc1Var, z);
                } catch (OutOfMemoryError e) {
                    i = i(e);
                } catch (RuntimeException e2) {
                    i = i(e2);
                }
                if (i != null) {
                    synchronized (this.b) {
                        this.j = i;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        xc1Var.s();
                    } else if (xc1Var.k()) {
                        this.m++;
                        xc1Var.s();
                    } else {
                        xc1Var.c = this.m;
                        this.m = 0;
                        this.d.addLast(xc1Var);
                    }
                    q(decoderInputBuffer);
                } finally {
                }
            }
            return true;
        }
    }

    private void n() {
        if (f()) {
            this.b.notify();
        }
    }

    private void o() {
        DecoderException decoderException = this.j;
        if (decoderException != null) {
            throw decoderException;
        }
    }

    private void q(DecoderInputBuffer decoderInputBuffer) {
        decoderInputBuffer.f();
        DecoderInputBuffer[] decoderInputBufferArr = this.e;
        int i = this.g;
        this.g = i + 1;
        decoderInputBufferArr[i] = decoderInputBuffer;
    }

    private void s(xc1 xc1Var) {
        xc1Var.f();
        xc1[] xc1VarArr = this.f;
        int i = this.h;
        this.h = i + 1;
        xc1VarArr[i] = xc1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (k());
    }

    @Override // defpackage.vc1
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                DecoderInputBuffer decoderInputBuffer = this.i;
                if (decoderInputBuffer != null) {
                    q(decoderInputBuffer);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    q((DecoderInputBuffer) this.c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    ((xc1) this.d.removeFirst()).s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract DecoderInputBuffer g();

    protected abstract xc1 h();

    protected abstract DecoderException i(Throwable th);

    protected abstract DecoderException j(DecoderInputBuffer decoderInputBuffer, xc1 xc1Var, boolean z);

    @Override // defpackage.vc1
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final DecoderInputBuffer d() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.b) {
            o();
            ur.g(this.i == null);
            int i = this.g;
            if (i == 0) {
                decoderInputBuffer = null;
            } else {
                DecoderInputBuffer[] decoderInputBufferArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                decoderInputBuffer = decoderInputBufferArr[i2];
            }
            this.i = decoderInputBuffer;
        }
        return decoderInputBuffer;
    }

    @Override // defpackage.vc1
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final xc1 b() {
        synchronized (this.b) {
            try {
                o();
                if (this.d.isEmpty()) {
                    return null;
                }
                return (xc1) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vc1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void c(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.b) {
            o();
            ur.a(decoderInputBuffer == this.i);
            this.c.addLast(decoderInputBuffer);
            n();
            this.i = null;
        }
    }

    protected void r(xc1 xc1Var) {
        synchronized (this.b) {
            s(xc1Var);
            n();
        }
    }

    @Override // defpackage.vc1
    public void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected final void u(int i) {
        ur.g(this.g == this.e.length);
        for (DecoderInputBuffer decoderInputBuffer : this.e) {
            decoderInputBuffer.t(i);
        }
    }
}
