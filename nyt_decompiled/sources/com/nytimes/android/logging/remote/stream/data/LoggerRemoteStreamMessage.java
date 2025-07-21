package com.nytimes.android.logging.remote.stream.data;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoggerRemoteStreamMessage {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final LoggerRemoteStreamMessageKind e;
    private final String f;

    public LoggerRemoteStreamMessage(String str, String str2, String str3, String str4, LoggerRemoteStreamMessageKind loggerRemoteStreamMessageKind, String str5) {
        zq3.h(str, "sessionId");
        zq3.h(str2, "deviceId");
        zq3.h(str3, "deviceKind");
        zq3.h(str4, "deviceName");
        zq3.h(loggerRemoteStreamMessageKind, "kind");
        zq3.h(str5, "messageId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = loggerRemoteStreamMessageKind;
        this.f = str5;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final LoggerRemoteStreamMessageKind d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggerRemoteStreamMessage)) {
            return false;
        }
        LoggerRemoteStreamMessage loggerRemoteStreamMessage = (LoggerRemoteStreamMessage) obj;
        return zq3.c(this.a, loggerRemoteStreamMessage.a) && zq3.c(this.b, loggerRemoteStreamMessage.b) && zq3.c(this.c, loggerRemoteStreamMessage.c) && zq3.c(this.d, loggerRemoteStreamMessage.d) && zq3.c(this.e, loggerRemoteStreamMessage.e) && zq3.c(this.f, loggerRemoteStreamMessage.f);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "LoggerRemoteStreamMessage(sessionId=" + this.a + ", deviceId=" + this.b + ", deviceKind=" + this.c + ", deviceName=" + this.d + ", kind=" + this.e + ", messageId=" + this.f + ")";
    }

    public /* synthetic */ LoggerRemoteStreamMessage(String str, String str2, String str3, String str4, LoggerRemoteStreamMessageKind loggerRemoteStreamMessageKind, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "android" : str3, str4, loggerRemoteStreamMessageKind, str5);
    }
}
