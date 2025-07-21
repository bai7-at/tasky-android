package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public class n80 implements j07 {
    private final Bitmap.CompressFormat a;
    private final int b;

    public n80() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // defpackage.j07
    public cz6 a(cz6 cz6Var, sk5 sk5Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) cz6Var.get()).compress(this.a, this.b, byteArrayOutputStream);
        cz6Var.c();
        return new xf0(byteArrayOutputStream.toByteArray());
    }

    public n80(Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }
}
