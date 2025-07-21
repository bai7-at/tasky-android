package io.embrace.android.embracesdk.anr.ndk;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class EmbraceNativeThreadSamplerServiceKt {
    public static final boolean isUnityMainThread() {
        Thread currentThread = Thread.currentThread();
        zq3.g(currentThread, "Thread.currentThread()");
        return zq3.c("UnityMain", currentThread.getName());
    }
}
