package io.embrace.android.embracesdk.internal.crash;

import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class LastRunCrashVerifier {
    private final CrashFileMarker crashFileMarker;
    private Boolean didLastRunCrash;
    private Future<Boolean> didLastRunCrashFuture;
    private final InternalEmbraceLogger logger;

    public LastRunCrashVerifier(CrashFileMarker crashFileMarker, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(crashFileMarker, "crashFileMarker");
        zq3.h(internalEmbraceLogger, "logger");
        this.crashFileMarker = crashFileMarker;
        this.logger = internalEmbraceLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean readAndCleanMarker() {
        boolean andCleanMarker = this.crashFileMarker.getAndCleanMarker();
        this.didLastRunCrash = Boolean.valueOf(andCleanMarker);
        return andCleanMarker;
    }

    public final boolean didLastRunCrash() {
        Boolean bool = this.didLastRunCrash;
        if (bool == null) {
            Future<Boolean> future = this.didLastRunCrashFuture;
            if (future != null) {
                try {
                    bool = future.get(2L, TimeUnit.SECONDS);
                } catch (Throwable th) {
                    this.logger.log("[Embrace] didLastRunCrash: error while getting the result", InternalEmbraceLogger.Severity.ERROR, th, false);
                }
            }
            bool = null;
        }
        return bool != null ? bool.booleanValue() : readAndCleanMarker();
    }

    public final void readAndCleanMarkerAsync(BackgroundWorker backgroundWorker) {
        zq3.h(backgroundWorker, "backgroundWorker");
        if (this.didLastRunCrash == null) {
            this.didLastRunCrashFuture = BackgroundWorker.submit$default(backgroundWorker, (TaskPriority) null, new Callable() { // from class: io.embrace.android.embracesdk.internal.crash.LastRunCrashVerifier$readAndCleanMarkerAsync$1
                @Override // java.util.concurrent.Callable
                public final Boolean call() {
                    boolean readAndCleanMarker;
                    readAndCleanMarker = LastRunCrashVerifier.this.readAndCleanMarker();
                    return Boolean.valueOf(readAndCleanMarker);
                }
            }, 1, (Object) null);
        }
    }
}
