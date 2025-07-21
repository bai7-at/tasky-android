package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class x80 implements w80 {
    @Override // defpackage.w80
    public void a(int i) {
    }

    @Override // defpackage.w80
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.w80
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.w80
    public void clearMemory() {
    }

    @Override // defpackage.w80
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return c(i, i2, config);
    }
}
