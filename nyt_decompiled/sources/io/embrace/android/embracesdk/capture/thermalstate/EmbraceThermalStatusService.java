package io.embrace.android.embracesdk.capture.thermalstate;

import android.os.PowerManager;
import defpackage.c04;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.payload.ThermalState;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.c;

/* loaded from: classes5.dex */
public final class EmbraceThermalStatusService implements ThermalStatusService {
    private final BackgroundWorker backgroundWorker;
    private final Clock clock;
    private final c04 powerManager$delegate;
    private final LinkedList<ThermalState> thermalStates;
    private final PowerManager.OnThermalStatusChangedListener thermalStatusListener;

    /* renamed from: io.embrace.android.embracesdk.capture.thermalstate.EmbraceThermalStatusService$1, reason: invalid class name */
    static final class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Systrace.startSynchronous("thermal-service-registration");
                PowerManager powerManager = EmbraceThermalStatusService.this.getPowerManager();
                if (powerManager != null) {
                    powerManager.addThermalStatusListener(new Executor() { // from class: io.embrace.android.embracesdk.capture.thermalstate.EmbraceThermalStatusService$1$$special$$inlined$traceSynchronous$lambda$1
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            BackgroundWorker backgroundWorker;
                            backgroundWorker = EmbraceThermalStatusService.this.backgroundWorker;
                            zq3.g(runnable, "it");
                            BackgroundWorker.submit$default(backgroundWorker, (TaskPriority) null, runnable, 1, (Object) null);
                        }
                    }, EmbraceThermalStatusService.this.thermalStatusListener);
                }
                ww8 ww8Var = ww8.a;
            } finally {
            }
        }
    }

    public EmbraceThermalStatusService(BackgroundWorker backgroundWorker, Clock clock, qs2 qs2Var) {
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(clock, "clock");
        zq3.h(qs2Var, "powerManagerProvider");
        this.backgroundWorker = backgroundWorker;
        this.clock = clock;
        this.thermalStates = new LinkedList<>();
        this.thermalStatusListener = new PowerManager.OnThermalStatusChangedListener() { // from class: io.embrace.android.embracesdk.capture.thermalstate.EmbraceThermalStatusService$thermalStatusListener$1
            @Override // android.os.PowerManager.OnThermalStatusChangedListener
            public final void onThermalStatusChanged(int i) {
                EmbraceThermalStatusService.this.handleThermalStateChange(Integer.valueOf(i));
            }
        };
        this.powerManager$delegate = c.a(qs2Var);
        backgroundWorker.submit(TaskPriority.LOW, new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PowerManager getPowerManager() {
        return (PowerManager) this.powerManager$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.thermalStates.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        PowerManager powerManager = getPowerManager();
        if (powerManager != null) {
            powerManager.removeThermalStatusListener(this.thermalStatusListener);
        }
    }

    public final void handleThermalStateChange(Integer num) {
        if (num == null) {
            return;
        }
        this.thermalStates.add(new ThermalState(this.clock.now(), num.intValue()));
        if (this.thermalStates.size() > 100) {
            this.thermalStates.removeFirst();
        }
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends ThermalState> getCapturedData() {
        return this.thermalStates;
    }
}
