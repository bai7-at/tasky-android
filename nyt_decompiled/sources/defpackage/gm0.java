package defpackage;

import java.io.Closeable;

/* loaded from: classes5.dex */
public abstract class gm0 {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                g62.a(th, th2);
            }
        }
    }
}
