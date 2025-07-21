package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class y80 implements cz6, rj3 {
    private final Bitmap a;
    private final w80 b;

    public y80(Bitmap bitmap, w80 w80Var) {
        this.a = (Bitmap) z06.e(bitmap, "Bitmap must not be null");
        this.b = (w80) z06.e(w80Var, "BitmapPool must not be null");
    }

    public static y80 f(Bitmap bitmap, w80 w80Var) {
        if (bitmap == null) {
            return null;
        }
        return new y80(bitmap, w80Var);
    }

    @Override // defpackage.cz6
    public int a() {
        return x19.g(this.a);
    }

    @Override // defpackage.rj3
    public void b() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.cz6
    public void c() {
        this.b.b(this.a);
    }

    @Override // defpackage.cz6
    public Class d() {
        return Bitmap.class;
    }

    @Override // defpackage.cz6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.a;
    }
}
