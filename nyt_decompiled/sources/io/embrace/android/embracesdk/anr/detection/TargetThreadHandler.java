package io.embrace.android.embracesdk.anr.detection;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.ThreadEnforcementCheckKt;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class TargetThreadHandler extends Handler {
    public static final Companion Companion = new Companion(null);
    public static final int HEARTBEAT_REQUEST = 34593;
    public ss2 action;
    private final AtomicReference<Thread> anrMonitorThread;
    private final ScheduledWorker anrMonitorWorker;
    private final Clock clock;
    private final ConfigService configService;
    private volatile boolean installed;
    private final InternalEmbraceLogger logger;
    private final MessageQueue messageQueue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TargetThreadHandler(Looper looper, ScheduledWorker scheduledWorker, AtomicReference atomicReference, ConfigService configService, MessageQueue messageQueue, InternalEmbraceLogger internalEmbraceLogger, Clock clock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(looper, scheduledWorker, atomicReference, configService, (i & 16) != 0 ? LooperCompat.getMessageQueue(looper) : messageQueue, internalEmbraceLogger, clock);
    }

    private final void onMainThreadUnblocked() {
        final long now = this.clock.now();
        this.anrMonitorWorker.submit(new Runnable() { // from class: io.embrace.android.embracesdk.anr.detection.TargetThreadHandler$onMainThreadUnblocked$1
            @Override // java.lang.Runnable
            public final void run() {
                AtomicReference atomicReference;
                atomicReference = TargetThreadHandler.this.anrMonitorThread;
                ThreadEnforcementCheckKt.enforceThread(atomicReference);
                TargetThreadHandler.this.getAction().invoke(Long.valueOf(now));
            }
        });
    }

    public final ss2 getAction() {
        ss2 ss2Var = this.action;
        if (ss2Var == null) {
            zq3.z("action");
        }
        return ss2Var;
    }

    public final boolean getInstalled() {
        return this.installed;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        zq3.h(message, "msg");
        try {
            if (message.what == 34593) {
                if (this.messageQueue != null && this.installed) {
                    return;
                }
                onMainThreadUnblocked();
            }
        } catch (Exception e) {
            this.logger.log("ANR healthcheck failed in main (monitored) thread", InternalEmbraceLogger.Severity.ERROR, e, true);
        }
    }

    public final boolean onIdleThread$embrace_android_sdk_release() {
        onMainThreadUnblocked();
        return true;
    }

    public final void setAction(ss2 ss2Var) {
        zq3.h(ss2Var, "<set-?>");
        this.action = ss2Var;
    }

    public final void setInstalled(boolean z) {
        this.installed = z;
    }

    public final void start() {
        if (this.configService.getAnrBehavior().isIdleHandlerEnabled()) {
            MessageQueue messageQueue = this.messageQueue;
            if (messageQueue != null) {
                final TargetThreadHandler$start$1 targetThreadHandler$start$1 = new TargetThreadHandler$start$1(this);
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: io.embrace.android.embracesdk.anr.detection.TargetThreadHandler$sam$android_os_MessageQueue_IdleHandler$0
                    @Override // android.os.MessageQueue.IdleHandler
                    public final /* synthetic */ boolean queueIdle() {
                        Object mo865invoke = qs2.this.mo865invoke();
                        zq3.g(mo865invoke, "invoke(...)");
                        return ((Boolean) mo865invoke).booleanValue();
                    }
                });
            }
            this.installed = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetThreadHandler(Looper looper, ScheduledWorker scheduledWorker, AtomicReference<Thread> atomicReference, ConfigService configService, MessageQueue messageQueue, InternalEmbraceLogger internalEmbraceLogger, Clock clock) {
        super(looper);
        zq3.h(looper, "looper");
        zq3.h(scheduledWorker, "anrMonitorWorker");
        zq3.h(atomicReference, "anrMonitorThread");
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(clock, "clock");
        this.anrMonitorWorker = scheduledWorker;
        this.anrMonitorThread = atomicReference;
        this.configService = configService;
        this.messageQueue = messageQueue;
        this.logger = internalEmbraceLogger;
        this.clock = clock;
    }
}
