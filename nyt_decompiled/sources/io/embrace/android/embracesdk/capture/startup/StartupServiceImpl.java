package io.embrace.android.embracesdk.capture.startup;

import defpackage.zq3;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class StartupServiceImpl implements StartupService {
    private final BackgroundWorker backgroundWorker;
    private volatile Long sdkInitEndMs;
    private volatile Long sdkInitStartMs;
    private volatile Long sdkStartupDurationMs;
    private final SpanService spanService;

    public StartupServiceImpl(SpanService spanService, BackgroundWorker backgroundWorker) {
        zq3.h(spanService, "spanService");
        zq3.h(backgroundWorker, "backgroundWorker");
        this.spanService = spanService;
        this.backgroundWorker = backgroundWorker;
    }

    @Override // io.embrace.android.embracesdk.capture.startup.StartupService
    public Long getSdkInitEndMs() {
        return this.sdkInitEndMs;
    }

    @Override // io.embrace.android.embracesdk.capture.startup.StartupService
    public Long getSdkInitStartMs() {
        return this.sdkInitStartMs;
    }

    @Override // io.embrace.android.embracesdk.capture.startup.StartupService
    public Long getSdkStartupDuration(boolean z) {
        if (z) {
            return this.sdkStartupDurationMs;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.capture.startup.StartupService
    public void setSdkStartupInfo(long j, long j2) {
        if (this.sdkStartupDurationMs == null) {
            SpanService.DefaultImpls.recordCompletedSpan$default(this.spanService, "sdk-init", j, j2, null, null, false, false, null, null, null, 1016, null);
        }
        this.sdkInitStartMs = Long.valueOf(j);
        this.sdkInitEndMs = Long.valueOf(j2);
        this.sdkStartupDurationMs = Long.valueOf(j2 - j);
    }
}
