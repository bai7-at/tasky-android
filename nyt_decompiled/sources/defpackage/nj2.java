package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class nj2 extends z80 {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(ov3.a);

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.z80
    protected Bitmap c(w80 w80Var, Bitmap bitmap, int i, int i2) {
        return zq8.c(w80Var, bitmap, i, i2);
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        return obj instanceof nj2;
    }

    @Override // defpackage.ov3
    public int hashCode() {
        return 1572326941;
    }
}
