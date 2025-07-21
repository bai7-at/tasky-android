package io.embrace.android.embracesdk.event;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.PerformanceInfoService;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.EventDescription;
import io.embrace.android.embracesdk.internal.StartupEventInfo;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Event;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceEventService implements EventService, ActivityLifecycleListener, ProcessStateListener, MemoryCleanerListener {
    public static final Companion Companion = new Companion(null);
    public static final String STARTUP_EVENT_NAME = "_startup";
    private final ConcurrentMap<String, EventDescription> activeEvents;
    private final BackgroundWorker backgroundWorker;
    private final Clock clock;
    private final ConfigService configService;
    private EventHandler eventHandler;
    private final ConcurrentLinkedQueue<String> eventIds;
    private final InternalEmbraceLogger logger;
    private boolean processStartedByNotification;
    private final EmbraceSessionProperties sessionProperties;
    private StartupEventInfo startupEventInfo;
    private boolean startupSent;
    private final long startupStartTimeMs;

    public static final class Companion {
        private Companion() {
        }

        public final String getInternalEventKey$embrace_android_sdk_release(String str, String str2) {
            zq3.h(str, "eventName");
            if (str2 == null) {
                return str;
            }
            if (str2.hashCode() == 0 && str2.equals("")) {
                return str;
            }
            return str + '#' + str2;
        }

        public final boolean isStartupEvent$embrace_android_sdk_release(String str) {
            zq3.h(str, "eventName");
            return zq3.c(EmbraceEventService.STARTUP_EVENT_NAME, str);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceEventService(long j, DeliveryService deliveryService, ConfigService configService, MetadataService metadataService, SessionIdTracker sessionIdTracker, PerformanceInfoService performanceInfoService, UserService userService, EmbraceSessionProperties embraceSessionProperties, InternalEmbraceLogger internalEmbraceLogger, WorkerThreadModule workerThreadModule, Clock clock) {
        zq3.h(deliveryService, "deliveryService");
        zq3.h(configService, "configService");
        zq3.h(metadataService, "metadataService");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(performanceInfoService, "performanceInfoService");
        zq3.h(userService, "userService");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(workerThreadModule, "workerThreadModule");
        zq3.h(clock, "clock");
        this.startupStartTimeMs = j;
        this.configService = configService;
        this.sessionProperties = embraceSessionProperties;
        this.logger = internalEmbraceLogger;
        this.clock = clock;
        this.eventIds = new ConcurrentLinkedQueue<>();
        this.activeEvents = new ConcurrentHashMap();
        WorkerName workerName = WorkerName.BACKGROUND_REGISTRATION;
        this.eventHandler = new EventHandler(metadataService, sessionIdTracker, configService, userService, performanceInfoService, deliveryService, internalEmbraceLogger, clock, workerThreadModule.scheduledWorker(workerName));
        this.backgroundWorker = workerThreadModule.backgroundWorker(workerName);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void applicationStartupComplete() {
        if (this.processStartedByNotification) {
            this.activeEvents.remove(STARTUP_EVENT_NAME);
        } else if (this.configService.getStartupBehavior().isAutomaticEndEnabled()) {
            endEvent(STARTUP_EVENT_NAME);
        }
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        Collection<EventDescription> values = this.activeEvents.values();
        final ArrayList arrayList = new ArrayList(i.w(values, 10));
        Iterator<T> it2 = values.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EventDescription) it2.next()).getEvent().eventId);
        }
        i.G(this.eventIds, new ss2() { // from class: io.embrace.android.embracesdk.event.EmbraceEventService$cleanCollections$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(invoke((String) obj));
            }

            public final boolean invoke(String str) {
                return !arrayList.contains(str);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cleanCollections();
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void endEvent(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        endEvent(str, null, false, null);
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public List<String> findEventIdsForSession() {
        return i.X0(this.eventIds);
    }

    public final EventDescription getActiveEvent(String str, String str2) {
        zq3.h(str, "eventName");
        return this.activeEvents.get(Companion.getInternalEventKey$embrace_android_sdk_release(str, str2));
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public List<String> getActiveEventIds() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = i.X0(this.activeEvents.values()).iterator();
        while (it2.hasNext()) {
            arrayList.add(((EventDescription) it2.next()).component2().eventId);
        }
        return arrayList;
    }

    public final ConcurrentMap<String, EventDescription> getActiveEvents() {
        return this.activeEvents;
    }

    public final EventHandler getEventHandler() {
        return this.eventHandler;
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public StartupEventInfo getStartupMomentInfo() {
        return this.startupEventInfo;
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onBackground(long j) {
        ProcessStateListener.DefaultImpls.onBackground(this, j);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onForeground(boolean z, long j) {
        if (z) {
            sendStartupMoment();
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onView(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onView(this, activity);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onViewClose(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onViewClose(this, activity);
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void sendStartupMoment() {
        synchronized (this) {
            if (this.startupSent) {
                return;
            }
            this.startupSent = true;
            ww8 ww8Var = ww8.a;
            this.logger.log("Sending startup start event.", InternalEmbraceLogger.Severity.DEBUG, null, true);
            startEvent(STARTUP_EVENT_NAME, null, null, Long.valueOf(this.startupStartTimeMs));
        }
    }

    public final void setEventHandler(EventHandler eventHandler) {
        zq3.h(eventHandler, "<set-?>");
        this.eventHandler = eventHandler;
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void setProcessStartedByNotification() {
        this.processStartedByNotification = true;
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void startEvent(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        startEvent(str, null, null, null);
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void endEvent(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        endEvent(str, str2, false, null);
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void startEvent(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        startEvent(str, str2, null, null);
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void endEvent(String str, Map<String, ? extends Object> map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        endEvent(str, null, false, map);
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void startEvent(String str, String str2, Map<String, ? extends Object> map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        startEvent(str, str2, map, null);
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void endEvent(String str, String str2, Map<String, ? extends Object> map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        endEvent(str, str2, false, map);
    }

    @Override // io.embrace.android.embracesdk.event.EventService
    public void startEvent(final String str, final String str2, Map<String, ? extends Object> map, Long l) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            if (this.eventHandler.isAllowedToStart(str)) {
                String internalEventKey$embrace_android_sdk_release = Companion.getInternalEventKey$embrace_android_sdk_release(str, str2);
                if (this.activeEvents.containsKey(internalEventKey$embrace_android_sdk_release)) {
                    endEvent(str, str2, false, null);
                }
                Long valueOf = l == null ? Long.valueOf(this.clock.now()) : l;
                String embUuid$default = Uuid.getEmbUuid$default(null, 1, null);
                this.eventIds.add(embUuid$default);
                this.activeEvents.put(internalEventKey$embrace_android_sdk_release, this.eventHandler.onEventStarted(embUuid$default, str, valueOf.longValue(), this.sessionProperties, map, new Runnable() { // from class: io.embrace.android.embracesdk.event.EmbraceEventService$startEvent$eventDescription$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmbraceEventService.this.endEvent(str, str2, true, null);
                    }
                }));
            }
        } catch (Exception e) {
            this.logger.log("Cannot start event with name: " + str + ", identifier: " + str2 + " due to an exception", InternalEmbraceLogger.Severity.ERROR, e, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endEvent(String str, String str2, boolean z, Map<String, ? extends Object> map) {
        EventDescription remove;
        try {
            Companion companion = Companion;
            String internalEventKey$embrace_android_sdk_release = companion.getInternalEventKey$embrace_android_sdk_release(str, str2);
            if (z) {
                remove = this.activeEvents.get(internalEventKey$embrace_android_sdk_release);
            } else {
                remove = this.activeEvents.remove(internalEventKey$embrace_android_sdk_release);
            }
            if (remove == null) {
                if (companion.isStartupEvent$embrace_android_sdk_release(str)) {
                    return;
                }
                this.logger.log("No start event found when ending an event with name: " + str + ", identifier: " + str2, InternalEmbraceLogger.Severity.ERROR, null, false);
                return;
            }
            Event component1 = this.eventHandler.onEventEnded(remove, z, map, this.sessionProperties).component1();
            if (companion.isStartupEvent$embrace_android_sdk_release(str)) {
                this.startupEventInfo = this.eventHandler.buildStartupEventInfo(remove.getEvent(), component1);
            }
        } catch (Exception e) {
            this.logger.log("Cannot end event with name: " + str + ", identifier: " + str2 + " due to an exception", InternalEmbraceLogger.Severity.ERROR, e, false);
        }
    }
}
