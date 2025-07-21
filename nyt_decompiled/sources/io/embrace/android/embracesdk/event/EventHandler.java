package io.embrace.android.embracesdk.event;

import defpackage.zq3;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.capture.PerformanceInfoService;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import io.embrace.android.embracesdk.internal.EventDescription;
import io.embrace.android.embracesdk.internal.StartupEventInfo;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Event;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.UserInfo;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;

/* loaded from: classes5.dex */
public final class EventHandler {
    private final Clock clock;
    private final ConfigService configService;
    private final DeliveryService deliveryService;
    private final InternalEmbraceLogger logger;
    private final MetadataService metadataService;
    private final PerformanceInfoService performanceInfoService;
    private final ScheduledWorker scheduledWorker;
    private final SessionIdTracker sessionIdTracker;
    private final UserService userService;

    public EventHandler(MetadataService metadataService, SessionIdTracker sessionIdTracker, ConfigService configService, UserService userService, PerformanceInfoService performanceInfoService, DeliveryService deliveryService, InternalEmbraceLogger internalEmbraceLogger, Clock clock, ScheduledWorker scheduledWorker) {
        zq3.h(metadataService, "metadataService");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(configService, "configService");
        zq3.h(userService, "userService");
        zq3.h(performanceInfoService, "performanceInfoService");
        zq3.h(deliveryService, "deliveryService");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(clock, "clock");
        zq3.h(scheduledWorker, "scheduledWorker");
        this.metadataService = metadataService;
        this.sessionIdTracker = sessionIdTracker;
        this.configService = configService;
        this.userService = userService;
        this.performanceInfoService = performanceInfoService;
        this.deliveryService = deliveryService;
        this.logger = internalEmbraceLogger;
        this.clock = clock;
        this.scheduledWorker = scheduledWorker;
    }

    private final Event buildEndEvent(Event event, long j, long j2, boolean z, EmbraceSessionProperties embraceSessionProperties, Map<String, ? extends Object> map) {
        return new Event(event.name, null, event.eventId, this.sessionIdTracker.getActiveSessionId(), z ? EventType.LATE : EventType.END, Long.valueOf(j), null, null, Long.valueOf(j2), this.metadataService.getAppState(), map != null ? t.v(map) : null, t.v(embraceSessionProperties.get()), null, null, null, null, null, 127170, null);
    }

    private final EventMessage buildEndEventMessage(Event event, long j, long j2) {
        return new EventMessage(event, null, null, null, this.userService.getUserInfo(), this.performanceInfoService.getPerformanceInfo(j, j2, false), null, 0, null, 462, null);
    }

    private final Event buildStartEvent(String str, String str2, long j, long j2, EmbraceSessionProperties embraceSessionProperties, Map<String, ? extends Object> map) {
        String activeSessionId = this.sessionIdTracker.getActiveSessionId();
        EventType eventType = EventType.START;
        String appState = this.metadataService.getAppState();
        Long valueOf = Long.valueOf(j2);
        return new Event(str2, null, str, activeSessionId, eventType, Long.valueOf(j), valueOf, null, null, appState, map != null ? t.v(map) : null, t.v(embraceSessionProperties.get()), null, null, null, null, null, 127362, null);
    }

    private final EventMessage buildStartEventMessage(Event event) {
        UserInfo userInfo = this.userService.getUserInfo();
        return new EventMessage(event, null, this.metadataService.getDeviceInfo(), this.metadataService.getAppInfo(), userInfo, null, null, 0, null, 482, null);
    }

    private final long calculateLateThreshold(String str) {
        Map<String, Long> eventLimits = this.configService.getDataCaptureEventBehavior().getEventLimits();
        Long l = eventLimits.get(str);
        return (l == null || !eventLimits.containsKey(str)) ? BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT : l.longValue();
    }

    private final long calculateOffset(long j, long j2) {
        return Math.min(j2, Math.max(0L, this.clock.now() - j));
    }

    private final boolean shouldSendMoment(String str) {
        if (zq3.c(str, EmbraceEventService.STARTUP_EVENT_NAME)) {
            if (this.configService.getSessionBehavior().shouldGateStartupMoment()) {
                return false;
            }
        } else if (this.configService.getSessionBehavior().shouldGateMoment()) {
            return false;
        }
        return true;
    }

    public final StartupEventInfo buildStartupEventInfo(Event event, Event event2) {
        zq3.h(event, "originEvent");
        zq3.h(event2, "endEvent");
        return new StartupEventInfo(event2.duration, event.lateThreshold);
    }

    public final boolean isAllowedToStart(String str) {
        zq3.h(str, "eventName");
        if (str.length() == 0) {
            this.logger.log("Event name is empty. Ignoring this event.", InternalEmbraceLogger.Severity.WARNING, null, false);
            return false;
        }
        if (this.configService.getDataCaptureEventBehavior().isEventEnabled(str)) {
            return true;
        }
        this.logger.log("Event disabled. Ignoring event with name " + str, InternalEmbraceLogger.Severity.WARNING, null, false);
        return false;
    }

    public final EventMessage onEventEnded(EventDescription eventDescription, boolean z, Map<String, ? extends Object> map, EmbraceSessionProperties embraceSessionProperties) {
        zq3.h(eventDescription, "originEventDescription");
        zq3.h(embraceSessionProperties, "sessionProperties");
        Event event = eventDescription.getEvent();
        Long l = event.timestamp;
        long longValue = l != null ? l.longValue() : 0L;
        long now = this.clock.now();
        long max = Math.max(0L, now - longValue);
        eventDescription.getLateTimer().cancel(false);
        EventMessage buildEndEventMessage = buildEndEventMessage(buildEndEvent(event, now, max, z, embraceSessionProperties, map), longValue, now);
        if (shouldSendMoment(event.name)) {
            this.deliveryService.sendMoment(buildEndEventMessage);
        } else {
            this.logger.log(event.name + " end moment not sent based on gating config.", InternalEmbraceLogger.Severity.DEBUG, null, true);
        }
        return buildEndEventMessage;
    }

    public final EventDescription onEventStarted(String str, String str2, long j, EmbraceSessionProperties embraceSessionProperties, Map<String, ? extends Object> map, Runnable runnable) {
        zq3.h(str, "eventId");
        zq3.h(str2, "eventName");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(runnable, "timeoutCallback");
        long calculateLateThreshold = calculateLateThreshold(str);
        Event buildStartEvent = buildStartEvent(str, str2, j, calculateLateThreshold, embraceSessionProperties, map);
        ScheduledFuture schedule = this.scheduledWorker.schedule(runnable, calculateLateThreshold - calculateOffset(j, calculateLateThreshold), TimeUnit.MILLISECONDS);
        if (shouldSendMoment(str2)) {
            this.deliveryService.sendMoment(buildStartEventMessage(buildStartEvent));
        } else {
            this.logger.log(str2 + " start moment not sent based on gating config.", InternalEmbraceLogger.Severity.DEBUG, null, true);
        }
        return new EventDescription(schedule, buildStartEvent);
    }
}
