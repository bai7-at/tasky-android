package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class qf3 {
    private static final Object d = new Object();
    private final Context a;
    private final String b;
    private final Map c;

    public qf3(Drawable.Callback callback, String str, lf3 lf3Var, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str + '/';
        }
        this.c = map;
        d(lf3Var);
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (d) {
            ((rc4) this.c.get(str)).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        rc4 rc4Var = (rc4) this.c.get(str);
        if (rc4Var == null) {
            return null;
        }
        Bitmap b = rc4Var.b();
        if (b != null) {
            return b;
        }
        Context context = this.a;
        if (context == null) {
            return null;
        }
        String c = rc4Var.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (c.startsWith("data:") && c.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c.substring(c.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                j94.d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.b + c), null, options);
                if (decodeStream != null) {
                    return c(str, l29.l(decodeStream, rc4Var.f(), rc4Var.d()));
                }
                j94.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e2) {
                j94.d("Unable to decode image `" + str + "`.", e2);
                return null;
            }
        } catch (IOException e3) {
            j94.d("Unable to open asset.", e3);
            return null;
        }
    }

    public boolean b(Context context) {
        if (this.a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.a;
    }

    public void d(lf3 lf3Var) {
    }
}
