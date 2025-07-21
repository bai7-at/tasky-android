package io.embrace.android.embracesdk.capture.monitor;

import defpackage.zq3;
import io.embrace.android.embracesdk.anr.detection.LivenessCheckScheduler;
import io.embrace.android.embracesdk.payload.ResponsivenessSnapshot;
import java.util.List;

/* loaded from: classes5.dex */
public final class EmbraceResponsivenessMonitorService implements ResponsivenessMonitorService {
    private final LivenessCheckScheduler livenessCheckScheduler;

    public EmbraceResponsivenessMonitorService(LivenessCheckScheduler livenessCheckScheduler) {
        zq3.h(livenessCheckScheduler, "livenessCheckScheduler");
        this.livenessCheckScheduler = livenessCheckScheduler;
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.livenessCheckScheduler.resetResponsivenessMonitors();
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends ResponsivenessSnapshot> getCapturedData() {
        return this.livenessCheckScheduler.responsivenessMonitorSnapshots();
    }
}
