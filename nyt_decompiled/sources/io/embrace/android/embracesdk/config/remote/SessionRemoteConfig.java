package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class SessionRemoteConfig {
    private final Set<String> fullSessionEvents;
    private final Boolean isEnabled;
    private final Set<String> sessionComponents;

    public SessionRemoteConfig() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionRemoteConfig copy$default(SessionRemoteConfig sessionRemoteConfig, Boolean bool, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sessionRemoteConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            set = sessionRemoteConfig.sessionComponents;
        }
        if ((i & 4) != 0) {
            set2 = sessionRemoteConfig.fullSessionEvents;
        }
        return sessionRemoteConfig.copy(bool, set, set2);
    }

    public final Boolean component1() {
        return this.isEnabled;
    }

    public final Set<String> component2() {
        return this.sessionComponents;
    }

    public final Set<String> component3() {
        return this.fullSessionEvents;
    }

    public final SessionRemoteConfig copy(@bt3(name = "enable") Boolean bool, @bt3(name = "components") Set<String> set, @bt3(name = "send_full_for") Set<String> set2) {
        return new SessionRemoteConfig(bool, set, set2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionRemoteConfig)) {
            return false;
        }
        SessionRemoteConfig sessionRemoteConfig = (SessionRemoteConfig) obj;
        return zq3.c(this.isEnabled, sessionRemoteConfig.isEnabled) && zq3.c(this.sessionComponents, sessionRemoteConfig.sessionComponents) && zq3.c(this.fullSessionEvents, sessionRemoteConfig.fullSessionEvents);
    }

    public final Set<String> getFullSessionEvents() {
        return this.fullSessionEvents;
    }

    public final Set<String> getSessionComponents() {
        return this.sessionComponents;
    }

    public int hashCode() {
        Boolean bool = this.isEnabled;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Set<String> set = this.sessionComponents;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.fullSessionEvents;
        return hashCode2 + (set2 != null ? set2.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "SessionRemoteConfig(isEnabled=" + this.isEnabled + ", sessionComponents=" + this.sessionComponents + ", fullSessionEvents=" + this.fullSessionEvents + ")";
    }

    public SessionRemoteConfig(@bt3(name = "enable") Boolean bool, @bt3(name = "components") Set<String> set, @bt3(name = "send_full_for") Set<String> set2) {
        this.isEnabled = bool;
        this.sessionComponents = set;
        this.fullSessionEvents = set2;
    }

    public /* synthetic */ SessionRemoteConfig(Boolean bool, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : set, (i & 4) != 0 ? null : set2);
    }
}
