package com.nytimes.android.logging.remote.stream.networktracker;

import defpackage.et3;
import defpackage.gw6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NetworkTrackerRemoteStreamMessageKind {
    private final NetworkTrackerRemoteStreamMessageData a;
    private final String b;

    public NetworkTrackerRemoteStreamMessageKind(NetworkTrackerRemoteStreamMessageData networkTrackerRemoteStreamMessageData, String str) {
        zq3.h(networkTrackerRemoteStreamMessageData, "data");
        zq3.h(str, "kind");
        this.a = networkTrackerRemoteStreamMessageData;
        this.b = str;
    }

    public final NetworkTrackerRemoteStreamMessageData a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkTrackerRemoteStreamMessageKind)) {
            return false;
        }
        NetworkTrackerRemoteStreamMessageKind networkTrackerRemoteStreamMessageKind = (NetworkTrackerRemoteStreamMessageKind) obj;
        return zq3.c(this.a, networkTrackerRemoteStreamMessageKind.a) && zq3.c(this.b, networkTrackerRemoteStreamMessageKind.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "NetworkTrackerRemoteStreamMessageKind(data=" + this.a + ", kind=" + this.b + ")";
    }

    public /* synthetic */ NetworkTrackerRemoteStreamMessageKind(NetworkTrackerRemoteStreamMessageData networkTrackerRemoteStreamMessageData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkTrackerRemoteStreamMessageData, (i & 2) != 0 ? gw6.c.b.a() : str);
    }
}
