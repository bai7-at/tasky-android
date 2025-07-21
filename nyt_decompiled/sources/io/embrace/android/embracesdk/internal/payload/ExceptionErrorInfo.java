package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ExceptionErrorInfo {
    private final AppState appState;
    private final List<ExceptionInfo> exceptions;
    private final Long timestamp;

    public enum AppState {
        FOREGROUND(Session.APPLICATION_STATE_FOREGROUND),
        BACKGROUND(Session.APPLICATION_STATE_BACKGROUND);

        private final String value;

        AppState(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public ExceptionErrorInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExceptionErrorInfo copy$default(ExceptionErrorInfo exceptionErrorInfo, Long l, AppState appState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = exceptionErrorInfo.timestamp;
        }
        if ((i & 2) != 0) {
            appState = exceptionErrorInfo.appState;
        }
        if ((i & 4) != 0) {
            list = exceptionErrorInfo.exceptions;
        }
        return exceptionErrorInfo.copy(l, appState, list);
    }

    public final Long component1() {
        return this.timestamp;
    }

    public final AppState component2() {
        return this.appState;
    }

    public final List<ExceptionInfo> component3() {
        return this.exceptions;
    }

    public final ExceptionErrorInfo copy(@bt3(name = "timestamp") Long l, @bt3(name = "app_state") AppState appState, @bt3(name = "exceptions") List<ExceptionInfo> list) {
        return new ExceptionErrorInfo(l, appState, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionErrorInfo)) {
            return false;
        }
        ExceptionErrorInfo exceptionErrorInfo = (ExceptionErrorInfo) obj;
        return zq3.c(this.timestamp, exceptionErrorInfo.timestamp) && zq3.c(this.appState, exceptionErrorInfo.appState) && zq3.c(this.exceptions, exceptionErrorInfo.exceptions);
    }

    public final AppState getAppState() {
        return this.appState;
    }

    public final List<ExceptionInfo> getExceptions() {
        return this.exceptions;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Long l = this.timestamp;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        AppState appState = this.appState;
        int hashCode2 = (hashCode + (appState != null ? appState.hashCode() : 0)) * 31;
        List<ExceptionInfo> list = this.exceptions;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ExceptionErrorInfo(timestamp=" + this.timestamp + ", appState=" + this.appState + ", exceptions=" + this.exceptions + ")";
    }

    public ExceptionErrorInfo(@bt3(name = "timestamp") Long l, @bt3(name = "app_state") AppState appState, @bt3(name = "exceptions") List<ExceptionInfo> list) {
        this.timestamp = l;
        this.appState = appState;
        this.exceptions = list;
    }

    public /* synthetic */ ExceptionErrorInfo(Long l, AppState appState, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : appState, (i & 4) != 0 ? null : list);
    }
}
