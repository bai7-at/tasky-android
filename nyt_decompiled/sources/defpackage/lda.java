package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
final class lda implements Runnable {
    /* synthetic */ lda(kda kdaVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            mda.b = MessageDigest.getInstance("MD5");
            countDownLatch = mda.e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = mda.e;
        } catch (Throwable th) {
            mda.e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
