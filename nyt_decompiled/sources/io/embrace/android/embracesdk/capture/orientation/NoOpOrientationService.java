package io.embrace.android.embracesdk.capture.orientation;

import io.embrace.android.embracesdk.payload.Orientation;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class NoOpOrientationService implements OrientationService {
    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
    }

    @Override // io.embrace.android.embracesdk.capture.orientation.OrientationService
    public void onOrientationChanged(Integer num) {
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends Orientation> getCapturedData() {
        return i.l();
    }
}
