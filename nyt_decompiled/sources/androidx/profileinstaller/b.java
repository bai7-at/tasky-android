package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.b;
import androidx.profileinstaller.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {
    private final AssetManager a;
    private final Executor b;
    private final e.c c;
    private final File e;
    private final String f;
    private final String g;
    private final String h;
    private c[] j;
    private byte[] k;
    private boolean i = false;
    private final byte[] d = d();

    public b(AssetManager assetManager, Executor executor, e.c cVar, String str, String str2, String str3, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = cVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream h;
        try {
            h = h(this.a, this.h);
        } catch (FileNotFoundException e) {
            this.c.a(9, e);
        } catch (IOException e2) {
            this.c.a(7, e2);
        } catch (IllegalStateException e3) {
            this.j = null;
            this.c.a(8, e3);
        }
        if (h == null) {
            if (h != null) {
                h.close();
            }
            return null;
        }
        try {
            this.j = g.q(h, g.o(h, g.b), bArr, cVarArr);
            h.close();
            return this;
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return null;
        }
        switch (i) {
        }
        return null;
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.g);
        } catch (FileNotFoundException e) {
            this.c.a(6, e);
            return null;
        } catch (IOException e2) {
            this.c.a(7, e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i, Object obj) {
        this.c.a(i, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.b(5, null);
            }
            return null;
        }
    }

    private c[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        c[] w = g.w(inputStream, g.o(inputStream, g.a), this.f);
                        try {
                            inputStream.close();
                            return w;
                        } catch (IOException e) {
                            this.c.a(7, e);
                            return w;
                        }
                    } catch (IOException e2) {
                        this.c.a(7, e2);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.c.a(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.c.a(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.a(7, e5);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return false;
        }
        switch (i) {
        }
        return false;
    }

    private void l(final int i, final Object obj) {
        this.b.execute(new Runnable() { // from class: rp1
            @Override // java.lang.Runnable
            public final void run() {
                b.this.g(i, obj);
            }
        });
    }

    public boolean e() {
        if (this.d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.e.canWrite()) {
            this.i = true;
            return true;
        }
        l(4, null);
        return false;
    }

    public b i() {
        b b;
        c();
        if (this.d == null) {
            return this;
        }
        InputStream f = f(this.a);
        if (f != null) {
            this.j = j(f);
        }
        c[] cVarArr = this.j;
        return (cVarArr == null || !k() || (b = b(cVarArr, this.d)) == null) ? this : b;
    }

    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.j;
        byte[] bArr = this.d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.c.a(7, e);
            } catch (IllegalStateException e2) {
                this.c.a(8, e2);
            }
            if (!g.B(byteArrayOutputStream, bArr, cVarArr)) {
                this.c.a(5, null);
                this.j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean n() {
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    try {
                        d.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.k = null;
                this.j = null;
            }
        } catch (FileNotFoundException e) {
            l(6, e);
            return false;
        } catch (IOException e2) {
            l(7, e2);
            return false;
        }
    }
}
