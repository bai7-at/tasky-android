package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.sf3;

/* loaded from: classes.dex */
public abstract class wg3 {
    public static final sf3 a(sf3.a aVar, Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, null);
        zq3.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AbstractC0565if.c(((BitmapDrawable) drawable).getBitmap());
    }
}
