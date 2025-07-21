package io.embrace.android.embracesdk.capture.thermalstate;

import io.embrace.android.embracesdk.payload.ThermalState;
import java.util.List;

/* loaded from: classes5.dex */
public final class NoOpThermalStatusService implements ThermalStatusService {
    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends ThermalState> getCapturedData() {
        return null;
    }
}
