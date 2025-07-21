package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.ads.zzavn;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class bia {
    private final jga a;
    private final String b;
    private final String c;
    private final Class[] e;
    private volatile Method d = null;
    private final CountDownLatch f = new CountDownLatch(1);

    public bia(jga jgaVar, String str, String str2, Class... clsArr) {
        this.a = jgaVar;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        jgaVar.k().submit(new aia(this));
    }

    static /* bridge */ /* synthetic */ void b(bia biaVar) {
        try {
            jga jgaVar = biaVar.a;
            Class<?> loadClass = jgaVar.i().loadClass(biaVar.c(jgaVar.u(), biaVar.b));
            if (loadClass != null) {
                biaVar.d = loadClass.getMethod(biaVar.c(biaVar.a.u(), biaVar.c), biaVar.e);
            }
        } catch (zzavn | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            biaVar.f.countDown();
            throw th;
        }
        biaVar.f.countDown();
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
