package com.nytimes.android.messaging.postloginregioffers.model;

import androidx.annotation.Keep;
import defpackage.bt3;
import defpackage.et3;
import defpackage.p06;
import defpackage.zq3;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class PostAuthUrgencyMessage implements p06 {
    public static final int $stable = 0;
    private final int endTimeInterval;
    private final String headline;
    private final int startTimeInterval;

    public PostAuthUrgencyMessage(String str, @bt3(name = "start_time_interval") int i, @bt3(name = "end_time_interval") int i2) {
        zq3.h(str, "headline");
        this.headline = str;
        this.startTimeInterval = i;
        this.endTimeInterval = i2;
    }

    public static /* synthetic */ PostAuthUrgencyMessage copy$default(PostAuthUrgencyMessage postAuthUrgencyMessage, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = postAuthUrgencyMessage.headline;
        }
        if ((i3 & 2) != 0) {
            i = postAuthUrgencyMessage.startTimeInterval;
        }
        if ((i3 & 4) != 0) {
            i2 = postAuthUrgencyMessage.endTimeInterval;
        }
        return postAuthUrgencyMessage.copy(str, i, i2);
    }

    public final String component1() {
        return this.headline;
    }

    public final int component2() {
        return this.startTimeInterval;
    }

    public final int component3() {
        return this.endTimeInterval;
    }

    public final PostAuthUrgencyMessage copy(String str, @bt3(name = "start_time_interval") int i, @bt3(name = "end_time_interval") int i2) {
        zq3.h(str, "headline");
        return new PostAuthUrgencyMessage(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostAuthUrgencyMessage)) {
            return false;
        }
        PostAuthUrgencyMessage postAuthUrgencyMessage = (PostAuthUrgencyMessage) obj;
        return zq3.c(this.headline, postAuthUrgencyMessage.headline) && this.startTimeInterval == postAuthUrgencyMessage.startTimeInterval && this.endTimeInterval == postAuthUrgencyMessage.endTimeInterval;
    }

    @Override // defpackage.p06
    public int getEndTimeInterval() {
        return this.endTimeInterval;
    }

    public final String getHeadline() {
        return this.headline;
    }

    @Override // defpackage.p06
    public int getStartTimeInterval() {
        return this.startTimeInterval;
    }

    public int hashCode() {
        return (((this.headline.hashCode() * 31) + Integer.hashCode(this.startTimeInterval)) * 31) + Integer.hashCode(this.endTimeInterval);
    }

    public String toString() {
        return "PostAuthUrgencyMessage(headline=" + this.headline + ", startTimeInterval=" + this.startTimeInterval + ", endTimeInterval=" + this.endTimeInterval + ")";
    }
}
