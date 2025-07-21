package io.embrace.android.embracesdk.capture.orientation;

import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.payload.Orientation;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public final class EmbraceOrientationService implements OrientationService {
    private final Clock clock;
    private final LinkedList<Orientation> orientations;

    public EmbraceOrientationService(Clock clock) {
        zq3.h(clock, "clock");
        this.clock = clock;
        this.orientations = new LinkedList<>();
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.orientations.clear();
    }

    @Override // io.embrace.android.embracesdk.capture.orientation.OrientationService
    public void onOrientationChanged(Integer num) {
        if (num != null) {
            if (this.orientations.isEmpty() || this.orientations.getLast().getInternalOrientation() != num.intValue()) {
                this.orientations.add(new Orientation(num.intValue(), this.clock.now()));
            }
        }
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends Orientation> getCapturedData() {
        return this.orientations;
    }
}
