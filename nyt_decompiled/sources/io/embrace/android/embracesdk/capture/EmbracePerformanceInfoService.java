package io.embrace.android.embracesdk.capture;

import defpackage.zq3;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService;
import io.embrace.android.embracesdk.anr.sigquit.GoogleAnrTimestampRepository;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.monitor.ResponsivenessMonitorService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.DiskUsage;
import io.embrace.android.embracesdk.payload.NativeThreadAnrInterval;
import io.embrace.android.embracesdk.payload.PerformanceInfo;
import io.embrace.android.embracesdk.payload.ResponsivenessSnapshot;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class EmbracePerformanceInfoService implements PerformanceInfoService {
    private final GoogleAnrTimestampRepository googleAnrTimestampRepository;
    private final InternalEmbraceLogger logger;
    private final MetadataService metadataService;
    private final NativeThreadSamplerService nativeThreadSamplerService;
    private final ResponsivenessMonitorService responsivenessMonitorService;

    public EmbracePerformanceInfoService(MetadataService metadataService, GoogleAnrTimestampRepository googleAnrTimestampRepository, NativeThreadSamplerService nativeThreadSamplerService, ResponsivenessMonitorService responsivenessMonitorService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(metadataService, "metadataService");
        zq3.h(googleAnrTimestampRepository, "googleAnrTimestampRepository");
        zq3.h(internalEmbraceLogger, "logger");
        this.metadataService = metadataService;
        this.googleAnrTimestampRepository = googleAnrTimestampRepository;
        this.nativeThreadSamplerService = nativeThreadSamplerService;
        this.responsivenessMonitorService = responsivenessMonitorService;
        this.logger = internalEmbraceLogger;
    }

    @Override // io.embrace.android.embracesdk.capture.PerformanceInfoService
    public PerformanceInfo getPerformanceInfo(long j, long j2, boolean z) {
        InternalEmbraceLogger internalEmbraceLogger = this.logger;
        DiskUsage diskUsage = null;
        try {
            DiskUsage diskUsage2 = this.metadataService.getDiskUsage();
            if (diskUsage2 != null) {
                diskUsage = DiskUsage.copy$default(diskUsage2, null, null, 3, null);
            }
        } catch (Throwable th) {
            internalEmbraceLogger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
        }
        return new PerformanceInfo(diskUsage, null, null, null, null, null, 62, null);
    }

    @Override // io.embrace.android.embracesdk.capture.PerformanceInfoService
    public PerformanceInfo getSessionPerformanceInfo(long j, long j2, boolean z, Boolean bool) {
        List list;
        List<NativeThreadAnrInterval> list2;
        PerformanceInfo performanceInfo = getPerformanceInfo(j, j2, z);
        InternalEmbraceLogger internalEmbraceLogger = this.logger;
        List<? extends ResponsivenessSnapshot> list3 = null;
        try {
            list = i.X0(this.googleAnrTimestampRepository.getGoogleAnrTimestamps(j, j2));
        } catch (Throwable th) {
            internalEmbraceLogger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
            list = null;
        }
        InternalEmbraceLogger internalEmbraceLogger2 = this.logger;
        try {
            NativeThreadSamplerService nativeThreadSamplerService = this.nativeThreadSamplerService;
            list2 = nativeThreadSamplerService != null ? nativeThreadSamplerService.getCapturedIntervals(bool) : null;
        } catch (Throwable th2) {
            internalEmbraceLogger2.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th2, false);
            list2 = null;
        }
        InternalEmbraceLogger internalEmbraceLogger3 = this.logger;
        try {
            ResponsivenessMonitorService responsivenessMonitorService = this.responsivenessMonitorService;
            if (responsivenessMonitorService != null) {
                list3 = responsivenessMonitorService.getCapturedData();
            }
        } catch (Throwable th3) {
            internalEmbraceLogger3.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th3, false);
        }
        return PerformanceInfo.copy$default(performanceInfo, null, list, null, list2, null, list3, 21, null);
    }
}
