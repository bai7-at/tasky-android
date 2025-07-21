package com.nytimes.android.fragment.article.hybrid;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class SentryEvent {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public SentryEvent(@bt3(name = "event_id") String str, String str2, String str3, String str4, String str5, String str6) {
        zq3.h(str, "eventId");
        zq3.h(str2, "message");
        zq3.h(str3, "level");
        zq3.h(str4, "platform");
        zq3.h(str5, "request");
        zq3.h(str6, "sentryUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final SentryEvent copy(@bt3(name = "event_id") String str, String str2, String str3, String str4, String str5, String str6) {
        zq3.h(str, "eventId");
        zq3.h(str2, "message");
        zq3.h(str3, "level");
        zq3.h(str4, "platform");
        zq3.h(str5, "request");
        zq3.h(str6, "sentryUrl");
        return new SentryEvent(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof SentryEvent)) {
            return false;
        }
        SentryEvent sentryEvent = (SentryEvent) obj;
        return zq3.c(this.a, sentryEvent.a) && zq3.c(this.b, sentryEvent.b) && zq3.c(this.c, sentryEvent.c) && zq3.c(this.d, sentryEvent.d) && zq3.c(this.e, sentryEvent.e) && zq3.c(this.f, sentryEvent.f);
    }

    public final String f() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "SentryEvent(eventId=" + this.a + ", message=" + this.b + ", level=" + this.c + ", platform=" + this.d + ", request=" + this.e + ", sentryUrl=" + this.f + ")";
    }
}
