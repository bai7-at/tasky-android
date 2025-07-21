package io.embrace.android.embracesdk.internal;

import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Event;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class EventDescription {
    private final Event event;
    private final Future<?> lateTimer;

    public EventDescription(Future<?> future, Event event) {
        zq3.h(future, "lateTimer");
        zq3.h(event, "event");
        this.lateTimer = future;
        this.event = event;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventDescription copy$default(EventDescription eventDescription, Future future, Event event, int i, Object obj) {
        if ((i & 1) != 0) {
            future = eventDescription.lateTimer;
        }
        if ((i & 2) != 0) {
            event = eventDescription.event;
        }
        return eventDescription.copy(future, event);
    }

    public final Future<?> component1() {
        return this.lateTimer;
    }

    public final Event component2() {
        return this.event;
    }

    public final EventDescription copy(Future<?> future, Event event) {
        zq3.h(future, "lateTimer");
        zq3.h(event, "event");
        return new EventDescription(future, event);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventDescription)) {
            return false;
        }
        EventDescription eventDescription = (EventDescription) obj;
        return zq3.c(this.lateTimer, eventDescription.lateTimer) && zq3.c(this.event, eventDescription.event);
    }

    public final Event getEvent() {
        return this.event;
    }

    public final Future<?> getLateTimer() {
        return this.lateTimer;
    }

    public int hashCode() {
        Future<?> future = this.lateTimer;
        int hashCode = (future != null ? future.hashCode() : 0) * 31;
        Event event = this.event;
        return hashCode + (event != null ? event.hashCode() : 0);
    }

    public String toString() {
        return "EventDescription(lateTimer=" + this.lateTimer + ", event=" + this.event + ")";
    }
}
