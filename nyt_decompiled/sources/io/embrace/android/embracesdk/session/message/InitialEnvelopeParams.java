package io.embrace.android.embracesdk.session.message;

import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class InitialEnvelopeParams {
    private final boolean coldStart;
    private final long startTime;
    private final Session.LifeEventType startType;

    public static final class BackgroundActivityParams extends InitialEnvelopeParams {
        private final String appState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackgroundActivityParams(boolean z, Session.LifeEventType lifeEventType, long j) {
            super(z, lifeEventType, j, null);
            zq3.h(lifeEventType, "startType");
            this.appState = Session.APPLICATION_STATE_BACKGROUND;
        }

        @Override // io.embrace.android.embracesdk.session.message.InitialEnvelopeParams
        public String getAppState() {
            return this.appState;
        }

        @Override // io.embrace.android.embracesdk.session.message.InitialEnvelopeParams
        public Map<String, String> getProperties(SessionPropertiesService sessionPropertiesService) {
            zq3.h(sessionPropertiesService, "service");
            return null;
        }

        @Override // io.embrace.android.embracesdk.session.message.InitialEnvelopeParams
        public int getSessionNumber(PreferencesService preferencesService) {
            zq3.h(preferencesService, "service");
            return preferencesService.incrementAndGetBackgroundActivityNumber();
        }
    }

    public static final class SessionParams extends InitialEnvelopeParams {
        private final String appState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionParams(boolean z, Session.LifeEventType lifeEventType, long j) {
            super(z, lifeEventType, j, null);
            zq3.h(lifeEventType, "startType");
            this.appState = Session.APPLICATION_STATE_FOREGROUND;
        }

        @Override // io.embrace.android.embracesdk.session.message.InitialEnvelopeParams
        public String getAppState() {
            return this.appState;
        }

        @Override // io.embrace.android.embracesdk.session.message.InitialEnvelopeParams
        public Map<String, String> getProperties(SessionPropertiesService sessionPropertiesService) {
            zq3.h(sessionPropertiesService, "service");
            return sessionPropertiesService.getProperties();
        }

        @Override // io.embrace.android.embracesdk.session.message.InitialEnvelopeParams
        public int getSessionNumber(PreferencesService preferencesService) {
            zq3.h(preferencesService, "service");
            return preferencesService.incrementAndGetSessionNumber();
        }
    }

    private InitialEnvelopeParams(boolean z, Session.LifeEventType lifeEventType, long j) {
        this.coldStart = z;
        this.startType = lifeEventType;
        this.startTime = j;
    }

    public abstract String getAppState();

    public final boolean getColdStart() {
        return this.coldStart;
    }

    public abstract Map<String, String> getProperties(SessionPropertiesService sessionPropertiesService);

    public abstract int getSessionNumber(PreferencesService preferencesService);

    public final long getStartTime() {
        return this.startTime;
    }

    public final Session.LifeEventType getStartType() {
        return this.startType;
    }

    public /* synthetic */ InitialEnvelopeParams(boolean z, Session.LifeEventType lifeEventType, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, lifeEventType, j);
    }
}
