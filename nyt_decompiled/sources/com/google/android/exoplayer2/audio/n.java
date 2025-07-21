package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import defpackage.ur;
import defpackage.z19;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes2.dex */
public class n implements AudioProcessor {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private AudioProcessor.a e;
    private AudioProcessor.a f;
    private AudioProcessor.a g;
    private AudioProcessor.a h;
    private boolean i;
    private m j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public n() {
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void a() {
        this.c = 1.0f;
        this.d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer b() {
        int k;
        m mVar = this.j;
        if (mVar != null && (k = mVar.k()) > 0) {
            if (this.k.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            mVar.j(this.l);
            this.o += k;
            this.k.limit(k);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = AudioProcessor.a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            m mVar = (m) ur.e(this.j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            mVar.t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean d() {
        m mVar;
        return this.p && ((mVar = this.j) == null || mVar.k() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        if (aVar.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i = this.b;
        if (i == -1) {
            i = aVar.a;
        }
        this.e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i, aVar.b, 2);
        this.f = aVar2;
        this.i = true;
        return aVar2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void f() {
        m mVar = this.j;
        if (mVar != null) {
            mVar.s();
        }
        this.p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.e;
            this.g = aVar;
            AudioProcessor.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new m(aVar.a, aVar.b, this.c, this.d, aVar2.a);
            } else {
                m mVar = this.j;
                if (mVar != null) {
                    mVar.i();
                }
            }
        }
        this.m = AudioProcessor.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public final long g(long j) {
        if (this.o < 1024) {
            return (long) (this.c * j);
        }
        long l = this.n - ((m) ur.e(this.j)).l();
        int i = this.h.a;
        int i2 = this.g.a;
        return i == i2 ? z19.Q0(j, l, this.o) : z19.Q0(j, l * i, this.o * i2);
    }

    public final void h(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void i(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }
}
