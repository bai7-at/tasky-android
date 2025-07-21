package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class LogPayload {
    private final List<Log> logs;

    /* JADX WARN: Multi-variable type inference failed */
    public LogPayload() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogPayload copy$default(LogPayload logPayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = logPayload.logs;
        }
        return logPayload.copy(list);
    }

    public final List<Log> component1() {
        return this.logs;
    }

    public final LogPayload copy(@bt3(name = "logs") List<Log> list) {
        return new LogPayload(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LogPayload) && zq3.c(this.logs, ((LogPayload) obj).logs);
        }
        return true;
    }

    public final List<Log> getLogs() {
        return this.logs;
    }

    public int hashCode() {
        List<Log> list = this.logs;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "LogPayload(logs=" + this.logs + ")";
    }

    public LogPayload(@bt3(name = "logs") List<Log> list) {
        this.logs = list;
    }

    public /* synthetic */ LogPayload(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
