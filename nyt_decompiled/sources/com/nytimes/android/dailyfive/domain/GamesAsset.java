package com.nytimes.android.dailyfive.domain;

import com.appsflyer.AppsFlyerProperties;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class GamesAsset {
    private final GamesNode a;
    private final DailyFiveChannel b;

    public GamesAsset(GamesNode gamesNode, DailyFiveChannel dailyFiveChannel) {
        zq3.h(gamesNode, "node");
        zq3.h(dailyFiveChannel, AppsFlyerProperties.CHANNEL);
        this.a = gamesNode;
        this.b = dailyFiveChannel;
    }

    public final DailyFiveChannel a() {
        return this.b;
    }

    public final String b() {
        return this.b.e();
    }

    public final GamesNode c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesAsset)) {
            return false;
        }
        GamesAsset gamesAsset = (GamesAsset) obj;
        return zq3.c(this.a, gamesAsset.a) && zq3.c(this.b, gamesAsset.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "GamesAsset(node=" + this.a + ", channel=" + this.b + ")";
    }
}
