package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.b;
import com.google.android.exoplayer2.mediacodec.j;
import defpackage.ep8;
import defpackage.gc8;
import defpackage.t31;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b implements j {
    private final MediaCodec a;
    private final e b;
    private final c c;
    private final boolean d;
    private boolean e;
    private int f;

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$b, reason: collision with other inner class name */
    public static final class C0182b implements j.b {
        private final gc8 a;
        private final gc8 b;
        private final boolean c;

        public C0182b(final int i, boolean z) {
            this(new gc8() { // from class: nu
                @Override // defpackage.gc8
                public final Object get() {
                    HandlerThread e;
                    e = b.C0182b.e(i);
                    return e;
                }
            }, new gc8() { // from class: ou
                @Override // defpackage.gc8
                public final Object get() {
                    HandlerThread f;
                    f = b.C0182b.f(i);
                    return f;
                }
            }, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i) {
            return new HandlerThread(b.s(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i) {
            return new HandlerThread(b.t(i));
        }

        @Override // com.google.android.exoplayer2.mediacodec.j.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(j.a aVar) {
            MediaCodec mediaCodec;
            b bVar;
            String str = aVar.a.a;
            b bVar2 = null;
            try {
                ep8.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodec, (HandlerThread) this.a.get(), (HandlerThread) this.b.get(), this.c);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodec = null;
            }
            try {
                ep8.c();
                bVar.v(aVar.b, aVar.d, aVar.e, aVar.f);
                return bVar;
            } catch (Exception e3) {
                e = e3;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        C0182b(gc8 gc8Var, gc8 gc8Var2, boolean z) {
            this.a = gc8Var;
            this.b = gc8Var2;
            this.c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(int i) {
        return u(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(int i) {
        return u(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String u(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.b.h(this.a);
        ep8.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, i);
        ep8.c();
        this.c.q();
        ep8.a("startCodec");
        this.a.start();
        ep8.c();
        this.f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(j.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    private void x() {
        if (this.d) {
            try {
                this.c.r();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void a(int i, int i2, t31 t31Var, long j, int i3) {
        this.c.n(i, i2, t31Var, j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public MediaFormat b() {
        return this.b.g();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void c(final j.c cVar, Handler handler) {
        x();
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                b.this.w(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void d(int i) {
        x();
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void f(Surface surface) {
        x();
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void flush() {
        this.c.i();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void g(int i, int i2, int i3, long j, int i4) {
        this.c.m(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public boolean h() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void i(Bundle bundle) {
        x();
        this.a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int k() {
        this.c.l();
        return this.b.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int l(MediaCodec.BufferInfo bufferInfo) {
        this.c.l();
        return this.b.d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void m(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer n(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void release() {
        try {
            if (this.f == 1) {
                this.c.p();
                this.b.o();
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            this.a.release();
            this.e = true;
        } catch (Throwable th) {
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
            throw th;
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.a = mediaCodec;
        this.b = new e(handlerThread);
        this.c = new c(mediaCodec, handlerThread2);
        this.d = z;
        this.f = 0;
    }
}
