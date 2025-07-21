package io.embrace.android.embracesdk.capture.cpu;

import defpackage.zq3;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class EmbraceCpuInfoDelegate implements CpuInfoDelegate {
    private final InternalEmbraceLogger logger;
    private final SharedObjectLoader sharedObjectLoader;

    public EmbraceCpuInfoDelegate(SharedObjectLoader sharedObjectLoader, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(sharedObjectLoader, "sharedObjectLoader");
        zq3.h(internalEmbraceLogger, "logger");
        this.sharedObjectLoader = sharedObjectLoader;
        this.logger = internalEmbraceLogger;
    }

    private final native String getNativeCpuName();

    private final native String getNativeEgl();

    @Override // io.embrace.android.embracesdk.capture.cpu.CpuInfoDelegate
    public String getCpuName() {
        if (!this.sharedObjectLoader.loadEmbraceNative()) {
            return null;
        }
        try {
            return getNativeCpuName();
        } catch (LinkageError e) {
            this.logger.log("Could not get the CPU name. Exception: " + e, InternalEmbraceLogger.Severity.ERROR, e, false);
            return null;
        }
    }

    @Override // io.embrace.android.embracesdk.capture.cpu.CpuInfoDelegate
    public String getEgl() {
        if (!this.sharedObjectLoader.loadEmbraceNative()) {
            return null;
        }
        try {
            return getNativeEgl();
        } catch (LinkageError e) {
            this.logger.log("Could not get the EGL name. Exception: " + e, InternalEmbraceLogger.Severity.ERROR, e, false);
            return null;
        }
    }
}
