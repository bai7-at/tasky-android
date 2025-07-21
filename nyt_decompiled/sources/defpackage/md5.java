package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes2.dex */
public final class md5 {
    private static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer a = AudioProcessor.a;
    private int c = 0;
    private int b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.b == 2) {
            int length = bArr != null ? bArr.length + 28 : d.length;
            i4 += e.length + length;
            i = length;
        } else {
            i = 0;
        }
        ByteBuffer c = c(i4);
        if (this.b == 2) {
            if (bArr != null) {
                e(c, bArr);
            } else {
                c.put(d);
            }
            c.put(e);
        }
        int i5 = this.c + wk5.i(byteBuffer);
        this.c = i5;
        f(c, i5, this.b, i3, false);
        for (int i6 = 0; i6 < i3; i6++) {
            if (i2 >= 255) {
                c.put((byte) -1);
                i2 -= 255;
            } else {
                c.put((byte) i2);
                i2 = 0;
            }
        }
        while (position < limit) {
            c.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        c.flip();
        if (this.b == 2) {
            byte[] array = c.array();
            int arrayOffset = c.arrayOffset() + i;
            byte[] bArr2 = e;
            c.putInt(i + bArr2.length + 22, z19.t(array, arrayOffset + bArr2.length, c.limit() - c.position(), 0));
        } else {
            c.putInt(22, z19.t(c.array(), c.arrayOffset(), c.limit() - c.position(), 0));
        }
        this.b++;
        return c;
    }

    private ByteBuffer c(int i) {
        if (this.a.capacity() < i) {
            this.a = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        return this.a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(px8.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, z19.t(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(px8.a(i2));
    }

    public void a(DecoderInputBuffer decoderInputBuffer, List list) {
        ur.e(decoderInputBuffer.c);
        if (decoderInputBuffer.c.limit() - decoderInputBuffer.c.position() == 0) {
            return;
        }
        this.a = b(decoderInputBuffer.c, (this.b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        decoderInputBuffer.f();
        decoderInputBuffer.t(this.a.remaining());
        decoderInputBuffer.c.put(this.a);
        decoderInputBuffer.u();
    }

    public void d() {
        this.a = AudioProcessor.a;
        this.c = 0;
        this.b = 2;
    }
}
