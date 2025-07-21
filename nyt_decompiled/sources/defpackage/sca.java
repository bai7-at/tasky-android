package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class sca extends y2f {
    ByteBuffer k;

    public sca(String str) {
        super(str);
    }

    @Override // defpackage.y2f
    public final void c(ByteBuffer byteBuffer) {
        this.k = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
