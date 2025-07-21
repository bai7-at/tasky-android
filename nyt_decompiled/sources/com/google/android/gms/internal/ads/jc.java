package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class jc extends bb implements Runnable {
    private final Runnable h;

    public jc(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final String d() {
        return "task=[" + this.h.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            g(th);
            throw th;
        }
    }
}
