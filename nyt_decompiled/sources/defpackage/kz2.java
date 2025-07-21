package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface kz2 {

    public interface a {
        void a(Bitmap bitmap);

        byte[] b(int i);

        Bitmap c(int i, int i2, Bitmap.Config config);

        int[] d(int i);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    void d(Bitmap.Config config);

    int e();

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
