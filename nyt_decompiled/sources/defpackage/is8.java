package defpackage;

import android.content.Context;
import java.io.Closeable;

/* loaded from: classes2.dex */
abstract class is8 implements Closeable {

    interface a {
        a a(Context context);

        is8 build();
    }

    is8() {
    }

    abstract w42 a();

    abstract hs8 b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
