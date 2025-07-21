package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* loaded from: classes2.dex */
public abstract class z80 implements xq8 {
    @Override // defpackage.xq8
    public final cz6 a(Context context, cz6 cz6Var, int i, int i2) {
        if (!x19.r(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        w80 f = a.c(context).f();
        Bitmap bitmap = (Bitmap) cz6Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = c(f, bitmap, i, i2);
        return bitmap.equals(c) ? cz6Var : y80.f(c, f);
    }

    protected abstract Bitmap c(w80 w80Var, Bitmap bitmap, int i, int i2);
}
