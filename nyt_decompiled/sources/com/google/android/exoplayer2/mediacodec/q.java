package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.j;
import com.google.android.exoplayer2.mediacodec.q;
import defpackage.ep8;
import defpackage.t31;
import defpackage.ur;
import defpackage.z19;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class q implements j {
    private final MediaCodec a;
    private ByteBuffer[] b;
    private ByteBuffer[] c;

    public static class b implements j.b {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.mediacodec.j.b
        public j a(j.a aVar) {
            MediaCodec mediaCodec = null;
            Object[] objArr = 0;
            try {
                MediaCodec b = b(aVar);
                try {
                    ep8.a("configureCodec");
                    b.configure(aVar.b, aVar.d, aVar.e, aVar.f);
                    ep8.c();
                    ep8.a("startCodec");
                    b.start();
                    ep8.c();
                    return new q(b);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = b;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e2) {
                e = e2;
            }
        }

        protected MediaCodec b(j.a aVar) {
            ur.e(aVar.a);
            String str = aVar.a.a;
            ep8.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            ep8.c();
            return createByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(j.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void a(int i, int i2, t31 t31Var, long j, int i3) {
        this.a.queueSecureInputBuffer(i, i2, t31Var.a(), j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public MediaFormat b() {
        return this.a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void c(final j.c cVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: rd8
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                q.this.p(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void d(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer e(int i) {
        return z19.a >= 21 ? this.a.getInputBuffer(i) : ((ByteBuffer[]) z19.j(this.b))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void f(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void flush() {
        this.a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void g(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public boolean h() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void i(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int k() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public int l(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && z19.a < 21) {
                this.c = this.a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void m(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public ByteBuffer n(int i) {
        return z19.a >= 21 ? this.a.getOutputBuffer(i) : ((ByteBuffer[]) z19.j(this.c))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.j
    public void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    private q(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (z19.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }
}
