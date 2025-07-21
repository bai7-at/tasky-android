package io.embrace.android.embracesdk.capture.orientation;

import io.embrace.android.embracesdk.arch.DataCaptureService;
import io.embrace.android.embracesdk.payload.Orientation;
import java.util.List;

/* loaded from: classes5.dex */
public interface OrientationService extends DataCaptureService<List<? extends Orientation>> {
    void onOrientationChanged(Integer num);
}
