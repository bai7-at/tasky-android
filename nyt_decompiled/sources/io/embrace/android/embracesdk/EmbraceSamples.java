package io.embrace.android.embracesdk;

import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.samples.EmbraceCrashSamples;

@InternalApi
/* loaded from: classes5.dex */
public final class EmbraceSamples {
    public static final EmbraceSamples INSTANCE = new EmbraceSamples();
    private static final EmbraceCrashSamples embraceCrashSamples = EmbraceCrashSamples.INSTANCE;
    private static final EmbraceAutomaticVerification embraceAutomaticVerification = new EmbraceAutomaticVerification(null, 1, null);

    private EmbraceSamples() {
    }

    public static final void causeNdkIllegalInstruction() {
        embraceCrashSamples.triggerNdkSigIllegalInstruction();
    }

    public static final void throwJvmException() {
        embraceCrashSamples.throwJvmException();
    }

    public static final void triggerAnr() {
        embraceCrashSamples.blockMainThreadForShortInterval();
    }

    public static final void triggerLongAnr() {
        embraceCrashSamples.triggerLongAnr();
    }

    public static final void verifyIntegration() {
        embraceAutomaticVerification.verifyIntegration();
    }
}
