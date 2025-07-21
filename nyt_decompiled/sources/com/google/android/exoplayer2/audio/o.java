package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import defpackage.z19;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class o extends h {
    private static final int i = Float.floatToIntBits(Float.NaN);

    o() {
    }

    private static void m(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c(ByteBuffer byteBuffer) {
        ByteBuffer l;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            l = l((i2 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l);
                position += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            l = l(i2);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l.flip();
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        int i2 = aVar.c;
        if (z19.v0(i2)) {
            return i2 != 4 ? new AudioProcessor.a(aVar.a, aVar.b, 4) : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
