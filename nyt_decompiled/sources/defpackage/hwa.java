package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
final class hwa implements Runnable {
    /* synthetic */ hwa(eva evaVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            mxa.b = MessageDigest.getInstance("MD5");
            countDownLatch = mxa.e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = mxa.e;
        } catch (Throwable th) {
            mxa.e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
