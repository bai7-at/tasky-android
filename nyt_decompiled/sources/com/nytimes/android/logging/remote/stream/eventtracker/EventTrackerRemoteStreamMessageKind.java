package com.nytimes.android.logging.remote.stream.eventtracker;

import com.nytimes.android.eventtracker.model.Event;
import defpackage.et3;
import defpackage.gw6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class EventTrackerRemoteStreamMessageKind {
    private final Event a;
    private final String b;

    public EventTrackerRemoteStreamMessageKind(Event event, String str) {
        zq3.h(event, "data");
        zq3.h(str, "kind");
        this.a = event;
        this.b = str;
    }

    public final Event a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventTrackerRemoteStreamMessageKind)) {
            return false;
        }
        EventTrackerRemoteStreamMessageKind eventTrackerRemoteStreamMessageKind = (EventTrackerRemoteStreamMessageKind) obj;
        return zq3.c(this.a, eventTrackerRemoteStreamMessageKind.a) && zq3.c(this.b, eventTrackerRemoteStreamMessageKind.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "EventTrackerRemoteStreamMessageKind(data=" + this.a + ", kind=" + this.b + ")";
    }

    public /* synthetic */ EventTrackerRemoteStreamMessageKind(Event event, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(event, (i & 2) != 0 ? gw6.a.b.a() : str);
    }
}
