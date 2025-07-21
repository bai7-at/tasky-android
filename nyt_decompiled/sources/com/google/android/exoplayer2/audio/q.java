package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import defpackage.z19;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class q extends h {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = z19.f;
    private int n;
    private long o;

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer b() {
        int i;
        if (super.d() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer l = l(length);
        int q = z19.q(length, 0, this.n);
        l.put(this.m, 0, q);
        int q2 = z19.q(length - q, 0, i2);
        byteBuffer.limit(byteBuffer.position() + q2);
        l.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - q2;
        int i4 = this.n - q;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, q, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        l.flip();
    }

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        if (aVar.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? AudioProcessor.a.e : aVar;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void i() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void j() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void k() {
        this.m = z19.f;
    }

    public long m() {
        return this.o;
    }

    public void n() {
        this.o = 0L;
    }

    public void o(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
