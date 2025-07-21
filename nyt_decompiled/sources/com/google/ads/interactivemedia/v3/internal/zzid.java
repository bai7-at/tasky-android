package com.google.ads.interactivemedia.v3.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
final class zzid implements Runnable {
    private zzid() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzie.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzie.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzie.zzb;
        } catch (Throwable th) {
            zzie.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    /* synthetic */ zzid(zzic zzicVar) {
    }
}
