package io.embrace.android.embracesdk.session.message;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.zq3;
import io.embrace.android.embracesdk.anr.AnrOtelMapper;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService;
import io.embrace.android.embracesdk.arch.schema.AppTerminationCause;
import io.embrace.android.embracesdk.capture.PerformanceInfoService;
import io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.startup.StartupService;
import io.embrace.android.embracesdk.capture.thermalstate.ThermalStatusService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.capture.webview.WebViewService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.event.EventService;
import io.embrace.android.embracesdk.event.LogMessageService;
import io.embrace.android.embracesdk.gating.GatingService;
import io.embrace.android.embracesdk.internal.StartupEventInfo;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.internal.payload.SpanMapperKt;
import io.embrace.android.embracesdk.internal.spans.CurrentSessionSpan;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanData;
import io.embrace.android.embracesdk.internal.spans.SpanRepository;
import io.embrace.android.embracesdk.internal.spans.SpanSink;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.logging.InternalErrorService;
import io.embrace.android.embracesdk.payload.AppInfo;
import io.embrace.android.embracesdk.payload.BetaFeatures;
import io.embrace.android.embracesdk.payload.Breadcrumbs;
import io.embrace.android.embracesdk.payload.DeviceInfo;
import io.embrace.android.embracesdk.payload.LegacyExceptionError;
import io.embrace.android.embracesdk.payload.PerformanceInfo;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.payload.ThermalState;
import io.embrace.android.embracesdk.payload.UserInfo;
import io.embrace.android.embracesdk.payload.WebViewInfo;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.message.FinalEnvelopeParams;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes5.dex */
public final class V1PayloadMessageCollator implements PayloadMessageCollator {
    private final AnrOtelMapper anrOtelMapper;
    private final BreadcrumbService breadcrumbService;
    private final ConfigService configService;
    private final CurrentSessionSpan currentSessionSpan;
    private final EventService eventService;
    private final GatingService gatingService;
    private final InternalErrorService internalErrorService;
    private final LogMessageService logMessageService;
    private final InternalEmbraceLogger logger;
    private final MetadataService metadataService;
    private final NativeThreadSamplerService nativeThreadSamplerService;
    private final PerformanceInfoService performanceInfoService;
    private final PreferencesService preferencesService;
    private final SessionPropertiesService sessionPropertiesService;
    private final SpanRepository spanRepository;
    private final SpanSink spanSink;
    private final StartupService startupService;
    private final ThermalStatusService thermalStatusService;
    private final UserService userService;
    private final WebViewService webViewService;

    public V1PayloadMessageCollator(GatingService gatingService, ConfigService configService, MetadataService metadataService, EventService eventService, LogMessageService logMessageService, InternalErrorService internalErrorService, PerformanceInfoService performanceInfoService, WebViewService webViewService, ThermalStatusService thermalStatusService, NativeThreadSamplerService nativeThreadSamplerService, BreadcrumbService breadcrumbService, UserService userService, PreferencesService preferencesService, SpanRepository spanRepository, SpanSink spanSink, CurrentSessionSpan currentSessionSpan, SessionPropertiesService sessionPropertiesService, StartupService startupService, AnrOtelMapper anrOtelMapper, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(gatingService, "gatingService");
        zq3.h(configService, "configService");
        zq3.h(metadataService, "metadataService");
        zq3.h(eventService, "eventService");
        zq3.h(logMessageService, "logMessageService");
        zq3.h(internalErrorService, "internalErrorService");
        zq3.h(performanceInfoService, "performanceInfoService");
        zq3.h(webViewService, "webViewService");
        zq3.h(thermalStatusService, "thermalStatusService");
        zq3.h(breadcrumbService, "breadcrumbService");
        zq3.h(userService, "userService");
        zq3.h(preferencesService, "preferencesService");
        zq3.h(spanRepository, "spanRepository");
        zq3.h(spanSink, "spanSink");
        zq3.h(currentSessionSpan, "currentSessionSpan");
        zq3.h(sessionPropertiesService, "sessionPropertiesService");
        zq3.h(startupService, "startupService");
        zq3.h(anrOtelMapper, "anrOtelMapper");
        zq3.h(internalEmbraceLogger, "logger");
        this.gatingService = gatingService;
        this.configService = configService;
        this.metadataService = metadataService;
        this.eventService = eventService;
        this.logMessageService = logMessageService;
        this.internalErrorService = internalErrorService;
        this.performanceInfoService = performanceInfoService;
        this.webViewService = webViewService;
        this.thermalStatusService = thermalStatusService;
        this.nativeThreadSamplerService = nativeThreadSamplerService;
        this.breadcrumbService = breadcrumbService;
        this.userService = userService;
        this.preferencesService = preferencesService;
        this.spanRepository = spanRepository;
        this.spanSink = spanSink;
        this.currentSessionSpan = currentSessionSpan;
        this.sessionPropertiesService = sessionPropertiesService;
        this.startupService = startupService;
        this.anrOtelMapper = anrOtelMapper;
        this.logger = internalEmbraceLogger;
    }

