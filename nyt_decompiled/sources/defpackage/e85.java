package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
final class e85 extends ov1 {
    private e85(Drawable drawable) {
        super(drawable);
    }

    static cz6 f(Drawable drawable) {
        if (drawable != null) {
            return new e85(drawable);
        }
        return null;
    }

    @Override // defpackage.cz6
    public int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.cz6
    public void c() {
    }

    @Override // defpackage.cz6
    public Class d() {
        return this.a.getClass();
    }
}
