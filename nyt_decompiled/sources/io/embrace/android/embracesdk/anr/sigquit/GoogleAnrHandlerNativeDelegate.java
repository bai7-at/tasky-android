package io.embrace.android.embracesdk.anr.sigquit;

import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class GoogleAnrHandlerNativeDelegate {
    private final GoogleAnrTimestampRepository googleAnrTimestampRepository;
    private final InternalEmbraceLogger logger;

    public GoogleAnrHandlerNativeDelegate(GoogleAnrTimestampRepository googleAnrTimestampRepository, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(googleAnrTimestampRepository, "googleAnrTimestampRepository");
        zq3.h(internalEmbraceLogger, "logger");
        this.googleAnrTimestampRepository = googleAnrTimestampRepository;
        this.logger = internalEmbraceLogger;
    }

    private final native int installGoogleAnrHandler(int i);

    public final int install(int i) {
        try {
            return installGoogleAnrHandler(i);
        } catch (UnsatisfiedLinkError e) {
            this.logger.log("Could not install ANR Handler. Exception: " + e, InternalEmbraceLogger.Severity.ERROR, null, false);
            return 1;
        }
    }

    public final synchronized void saveGoogleAnr(long j) {
        this.logger.log("got Google ANR timestamp " + j, InternalEmbraceLogger.Severity.INFO, null, true);
        this.googleAnrTimestampRepository.add(j);
    }
}
