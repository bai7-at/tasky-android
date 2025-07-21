package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* loaded from: classes2.dex */
final class a implements Runnable {
    private final Runnable a;

    public a(Runnable runnable, int i) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
