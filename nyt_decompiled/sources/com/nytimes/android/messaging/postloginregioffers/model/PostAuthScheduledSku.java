package com.nytimes.android.messaging.postloginregioffers.model;

import androidx.annotation.Keep;
import defpackage.bt3;
import defpackage.et3;
import defpackage.p06;
import defpackage.zq3;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class PostAuthScheduledSku implements p06 {
    public static final int $stable = 0;
    private final int endTimeInterval;
    private final String sku;
    private final int startTimeInterval;

    public PostAuthScheduledSku(String str, @bt3(name = "start_time_interval") int i, @bt3(name = "end_time_interval") int i2) {
        zq3.h(str, "sku");
        this.sku = str;
        this.startTimeInterval = i;
        this.endTimeInterval = i2;
    }

    public static /* synthetic */ PostAuthScheduledSku copy$default(PostAuthScheduledSku postAuthScheduledSku, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = postAuthScheduledSku.sku;
        }
        if ((i3 & 2) != 0) {
            i = postAuthScheduledSku.startTimeInterval;
        }
        if ((i3 & 4) != 0) {
            i2 = postAuthScheduledSku.endTimeInterval;
        }
        return postAuthScheduledSku.copy(str, i, i2);
    }

    public final String component1() {
        return this.sku;
    }

    public final int component2() {
        return this.startTimeInterval;
    }

    public final int component3() {
        return this.endTimeInterval;
    }

    public final PostAuthScheduledSku copy(String str, @bt3(name = "start_time_interval") int i, @bt3(name = "end_time_interval") int i2) {
        zq3.h(str, "sku");
        return new PostAuthScheduledSku(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostAuthScheduledSku)) {
            return false;
        }
        PostAuthScheduledSku postAuthScheduledSku = (PostAuthScheduledSku) obj;
        return zq3.c(this.sku, postAuthScheduledSku.sku) && this.startTimeInterval == postAuthScheduledSku.startTimeInterval && this.endTimeInterval == postAuthScheduledSku.endTimeInterval;
    }

    @Override // defpackage.p06
    public int getEndTimeInterval() {
        return this.endTimeInterval;
    }

    public final String getSku() {
        return this.sku;
    }

    @Override // defpackage.p06
    public int getStartTimeInterval() {
        return this.startTimeInterval;
    }

    public int hashCode() {
        return (((this.sku.hashCode() * 31) + Integer.hashCode(this.startTimeInterval)) * 31) + Integer.hashCode(this.endTimeInterval);
    }

    public String toString() {
        return "PostAuthScheduledSku(sku=" + this.sku + ", startTimeInterval=" + this.startTimeInterval + ", endTimeInterval=" + this.endTimeInterval + ")";
    }
}
