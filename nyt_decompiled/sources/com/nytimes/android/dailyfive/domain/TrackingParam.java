package com.nytimes.android.dailyfive.domain;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class TrackingParam {
    private final String a;
    private final String b;

    public TrackingParam(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingParam)) {
            return false;
        }
        TrackingParam trackingParam = (TrackingParam) obj;
        return zq3.c(this.a, trackingParam.a) && zq3.c(this.b, trackingParam.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TrackingParam(key=" + this.a + ", value=" + this.b + ")";
    }
}
