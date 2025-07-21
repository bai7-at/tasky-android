package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
final class ixf extends MediaCodec.Callback {
    private final HandlerThread b;
    private Handler c;
    private MediaFormat h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private MediaCodec.CryptoException k;
    private long l;
    private boolean m;
    private IllegalStateException n;
    private final Object a = new Object();
    private final xk0 d = new xk0();
    private final xk0 e = new xk0();
    private final ArrayDeque f = new ArrayDeque();
    private final ArrayDeque g = new ArrayDeque();

    ixf(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public static /* synthetic */ void d(ixf ixfVar) {
        synchronized (ixfVar.a) {
            try {
                if (ixfVar.m) {
                    return;
                }
                long j = ixfVar.l - 1;
                ixfVar.l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    ixfVar.i();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (ixfVar.a) {
                    ixfVar.n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void h(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    private final void i() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat) this.g.getLast();
        }
        this.d.b();
        this.e.b();
        this.f.clear();
        this.g.clear();
    }

    private final void j() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException != null) {
            this.n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.j;
        if (codecException != null) {
            this.j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.k;
        if (cryptoException == null) {
            return;
        }
        this.k = null;
        throw cryptoException;
    }

    private final boolean k() {
        return this.l > 0 || this.m;
    }

    public final int a() {
        synchronized (this.a) {
            try {
                j();
                int i = -1;
                if (k()) {
                    return -1;
                }
                if (!this.d.d()) {
                    i = this.d.e();
                }
                return i;
            } finally {
            }
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                j();
                if (k()) {
                    return -1;
                }
                if (this.e.d()) {
                    return -1;
                }
                int e = this.e.e();
                if (e >= 0) {
                    wad.b(this.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (e == -2) {
                    this.h = (MediaFormat) this.g.remove();
                    e = -2;
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            try {
                mediaFormat = this.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.a) {
            this.l++;
            Handler handler = this.c;
            int i = khe.a;
            handler.post(new Runnable() { // from class: hxf
                @Override // java.lang.Runnable
                public final void run() {
                    ixf.d(ixf.this);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        wad.f(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final void g() {
        synchronized (this.a) {
            this.m = true;
            this.b.quit();
            i();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    h(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            h(mediaFormat);
            this.i = null;
        }
    }
}