    private final Session buildFinalBackgroundActivity(FinalEnvelopeParams finalEnvelopeParams) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        Integer num;
        Integer num2;
        Integer num3;
        LegacyExceptionError legacyExceptionError;
        Integer num4;
        Session copy;
        long startTime = finalEnvelopeParams.getInitial().getStartTime();
        Session initial = finalEnvelopeParams.getInitial();
        Long valueOf = Long.valueOf(finalEnvelopeParams.getEndTime());
        InternalEmbraceLogger logger = finalEnvelopeParams.getLogger();
        try {
            list = this.eventService.findEventIdsForSession();
        } catch (Throwable th) {
            logger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
            list = null;
        }
        InternalEmbraceLogger logger2 = finalEnvelopeParams.getLogger();
        try {
            list2 = this.logMessageService.findInfoLogIds(startTime, finalEnvelopeParams.getEndTime());
        } catch (Throwable th2) {
            logger2.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th2, false);
            list2 = null;
        }
        InternalEmbraceLogger logger3 = finalEnvelopeParams.getLogger();
        try {
            list3 = this.logMessageService.findWarningLogIds(startTime, finalEnvelopeParams.getEndTime());
        } catch (Throwable th3) {
            logger3.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th3, false);
            list3 = null;
        }
        InternalEmbraceLogger logger4 = finalEnvelopeParams.getLogger();
        try {
            list4 = this.logMessageService.findErrorLogIds(startTime, finalEnvelopeParams.getEndTime());
        } catch (Throwable th4) {
            logger4.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th4, false);
            list4 = null;
        }
        InternalEmbraceLogger logger5 = finalEnvelopeParams.getLogger();
        try {
            num = Integer.valueOf(this.logMessageService.getInfoLogsAttemptedToSend());
        } catch (Throwable th5) {
            logger5.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th5, false);
            num = null;
        }
        InternalEmbraceLogger logger6 = finalEnvelopeParams.getLogger();
        try {
            num2 = Integer.valueOf(this.logMessageService.getWarnLogsAttemptedToSend());
        } catch (Throwable th6) {
            logger6.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th6, false);
            num2 = null;
        }
        InternalEmbraceLogger logger7 = finalEnvelopeParams.getLogger();
        try {
            num3 = Integer.valueOf(this.logMessageService.getErrorLogsAttemptedToSend());
        } catch (Throwable th7) {
            logger7.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th7, false);
            num3 = null;
        }
        InternalEmbraceLogger logger8 = finalEnvelopeParams.getLogger();
        try {
            legacyExceptionError = this.internalErrorService.getCurrentExceptionError();
        } catch (Throwable th8) {
            logger8.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th8, false);
            legacyExceptionError = null;
        }
        Long valueOf2 = Long.valueOf(finalEnvelopeParams.getEndTime());
        Session.LifeEventType lifeEventType = finalEnvelopeParams.getLifeEventType();
        InternalEmbraceLogger logger9 = finalEnvelopeParams.getLogger();
        try {
            num4 = Integer.valueOf(this.logMessageService.getUnhandledExceptionsSent());
        } catch (Throwable th9) {
            logger9.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th9, false);
            num4 = null;
        }
        copy = initial.copy((r51 & 1) != 0 ? initial.sessionId : null, (r51 & 2) != 0 ? initial.startTime : 0L, (r51 & 4) != 0 ? initial.number : 0, (r51 & 8) != 0 ? initial.messageType : null, (r51 & 16) != 0 ? initial.appState : null, (r51 & 32) != 0 ? initial.isColdStart : false, (r51 & 64) != 0 ? initial.endTime : valueOf, (r51 & 128) != 0 ? initial.lastHeartbeatTime : valueOf2, (r51 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? initial.terminationTime : null, (r51 & 512) != 0 ? initial.isEndedCleanly : null, (r51 & 1024) != 0 ? initial.isReceivedTermination : null, (r51 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? initial.eventIds : list, (r51 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? initial.infoLogIds : list2, (r51 & 8192) != 0 ? initial.warningLogIds : list3, (r51 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? initial.errorLogIds : list4, (r51 & 32768) != 0 ? initial.networkLogIds : null, (r51 & 65536) != 0 ? initial.infoLogsAttemptedToSend : num, (r51 & 131072) != 0 ? initial.warnLogsAttemptedToSend : num2, (r51 & 262144) != 0 ? initial.errorLogsAttemptedToSend : num3, (r51 & 524288) != 0 ? initial.exceptionError : legacyExceptionError, (r51 & Constants.MB) != 0 ? initial.crashReportId : finalEnvelopeParams.getCrashId(), (r51 & 2097152) != 0 ? initial.endType : lifeEventType, (r51 & 4194304) != 0 ? initial.startType : null, (r51 & 8388608) != 0 ? initial.orientations : null, (r51 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? initial.properties : null, (r51 & 33554432) != 0 ? initial.startupDuration : null, (r51 & 67108864) != 0 ? initial.startupThreshold : null, (r51 & 134217728) != 0 ? initial.sdkStartupDuration : null, (r51 & 268435456) != 0 ? initial.unhandledExceptions : num4, (r51 & 536870912) != 0 ? initial.betaFeatures : null, (r51 & 1073741824) != 0 ? initial.symbols : null, (r51 & RecyclerView.UNDEFINED_DURATION) != 0 ? initial.webViewInfo : null);
        return copy;
    }

    private final SessionMessage buildWrapperEnvelope(FinalEnvelopeParams finalEnvelopeParams, Session session, long j, long j2) {
        List<EmbraceSpanData> list;
        Breadcrumbs breadcrumbs;
        ArrayList arrayList;
        UserInfo userInfo;
        AppInfo appInfo;
        DeviceInfo deviceInfo;
        List<EmbraceSpanData> completedSpans;
        InternalEmbraceLogger internalEmbraceLogger = this.logger;
        PerformanceInfo performanceInfo = null;
        try {
            if (!finalEnvelopeParams.getCaptureSpans()) {
                completedSpans = null;
            } else if (finalEnvelopeParams.isCacheAttempt()) {
                completedSpans = this.spanSink.completedSpans();
            } else {
                AppTerminationCause.Crash crash = session.getCrashReportId() != null ? AppTerminationCause.Crash.INSTANCE : null;
                completedSpans = this.currentSessionSpan.endSession(crash);
                if (crash == null) {
                    this.sessionPropertiesService.populateCurrentSession();
                }
            }
            if (completedSpans != null) {
                List<EmbraceSpanData> list2 = completedSpans;
                List<Span> snapshot = this.anrOtelMapper.snapshot(!finalEnvelopeParams.isCacheAttempt());
                ArrayList arrayList2 = new ArrayList(i.w(snapshot, 10));
                Iterator<T> it2 = snapshot.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(SpanMapperKt.toOldPayload((Span) it2.next()));
                }
                List<EmbraceSpanData> F0 = i.F0(list2, arrayList2);
                if (F0 != null) {
                    completedSpans = F0;
                }
            }
            list = completedSpans;
        } catch (Throwable th) {
            internalEmbraceLogger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
            list = null;
        }
        InternalEmbraceLogger internalEmbraceLogger2 = this.logger;
        try {
            breadcrumbs = !finalEnvelopeParams.isCacheAttempt() ? this.breadcrumbService.flushBreadcrumbs() : this.breadcrumbService.getBreadcrumbs();
        } catch (Throwable th2) {
            internalEmbraceLogger2.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th2, false);
            breadcrumbs = null;
        }
        InternalEmbraceLogger internalEmbraceLogger3 = this.logger;
        try {
            List<PersistableEmbraceSpan> activeSpans = this.spanRepository.getActiveSpans();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = activeSpans.iterator();
            while (it3.hasNext()) {
                Span snapshot2 = ((PersistableEmbraceSpan) it3.next()).snapshot();
                EmbraceSpanData oldPayload = snapshot2 != null ? SpanMapperKt.toOldPayload(snapshot2) : null;
                if (oldPayload != null) {
                    arrayList3.add(oldPayload);
                }
            }
            arrayList = arrayList3;
        } catch (Throwable th3) {
            internalEmbraceLogger3.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th3, false);
            arrayList = null;
        }
        InternalEmbraceLogger internalEmbraceLogger4 = this.logger;
        try {
            userInfo = this.userService.getUserInfo();
        } catch (Throwable th4) {
            internalEmbraceLogger4.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th4, false);
            userInfo = null;
        }
        InternalEmbraceLogger internalEmbraceLogger5 = this.logger;
        try {
            appInfo = this.metadataService.getAppInfo();
        } catch (Throwable th5) {
            internalEmbraceLogger5.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th5, false);
            appInfo = null;
        }
        InternalEmbraceLogger internalEmbraceLogger6 = this.logger;
        try {
            deviceInfo = this.metadataService.getDeviceInfo();
        } catch (Throwable th6) {
            internalEmbraceLogger6.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th6, false);
            deviceInfo = null;
        }
        InternalEmbraceLogger internalEmbraceLogger7 = this.logger;
        try {
            performanceInfo = this.performanceInfoService.getSessionPerformanceInfo(j, j2, session.isColdStart(), null);
        } catch (Throwable th7) {
            internalEmbraceLogger7.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th7, false);
        }
        return new SessionMessage(session, userInfo, appInfo, deviceInfo, performanceInfo, breadcrumbs, list, arrayList, null, null, null, null, null, null, 16128, null);
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadMessageCollator
    public SessionMessage buildFinalBackgroundActivityMessage(FinalEnvelopeParams.BackgroundActivityParams backgroundActivityParams) {
        zq3.h(backgroundActivityParams, "params");
        Session buildFinalBackgroundActivity = buildFinalBackgroundActivity(backgroundActivityParams);
        return this.gatingService.gateSessionMessage(buildWrapperEnvelope(backgroundActivityParams, buildFinalBackgroundActivity, buildFinalBackgroundActivity.getStartTime(), backgroundActivityParams.getEndTime()));
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadMessageCollator
    public SessionMessage buildFinalSessionMessage(FinalEnvelopeParams.SessionParams sessionParams) {
        List<? extends ThermalState> list;
        BetaFeatures betaFeatures;
        List<String> list2;
        Map<String, String> map;
        List<? extends WebViewInfo> list3;
        Session copy;
        zq3.h(sessionParams, "params");
        Session buildFinalBackgroundActivity = buildFinalBackgroundActivity(sessionParams);
        StartupEventInfo startupEventInfo = sessionParams.getStartupEventInfo(this.eventService);
        Map<String, String> map2 = null;
        if (this.configService.getSdkModeBehavior().isBetaFeaturesEnabled()) {
            InternalEmbraceLogger logger = sessionParams.getLogger();
            try {
                list = this.thermalStatusService.getCapturedData();
            } catch (Throwable th) {
                logger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
                list = null;
            }
            betaFeatures = new BetaFeatures(list);
        } else {
            betaFeatures = null;
        }
        Boolean valueOf = Boolean.valueOf(sessionParams.getEndType().getEndedCleanly());
        InternalEmbraceLogger logger2 = sessionParams.getLogger();
        try {
            list2 = this.logMessageService.findNetworkLogIds(sessionParams.getInitial().getStartTime(), sessionParams.getEndTime());
        } catch (Throwable th2) {
            logger2.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th2, false);
            list2 = null;
        }
        InternalEmbraceLogger logger3 = sessionParams.getLogger();
        try {
            map = this.sessionPropertiesService.getProperties();
        } catch (Throwable th3) {
            logger3.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th3, false);
            map = null;
        }
        InternalEmbraceLogger logger4 = sessionParams.getLogger();
        try {
            list3 = this.webViewService.getCapturedData();
        } catch (Throwable th4) {
            logger4.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th4, false);
            list3 = null;
        }
        Long terminationTime = sessionParams.getTerminationTime();
        Boolean receivedTermination = sessionParams.getReceivedTermination();
        Long endTimeVal = sessionParams.getEndTimeVal();
        Long sdkStartupDuration = this.startupService.getSdkStartupDuration(sessionParams.getInitial().isColdStart());
        Long duration = startupEventInfo != null ? startupEventInfo.getDuration() : null;
        Long threshold = startupEventInfo != null ? startupEventInfo.getThreshold() : null;
        InternalEmbraceLogger logger5 = sessionParams.getLogger();
        try {
            NativeThreadSamplerService nativeThreadSamplerService = this.nativeThreadSamplerService;
            if (nativeThreadSamplerService != null) {
                map2 = nativeThreadSamplerService.getNativeSymbols();
            }
        } catch (Throwable th5) {
            logger5.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th5, false);
        }
        copy = buildFinalBackgroundActivity.copy((r51 & 1) != 0 ? buildFinalBackgroundActivity.sessionId : null, (r51 & 2) != 0 ? buildFinalBackgroundActivity.startTime : 0L, (r51 & 4) != 0 ? buildFinalBackgroundActivity.number : 0, (r51 & 8) != 0 ? buildFinalBackgroundActivity.messageType : null, (r51 & 16) != 0 ? buildFinalBackgroundActivity.appState : null, (r51 & 32) != 0 ? buildFinalBackgroundActivity.isColdStart : false, (r51 & 64) != 0 ? buildFinalBackgroundActivity.endTime : endTimeVal, (r51 & 128) != 0 ? buildFinalBackgroundActivity.lastHeartbeatTime : null, (r51 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? buildFinalBackgroundActivity.terminationTime : terminationTime, (r51 & 512) != 0 ? buildFinalBackgroundActivity.isEndedCleanly : valueOf, (r51 & 1024) != 0 ? buildFinalBackgroundActivity.isReceivedTermination : receivedTermination, (r51 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? buildFinalBackgroundActivity.eventIds : null, (r51 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? buildFinalBackgroundActivity.infoLogIds : null, (r51 & 8192) != 0 ? buildFinalBackgroundActivity.warningLogIds : null, (r51 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? buildFinalBackgroundActivity.errorLogIds : null, (r51 & 32768) != 0 ? buildFinalBackgroundActivity.networkLogIds : list2, (r51 & 65536) != 0 ? buildFinalBackgroundActivity.infoLogsAttemptedToSend : null, (r51 & 131072) != 0 ? buildFinalBackgroundActivity.warnLogsAttemptedToSend : null, (r51 & 262144) != 0 ? buildFinalBackgroundActivity.errorLogsAttemptedToSend : null, (r51 & 524288) != 0 ? buildFinalBackgroundActivity.exceptionError : null, (r51 & Constants.MB) != 0 ? buildFinalBackgroundActivity.crashReportId : null, (r51 & 2097152) != 0 ? buildFinalBackgroundActivity.endType : null, (r51 & 4194304) != 0 ? buildFinalBackgroundActivity.startType : null, (r51 & 8388608) != 0 ? buildFinalBackgroundActivity.orientations : null, (r51 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? buildFinalBackgroundActivity.properties : map, (r51 & 33554432) != 0 ? buildFinalBackgroundActivity.startupDuration : duration, (r51 & 67108864) != 0 ? buildFinalBackgroundActivity.startupThreshold : threshold, (r51 & 134217728) != 0 ? buildFinalBackgroundActivity.sdkStartupDuration : sdkStartupDuration, (r51 & 268435456) != 0 ? buildFinalBackgroundActivity.unhandledExceptions : null, (r51 & 536870912) != 0 ? buildFinalBackgroundActivity.betaFeatures : betaFeatures, (r51 & 1073741824) != 0 ? buildFinalBackgroundActivity.symbols : map2, (r51 & RecyclerView.UNDEFINED_DURATION) != 0 ? buildFinalBackgroundActivity.webViewInfo : list3);
        return this.gatingService.gateSessionMessage(buildWrapperEnvelope(sessionParams, copy, sessionParams.getInitial().getStartTime(), sessionParams.getEndTime()));
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadMessageCollator
    public Session buildInitialSession(InitialEnvelopeParams initialEnvelopeParams) {
        zq3.h(initialEnvelopeParams, "params");
        String sessionId = this.currentSessionSpan.getSessionId();
        long startTime = initialEnvelopeParams.getStartTime();
        boolean coldStart = initialEnvelopeParams.getColdStart();
        return new Session(sessionId, startTime, initialEnvelopeParams.getSessionNumber(this.preferencesService), Session.MESSAGE_TYPE_END, initialEnvelopeParams.getAppState(), coldStart, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, initialEnvelopeParams.getStartType(), null, initialEnvelopeParams.getProperties(this.sessionPropertiesService), null, null, null, null, null, null, null, -20971584, null);
    }
}
