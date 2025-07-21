package io.embrace.android.embracesdk.session.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.d44;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator;
import io.embrace.android.embracesdk.utils.ThreadUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceProcessStateService implements ProcessStateService {
    public static final Companion Companion = new Companion(null);
    private static final String ERROR_FAILED_TO_NOTIFY = "Failed to notify EmbraceProcessStateService listener";
    private final Clock clock;
    private volatile boolean coldStart;
    private volatile boolean isInBackground;
    private final CopyOnWriteArrayList<ProcessStateListener> listeners;
    private final InternalEmbraceLogger logger;
    private SessionOrchestrator sessionOrchestrator;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceProcessStateService(Clock clock, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(clock, "clock");
        zq3.h(internalEmbraceLogger, "logger");
        this.clock = clock;
        this.logger = internalEmbraceLogger;
        this.listeners = new CopyOnWriteArrayList<>();
        this.coldStart = true;
        this.isInBackground = true;
        ThreadUtils.INSTANCE.runOnMainThread(internalEmbraceLogger, new Runnable() { // from class: io.embrace.android.embracesdk.session.lifecycle.EmbraceProcessStateService.1
            @Override // java.lang.Runnable
            public final void run() {
                d44 k = l.k();
                zq3.g(k, "ProcessLifecycleOwner.get()");
                k.getLifecycle().a(EmbraceProcessStateService.this);
            }
        });
    }

    private final void invokeCallbackSafely(qs2 qs2Var) {
        try {
            qs2Var.mo865invoke();
        } catch (Exception e) {
            this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateService
    public void addListener(ProcessStateListener processStateListener) {
        zq3.h(processStateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (processStateListener instanceof SessionOrchestrator) {
            this.sessionOrchestrator = (SessionOrchestrator) processStateListener;
        } else {
            this.listeners.addIfAbsent(processStateListener);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.logger.log("Shutting down EmbraceProcessStateService", InternalEmbraceLogger.Severity.DEBUG, null, true);
            this.listeners.clear();
            this.sessionOrchestrator = null;
        } catch (Exception e) {
            this.logger.log("Error when closing EmbraceProcessStateService", InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    public final CopyOnWriteArrayList<ProcessStateListener> getListeners() {
        return this.listeners;
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateService
    public boolean isInBackground() {
        return this.isInBackground;
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateService
    @k(Lifecycle.Event.ON_STOP)
    public void onBackground() {
        this.logger.log("AppState: App entered background", InternalEmbraceLogger.Severity.DEBUG, null, true);
        this.isInBackground = true;
        long now = this.clock.now();
        try {
            SessionOrchestrator sessionOrchestrator = this.sessionOrchestrator;
            if (sessionOrchestrator != null) {
                sessionOrchestrator.onBackground(now);
            }
        } catch (Exception e) {
            this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
        Iterator it2 = i.X0(this.listeners).iterator();
        while (it2.hasNext()) {
            try {
                ((ProcessStateListener) it2.next()).onBackground(now);
            } catch (Exception e2) {
                this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e2, true);
            }
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateService
    @k(Lifecycle.Event.ON_START)
    public void onForeground() {
        this.logger.log("AppState: App entered foreground.", InternalEmbraceLogger.Severity.DEBUG, null, true);
        if (!isInBackground()) {
            this.logger.log("Unbalanced call to onForeground(). This will contribute to session loss.", InternalEmbraceLogger.Severity.ERROR, new InternalError("Unbalanced call to onForeground(). This will contribute to session loss."), false);
        }
        this.isInBackground = false;
        long now = this.clock.now();
        try {
            SessionOrchestrator sessionOrchestrator = this.sessionOrchestrator;
            if (sessionOrchestrator != null) {
                sessionOrchestrator.onForeground(this.coldStart, now);
            }
        } catch (Exception e) {
            this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
        Iterator it2 = i.X0(this.listeners).iterator();
        while (it2.hasNext()) {
            try {
                ((ProcessStateListener) it2.next()).onForeground(this.coldStart, now);
            } catch (Exception e2) {
                this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e2, true);
            }
        }
        this.coldStart = false;
    }
}
