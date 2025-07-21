package io.embrace.android.embracesdk.internal;

import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class SharedObjectLoader {
    private final AtomicBoolean loaded;
    private final InternalEmbraceLogger logger;

    public SharedObjectLoader(InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        this.logger = internalEmbraceLogger;
        this.loaded = new AtomicBoolean(false);
    }

    public final AtomicBoolean getLoaded() {
        return this.loaded;
    }

    public final boolean loadEmbraceNative() {
        if (this.loaded.get()) {
            return true;
        }
        synchronized (this.loaded) {
            if (!this.loaded.get()) {
                try {
                    try {
                        Systrace.startSynchronous("load-embrace-native-lib");
                        System.loadLibrary("embrace-native");
                        ww8 ww8Var = ww8.a;
                        Systrace.endSynchronous();
                        this.loaded.set(true);
                    } catch (UnsatisfiedLinkError e) {
                        this.logger.log("Failed to load SO file embrace-native", InternalEmbraceLogger.Severity.ERROR, e, false);
                        return false;
                    }
                } finally {
                }
            }
        }
        return true;
    }
}
