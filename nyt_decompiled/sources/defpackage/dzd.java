package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.pal.zzda;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class dzd {
    private final ksc a;
    private final String b;
    private final String c;
    private final Class[] e;
    private volatile Method d = null;
    private final CountDownLatch f = new CountDownLatch(1);

    public dzd(ksc kscVar, String str, String str2, Class... clsArr) {
        this.a = kscVar;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        kscVar.k().submit(new byd(this));
    }

    static /* bridge */ /* synthetic */ void b(dzd dzdVar) {
        CountDownLatch countDownLatch;
        Class<?> loadClass;
        try {
            try {
                ksc kscVar = dzdVar.a;
                loadClass = kscVar.i().loadClass(dzdVar.c(kscVar.u(), dzdVar.b));
            } catch (zzda | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (loadClass == null) {
                countDownLatch = dzdVar.f;
            } else {
                dzdVar.d = loadClass.getMethod(dzdVar.c(dzdVar.a.u(), dzdVar.c), dzdVar.e);
                if (dzdVar.d == null) {
                    countDownLatch = dzdVar.f;
                }
                countDownLatch = dzdVar.f;
            }
        } catch (NullPointerException unused2) {
            countDownLatch = dzdVar.f;
        } catch (Throwable th) {
            dzdVar.f.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.a.e().b(bArr, str), Constants.DEFAULT_ENCODING);
    }

    public final Method a() {
        if (this.d != null) {
            return this.d;
        }
        try {
            if (this.f.await(2L, TimeUnit.SECONDS)) {
                return this.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
