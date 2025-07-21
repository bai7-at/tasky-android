package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class lf8 {
    protected int a;
    protected ByteBuffer b;
    private int c;
    private int d;
    s19 e = s19.a();

    protected int a(int i) {
        return i + this.b.getInt(i);
    }

    protected int b(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    protected void c(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer == null) {
            this.a = 0;
            this.c = 0;
            this.d = 0;
        } else {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            this.d = this.b.getShort(i2);
        }
    }

    protected int d(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    protected int e(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }
}
