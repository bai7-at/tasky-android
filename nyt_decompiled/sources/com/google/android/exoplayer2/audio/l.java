package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import defpackage.ur;
import defpackage.z19;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class l extends h {
    private final long i;
    private final long j;
    private final short k;
    private int l;
    private boolean m;
    private byte[] n;
    private byte[] o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private long t;

    public l() {
        this(150000L, 20000L, (short) 1024);
    }

    private int m(long j) {
        return (int) ((j * this.b.a) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.k);
        int i = this.l;
        return ((limit / i) * i) + i;
    }

    private int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.k) {
                int i = this.l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    private void q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.s = true;
        }
    }

    private void r(byte[] bArr, int i) {
        l(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.s = true;
        }
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o = o(byteBuffer);
        int position = o - byteBuffer.position();
        byte[] bArr = this.n;
        int length = bArr.length;
        int i = this.q;
        int i2 = length - i;
        if (o < limit && position < i2) {
            r(bArr, i);
            this.q = 0;
            this.p = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.n, this.q, min);
        int i3 = this.q + min;
        this.q = i3;
        byte[] bArr2 = this.n;
        if (i3 == bArr2.length) {
            if (this.s) {
                r(bArr2, this.r);
                this.t += (this.q - (this.r * 2)) / this.l;
            } else {
                this.t += (i3 - this.r) / this.l;
            }
            w(byteBuffer, this.n, this.q);
            this.q = 0;
            this.p = 2;
        }
        byteBuffer.limit(limit);
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
        int n = n(byteBuffer);
        if (n == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(n);
            q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o = o(byteBuffer);
        byteBuffer.limit(o);
        this.t += byteBuffer.remaining() / this.l;
        w(byteBuffer, this.o, this.r);
        if (o < limit) {
            r(this.o, this.r);
            this.p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void w(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i2 = this.r - min;
        System.arraycopy(bArr, i - i2, this.o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, i2, min);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i = this.p;
            if (i == 0) {
                t(byteBuffer);
            } else if (i == 1) {
                s(byteBuffer);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                u(byteBuffer);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        if (aVar.c == 2) {
            return this.m ? aVar : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void i() {
        if (this.m) {
            this.l = this.b.d;
            int m = m(this.i) * this.l;
            if (this.n.length != m) {
                this.n = new byte[m];
            }
            int m2 = m(this.j) * this.l;
            this.r = m2;
            if (this.o.length != m2) {
                this.o = new byte[m2];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void j() {
        int i = this.q;
        if (i > 0) {
            r(this.n, i);
        }
        if (this.s) {
            return;
        }
        this.t += this.r / this.l;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void k() {
        this.m = false;
        this.r = 0;
        byte[] bArr = z19.f;
        this.n = bArr;
        this.o = bArr;
    }

    public long p() {
        return this.t;
    }

    public void v(boolean z) {
        this.m = z;
    }

    public l(long j, long j2, short s) {
        ur.a(j2 <= j);
        this.i = j;
        this.j = j2;
        this.k = s;
        byte[] bArr = z19.f;
        this.n = bArr;
        this.o = bArr;
    }
}
