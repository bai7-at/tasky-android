package com.appsflyer.internal;

/* loaded from: classes2.dex */
public class AFc1tSDK {
    public final long values;

    public AFc1tSDK(long j) {
        this.values = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.values == ((AFc1tSDK) obj).values;
    }

    public int hashCode() {
        long j = this.values;
        return (int) (j ^ (j >>> 32));
    }
}
