package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.nytimes.android.image.loader.picasso.PicassoImageLoader;

/* loaded from: classes4.dex */
public final class og3 {
    public static final og3 a = new og3();
    private static final tg3 b = new PicassoImageLoader();

    private og3() {
    }

    public static final void a(Context context, b04 b04Var) {
        zq3.h(context, "context");
        zq3.h(b04Var, "client");
        b.a(context, b04Var);
    }

    public static final void b(ImageView imageView) {
        zq3.h(imageView, "imageView");
        b.b(imageView);
    }

    public static final fy6 c() {
        return b.get();
    }

    public static final tg3 d() {
        return b;
    }
}
