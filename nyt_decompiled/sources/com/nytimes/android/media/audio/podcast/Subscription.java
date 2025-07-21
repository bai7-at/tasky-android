package com.nytimes.android.media.audio.podcast;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Subscription {
    private final PodcastSubscriptionType a;
    private final String b;

    public Subscription(PodcastSubscriptionType podcastSubscriptionType, String str) {
        zq3.h(podcastSubscriptionType, "service");
        zq3.h(str, "url");
        this.a = podcastSubscriptionType;
        this.b = str;
    }

    public final PodcastSubscriptionType a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.a == subscription.a && zq3.c(this.b, subscription.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Subscription(service=" + this.a + ", url=" + this.b + ")";
    }
}
