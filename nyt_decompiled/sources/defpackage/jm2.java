package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class jm2 {
    private final AssetManager d;
    private final ky4 a = new ky4();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private String e = ".ttf";

    public jm2(Drawable.Callback callback, im2 im2Var) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            j94.c("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }

    private Typeface a(hm2 hm2Var) {
        String a = hm2Var.a();
        Typeface typeface = (Typeface) this.c.get(a);
        if (typeface != null) {
            return typeface;
        }
        hm2Var.c();
        hm2Var.b();
        if (hm2Var.d() != null) {
            return hm2Var.d();
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.d, "fonts/" + a + this.e);
        this.c.put(a, createFromAsset);
        return createFromAsset;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public Typeface b(hm2 hm2Var) {
        this.a.b(hm2Var.a(), hm2Var.c());
        Typeface typeface = (Typeface) this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e = e(a(hm2Var), hm2Var.c());
        this.b.put(this.a, e);
        return e;
    }

    public void c(String str) {
        this.e = str;
    }

    public void d(im2 im2Var) {
    }
}
