package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes3.dex */
public final class yvf {
    private static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer a = grc.a;
    private int c = 0;
    private int b = 2;

    private static final void c(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(qje.a(i2));
    }

    public final void a(n7f n7fVar, List list) {
        int i;
        ByteBuffer byteBuffer = n7fVar.d;
        byteBuffer.getClass();
        if (byteBuffer.limit() - n7fVar.d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = n7fVar.d;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i2 = limit - position;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.b == 2) {
            i = bArr != null ? bArr.length + 28 : 47;
            i4 += i + 44;
        } else {
            i = 0;
        }
        if (this.a.capacity() < i4) {
            this.a = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        ByteBuffer byteBuffer3 = this.a;
        if (this.b == 2) {
            if (bArr != null) {
                c(byteBuffer3, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer3.put(qje.a(length));
                byteBuffer3.put(bArr);
                int i5 = length + 28;
                byteBuffer3.putInt(22, khe.s(byteBuffer3.array(), byteBuffer3.arrayOffset(), i5, 0));
                byteBuffer3.position(i5);
            } else {
                byteBuffer3.put(d);
            }
            byteBuffer3.put(e);
        }
        int c = this.c + bx9.c(byteBuffer2);
        this.c = c;
        c(byteBuffer3, c, this.b, i3, false);
        for (int i6 = 0; i6 < i3; i6++) {
            if (i2 >= 255) {
                byteBuffer3.put((byte) -1);
                i2 -= 255;
            } else {
                byteBuffer3.put((byte) i2);
                i2 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.b == 2) {
            byteBuffer3.putInt(i + 66, khe.s(byteBuffer3.array(), byteBuffer3.arrayOffset() + i + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, khe.s(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.b++;
        this.a = byteBuffer3;
        n7fVar.b();
        n7fVar.i(this.a.remaining());
        n7fVar.d.put(this.a);
        n7fVar.j();
    }

    public final void b() {
        this.a = grc.a;
        this.c = 0;
        this.b = 2;
    }
}
