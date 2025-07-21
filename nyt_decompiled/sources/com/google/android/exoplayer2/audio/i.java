package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import defpackage.ur;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class i extends h {
    private int[] i;
    private int[] j;

    i() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ur.e(this.j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                l.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return AudioProcessor.a.e;
        }
        if (aVar.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z = aVar.b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= aVar.b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new AudioProcessor.a(aVar.a, iArr.length, 2) : AudioProcessor.a.e;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void i() {
        this.j = this.i;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void k() {
        this.j = null;
        this.i = null;
    }

    public void m(int[] iArr) {
        this.i = iArr;
    }
}
