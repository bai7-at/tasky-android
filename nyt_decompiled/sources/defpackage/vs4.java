package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class vs4 extends lf8 {
    public static vs4 h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new vs4());
    }

    public static vs4 i(ByteBuffer byteBuffer, vs4 vs4Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return vs4Var.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public vs4 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public us4 j(us4 us4Var, int i) {
        int b = b(6);
        if (b != 0) {
            return us4Var.f(a(d(b) + (i * 4)), this.b);
        }
        return null;
    }

    public int k() {
        int b = b(6);
        if (b != 0) {
            return e(b);
        }
        return 0;
    }

    public int l() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
