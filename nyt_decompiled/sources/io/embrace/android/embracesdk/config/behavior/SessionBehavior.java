package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.config.local.SessionLocalConfig;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.config.remote.SessionRemoteConfig;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import io.embrace.android.embracesdk.payload.EventMessage;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SessionBehavior extends MergedConfigBehavior<SessionLocalConfig, RemoteConfig> {
    public static final Companion Companion = new Companion(null);
    public static final boolean ERROR_LOG_STRICT_MODE_DEFAULT = false;
    public static final int SESSION_PROPERTY_LIMIT = 10;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        super(behaviorThresholdCheck, qs2Var, qs2Var2);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
    }

    private final boolean shouldGateFeature(String str) {
        if (getSessionComponents() != null) {
            return !r0.contains(str);
        }
        return false;
    }

    public final Set<String> getFullSessionEvents() {
        Set<String> fullSessionEvents;
        SessionRemoteConfig sessionConfig;
        RemoteConfig remote = getRemote();
        if (remote == null || (sessionConfig = remote.getSessionConfig()) == null || (fullSessionEvents = sessionConfig.getFullSessionEvents()) == null) {
            SessionLocalConfig local = getLocal();
            fullSessionEvents = local != null ? local.getFullSessionEvents() : null;
        }
        if (fullSessionEvents == null) {
            fullSessionEvents = b0.e();
        }
        Set<String> set = fullSessionEvents;
        ArrayList arrayList = new ArrayList(i.w(set, 10));
        for (String str : set) {
            Locale locale = Locale.US;
            zq3.g(locale, "Locale.US");
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase(locale);
            zq3.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            arrayList.add(lowerCase);
        }
        return i.c1(arrayList);
    }

    public final int getMaxSessionProperties() {
        Integer maxSessionProperties;
        RemoteConfig remote = getRemote();
        if (remote == null || (maxSessionProperties = remote.getMaxSessionProperties()) == null) {
            return 10;
        }
        return maxSessionProperties.intValue();
    }

    public final Set<String> getSessionComponents() {
        SessionRemoteConfig sessionConfig;
        Set<String> sessionComponents;
        RemoteConfig remote = getRemote();
        if (remote != null && (sessionConfig = remote.getSessionConfig()) != null && (sessionComponents = sessionConfig.getSessionComponents()) != null) {
            return sessionComponents;
        }
        SessionLocalConfig local = getLocal();
        if (local != null) {
            return local.getSessionComponents();
        }
        return null;
    }

    public final boolean isGatingFeatureEnabled() {
        return getSessionComponents() != null;
    }

    public final boolean isSessionControlEnabled() {
        SessionRemoteConfig sessionConfig;
        Boolean isEnabled;
        RemoteConfig remote = getRemote();
        if (remote == null || (sessionConfig = remote.getSessionConfig()) == null || (isEnabled = sessionConfig.isEnabled()) == null) {
            return false;
        }
        return isEnabled.booleanValue();
    }

    public final boolean isSessionErrorLogStrictModeEnabled() {
        Boolean sessionEnableErrorLogStrictMode;
        SessionLocalConfig local = getLocal();
        if (local == null || (sessionEnableErrorLogStrictMode = local.getSessionEnableErrorLogStrictMode()) == null) {
            return false;
        }
        return sessionEnableErrorLogStrictMode.booleanValue();
    }

    public final boolean shouldGateInfoLog() {
        return shouldGateFeature(SessionGatingKeys.LOGS_INFO);
    }

    public final boolean shouldGateLogProperties() {
        return shouldGateFeature(SessionGatingKeys.LOG_PROPERTIES);
    }

    public final boolean shouldGateMoment() {
        return shouldGateFeature(SessionGatingKeys.SESSION_MOMENTS);
    }

    public final boolean shouldGateSessionProperties() {
        return shouldGateFeature(SessionGatingKeys.SESSION_PROPERTIES);
    }

    public final boolean shouldGateStartupMoment() {
        return shouldGateFeature(SessionGatingKeys.STARTUP_MOMENT);
    }

    public final boolean shouldGateWarnLog() {
        return shouldGateFeature(SessionGatingKeys.LOGS_WARN);
    }

    public final boolean shouldSendFullForCrash() {
        return getFullSessionEvents().contains(SessionGatingKeys.FULL_SESSION_CRASHES);
    }

    public final boolean shouldSendFullForErrorLog() {
        return getFullSessionEvents().contains(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
    }

    public final boolean shouldSendFullMessage(EventMessage eventMessage) {
        zq3.h(eventMessage, "eventMessage");
        EventType eventType = eventMessage.getEvent().f83type;
        return (eventType == EventType.ERROR_LOG && shouldSendFullForErrorLog()) || (eventType == EventType.CRASH && shouldSendFullForCrash());
    }
}
