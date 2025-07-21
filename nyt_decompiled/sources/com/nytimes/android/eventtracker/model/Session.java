package com.nytimes.android.eventtracker.model;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Session {
    private final int a;
    private final Timestamp b;

    public Session(int i, Timestamp timestamp) {
        zq3.h(timestamp, "started");
        this.a = i;
        this.b = timestamp;
    }

    public final int a() {
        return this.a;
    }

    public final Timestamp b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return this.a == session.a && zq3.c(this.b, session.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Session(index=" + this.a + ", started=" + this.b + ")";
    }
}
