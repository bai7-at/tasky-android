package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.kz4;
import defpackage.pt0;
import defpackage.t31;
import defpackage.ur;
import defpackage.z19;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class c {
    private static final ArrayDeque g = new ArrayDeque();
    private static final Object h = new Object();
    private final MediaCodec a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference d;
    private final pt0 e;
    private boolean f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c.this.f(message);
        }
    }

    private static class b {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        b() {
        }

        public void a(int i, int i2, int i3, long j, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new pt0());
    }

    private void b() {
        this.e.c();
        ((Handler) ur.e(this.c)).obtainMessage(2).sendToTarget();
        this.e.a();
    }

    private static void c(t31 t31Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = t31Var.f;
        cryptoInfo.numBytesOfClearData = e(t31Var.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(t31Var.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) ur.e(d(t31Var.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) ur.e(d(t31Var.a, cryptoInfo.iv));
        cryptoInfo.mode = t31Var.c;
        if (z19.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(t31Var.g, t31Var.h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        b bVar;
        int i = message.what;
        if (i == 0) {
            bVar = (b) message.obj;
            g(bVar.a, bVar.b, bVar.c, bVar.e, bVar.f);
        } else if (i != 1) {
            bVar = null;
            if (i != 2) {
                kz4.a(this.d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.e.e();
            }
        } else {
            bVar = (b) message.obj;
            h(bVar.a, bVar.b, bVar.d, bVar.e, bVar.f);
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    private void g(int i, int i2, int i3, long j, int i4) {
        try {
            this.a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            kz4.a(this.d, null, e);
        }
    }

    private void h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (h) {
                this.a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            kz4.a(this.d, null, e);
        }
    }

    private void j() {
        ((Handler) ur.e(this.c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void o(b bVar) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f) {
            try {
                j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public void l() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public void m(int i, int i2, int i3, long j, int i4) {
        l();
        b k = k();
        k.a(i, i2, i3, j, i4);
        ((Handler) z19.j(this.c)).obtainMessage(0, k).sendToTarget();
    }

    public void n(int i, int i2, t31 t31Var, long j, int i3) {
        l();
        b k = k();
        k.a(i, i2, 0, j, i3);
        c(t31Var, k.d);
        ((Handler) z19.j(this.c)).obtainMessage(1, k).sendToTarget();
    }

    public void p() {
        if (this.f) {
            i();
            this.b.quit();
        }
        this.f = false;
    }

    public void q() {
        if (this.f) {
            return;
        }
        this.b.start();
        this.c = new a(this.b.getLooper());
        this.f = true;
    }

    public void r() {
        b();
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, pt0 pt0Var) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = pt0Var;
        this.d = new AtomicReference();
    }
}
