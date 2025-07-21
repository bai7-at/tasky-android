package com.nytimes.android.logging.remote.stream.networktracker;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NetworkTrackerRemoteStreamMessageData {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Map e;
    private final NetworkTrackerRemoteStreamMessageResponse f;

    public NetworkTrackerRemoteStreamMessageData(String str, String str2, String str3, String str4, Map map, NetworkTrackerRemoteStreamMessageResponse networkTrackerRemoteStreamMessageResponse) {
        zq3.h(str, "requestUrl");
        zq3.h(str2, "method");
        zq3.h(str4, "body");
        zq3.h(map, "headers");
        zq3.h(networkTrackerRemoteStreamMessageResponse, "response");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = networkTrackerRemoteStreamMessageResponse;
    }

    public final String a() {
        return this.d;
    }

    public final Map b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final NetworkTrackerRemoteStreamMessageResponse e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkTrackerRemoteStreamMessageData)) {
            return false;
        }
        NetworkTrackerRemoteStreamMessageData networkTrackerRemoteStreamMessageData = (NetworkTrackerRemoteStreamMessageData) obj;
        return zq3.c(this.a, networkTrackerRemoteStreamMessageData.a) && zq3.c(this.b, networkTrackerRemoteStreamMessageData.b) && zq3.c(this.c, networkTrackerRemoteStreamMessageData.c) && zq3.c(this.d, networkTrackerRemoteStreamMessageData.d) && zq3.c(this.e, networkTrackerRemoteStreamMessageData.e) && zq3.c(this.f, networkTrackerRemoteStreamMessageData.f);
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "NetworkTrackerRemoteStreamMessageData(requestUrl=" + this.a + ", method=" + this.b + ", tag=" + this.c + ", body=" + this.d + ", headers=" + this.e + ", response=" + this.f + ")";
    }
}
