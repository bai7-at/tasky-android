package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class b extends Thread {
    private final WeakReference a;
    private final long b;
    final CountDownLatch c = new CountDownLatch(1);
    boolean d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j) {
        this.a = new WeakReference(advertisingIdClient);
        this.b = j;
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.c.await(this.b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
