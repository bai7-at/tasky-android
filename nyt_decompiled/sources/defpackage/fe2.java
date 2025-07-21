package defpackage;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public abstract class fe2 implements Closeable {
    private final boolean a;
    private boolean b;
    private int c;
    private final ReentrantLock d = an9.b();

    private static final class a implements px7 {
        private final fe2 a;
        private long b;
        private boolean c;

        public a(fe2 fe2Var, long j) {
            zq3.h(fe2Var, "fileHandle");
            this.a = fe2Var;
            this.b = j;
        }

        @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
        public void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            ReentrantLock i = this.a.i();
            i.lock();
            try {
                fe2 fe2Var = this.a;
                fe2Var.c--;
                if (this.a.c == 0 && this.a.b) {
                    ww8 ww8Var = ww8.a;
                    i.unlock();
                    this.a.j();
                }
            } finally {
                i.unlock();
            }
        }

        @Override // defpackage.px7
        public long read(ad0 ad0Var, long j) {
            zq3.h(ad0Var, "sink");
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            long r = this.a.r(this.b, ad0Var, j);
            if (r != -1) {
                this.b += r;
            }
            return r;
        }

        @Override // defpackage.px7, defpackage.yt7
        public pm8 timeout() {
            return pm8.NONE;
        }
    }

    public fe2(boolean z) {
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long r(long j, ad0 ad0Var, long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = j2 + j;
        long j4 = j;
        while (true) {
            if (j4 >= j3) {
                break;
            }
            ji7 w1 = ad0Var.w1(1);
            int l = l(j4, w1.a, w1.c, (int) Math.min(j3 - j4, 8192 - r7));
            if (l == -1) {
                if (w1.b == w1.c) {
                    ad0Var.a = w1.b();
                    li7.b(w1);
                }
                if (j == j4) {
                    return -1L;
                }
            } else {
                w1.c += l;
                long j5 = l;
                j4 += j5;
                ad0Var.e1(ad0Var.h1() + j5);
            }
        }
        return j4 - j;
    }

    public final px7 C(long j) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            this.c++;
            reentrantLock.unlock();
            return new a(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c != 0) {
                return;
            }
            ww8 ww8Var = ww8.a;
            reentrantLock.unlock();
            j();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock i() {
        return this.d;
    }

    protected abstract void j();

    protected abstract int l(long j, byte[] bArr, int i, int i2);

    protected abstract long m();

    public final long s() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            ww8 ww8Var = ww8.a;
            reentrantLock.unlock();
            return m();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
