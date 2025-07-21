package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class EventContext {
    private final String name;

    public EventContext(String str) {
        this.name = str;
    }

    public static /* synthetic */ EventContext copy$default(EventContext eventContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventContext.name;
        }
        return eventContext.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final EventContext copy(String str) {
        return new EventContext(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventContext) && zq3.c(this.name, ((EventContext) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "EventContext(name=" + this.name + ')';
    }
}
