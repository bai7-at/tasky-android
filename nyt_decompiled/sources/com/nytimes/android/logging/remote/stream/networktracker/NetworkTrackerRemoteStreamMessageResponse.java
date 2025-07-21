package com.nytimes.android.logging.remote.stream.networktracker;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class NetworkTrackerRemoteStreamMessageResponse {
    private final Map a;
    private final String b;
    private final Integer c;
    private final String d;

    public NetworkTrackerRemoteStreamMessageResponse(Map map, String str, Integer num, String str2) {
        zq3.h(map, "headers");
        zq3.h(str, "body");
        this.a = map;
        this.b = str;
        this.c = num;
        this.d = str2;
    }

    public final String a() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final Map d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkTrackerRemoteStreamMessageResponse)) {
            return false;
        }
        NetworkTrackerRemoteStreamMessageResponse networkTrackerRemoteStreamMessageResponse = (NetworkTrackerRemoteStreamMessageResponse) obj;
        return zq3.c(this.a, networkTrackerRemoteStreamMessageResponse.a) && zq3.c(this.b, networkTrackerRemoteStreamMessageResponse.b) && zq3.c(this.c, networkTrackerRemoteStreamMessageResponse.c) && zq3.c(this.d, networkTrackerRemoteStreamMessageResponse.d);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkTrackerRemoteStreamMessageResponse(headers=" + this.a + ", body=" + this.b + ", code=" + this.c + ", error=" + this.d + ")";
    }
}
