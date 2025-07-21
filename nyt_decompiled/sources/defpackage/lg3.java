package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class lg3 implements Closeable {
    private final URL a;
    private volatile Future b;
    private og8 c;

    private lg3(URL url) {
        this.a = url;
    }

    private byte[] d() {
        URLConnection openConnection = this.a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] d = sf0.d(sf0.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + d.length + " bytes from " + this.a);
            }
            if (d.length <= 1048576) {
                return d;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static lg3 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new lg3(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(qg8 qg8Var) {
        try {
            qg8Var.c(b());
        } catch (Exception e) {
            qg8Var.b(e);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.a);
        }
        byte[] d = d();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(d, 0, d.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.a);
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.cancel(true);
    }

    public og8 i() {
        return (og8) Preconditions.checkNotNull(this.c);
    }

    public void l(ExecutorService executorService) {
        final qg8 qg8Var = new qg8();
        this.b = executorService.submit(new Runnable() { // from class: kg3
            @Override // java.lang.Runnable
            public final void run() {
                lg3.this.j(qg8Var);
            }
        });
        this.c = qg8Var.a();
    }
}
