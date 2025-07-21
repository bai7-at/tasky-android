package io.embrace.android.embracesdk;

import android.annotation.SuppressLint;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.InternalApi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@InternalApi
@SuppressLint({"EmbracePublicApiPackageRule"})
/* loaded from: classes5.dex */
public enum EventType {
    START("s"),
    LATE("l"),
    INTERRUPT(QueryKeys.VIEW_TITLE),
    CRASH(QueryKeys.TIME_ON_VIEW_IN_MINUTES),
    END(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING),
    INFO_LOG("il"),
    ERROR_LOG("el"),
    WARNING_LOG("wl"),
    NETWORK_LOG(QueryKeys.IS_NEW_USER);

    public static final Companion Companion = new Companion(null);
    private final String abbreviation;

    public static final class Companion {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Severity.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[Severity.INFO.ordinal()] = 1;
                iArr[Severity.WARNING.ordinal()] = 2;
                iArr[Severity.ERROR.ordinal()] = 3;
            }
        }

        private Companion() {
        }

        public final EventType fromSeverity(Severity severity) {
            zq3.h(severity, "severity");
            int i = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
            if (i == 1) {
                return EventType.INFO_LOG;
            }
            if (i == 2) {
                return EventType.WARNING_LOG;
            }
            if (i == 3) {
                return EventType.ERROR_LOG;
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[EventType.INFO_LOG.ordinal()] = 1;
            iArr[EventType.WARNING_LOG.ordinal()] = 2;
            iArr[EventType.ERROR_LOG.ordinal()] = 3;
        }
    }

    EventType(String str) {
        this.abbreviation = str;
    }

    public final String getAbbreviation() {
        return this.abbreviation;
    }

    public final Severity getSeverity() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return Severity.INFO;
        }
        if (i == 2) {
            return Severity.WARNING;
        }
        if (i != 3) {
            return null;
        }
        return Severity.ERROR;
    }
}
