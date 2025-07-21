package defpackage;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ff0 implements iz6 {
    private final t80 a = new t80();

    @Override // defpackage.iz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz6 b(ByteBuffer byteBuffer, int i, int i2, sk5 sk5Var) {
        return this.a.b(ImageDecoder.createSource(byteBuffer), i, i2, sk5Var);
    }

    @Override // defpackage.iz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, sk5 sk5Var) {
        return true;
    }
}
