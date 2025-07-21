package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class mc {
    static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
