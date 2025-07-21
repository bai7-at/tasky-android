package io.embrace.android.embracesdk.samples;

import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class EmbraceCrashSamples {
    private static final int LONG_ANR_LENGTH = 30000;
    private static final long SHORT_ANR_4_SEC = 4000;
    public static final EmbraceCrashSamples INSTANCE = new EmbraceCrashSamples();
    private static final InternalEmbraceLogger logger = new InternalEmbraceLogger();
    private static final EmbraceCrashSamplesNdkDelegateImpl ndkCrashSamplesNdkDelegate = new EmbraceCrashSamplesNdkDelegateImpl();

    private EmbraceCrashSamples() {
    }

    public final void blockMainThreadForShortInterval() {
        isSdkStarted();
        checkAnrDetectionEnabled();
        try {
            Thread.sleep(SHORT_ANR_4_SEC);
        } catch (InterruptedException e) {
            logger.log("Short ANR failed", InternalEmbraceLogger.Severity.ERROR, e, false);
        }
    }

    public final void checkAnrDetectionEnabled() {
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        if (embrace.getInternalInterface().isAnrCaptureEnabled()) {
            return;
        }
        EmbraceSampleCodeException embraceSampleCodeException = new EmbraceSampleCodeException("ANR capture disabled - you need to enable it to test Embrace's ANR functionality:\n - add [\"anr\":{\"pct_enabled\": 100 }] inside the configuration file to enable ANR detection");
        logger.log("ANR detection disabled", InternalEmbraceLogger.Severity.ERROR, embraceSampleCodeException, false);
        throw embraceSampleCodeException;
    }

    public final void checkNdkDetectionEnabled() {
        isSdkStarted();
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        if (embrace.getInternalInterface().isNdkEnabled()) {
            return;
        }
        EmbraceSampleCodeException embraceSampleCodeException = new EmbraceSampleCodeException("NDK crash capture is disabled - you need to enable it to test Embrace's NDK functionality - To enable it, add [\"ndk_enabled\": true] inside the configuration file");
        logger.log("NDK detection disabled", InternalEmbraceLogger.Severity.ERROR, embraceSampleCodeException, false);
        throw embraceSampleCodeException;
    }

    public final void isSdkStarted() {
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        if (embrace.isStarted()) {
            return;
        }
        EmbraceSampleCodeException embraceSampleCodeException = new EmbraceSampleCodeException("Embrace SDK not initialized. Please ensure you have included Embrace.getInstance().start(this) in Application#onCreate()\nand then trigger these crash samples via a button press once the app has loaded.");
        logger.log("Embrace SDK is not initialized", InternalEmbraceLogger.Severity.ERROR, embraceSampleCodeException, false);
        throw embraceSampleCodeException;
    }

    public final void throwJvmException() {
        isSdkStarted();
        throw new EmbraceSampleCodeException("Custom JVM Exception");
    }

    public final void triggerLongAnr() {
        isSdkStarted();
        checkAnrDetectionEnabled();
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        while (embrace.getInternalInterface().getSdkCurrentTime() - embrace.getInternalInterface().getSdkCurrentTime() < 30000) {
        }
    }

    public final void triggerNdkSigAbort() {
        checkNdkDetectionEnabled();
        ndkCrashSamplesNdkDelegate.sigAbort();
    }

    public final void triggerNdkSigIllegalInstruction() {
        checkNdkDetectionEnabled();
        ndkCrashSamplesNdkDelegate.sigIllegalInstruction();
    }

    public final void triggerNdkSigfpe() {
        checkNdkDetectionEnabled();
        ndkCrashSamplesNdkDelegate.sigfpe();
    }

    public final void triggerNdkSigsegv() {
        checkNdkDetectionEnabled();
        ndkCrashSamplesNdkDelegate.sigsegv();
    }

    public final void triggerNdkThrowCppException() {
        checkNdkDetectionEnabled();
        ndkCrashSamplesNdkDelegate.throwException();
    }
}
