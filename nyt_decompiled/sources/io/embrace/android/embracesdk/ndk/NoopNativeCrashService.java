package io.embrace.android.embracesdk.ndk;

import io.embrace.android.embracesdk.payload.NativeCrashData;

/* loaded from: classes5.dex */
public final class NoopNativeCrashService implements NativeCrashService {
    @Override // io.embrace.android.embracesdk.ndk.NativeCrashService
    public NativeCrashData getAndSendNativeCrash() {
        return null;
    }
}
