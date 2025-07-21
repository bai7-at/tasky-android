package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class hf implements sf3 {
    private final Bitmap b;

    public hf(Bitmap bitmap) {
        this.b = bitmap;
    }

    @Override // defpackage.sf3
    public void a() {
        this.b.prepareToDraw();
    }

    @Override // defpackage.sf3
    public int b() {
        return AbstractC0565if.e(this.b.getConfig());
    }

    public final Bitmap c() {
        return this.b;
    }

    @Override // defpackage.sf3
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.sf3
    public int getWidth() {
        return this.b.getWidth();
    }
}
