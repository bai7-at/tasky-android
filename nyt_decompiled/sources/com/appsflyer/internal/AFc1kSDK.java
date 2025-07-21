package com.appsflyer.internal;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class AFc1kSDK extends TimerTask {
    private final Thread valueOf;

    public AFc1kSDK(Thread thread) {
        this.valueOf = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.valueOf.interrupt();
    }
}
