package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.capture.crash.CrashService;
import io.embrace.android.embracesdk.internal.crash.LastRunCrashVerifier;
import io.embrace.android.embracesdk.ndk.NativeCrashService;
import io.embrace.android.embracesdk.samples.AutomaticVerificationExceptionHandler;

/* loaded from: classes5.dex */
public interface CrashModule {
    AutomaticVerificationExceptionHandler getAutomaticVerificationExceptionHandler();

    CrashService getCrashService();

    LastRunCrashVerifier getLastRunCrashVerifier();

    NativeCrashService getNativeCrashService();
}
