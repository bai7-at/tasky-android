package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class g0 extends z {
    private final WeakReference b;

    public g0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable a = a(i);
        Context context = (Context) this.b.get();
        if (a != null && context != null) {
            y.g().w(context, i, a);
        }
        return a;
    }
}
