package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class ls7 implements ps4 {
    @Override // defpackage.ps4
    public final Metadata a(ts4 ts4Var) {
        ByteBuffer byteBuffer = (ByteBuffer) ur.e(ts4Var.c);
        ur.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (ts4Var.k()) {
            return null;
        }
        return b(ts4Var, byteBuffer);
    }

    protected abstract Metadata b(ts4 ts4Var, ByteBuffer byteBuffer);
}
