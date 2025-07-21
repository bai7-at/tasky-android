package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class fl3 implements iz6 {
    private final t80 a = new t80();

    @Override // defpackage.iz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz6 b(InputStream inputStream, int i, int i2, sk5 sk5Var) {
        return this.a.b(ImageDecoder.createSource(lf0.b(inputStream)), i, i2, sk5Var);
    }

    @Override // defpackage.iz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, sk5 sk5Var) {
        return true;
    }
}
