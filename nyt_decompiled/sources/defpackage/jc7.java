package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Window;
import com.nytimes.android.logging.NYTLogger;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes4.dex */
public abstract class jc7 {
    private static final File b(File file, Bitmap bitmap, String str) {
        try {
            new Canvas().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            File file2 = new File(file, "images");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(file2, str);
            if (file3.exists()) {
                file3.delete();
            }
            file3.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                ww8 ww8Var = ww8.a;
                gm0.a(fileOutputStream, null);
                return file3;
            } finally {
            }
        } catch (Exception e) {
            NYTLogger.h(e);
            return null;
        }
    }

    public static final void c(final File file, Window window, Handler handler, int i, int i2, final ss2 ss2Var, final qs2 qs2Var) {
        zq3.h(file, "cacheDir");
        zq3.h(window, "window");
        zq3.h(handler, "handler");
        zq3.h(ss2Var, "onSuccess");
        zq3.h(qs2Var, "onError");
        final Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        zq3.g(createBitmap, "createBitmap(...)");
        PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: ic7
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i3) {
                jc7.d(file, createBitmap, qs2Var, ss2Var, i3);
            }
        }, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(File file, Bitmap bitmap, qs2 qs2Var, ss2 ss2Var, int i) {
        ww8 ww8Var;
        zq3.h(file, "$cacheDir");
        zq3.h(bitmap, "$resultBitmap");
        zq3.h(qs2Var, "$onError");
        zq3.h(ss2Var, "$onSuccess");
        if (i != 0) {
            NYTLogger.g("Pixel Copy error: " + i, new Object[0]);
            qs2Var.mo865invoke();
            return;
        }
        File b = b(file, bitmap, "nytimes-screenshot.png");
        if (b != null) {
            ss2Var.invoke(b);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            qs2Var.mo865invoke();
        }
    }
}
