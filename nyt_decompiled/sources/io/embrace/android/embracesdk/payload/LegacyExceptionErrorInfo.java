package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.ExceptionErrorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class LegacyExceptionErrorInfo {
    private final List<LegacyExceptionInfo> exceptions;
    private final String state;
    private final Long timestamp;

    public LegacyExceptionErrorInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegacyExceptionErrorInfo copy$default(LegacyExceptionErrorInfo legacyExceptionErrorInfo, Long l, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = legacyExceptionErrorInfo.timestamp;
        }
        if ((i & 2) != 0) {
            str = legacyExceptionErrorInfo.state;
        }
        if ((i & 4) != 0) {
            list = legacyExceptionErrorInfo.exceptions;
        }
        return legacyExceptionErrorInfo.copy(l, str, list);
    }

    public final Long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.state;
    }

    public final List<LegacyExceptionInfo> component3() {
        return this.exceptions;
    }

    public final LegacyExceptionErrorInfo copy(@bt3(name = "ts") Long l, @bt3(name = "s") String str, @bt3(name = "ex") List<LegacyExceptionInfo> list) {
        return new LegacyExceptionErrorInfo(l, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyExceptionErrorInfo)) {
            return false;
        }
        LegacyExceptionErrorInfo legacyExceptionErrorInfo = (LegacyExceptionErrorInfo) obj;
        return zq3.c(this.timestamp, legacyExceptionErrorInfo.timestamp) && zq3.c(this.state, legacyExceptionErrorInfo.state) && zq3.c(this.exceptions, legacyExceptionErrorInfo.exceptions);
    }

    public final List<LegacyExceptionInfo> getExceptions() {
        return this.exceptions;
    }

    public final String getState() {
        return this.state;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Long l = this.timestamp;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.state;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<LegacyExceptionInfo> list = this.exceptions;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final ExceptionErrorInfo toNewPayload() {
        ArrayList arrayList;
        String str = this.state;
        ExceptionErrorInfo.AppState appState = (str != null && str.hashCode() == -1332194002 && str.equals(Session.APPLICATION_STATE_BACKGROUND)) ? ExceptionErrorInfo.AppState.BACKGROUND : ExceptionErrorInfo.AppState.FOREGROUND;
        Long l = this.timestamp;
        List<LegacyExceptionInfo> list = this.exceptions;
        if (list != null) {
            List<LegacyExceptionInfo> list2 = list;
            arrayList = new ArrayList(i.w(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((LegacyExceptionInfo) it2.next()).toNewPayload());
            }
        } else {
            arrayList = null;
        }
        return new ExceptionErrorInfo(l, appState, arrayList);
    }

    public String toString() {
        return "LegacyExceptionErrorInfo(timestamp=" + this.timestamp + ", state=" + this.state + ", exceptions=" + this.exceptions + ")";
    }

    public LegacyExceptionErrorInfo(@bt3(name = "ts") Long l, @bt3(name = "s") String str, @bt3(name = "ex") List<LegacyExceptionInfo> list) {
        this.timestamp = l;
        this.state = str;
        this.exceptions = list;
    }

    public /* synthetic */ LegacyExceptionErrorInfo(Long l, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
