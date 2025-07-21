package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class a3f extends y2f implements oca {
    private int k;

    protected a3f(String str) {
        super("mvhd");
    }

    public final int f() {
        if (!this.c) {
            e();
        }
        return this.k;
    }

    protected final long g(ByteBuffer byteBuffer) {
        this.k = nca.c(byteBuffer.get());
        nca.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
