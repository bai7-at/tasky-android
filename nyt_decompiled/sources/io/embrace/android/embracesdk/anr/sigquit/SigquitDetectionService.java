package io.embrace.android.embracesdk.anr.sigquit;

import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigListener;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import io.embrace.android.embracesdk.utils.ThreadUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class SigquitDetectionService implements MemoryCleanerListener {
    private ConfigService configService;
    private final FindGoogleThread findGoogleThread;
    private final GoogleAnrHandlerNativeDelegate googleAnrHandlerNativeDelegate;
    private final GoogleAnrTimestampRepository googleAnrTimestampRepository;
    private final AtomicBoolean googleAnrTrackerInstalled;
    private final InternalEmbraceLogger logger;
    private final SharedObjectLoader sharedObjectLoader;

    public SigquitDetectionService(SharedObjectLoader sharedObjectLoader, FindGoogleThread findGoogleThread, GoogleAnrHandlerNativeDelegate googleAnrHandlerNativeDelegate, GoogleAnrTimestampRepository googleAnrTimestampRepository, ConfigService configService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(sharedObjectLoader, "sharedObjectLoader");
        zq3.h(findGoogleThread, "findGoogleThread");
        zq3.h(googleAnrHandlerNativeDelegate, "googleAnrHandlerNativeDelegate");
        zq3.h(googleAnrTimestampRepository, "googleAnrTimestampRepository");
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        this.sharedObjectLoader = sharedObjectLoader;
        this.findGoogleThread = findGoogleThread;
        this.googleAnrHandlerNativeDelegate = googleAnrHandlerNativeDelegate;
        this.googleAnrTimestampRepository = googleAnrTimestampRepository;
        this.configService = configService;
        this.logger = internalEmbraceLogger;
        this.googleAnrTrackerInstalled = new AtomicBoolean(false);
    }

    private final void installGoogleAnrHandler(int i) {
        int install = this.googleAnrHandlerNativeDelegate.install(i);
        if (install <= 0) {
            this.logger.log("Google Anr Tracker handler installed successfully", InternalEmbraceLogger.Severity.INFO, null, true);
            return;
        }
        this.googleAnrTrackerInstalled.set(false);
        InternalEmbraceLogger internalEmbraceLogger = this.logger;
        z38 z38Var = z38.a;
        String format = String.format(Locale.US, "Could not initialize Google ANR tracking {code=%d}", Arrays.copyOf(new Object[]{Integer.valueOf(install)}, 1));
        zq3.g(format, "java.lang.String.format(locale, format, *args)");
        internalEmbraceLogger.log(format, InternalEmbraceLogger.Severity.ERROR, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupGoogleAnrTracking() {
        if (!this.configService.getAnrBehavior().isGoogleAnrCaptureEnabled() || this.googleAnrTrackerInstalled.getAndSet(true)) {
            return;
        }
        ThreadUtils.INSTANCE.runOnMainThread(this.logger, new Runnable() { // from class: io.embrace.android.embracesdk.anr.sigquit.SigquitDetectionService$setupGoogleAnrTracking$1
            @Override // java.lang.Runnable
            public final void run() {
                SigquitDetectionService.this.setupGoogleAnrHandler();
            }
        });
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.googleAnrTimestampRepository.clear();
    }

    public final ConfigService getConfigService() {
        return this.configService;
    }

    public final void initializeGoogleAnrTracking() {
        if (this.configService.getAnrBehavior().isGoogleAnrCaptureEnabled()) {
            setupGoogleAnrTracking();
        } else {
            this.configService.addListener(new ConfigListener() { // from class: io.embrace.android.embracesdk.anr.sigquit.SigquitDetectionService$initializeGoogleAnrTracking$1
                @Override // io.embrace.android.embracesdk.config.ConfigListener
                public final void onConfigChange(ConfigService configService) {
                    zq3.h(configService, "it");
                    SigquitDetectionService.this.setupGoogleAnrTracking();
                }
            });
        }
    }

    public final void setConfigService(ConfigService configService) {
        zq3.h(configService, "<set-?>");
        this.configService = configService;
    }

    public final void setupGoogleAnrHandler() {
        if (!this.sharedObjectLoader.loadEmbraceNative()) {
            this.googleAnrTrackerInstalled.set(false);
            return;
        }
        int invoke = this.findGoogleThread.invoke();
        if (invoke > 0) {
            installGoogleAnrHandler(invoke);
        } else {
            this.logger.log("Could not initialize Google ANR tracking: Google thread not found.", InternalEmbraceLogger.Severity.ERROR, null, false);
            this.googleAnrTrackerInstalled.set(false);
        }
    }
}
