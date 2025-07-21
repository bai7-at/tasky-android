package defpackage;

import android.os.Looper;

/* loaded from: classes3.dex */
final class rib implements Runnable {
    rib(tib tibVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
