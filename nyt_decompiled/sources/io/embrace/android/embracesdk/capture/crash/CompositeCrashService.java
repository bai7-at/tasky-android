package io.embrace.android.embracesdk.capture.crash;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.ApkToolsConfig;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.JsException;

/* loaded from: classes5.dex */
public final class CompositeCrashService implements CrashService {
    private final ConfigService configService;
    private final qs2 crashDataSourceProvider;
    private final qs2 crashServiceProvider;
    private final InternalEmbraceLogger logger;

    public CompositeCrashService(qs2 qs2Var, qs2 qs2Var2, ConfigService configService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(qs2Var, "crashServiceProvider");
        zq3.h(qs2Var2, "crashDataSourceProvider");
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        this.crashServiceProvider = qs2Var;
        this.crashDataSourceProvider = qs2Var2;
        this.configService = configService;
        this.logger = internalEmbraceLogger;
        if (!configService.getAutoDataCaptureBehavior().isUncaughtExceptionHandlerEnabled() || ApkToolsConfig.IS_EXCEPTION_CAPTURE_DISABLED) {
            return;
        }
        registerExceptionHandler();
    }

    private final CrashService getBaseCrashService() {
        return (CrashService) (getUseCrashDataSource() ? this.crashDataSourceProvider : this.crashServiceProvider).mo865invoke();
    }

    private final boolean getUseCrashDataSource() {
        return this.configService.getOTelBehavior().isBetaEnabled();
    }

    private final void registerExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new EmbraceUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler(), this, this.logger));
    }

    @Override // io.embrace.android.embracesdk.capture.crash.CrashService
    public void handleCrash(Throwable th) {
        zq3.h(th, "exception");
        getBaseCrashService().handleCrash(th);
    }

    @Override // io.embrace.android.embracesdk.capture.crash.CrashService
    public void logUnhandledJsException(JsException jsException) {
        zq3.h(jsException, "exception");
        getBaseCrashService().logUnhandledJsException(jsException);
    }
}
