package com.nytimes.android.logging.remote.stream.data;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoggerRemoteStreamMessageKind {
    private final LoggerRemoteStreamMessageData a;
    private final String b;

    public LoggerRemoteStreamMessageKind(LoggerRemoteStreamMessageData loggerRemoteStreamMessageData, String str) {
        zq3.h(str, "kind");
        this.a = loggerRemoteStreamMessageData;
        this.b = str;
    }

    public final LoggerRemoteStreamMessageData a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggerRemoteStreamMessageKind)) {
            return false;
        }
        LoggerRemoteStreamMessageKind loggerRemoteStreamMessageKind = (LoggerRemoteStreamMessageKind) obj;
        return zq3.c(this.a, loggerRemoteStreamMessageKind.a) && zq3.c(this.b, loggerRemoteStreamMessageKind.b);
    }

    public int hashCode() {
        LoggerRemoteStreamMessageData loggerRemoteStreamMessageData = this.a;
        return ((loggerRemoteStreamMessageData == null ? 0 : loggerRemoteStreamMessageData.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LoggerRemoteStreamMessageKind(data=" + this.a + ", kind=" + this.b + ")";
    }

    public /* synthetic */ LoggerRemoteStreamMessageKind(LoggerRemoteStreamMessageData loggerRemoteStreamMessageData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : loggerRemoteStreamMessageData, str);
    }
}
