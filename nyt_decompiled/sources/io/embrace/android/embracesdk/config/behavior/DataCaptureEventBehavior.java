package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.PatternCache;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class DataCaptureEventBehavior extends MergedConfigBehavior<ww8, RemoteConfig> {
    public static final Companion Companion = new Companion(null);
    private static final boolean DEFAULT_INTERNAL_EXCEPTION_CAPTURE = true;
    private final PatternCache patternCache;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DataCaptureEventBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(behaviorThresholdCheck, (i & 2) != 0 ? new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.DataCaptureEventBehavior.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        } : qs2Var);
    }

    public final Map<String, Long> getEventLimits() {
        Map<String, Long> eventLimits;
        RemoteConfig remote = getRemote();
        return (remote == null || (eventLimits = remote.getEventLimits()) == null) ? t.i() : eventLimits;
    }

    public final boolean isEventEnabled(String str) {
        zq3.h(str, "eventName");
        RemoteConfig remote = getRemote();
        Set<String> disabledEventAndLogPatterns = remote != null ? remote.getDisabledEventAndLogPatterns() : null;
        return disabledEventAndLogPatterns == null || !this.patternCache.doesStringMatchesPatternInSet(str, disabledEventAndLogPatterns);
    }

    public final boolean isInternalExceptionCaptureEnabled() {
        Boolean internalExceptionCaptureEnabled;
        RemoteConfig remote = getRemote();
        if (remote == null || (internalExceptionCaptureEnabled = remote.getInternalExceptionCaptureEnabled()) == null) {
            return true;
        }
        return internalExceptionCaptureEnabled.booleanValue();
    }

    public final boolean isLogMessageEnabled(String str) {
        zq3.h(str, "logMessage");
        RemoteConfig remote = getRemote();
        Set<String> disabledEventAndLogPatterns = remote != null ? remote.getDisabledEventAndLogPatterns() : null;
        return disabledEventAndLogPatterns == null || !this.patternCache.doesStringMatchesPatternInSet(str, disabledEventAndLogPatterns);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataCaptureEventBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var) {
        super(behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.DataCaptureEventBehavior.2
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ww8 mo865invoke() {
                return null;
            }
        }, qs2Var);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "remoteSupplier");
        this.patternCache = new PatternCache();
    }
}
