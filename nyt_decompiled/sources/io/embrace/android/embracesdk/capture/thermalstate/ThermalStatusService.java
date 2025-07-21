package io.embrace.android.embracesdk.capture.thermalstate;

import io.embrace.android.embracesdk.arch.DataCaptureService;
import io.embrace.android.embracesdk.payload.ThermalState;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes5.dex */
public interface ThermalStatusService extends DataCaptureService<List<? extends ThermalState>>, Closeable {
}
