package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class MemoryWarning {
    private final long timestamp;

    public MemoryWarning(@bt3(name = "ts") long j) {
        this.timestamp = j;
    }

    public static /* synthetic */ MemoryWarning copy$default(MemoryWarning memoryWarning, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = memoryWarning.timestamp;
        }
        return memoryWarning.copy(j);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final MemoryWarning copy(@bt3(name = "ts") long j) {
        return new MemoryWarning(j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MemoryWarning) && this.timestamp == ((MemoryWarning) obj).timestamp;
        }
        return true;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "MemoryWarning(timestamp=" + this.timestamp + ")";
    }
}
