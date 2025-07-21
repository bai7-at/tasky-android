package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class ov1 implements cz6, rj3 {
    protected final Drawable a;

    public ov1(Drawable drawable) {
        this.a = (Drawable) z06.d(drawable);
    }

    @Override // defpackage.rj3
    public void b() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof lz2) {
            ((lz2) drawable).e().prepareToDraw();
        }
    }

    @Override // defpackage.cz6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }
}
