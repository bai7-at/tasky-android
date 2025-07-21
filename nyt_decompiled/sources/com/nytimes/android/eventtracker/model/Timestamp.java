package com.nytimes.android.eventtracker.model;

import defpackage.bt3;
import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Timestamp {
    private final long a;
    private final boolean b;

    public Timestamp(long j, @bt3(name = "using_device_time") boolean z) {
        this.a = j;
        this.b = z;
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final Timestamp copy(long j, @bt3(name = "using_device_time") boolean z) {
        return new Timestamp(j, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timestamp)) {
            return false;
        }
        Timestamp timestamp = (Timestamp) obj;
        return this.a == timestamp.a && this.b == timestamp.b;
    }

    public int hashCode() {
        return (Long.hashCode(this.a) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "Timestamp(timestamp=" + this.a + ", usingDeviceTime=" + this.b + ")";
    }
}
