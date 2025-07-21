package com.nytimes.android.logging.remote.stream.eventtracker;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class EventTrackerRemoteStreamMessage {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final EventTrackerRemoteStreamMessageKind e;
    private final String f;

    public EventTrackerRemoteStreamMessage(String str, String str2, String str3, String str4, EventTrackerRemoteStreamMessageKind eventTrackerRemoteStreamMessageKind, String str5) {
        zq3.h(str, "sessionId");
        zq3.h(str3, "deviceKind");
        zq3.h(eventTrackerRemoteStreamMessageKind, "kind");
        zq3.h(str5, "messageId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = eventTrackerRemoteStreamMessageKind;
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

    public final EventTrackerRemoteStreamMessageKind d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventTrackerRemoteStreamMessage)) {
            return false;
        }
        EventTrackerRemoteStreamMessage eventTrackerRemoteStreamMessage = (EventTrackerRemoteStreamMessage) obj;
        return zq3.c(this.a, eventTrackerRemoteStreamMessage.a) && zq3.c(this.b, eventTrackerRemoteStreamMessage.b) && zq3.c(this.c, eventTrackerRemoteStreamMessage.c) && zq3.c(this.d, eventTrackerRemoteStreamMessage.d) && zq3.c(this.e, eventTrackerRemoteStreamMessage.e) && zq3.c(this.f, eventTrackerRemoteStreamMessage.f);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        String str2 = this.d;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "EventTrackerRemoteStreamMessage(sessionId=" + this.a + ", deviceId=" + this.b + ", deviceKind=" + this.c + ", deviceName=" + this.d + ", kind=" + this.e + ", messageId=" + this.f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ EventTrackerRemoteStreamMessage(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.nytimes.android.logging.remote.stream.eventtracker.EventTrackerRemoteStreamMessageKind r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 4
            if (r15 == 0) goto L6
            java.lang.String r10 = "android"
        L6:
            r3 = r10
            r10 = r14 & 32
            if (r10 == 0) goto L18
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r13 = r10.toString()
            java.lang.String r10 = "toString(...)"
            defpackage.zq3.g(r13, r10)
        L18:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.logging.remote.stream.eventtracker.EventTrackerRemoteStreamMessage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nytimes.android.logging.remote.stream.eventtracker.EventTrackerRemoteStreamMessageKind, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
