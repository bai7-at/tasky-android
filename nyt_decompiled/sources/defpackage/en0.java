package defpackage;

import android.content.Context;
import coil.ImageLoader;

/* loaded from: classes.dex */
public final class en0 {
    public static final en0 a = new en0();
    private static ImageLoader b;

    private en0() {
    }

    public static final ImageLoader a(Context context) {
        ImageLoader imageLoader = b;
        return imageLoader == null ? a.b(context) : imageLoader;
    }

    private final synchronized ImageLoader b(Context context) {
        ImageLoader imageLoader = b;
        if (imageLoader != null) {
            return imageLoader;
        }
        context.getApplicationContext();
        ImageLoader a2 = ug3.a(context);
        b = a2;
        return a2;
    }

    public static final synchronized void c(ImageLoader imageLoader) {
        synchronized (en0.class) {
            b = imageLoader;
        }
    }
}
