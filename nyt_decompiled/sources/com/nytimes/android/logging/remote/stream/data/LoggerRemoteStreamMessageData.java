package com.nytimes.android.logging.remote.stream.data;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoggerRemoteStreamMessageData {
    private final long a;
    private final int b;
    private final LoggerRemoteStreamMessageLocation c;
    private final String d;
    private final String e;

    public LoggerRemoteStreamMessageData(long j, int i, LoggerRemoteStreamMessageLocation loggerRemoteStreamMessageLocation, String str, String str2) {
        zq3.h(str, "message");
        this.a = j;
        this.b = i;
        this.c = loggerRemoteStreamMessageLocation;
        this.d = str;
        this.e = str2;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final LoggerRemoteStreamMessageLocation c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggerRemoteStreamMessageData)) {
            return false;
        }
        LoggerRemoteStreamMessageData loggerRemoteStreamMessageData = (LoggerRemoteStreamMessageData) obj;
        return this.a == loggerRemoteStreamMessageData.a && this.b == loggerRemoteStreamMessageData.b && zq3.c(this.c, loggerRemoteStreamMessageData.c) && zq3.c(this.d, loggerRemoteStreamMessageData.d) && zq3.c(this.e, loggerRemoteStreamMessageData.e);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31;
        LoggerRemoteStreamMessageLocation loggerRemoteStreamMessageLocation = this.c;
        int hashCode2 = (((hashCode + (loggerRemoteStreamMessageLocation == null ? 0 : loggerRemoteStreamMessageLocation.hashCode())) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LoggerRemoteStreamMessageData(date=" + this.a + ", level=" + this.b + ", location=" + this.c + ", message=" + this.d + ", throwable=" + this.e + ")";
    }

    public /* synthetic */ LoggerRemoteStreamMessageData(long j, int i, LoggerRemoteStreamMessageLocation loggerRemoteStreamMessageLocation, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, (i2 & 4) != 0 ? null : loggerRemoteStreamMessageLocation, str, str2);
    }
}
