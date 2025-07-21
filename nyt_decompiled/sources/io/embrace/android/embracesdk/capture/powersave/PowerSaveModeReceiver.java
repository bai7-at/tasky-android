package io.embrace.android.embracesdk.capture.powersave;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;

/* loaded from: classes5.dex */
public final class PowerSaveModeReceiver extends BroadcastReceiver {
    private final ss2 callback;
    private final InternalEmbraceLogger logger;
    private final qs2 powerManagerProvider;

    public PowerSaveModeReceiver(InternalEmbraceLogger internalEmbraceLogger, qs2 qs2Var, ss2 ss2Var) {
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(qs2Var, "powerManagerProvider");
        zq3.h(ss2Var, "callback");
        this.logger = internalEmbraceLogger;
        this.powerManagerProvider = qs2Var;
        this.callback = ss2Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PowerManager powerManager;
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        try {
            if (!zq3.c(intent.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED") || (powerManager = (PowerManager) this.powerManagerProvider.mo865invoke()) == null) {
                return;
            }
        } catch (Exception e) {
            this.logger.log("Failed to handle " + intent.getAction(), InternalEmbraceLogger.Severity.ERROR, e, false);
        }
    }

    public final void register(final Context context, BackgroundWorker backgroundWorker) {
        zq3.h(context, "context");
        zq3.h(backgroundWorker, "backgroundWorker");
        BackgroundWorker.submit$default(backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.powersave.PowerSaveModeReceiver$register$1
            @Override // java.lang.Runnable
            public final void run() {
                InternalEmbraceLogger internalEmbraceLogger;
                qs2 qs2Var;
                try {
                    Systrace.startSynchronous("power-service-registration");
                    try {
                        qs2Var = PowerSaveModeReceiver.this.powerManagerProvider;
                        if (qs2Var.mo865invoke() != null) {
                            context.registerReceiver(PowerSaveModeReceiver.this, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                        }
                    } catch (Exception e) {
                        internalEmbraceLogger = PowerSaveModeReceiver.this.logger;
                        internalEmbraceLogger.log("Failed to register broadcast receiver. Power save mode status will be unavailable.", InternalEmbraceLogger.Severity.ERROR, e, false);
                    }
                    ww8 ww8Var = ww8.a;
                } finally {
                }
            }
        }, 1, (Object) null);
    }

    public final void unregister(Context context) {
        zq3.h(context, "ctx");
        context.unregisterReceiver(this);
    }
}
