package io.embrace.android.embracesdk.anr;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.payload.AnrInterval;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class NoOpAnrService implements AnrService {
    @Override // io.embrace.android.embracesdk.anr.AnrService
    public void addBlockedThreadListener(BlockedThreadListener blockedThreadListener) {
        zq3.h(blockedThreadListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.embrace.android.embracesdk.anr.AnrService
    public void finishInitialization(ConfigService configService) {
        zq3.h(configService, "configService");
    }

    @Override // io.embrace.android.embracesdk.anr.AnrService
    public void forceAnrTrackingStopOnCrash() {
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends AnrInterval> getCapturedData() {
        return i.l();
    }
}
