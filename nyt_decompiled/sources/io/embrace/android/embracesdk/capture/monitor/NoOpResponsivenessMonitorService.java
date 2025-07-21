package io.embrace.android.embracesdk.capture.monitor;

import io.embrace.android.embracesdk.payload.ResponsivenessSnapshot;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class NoOpResponsivenessMonitorService implements ResponsivenessMonitorService {
    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends ResponsivenessSnapshot> getCapturedData() {
        return i.l();
    }
}
