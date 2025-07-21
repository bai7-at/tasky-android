package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class SessionLocalConfig {
    private final Set<String> fullSessionEvents;
    private final Set<String> sessionComponents;
    private final Boolean sessionEnableErrorLogStrictMode;

    public SessionLocalConfig() {
        this(null, null, null, 7, null);
    }

    public final Set<String> getFullSessionEvents() {
        return this.fullSessionEvents;
    }

    public final Set<String> getSessionComponents() {
        return this.sessionComponents;
    }

    public final Boolean getSessionEnableErrorLogStrictMode() {
        return this.sessionEnableErrorLogStrictMode;
    }

    public SessionLocalConfig(@bt3(name = "components") Set<String> set, @bt3(name = "send_full_for") Set<String> set2, @bt3(name = "error_log_strict_mode") Boolean bool) {
        this.sessionComponents = set;
        this.fullSessionEvents = set2;
        this.sessionEnableErrorLogStrictMode = bool;
    }

    public /* synthetic */ SessionLocalConfig(Set set, Set set2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : set, (i & 2) != 0 ? null : set2, (i & 4) != 0 ? null : bool);
    }
}
